package by.htp.les03.travel.entity;

public class Voucher {

	private String name;
	private double price;
	private int duration;
	private int day;
	private int month;
	private boolean breakfast;
	private boolean transportation;
	private VoucherType type;

	public Voucher() {
	}

	public Voucher(String name, double price, int duration, int day, int month, boolean breakfast,
			boolean transportation, VoucherType type) {
		this.name = name;
		this.price = price;
		this.duration = duration;
		this.day = day;
		this.month = month;
		this.breakfast = breakfast;
		this.transportation = transportation;
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setBreakfast(boolean breakfast) {
		this.breakfast = breakfast;
	}

	public void setTransportation(boolean transportation) {
		this.transportation = transportation;
	}

	public void setType(VoucherType type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public int getDuration() {
		return this.duration;
	}

	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public boolean getBreakfast() {
		return this.breakfast;
	}

	public boolean getTransportation() {
		return this.transportation;
	}

	public VoucherType getType() {
		return this.type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (breakfast ? 1231 : 1237);
		result = prime * result + day;
		result = prime * result + duration;
		result = prime * result + month;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (transportation ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voucher other = (Voucher) obj;
		if (breakfast != other.breakfast)
			return false;
		if (day != other.day)
			return false;
		if (duration != other.duration)
			return false;
		if (month != other.month)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (transportation != other.transportation)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Voucher [name=" + name + ", price=" + price + ", duration=" + duration + ", day=" + day + ", month="
				+ month + ", breakfast=" + breakfast + ", transportation=" + transportation + ", type=" + type + "]";
	}

}
