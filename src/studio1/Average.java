package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Value 1 to be averaged?");
		double n1 = in.nextInt();
		System.out.print("Value 2 to be averaged?");
		double n2 = in.nextInt();
		System.out.println("Average of " + n1 + " and " + n2 + " is " + (n1 + n2)/2);
	}

}
