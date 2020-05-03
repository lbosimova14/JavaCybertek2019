package Lesson07_MethodVoid;

public class EasiestWayNoCompletedFrequalsy {

	public static void main(String[] args) {
		String str="AABBDDTTTCCCC";
		String expectedResult="";
		
		for(int j=0;j<str.length();j++) {
		int count=0;
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
			}
		expectedResult +=""+str.charAt(j)+count;//A2A2B2B2C2C2D2D2
		str=str.replace(""+str.charAt(j), "");//A2B2D2
		}
System.out.println(expectedResult);
	}

}
