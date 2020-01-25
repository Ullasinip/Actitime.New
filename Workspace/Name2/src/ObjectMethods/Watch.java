package ObjectMethods;

public class Watch 
{
	String wname;
	double wtime;
 Watch(String wname,double wtime)
 {
	 this.wname=wname;
	 this.wtime=wtime;
	 
 }
 public String toString()
 {
	 return "Name of the watch:\t"+wname+"Time in the watch:\t"+wtime;
 }
 public boolean equals(Object obj)
 {
	 Watch w=(Watch)obj;
	 return this.wtime<obj.wtime;
	 
 }
}
 
