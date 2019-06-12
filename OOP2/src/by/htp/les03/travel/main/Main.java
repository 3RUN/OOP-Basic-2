package by.htp.les03.travel.main;

import java.util.*;

import by.htp.les03.travel.entity.TouristAgency;
import by.htp.les03.travel.entity.Voucher;
import by.htp.les03.travel.entity.VoucherType;
import by.htp.les03.travel.logic.TouristAgencyLogic;

public class Main {

	public static void main(String[] args) {
		Voucher[] voucher = new Voucher[10];
		voucher[0] = new Voucher("Moscow shoping week.", 1520.0, 7, 12, 9, false, true, VoucherType.SHOPING);
		voucher[1] = new Voucher("Milan shopping week.", 7125.0, 7, 1, 4, true, true, VoucherType.SHOPING);
		voucher[2] = new Voucher("Around-the-world cruise.", 12800.0, 46, 5, 8, true, true, VoucherType.CRUISE);
		voucher[3] = new Voucher("Mediterranean Sea cruise.", 9300.0, 14, 1, 6, true, true, VoucherType.CRUISE);
		voucher[4] = new Voucher("Sanatorium Kislovodsk.", 3218.0, 20, 1, 5, true, true, VoucherType.TREATMENT);
		voucher[5] = new Voucher("Chinese traditional medicine treatment in Shanghai.", 18500.0, 31, 13, 7, false, true,
				VoucherType.TREATMENT);
		voucher[6] = new Voucher("Full-Day Tour to Giza Pyramids, Memphis, and Sakkara.", 345.0, 1, 11, 11, false, true,
				VoucherType.EXCURSION);
		voucher[7] = new Voucher("Golden Ring Tour. Express To Russia.", 1200.0, 5, 7, 8, false, true,
				VoucherType.EXCURSION);
		voucher[8] = new Voucher("Bali - honeymoon.", 8700.0, 31, 2, 3, true, true, VoucherType.RELAXATION);
		voucher[9] = new Voucher("Winter holidays in Dombai.", 5120.0, 9, 30, 12, true, false, VoucherType.RELAXATION);

		int i = 0;
		List<Voucher> listOfVouchers = new ArrayList<Voucher>();
		for (i = 0; i < voucher.length; i++) {
			listOfVouchers.add(voucher[i]);
		}

		TouristAgency agency = new TouristAgency("StarTour", listOfVouchers);

		// show list of all available offers
		displayAccount(agency.getVouchers());

		// create logic
		TouristAgencyLogic logic = new TouristAgencyLogic();

		// find offers with the given parameters (within the given month)
		List<Voucher> resA = logic.find(agency, 20000, 21, 6, true, true, VoucherType.CRUISE);
		displayAccount(resA);

		// find offer with the given parameters (WITHOUT month)
		List<Voucher> resB = logic.find(agency, 10000, 7, true, true, VoucherType.SHOPING);
		displayAccount(resB);

	}

	public static void displayAccount(List<Voucher> voucher) {

		// setup month massive
		// only for fancy look
		String[] monthName = new String[12];
		monthName[0] = "January";
		monthName[1] = "February";
		monthName[2] = "March";
		monthName[3] = "April";
		monthName[4] = "May";
		monthName[5] = "June";
		monthName[6] = "Jully";
		monthName[7] = "August";
		monthName[8] = "September";
		monthName[9] = "October";
		monthName[10] = "November";
		monthName[11] = "December";

		int i = 0;
		for (i = 0; i < voucher.size(); i++) {
			String name = voucher.get(i).getName();
			double price = voucher.get(i).getPrice();
			int duration = voucher.get(i).getDuration();
			int day = voucher.get(i).getDay();
			int month = voucher.get(i).getMonth();
			boolean breakfast = voucher.get(i).isBreakfast();
			boolean transportation = voucher.get(i).isTransportation();

			System.out.print(name + " ONLY for " + price + " BYR, for " + duration + " days, starting from " + day + " "
					+ monthName[month - 1] + "! OPTIONS:");

			if (breakfast) {
				System.out.print(" breakfast;");
			}

			if (transportation) {
				System.out.print(" airport transportation;");
			}
			System.out.println();
		}
		System.out.println();
	}

}
