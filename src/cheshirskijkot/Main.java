package cheshirskijkot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year;

		System.out.println("Please enter the year");

		year = sc.nextInt();
		sc.close();

		if (year % 400 == 0) {
			System.out.println("leap year");
		} else if (year % 100 == 0) {
			System.out.println("non-leap year");
		} else if (year % 4 == 0) {
			System.out.println("leap year");
		} else {
			System.out.println("non-leap year");
		}

	}

}
