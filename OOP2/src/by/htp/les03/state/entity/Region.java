package by.htp.les03.state.entity;

import java.util.List;

public class Region {

	private String name;
	private String center;
	private int population;
	private double square; // square kilometers
	private List<Area> area;

	public Region() {
	}

	public Region(String name, String center, List<Area> area) {
		this.name = name;
		this.center = center;
		this.area = area;

		this.population = 0;
		this.square = 0.0D;

		int i = 0;
		for (i = 0; i < area.size(); i++) {
			this.population += area.get(i).getPopulation();
			this.square += area.get(i).getSquare();
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCenter(String center) {
		this.center = center;
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

	public String getCenter() {
		return this.center;
	}

	public int getPopulation() {
		return this.population;
	}

	public double getSquare() {
		return this.square;
	}

	public List<Area> getAreas() {
		return this.area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
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
		Region other = (Region) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", center=" + center + ", population=" + population + ", square=" + square
				+ ", area=" + area + "]";
	}

}
