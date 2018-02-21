import java.util.Scanner;
import java.text.DecimalFormat;
public class Assignment1 {
	public static void main(String[] args) {
		Scanner keyboard1 = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);
		Scanner keyboard3 = new Scanner(System.in);
		Scanner keyboard4 = new Scanner(System.in);
		Scanner keyboard5 = new Scanner(System.in);

			
		
			System.out.print("Name of exercise 1: ");
			String exercise1 = keyboard1.nextLine();
			System.out.println(exercise1);
			System.out.print("Total points possible for exercise 1:");
			float total1 = keyboard1.nextInt();
			System.out.println(total1);
			System.out.print("Score received for exercise 1: ");
			float score1 = keyboard1.nextInt();
			System.out.println(score1);
			
			System.out.print("Name of exercise 2: ");
			String exercise2 = keyboard2.nextLine();
			System.out.println(exercise2);
			System.out.print("Total points possible for exercise 2:");
			float total2 = keyboard2.nextInt();
			System.out.println(total2);
			System.out.print("Score received for exercise 2: ");
			float score2 = keyboard2.nextInt();
			System.out.println(score2);
			
			System.out.print("Name of exercise 3: ");
			String exercise3 = keyboard3.nextLine();
			System.out.println(exercise3);
			System.out.print("Total points possible for exercise 3:");
			float total3 = keyboard3.nextInt();
			System.out.println(total3);
			System.out.print("Score received for exercise 3: ");
			float score3 = keyboard3.nextInt();
			System.out.println(score3);
			
			System.out.print("Name of exercise 4: ");
			String exercise4 = keyboard4.nextLine();
			System.out.println(exercise4);
			System.out.print("Total points possible for exercise 4:");
			float total4 = keyboard4.nextInt();
			System.out.println(total4);
			System.out.print("Score received for exercise 4: ");
			float score4 = keyboard4.nextInt();
			System.out.println(score4);
			
			System.out.print("Name of exercise 5: ");
			String exercise5 = keyboard5.nextLine();
			System.out.println(exercise5);
			System.out.print("Total points possible for exercise 5:");
			float total5 = keyboard5.nextInt();
			System.out.println(total5);
			System.out.print("Score received for exercise 5: ");
			float score5 = keyboard5.nextInt();
			System.out.println(score5);
			
			System.out.println("");
			System.out.println("**************Scores Summary**************");
		
			System.out.printf("%-24s %-7s %-4s%n", "Exercise", "Score", "Total Points");
			System.out.println();
			System.out.printf("%-24s %-7.0f %-4.0f %n", exercise1, score1, total1);
			System.out.printf("%-24s %-7.0f %-4.0f %n", exercise2, score2, total2);
			System.out.printf("%-24s %-7.0f %-4.0f %n", exercise3, score3, total3);
			System.out.printf("%-24s %-7.0f %-4.0f %n", exercise4, score4, total4);
			System.out.printf("%-24s %-7.0f %-4.0f %n", exercise5, score5, total5);
			System.out.println();
			
			 float finalScore = score1 + score2 + score3 + score4 + score5;
			 float finalTotal = total1 + total2 + total3 + total4 + total5;
			 float finalPercentage = finalScore/finalTotal * 100;
			 
			 DecimalFormat numConvert = new DecimalFormat("0.00");
			
			System.out.printf("Your total is " + "%-6.1f" + " out of " + "%-6.1f" + ", or " + numConvert.format(finalPercentage) + " percent!", finalScore, finalTotal);

	}

}
