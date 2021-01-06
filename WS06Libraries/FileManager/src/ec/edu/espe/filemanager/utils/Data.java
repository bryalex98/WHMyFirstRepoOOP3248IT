
package ec.edu.espe.filemanager.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Bryan Pazmino
 */
public class Data {
    
    private static int totalLines;
    private static int totalCoincidence;    
    File file = new File("Group2.csv");
    
    public static void save(String fileName, String record){
        //TODO code to save data in a file
        System.out.println("Calling save method, with parameters: "+fileName+" and "+record);   
    }
    
    public static String find(File file, String data){
        
        try {
            if(file.exists()) {
                BufferedReader readFile = new BufferedReader(new FileReader(file));
                String readLine;
                while((readLine = readFile.readLine()) != null) {
                    totalLines=totalLines+1;
                    String[] words = readLine.split(" ");
                    for (String word : words) {
                        if (word.equals(data)) {                            
                            totalCoincidence = totalCoincidence +1;
                            System.out.println(readLine);                            
                        }
                    }
                }
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }

    public static boolean remove(String fileName, String data){
        //TODO code to remove information in a file
        boolean removed;
        
        removed=true;
        System.out.println(data+"was removed");
        return removed;
    }
        
    public static boolean update(String fileName, String data){
        //TODO code to update information in a file
        boolean modified;
        
        modified=true;
        System.out.println(data+"was update");
        return modified;
    }
    
    public static String findAll(String fileName, String data){
        //TODO code to find all information in a file
        String results;
        
        results="Bryan Pazmino,23,0995593932\nNathaly Campos, 23, 0993838472\n";
        System.out.println("Returning => "+results);

        return results;
        
    }
    
    //.jar: java archive
    //.war: web archive
    //.ear: enterprise archive
    
}
