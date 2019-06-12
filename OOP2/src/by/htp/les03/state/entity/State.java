package by.htp.les03.state.entity;

import java.util.List;

public class State {

	private String name;
	private String capital;
	private int population;
	private double square; // square kilometers
	private List<Region> region;

	public State() {
	}

	public State(String name, String capital, List<Region> region) {
		this.name = name;
		this.capital = capital;
		this.region = region;

		this.population = 0;
		this.square = 0.0D;

		int i = 0;
		for (i = 0; i < region.size(); i++) {
			this.population += region.get(i).getPopulation();
			this.square += region.get(i).getSquare();
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public String getName() {
		return this.name;
	}

	public String getCapital() {
		return this.capital;
	}

	public int getPopulation() {
		return this.population;
	}

	public double getSquare() {
		return this.square;
	}

	public List<Region> getRegions() {
		return this.region;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		State other = (State) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", capital=" + capital + ", population=" + population + ", square=" + square
				+ ", region=" + region + "]";
	}

}
