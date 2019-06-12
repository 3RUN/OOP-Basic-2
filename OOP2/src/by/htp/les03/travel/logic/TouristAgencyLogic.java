package by.htp.les03.travel.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les03.travel.entity.TouristAgency;
import by.htp.les03.travel.entity.Voucher;
import by.htp.les03.travel.entity.VoucherType;

public class TouristAgencyLogic {

	public TouristAgencyLogic() {
	}

	public List<Voucher> find(TouristAgency touristAgency, double price, int duration, boolean hasBreakfast,
			boolean hasTransportation, VoucherType type) {
		int i = 0;
		List<Voucher> tempList = new ArrayList<Voucher>();
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			// check voucher by it's price
			// if it equals or less than the given price
			double tempPrice = agencyList.get(i).getPrice();
			// check voucher by it's duration
			// if it equals or greater than the given duration
			int tempDuration = agencyList.get(i).getDuration();

			// price and duration equals or less then the given parameters?
			// move on to the breakfast and transportation
			if (tempPrice <= price && tempDuration <= duration) {

				// check voucher if it has breakfast included
				boolean breakfast = agencyList.get(i).isBreakfast();
				// check voucher if it has transportation from airport
				boolean transportation = agencyList.get(i).isTransportation();

				// breakfast and transportation equals to the given parameters?
				// then move on to the type
				if (breakfast == hasBreakfast && transportation == hasTransportation) {

					// get types to compare
					VoucherType tempType = agencyList.get(i).getType();

					// matches the given voucher type?
					if (tempType.compareTo(type) == 0) {
						// add to the list
						tempList.add(agencyList.get(i));
					}

				}

			}

		}

