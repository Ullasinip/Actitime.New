package ObjectMethods;

public class ECom {

	public static void main(String[] args)
	{
		Mobile m1=new Mobile("Iphone XL",4,100000,16,64,100);
		Mobile m2=new Mobile("One Plus 9",8,50000,32,128,100);
		Mobile m3=new Mobile("OPPO",2,45000,16,32,100);
		Mobile m4=new Mobile("Pixel",16,30000,16,16,100);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		m1.hashCode();
		m1.hashCode();
		m1.hashCode();
		m1.hashCode();
		m1.hashCode();
		m1.hashCode();
		m1.hashCode();
		m1.hashCode();
		m1.hashCode();
		m1.hashCode();
		m1.hashCode();
		
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		m2.hashCode();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		m1.equals(m2);
		m3.equals(m4);
	}

}
