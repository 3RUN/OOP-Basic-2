package by.htp.les03.car.entity;

public class Engine {

	private String fuelType;
	private int fuelConsumption; // liters per kilometer
	private int enginePower; // horse power

	public Engine() {
	}

	public Engine(String fuelType, int fuelConsumption, int enginePower) {
		this.fuelType = fuelType;
		this.fuelConsumption = fuelConsumption;
		this.enginePower = enginePower;
	}

	public String getFuelType() {
		return this.fuelType;
	}

	public int getFuelConsumption() {
		return this.fuelConsumption;
	}

	public int getEnginePower() {
		return this.enginePower;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + enginePower;
		result = prime * result + fuelConsumption;
		result = prime * result + ((fuelType == null) ? 0 : fuelType.hashCode());
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
		Engine other = (Engine) obj;
		if (enginePower != other.enginePower)
			return false;
		if (fuelConsumption != other.fuelConsumption)
			return false;
		if (fuelType == null) {
			if (other.fuelType != null)
				return false;
		} else if (!fuelType.equals(other.fuelType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [fuelType=" + fuelType + ", fuelConsumption=" + fuelConsumption + ", enginePower=" + enginePower
				+ "]";
	}

}
