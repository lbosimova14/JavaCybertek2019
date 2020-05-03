package Ass03_MethodReplit;
//not working in replit
public class getDupArray {
	public static void main(String[] args) {
	
	 String[][] matrix = {{"1","2","1","3",},{"7","6","null","2",},{"5","6","3","null",},{"3","10","9","5",}};
	    System.out.println(getDup(matrix));
	}

	public static int getDup(String[][] matrix){
	    String strArr[] = new String[(matrix.length)*(matrix[0].length)];
	    int count = 0;
	    for(int i = 0; i < matrix.length; i++){
	        for(int j = 0; j < matrix[0].length; j++){
	            for(int k = 0; k < matrix.length; k++){
	                for(int l = 0; l < matrix[0].length; l++){
	                    if((i!=k || j!=l)){
	                        if(matrix[i][j] == matrix[k][l]){
	                            int x = 0;
	                            boolean flag = false;
	                            while(strArr[x] != null){
	                                if(null != matrix[i][j] && matrix[i][j].equals(strArr[x])){
	                                    flag = true;                                    
	                                }
	                                x++;
	                            }
	                            if(flag==false){
	                                strArr[count] = matrix[i][j];
	                                count++;
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }
	    return count;
	}
}
/* public static int getDup(String[] r) 
 * getDup accepts an array and returns an int.
If there is any element is duplicated, method counts how many of those present in the array.
For example :
getDup(["1","2","aa"',"1"])
returns:2 ("1" is duplicated and there are two "1"s so return is 2)
getDup(["1","2","aa"',"1", "aa"])
returns:4 ("1" is duplicated and there are two "1"s 
           and 2 "aa"s so return is 4)
getDup(["1","g","aabb',"7","7","2","aa"',"7"])
returns:3
hint:
    you will need a nested array the will run on the array we get from the method argument.
    inside the nested loop you will need to check if the main array element is equal to the current
    
    this is easy solution, repletda sublit qilmayapti cours tugagani uchun,
    *	 String[] matrix = {"1","2","1","3"};
	    System.out.println(getDup(matrix));
	}

	public static int getDup(String[] matrix){
	  count=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j].equals(arr[i])) {
				count++;
				}
		}
	}
	return count;
}
	
}
    */