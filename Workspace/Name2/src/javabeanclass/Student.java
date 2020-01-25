package javabeanclass;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	private String name;
	private int regNo;
	private double marks;
	
public Student(String name, int regNo, double marks) {
		this.name = name;
		this.regNo = regNo;
		this.marks = marks;
	}

@Override
public String toString() {
	return "Student name=" + name + ", regNo=" + regNo + ", marks=" + marks ;
}

public Student()
{
	
}

public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}


public int compare(Student o1, Student o2)
{
	if(o1.name.equals(o2.name))
		return o1.regNo-o2.regNo;
		return o1.name.compareTo(o2.name); 
}

}
