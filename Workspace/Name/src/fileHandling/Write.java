package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Write {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\QSpiders\\demo.txt"); //Establish the stream
		
		File f2 = new File("D:\\QSpiders\\demo2.txt");
		
		
		FileReader input = new FileReader(f); // Mention if its Input Stream or Output stream
		
		FileWriter output = new FileWriter(f2);
		
		
		BufferedReader readLine = new BufferedReader(input); //Reads line by line
		
		BufferedWriter writeLines = new BufferedWriter(output);
		
		
		String s = readLine.readLine();
		
		for(;s!=null;s=readLine.readLine()) //readLine() keeps on reading until s!=null
		{
		 writeLines.write(s);
		 writeLines.write("\n");
	//	 writeLines.append("I am fine");
		 //writeLines.write("\n");
		}
		
		writeLines.flush(); //to write the contents in the file.To push the contents to the file.
		System.out.println("Done!!");
		
		writeLines.close();
		readLine.close();
		output.close();
		input.close();
		
		
	/*	int data = input.read(); // read() reads char by char and in ASCII Code format.i.e return type is int. So typecast it to Char.
	
		while(data!=-1) //read returns -1 while at the end of reading the file
		{
			System.out.print((char)data);
			data=input.read();
			
		}
		*/

	}

}
