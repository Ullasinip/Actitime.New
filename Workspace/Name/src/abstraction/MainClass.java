package abstraction;
import java.util.Scanner;
class MainClass
{

	public static void main(String[] args) 
	{
		Factory ref=new Factory();
		System.out.println("Menu options are:\n 1. Galaxy\n 2.BlackForest\n 3.RedVelvet\n 4.exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the option to be displayed");
		int menu=sc.nextInt();
		switch(menu)
		{
		case 1:ref.display(new Galaxy());
				break;
		case 2:ref.display(new BlackForest());
				break;
		case 3:ref.display(new RedVelvet());
				break;
		case 4: System.exit(0);
		default: System.out.println("Invalid input");
		}
	}

}
