import java.util.Scanner;

public class Task6 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance you ran in meters:");
		int distance = input.nextInt();
		
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Time you ran in second:");
		int time = input2.nextInt();
		
		System.out.println("You ran " + distance/time + " m/s");
	}
}

