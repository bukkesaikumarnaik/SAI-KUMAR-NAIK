package Files;

import java.io.File;
import java.io.IOException;

public class CreateFile 
{
 public static void main(String[] args)
 {

     try
     {
         File Obj = new File("SaiKumarFiles");
         if (Obj.createNewFile()) {
             System.out.println("File created: "
                                + Obj.getName());
         }
         else
         {

             System.out.println("File already exists.");
         }
     }
     catch (IOException e) 
     {
         System.out.println("An error has occurred.");
         e.printStackTrace();
     }
 }
}