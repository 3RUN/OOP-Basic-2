package by.htp.les03.state.entity;

import java.util.*;

public class Area {

	private String name;
	private String center;
	private int population;
	private double square; // square kilometers
	private List<City> city;

	public Area() {
	}

	public Area(String name, String center, List<City> city) {
		this.name = name;
		this.center = center;
		this.city = city;

		this.population = 0;
		this.square = 0.0D;

		int i = 0;
		for (i = 0; i < city.size(); i++) {
			this.population += city.get(i).getPopulation();
			this.square += city.get(i).getSquare();
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

	public List<City> getCities() {
		return this.city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
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
		Area other = (Area) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
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
		return "Area [name=" + name + ", center=" + center + ", population=" + population + ", square=" + square
				+ ", city=" + city + "]";
	}

}
