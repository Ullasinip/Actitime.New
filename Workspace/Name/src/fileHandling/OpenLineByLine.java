package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OpenLineByLine 
{

	public static void main(String[] args) throws IOException
	{
		File f = new File("D:\\QSpiders\\demo.txt"); //Establish the stream
		
		FileReader input = new FileReader(f); // Mention if its Input Stream or Output stream
		
		BufferedReader readLine = new BufferedReader(input); //Reads line by line
		
		String s = readLine.readLine();
		
		for(;s!=null;s=readLine.readLine()) //readLine() keeps on reading until s!=null
		{
			System.out.println(s);
		}
		
	/*	int data = input.read(); // read() reads char by char and in ASCII Code format.i.e return type is int. So typecast it to Char.
	
		while(data!=-1) //read returns -1 while at the end of reading the file
		{
			System.out.print((char)data);
			data=input.read();
			
		}
		*/
	}

}