		return tempList;
	}

	public List<Voucher> find(TouristAgency touristAgency, double price, int duration, int month, boolean hasBreakfast,
			boolean hasTransportation, VoucherType type) {
		int i = 0;
		List<Voucher> tempList = new ArrayList<Voucher>();
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			// check for month first
			int tempMonth = agencyList.get(i).getMonth();
			if (tempMonth != month) {
				continue;
			}

			// check voucher by it's price
			// if it equals or less than the given price
			double tempPrice = agencyList.get(i).getPrice();
			// check voucher by it's duration
			// if it equals or greater than the given duration
			int tempDuration = agencyList.get(i).getDuration();

			// price and duration equals or less then the given parameters?
			// move on to the breakfast and transportation
			if (tempPrice <= price && tempDuration <= duration) {

				// check voucher if it has breakfast included
				boolean breakfast = agencyList.get(i).isBreakfast();
				// check voucher if it has transportation from airport
				boolean transportation = agencyList.get(i).isTransportation();

				// breakfast and transportation equals to the given parameters?
				// then move on to the type
				if (breakfast == hasBreakfast && transportation == hasTransportation) {

					// get types to compare
					VoucherType tempType = agencyList.get(i).getType();

					// matches the given voucher type?
					if (tempType.compareTo(type) == 0) {
						// add to the list
						tempList.add(agencyList.get(i));
					}

				}

			}

		}

		return tempList;
	}

	public List<Voucher> findByType(TouristAgency touristAgency, VoucherType type) {
		int i = 0;
		List<Voucher> tempList = new ArrayList<Voucher>();
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			// get types to compare
			VoucherType tempType = agencyList.get(i).getType();

			// check if current voucher's type equals to the given one
			// and if it is, then add it to the list
			if (tempType.compareTo(type) == 0) {
				tempList.add(agencyList.get(i));
			}

		}

		return tempList;
	}

	public List<Voucher> findByPrice(TouristAgency touristAgency, double price) {
		int i = 0;
		List<Voucher> tempList = new ArrayList<Voucher>();
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			// check voucher by it's price
			// if it equals or less than the given price
			double tempPrice = agencyList.get(i).getPrice();
			if (tempPrice <= price) {
				// if it is
				// then add it to temporary list
				tempList.add(agencyList.get(i));
			}

		}

		return tempList;
	}

	public List<Voucher> findByHigherDuration(TouristAgency touristAgency, int duration) {
		int i = 0;
		List<Voucher> tempList = new ArrayList<Voucher>();
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			// check voucher by it's duration
			// if it equals or greater than the given duration
			int tempDuration = agencyList.get(i).getDuration();
			if (tempDuration >= duration) {
				// if it is
				// then add it to temporary list
				tempList.add(agencyList.get(i));
			}

		}

		return tempList;
	}

	public List<Voucher> findByLowerDuration(TouristAgency touristAgency, int duration) {
		int i = 0;
		List<Voucher> tempList = new ArrayList<Voucher>();
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			// check voucher by it's duration
			// if it equals or less than the given duration
			int tempDuration = agencyList.get(i).getDuration();
			if (tempDuration <= duration) {
				// if it is
				// then add it to temporary list
				tempList.add(agencyList.get(i));
			}

		}

		return tempList;
	}

	public List<Voucher> findByBreakfast(TouristAgency touristAgency, boolean hasBreakfast) {
		int i = 0;
		List<Voucher> tempList = new ArrayList<Voucher>();
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			// check voucher if it has breakfast included
			boolean breakfast = agencyList.get(i).isBreakfast();
			if (breakfast == hasBreakfast) {
				// if it has
				// then add it to temporary list
				tempList.add(agencyList.get(i));
			}

		}

		return tempList;
	}

	public List<Voucher> findByTransportation(TouristAgency touristAgency, boolean hasTransportation) {
		int i = 0;
		List<Voucher> tempList = new ArrayList<Voucher>();
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			// check voucher if it has transportation from airport
			boolean transportation = agencyList.get(i).isTransportation();
			if (transportation == hasTransportation) {
				// if it has
				// then add it to temporary list
				tempList.add(agencyList.get(i));
			}

		}

		return tempList;
	}

	public void sortByType(TouristAgency touristAgency) {
		int i = 0;
		int j = 0;
		Voucher tempVoucher;
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			for (j = i + 1; j < agencyList.size(); j++) {

				// get types to compare
				VoucherType typeA = agencyList.get(i).getType();
				VoucherType typeB = agencyList.get(j).getType();

				if (typeA.compareTo(typeB) > 0) {
					tempVoucher = agencyList.get(i);
					agencyList.set(i, agencyList.get(j));
					agencyList.set(j, tempVoucher);
				}

			}

		}
	}

	public void sortByDuration(TouristAgency touristAgency) {
		int i = 0;
		int j = 0;
		Voucher tempVoucher;
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			for (j = i + 1; j < agencyList.size(); j++) {

				// get durations to compare
				int durationA = agencyList.get(i).getDuration();
				int durationB = agencyList.get(j).getDuration();

				// sort them!
				if (durationA < durationB) {
					tempVoucher = agencyList.get(i);
					agencyList.set(i, agencyList.get(j));
					agencyList.set(j, tempVoucher);
				}

			}
		}
	}

	public void sortByPrice(TouristAgency touristAgency) {
		int i = 0;
		int j = 0;
		Voucher tempVoucher;
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			for (j = i + 1; j < agencyList.size(); j++) {

				// get prices to compare
				double priceA = agencyList.get(i).getPrice();
				double priceB = agencyList.get(j).getPrice();

				// sort them!
				if (priceA < priceB) {
					tempVoucher = agencyList.get(i);
					agencyList.set(i, agencyList.get(j));
					agencyList.set(j, tempVoucher);
				}

			}

		}
	}

	public void sortByDate(TouristAgency touristAgency) {
		int i = 0;
		int j = 0;
		Voucher tempVoucher;
		List<Voucher> agencyList = touristAgency.getVouchers();
		for (i = 0; i < agencyList.size(); i++) {

			for (j = i + 1; j < agencyList.size(); j++) {

				// get month to compare
				int monthA = agencyList.get(i).getMonth();
				int monthB = agencyList.get(j).getMonth();
				// sort them!
				if (monthA < monthB) {
					tempVoucher = agencyList.get(i);
					agencyList.set(i, agencyList.get(j));
					agencyList.set(j, tempVoucher);
				}
				// same month ?
				// sort by date
				if (monthA == monthB) {
					// get month to compare
					int dayA = agencyList.get(i).getDay();
					int dayB = agencyList.get(j).getDay();
					if (dayA < dayB) {
						tempVoucher = agencyList.get(i);
						agencyList.set(i, agencyList.get(j));
						agencyList.set(j, tempVoucher);
					}
				}

			}

		}

	}

}
