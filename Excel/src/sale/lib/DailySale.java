package sale.lib;

import java.util.Scanner;

import excel.lib.Reader;
import sale.gui.SaleScreen;

public class DailySale {

	public static void main(String[] args) {
		System.out.println("Enter Lot #: ");
		Scanner sc = new Scanner(System.in);
		String lotName = sc.next();
		Reader reader = new Reader(lotName);
		
		System.out.println("My Lot # is " + reader.getLotName());
		
		reader.CreateDailySale();
		SaleScreen scs = new SaleScreen();
		sc.close();

	}

}
