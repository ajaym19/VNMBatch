package Basics;

public class LoopingDemo {

	public static void main(String[] args) {
		// print from 1 to 10
		System.out.println("Learning for loop");
		for (int i = 1; i < 10; i++) {

			if (i == 5) {
				System.out.println("Found 5 and hence terminating the for loop");
				break;
			}
			System.out.println(i);

		}

		System.out.println("Learning while loop");
		int j = 10;
		while (j < 5) {
			System.out.println(j);
			j++;
		}

		System.out.println("Learning do while loop");
		int k = 10;
		do {
			System.out.println(k);
			k++;
		} while (k < 5);

		System.out.println("Learning if else");
		for (int i = 1; i < 10; i++) {
			if (i == 1) {
				System.out.println("Ajay");
			} else if (i == 2) {
				System.out.println("Iswarya");
			} else if (i == 3) {
				System.out.println("Jyothi");
			} else if (i == 4) {
				System.out.println("Pratishtha");
			} else {
				System.out.println("No Match found");
			}
		}

		System.out.println("Learning switch case");
		int day = 14;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		default:
			System.out.println("Please enter value within 1 to 7");
			break;
		}

	}
}
