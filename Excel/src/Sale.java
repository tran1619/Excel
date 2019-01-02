

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
		System.out.println("Enter Lot #: ");
		Scanner sc = new Scanner(System.in);
		String lotName = sc.next();
		Lot reader = new Lot(lotName);
		
		System.out.println("My Lot # is " + reader.getLotName());
		
		reader.CreateDailySale();
		SaleScreen scs = new SaleScreen();
		sc.close();

	}

}
