package Singleton;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
	public static void main(String[] args)
	{
		String[] Comp= {"Rock", "Paper", "Scissors"};
		String[] User= {"Rock", "Paper", "Scissors"};
		Random random = new Random();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("=========================================");
			System.out.println("Try number:\t"+i);
			System.out.println("Enter your selection: 0.Rock\t1.Paper\t2.Scissors");
			int userSelect=sc.nextInt();
			System.out.println("Computer selected value:\t");
			int compSelect=random.nextInt(3);
			System.out.println(compSelect);
			if(userSelect==0)
			{
				System.out.println("You have selected:\t"+User[userSelect]);
				if(compSelect==0)
				{
					System.out.println("Computer selected:\t"+Comp[compSelect]);
					System.out.println("Its a Draw!!");
				}
				else if(compSelect==1)
				{
					System.out.println("Computer selected:\t"+Comp[compSelect]);
					System.out.println("Paper covers Rock....Computer Wins!!");
				}
				else if(compSelect==2)
				{
					System.out.println("Computer selected:\t"+Comp[compSelect]);
					System.out.println("Rock crushed Scissors....You win!!");
				}
					
			}
			else if(userSelect==1)
			{
				System.out.println("You have selected:\t"+User[userSelect]);
				if(compSelect==0)
				{
					System.out.println("Computer selected:\t"+Comp[compSelect]);
					System.out.println("Paper covers Rock......You win!!");
				}
				else if(compSelect==1)
				{
					System.out.println("Computer selected:\t"+Comp[compSelect]);
					System.out.println("Its a Draw!!");
				}
				else if(compSelect==2)
				{
					System.out.println("Computer selected::\t"+Comp[compSelect]);
					System.out.println("Scissors cuts Paper...Computer Wins!!");
				}
				
			}
			else if(userSelect==2)
			{
				System.out.println("You have selected:\t"+User[userSelect]);
				if(compSelect==0)
				{
					System.out.println("Computer selected:\t"+Comp[compSelect]);
					System.out.println("Rock crushed Scissors......Computer Wins!!");
				}
				else if(compSelect==1)
				{
					System.out.println("Computer selected\t"+Comp[compSelect]);
					System.out.println("Scissors cuts Paper....You Win!!");
				}
				else if(compSelect==2)
				{
					System.out.println("Computer selected \t"+Comp[compSelect]);
							System.out.println("Its a Draw!!");
				}
				
			}
			else 
			{
				System.out.println("Invalid selection...Enter values between 0-2");
			}
			
			
		}

	}

}
