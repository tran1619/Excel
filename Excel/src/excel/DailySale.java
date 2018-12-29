package excel;

import java.util.Scanner;

import excel.lib.Reader;

public class DailySale {

	public static void main(String[] args) {
		System.out.println("Enter Lot #: ");
		Scanner sc = new Scanner(System.in);
		String lotName = sc.next();
		Reader reader = new Reader(lotName);
		
		System.out.println("My Lot # is " + reader.getLotName());
		
		reader.CreateDailySale();
		sc.close();

	}

}
