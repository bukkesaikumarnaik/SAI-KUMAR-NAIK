package Files;
import java.io.FileWriter;
import java.io.IOException;  
public class WriteFile
{
    public static void main(String[] args) 
    {  
    try 
    {  
        FileWriter fwrite = new FileWriter("G:\\Internship\\File Handling\\NewFile.txt");  
        fwrite.write("Written using FileWriter!!!");   
        fwrite.close(); 
    } catch (IOException e)
    {  
        System.out.println("Error While Writing!!!");  
        e.printStackTrace();  
    }  
    }  
}  
