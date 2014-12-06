package text.reader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DataReader {
	/**
	 * This class contains a main method which will be able to read a file.
	 */
	public static void main(String[] args){
		/* Use java API to read a file from external sources(can be a text file 
		 * in your documents folder)
		 * You must use Try...catch and finally block.
		 * You must use while loop.Use String array for extra credit.
		 * 
		 */

	/**
	 * This class contains a main method which will be able to read a file.
	 */
	        
            Path path = new File("example.txt").toPath();
            try {
               
                List<String> list = Files.readAllLines(path);
                
                String [] theArray = list.toArray(new String[list.size()]);
                
               
                int i=0;
                while (i<theArray.length){
                    System.out.println(theArray[i]);
                    i++;    
                }
                
            
                
            } catch (IOException ex) {
             
                System.out.println("Problems reading from the file: "+ex.getLocalizedMessage());
            }
            finally{
                System.out.println("Program ended");
            }
            

	}

}

