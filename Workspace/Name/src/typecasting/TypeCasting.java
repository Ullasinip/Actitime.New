package typecasting;

class TypeCasting {

	public static void main(String[] args)
	{
		byte b = 1;
		short s = 20;
		int i = 25;
		char c = 'a';
		long l = 25000l;
		float f = 25.5f;
		double d = 55.5;
		System.out.println("Implicit typecasting from byte to short:"+(s=b));
		System.out.println("Implicit typecasting from short to int:"+(i=s));
		System.out.println("Implicit typecasting from char to int:"+(i=c));
		System.out.println("Implicit typecasting from int to short:"+(l=i));
		System.out.println("Implicit typecasting from long to float:"+(f=l));
		System.out.println("Implicit typecasting from float to double:"+(d=f));
		System.out.println("Explicit typecasting from byte to short:"+(f=(float)d));
		System.out.println("Explicit typecasting from byte to short:"+(l=(long)f));
		System.out.println("Explicit typecasting from byte to short:"+(i=(int)l));
		System.out.println("Explicit typecasting from byte to short:"+(c=(char)i));
		System.out.println("Explicit typecasting from byte to short:"+(s=(short)i));
		System.out.println("Explicit typecasting from byte to short:"+(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         b=(byte)s));
		
		
		

	}

}
