package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Open 
{

	public static void main(String[] args) throws IOException
	{
		File f = new File("D:\\QSpiders\\demo.txt"); //Establish the stream
		
		FileReader input = new FileReader(f); // Mention if its Input Stream or Output stream
		
		int data = input.read(); // read() reads char by char and in ASCII Code format.i.e return type is int. So typecast it to Char.
	
		while(data!=-1) //read returns -1 while at the end of reading the file
		{
			System.out.print((char)data);
			data=input.read();
			
		}
		
	}

}
