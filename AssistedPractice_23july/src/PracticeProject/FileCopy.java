package PracticeProject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy 
{

	public static void main(String[] args) 
	{
		File file = new File("/users/naik/Downloads/sample.pdf");
		File opFile = new File("/users/naik/Downloads/sample-copy.pdf");
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try 
		{
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(opFile);
		}catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			System.out.println(fileInputStream.available());
		}catch (IOException e) 
		{
			e.printStackTrace();
		}
		int i = 0;
		try 
		{
			while((i = fileInputStream.read())!=-1) 
			{
				fileOutputStream.write(i);
			}
		}catch (IOException e) 
		{
			e.printStackTrace();
		}
			
		finally 
		{
			if(fileInputStream != null) 
			{
				fileOutputStream.close();
			}
		}
		
			
		
