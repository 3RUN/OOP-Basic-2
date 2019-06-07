package by.htp.les03.car.entity;

public class Wheel {

	private int diameter;
	private String tireType;
	private String rim;
	private boolean flat;

	public Wheel() {
		this.diameter = 18;
		this.tireType = "All season";
		this.rim = "Sportline 8S 18";
		this.flat = false;
	}

	public Wheel(int diameter, String tireType, String rim) {
		this.diameter = diameter;
		this.tireType = tireType;
		this.rim = rim;
		this.flat = false;
	}

	public int getDiameter() {
		return this.diameter;
	}

	public String getTireType() {
		return this.tireType;
	}

	public String getRim() {
		return this.rim;
	}

	public boolean isFlat() {
		return this.flat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + ((rim == null) ? 0 : rim.hashCode());
		result = prime * result + ((tireType == null) ? 0 : tireType.hashCode());
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
		Wheel other = (Wheel) obj;
		if (diameter != other.diameter)
			return false;
		if (rim == null) {
			if (other.rim != null)
				return false;
		} else if (!rim.equals(other.rim))
			return false;
		if (tireType == null) {
			if (other.tireType != null)
				return false;
		} else if (!tireType.equals(other.tireType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", tireType=" + tireType + ", rim=" + rim + "]";
	}

}
