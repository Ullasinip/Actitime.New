package javabeanclass;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentMain { 

	public static void main(String[] args)
	{
		TreeSet<Student> t=new TreeSet<>(new Student());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of students:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			Student e=new Student();
			System.out.println("Enter student name");
			sc.nextLine();
			e.setName(sc.nextLine());
			System.out.println("Enter student regNo");
			e.setRegNo(sc.nextInt());
			System.out.println("Enter student marks");
			e.setMarks(sc.nextDouble());
			t.add(e);
		}
//	System.out.println(t);
	for(Student student:t)
	{
		System.out.println(student);
	}
	}

	

}
