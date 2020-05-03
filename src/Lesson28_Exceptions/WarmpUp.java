package Lesson28_Exceptions;
/*
 * 1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
            parameters: double seconds
            return-type: String
            Thread.sleep();
        Note: Exceptions MUST be handled within the methods
    2. write a method called "getData" that can retrieve the data from properties files
            parameters: String Key, String FilePath
            return-type: String
        Note: Exceptions MUST be handled within the methods
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/*
1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
        parameters: double seconds
        return-type: void
        Thread.sleep();
    Note: Exceptions MUST be handled within the methods
2. write a method called "getData" that can retrieve the data from properties files
        parameters: String Key, String FilePath
        return-type: String
    Note: Exceptions MUST be handled within the methods
*/
public class WarmpUp {
    public static void main(String[] args) {
        
        Wait( 3 );
        System.out.println( "Batch 12");
        //Properties class helps us to retriev data from properties file
             //load file
        Properties property = new Properties();
        
        String path = "/Users/cybertekstudios/Desktop/Data.properties";
        
        try {
            FileInputStream file = new FileInputStream(path);
            property.load( file);
            
        }catch(Exception e) {
            
        }
        
        String Name =   property.getProperty("ID");
        System.out.println(Name);
        
        
    System.out.println(   getData("Name", "C:\\Users\\Max\\Desktop\\Java\\Data.properties")  );
    System.out.println(property.getProperty("URL"));
    System.out.println(getData("Age","C:\\Users\\Max\\eclipse-workspace\\Summer2019_Java\\TestData.properties"));    
     System.out.println(getData("Gender","TestData.properties"));   
    }
    
    public static void Wait(double seconds) {
        
        try {
          Thread.sleep( (long)(seconds*1000) );  // 1 seconds = 1000 milliseconds
        } catch(Exception e) {  }
        
    }
    
    
    //second warm up
    public static String getData(String Key, String Path) {
        String data ="";
        Properties property = new Properties();
        
        
        try {
            FileInputStream file = new FileInputStream(Path);//in oder to read file from my computer, we need fILEiNPUT sTREAM
            //but java still does not know what kind of file, and we use Properties class
            //then loaded file to Properties class
            property.load( file);
            //bc syntax error compile error(file not find exception and IO exception), that is why we need use try and catch block 
        }catch(Exception e) {
            
        }
        
        data = property.getProperty(Key);//use getProperty method for retrive the Key
        
        return data;
    }
    
    
    
    
}