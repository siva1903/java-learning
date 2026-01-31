import java.io.*;
import java.util.*;

import java.util.Scanner;

class Restaurant {
	static Scanner scn = new Scanner(System.in);

	Restaurant() {
		System.out.println("$$Welcome to Restaurant$$");\\deeapk and siva loves food 
	} \\its will be in new branch 

	int briyani(int no) {
		return 150 * no;
	}

	int friedRice(int no) {
		return 120 * no;
	}

	int grill(int no) {
		return 200 * no;
	}

	int noodles(int no) {
		return 100 * no;
	}

	void bill(int total[]) {
		int bill = total[0] + total[1] + total[2] + total[3];
		System.out.println("Total Bill : " + bill);
	}

	int[] orders() {
		int orderList[] = new int[4];
		System.out.println("Order Please !");
		System.out.print("Briyani No : ");
		orderList[0] = scn.nextInt();
		System.out.print("\nFriedRice No : ");
		orderList[1] = scn.nextInt();
		System.out.print("\nGrill No : ");
		orderList[2] = scn.nextInt();
		System.out.print("\nNoodles No : ");
		orderList[3] = scn.nextInt();
		return orderList;
	}

	public static void main(String[] args) {
		Restaurant res = new Restaurant();
		while (true) {
			int orderList[] = res.orders();
			System.out.println("Your Orders");
			System.out.println("Briyani No : " + orderList[0]);
			System.out.println("FriedRice No : " + orderList[1]);
			System.out.println("Grill No : " + orderList[2]);
			System.out.println("Noodles No : " + orderList[3]);
			System.out.println("Do you Want to (1-Bill it Or 2-Cancel All Or 3-Wrong Bill(redo)");
			int operation = scn.nextInt();
			switch (operation) {
			case 1:
				orderList[0] = res.briyani(orderList[0]);
				orderList[1] = res.briyani(orderList[1]);
				orderList[2] = res.briyani(orderList[2]);
				orderList[3] = res.briyani(orderList[3]);
				res.bill(orderList);
				break;
			case 2:
				return;
			case 3:
				System.out.println("Redo");
				break;
			}

		}
	}

}