package Files; 
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.util.Scanner; 

public class Readfile {
 public static void main(String[] args)
 {
     try {
         File Obj = new File("SAI KUMAR NAIK");
         Scanner Reader = new Scanner(Obj);
         while (Reader.hasNextLine()) {
             String data = Reader.nextLine();
             System.out.println(data);
         }
         Reader.close();
     }
     catch (FileNotFoundException e) {
         System.out.println("An error has occurred.");
         e.printStackTrace();
     }
 }
}
