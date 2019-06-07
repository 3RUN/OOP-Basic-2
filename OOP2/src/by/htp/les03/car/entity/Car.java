package by.htp.les03.car.entity;

import java.util.Arrays;

public class Car {

	private String model;
	private Wheel[] wheel;
	private Engine engine;
	private int fuel;
	private int gasTank;

	public Car() {

		this.model = "BMW";
		this.wheel = new Wheel[4];
		int i = 0;
		for (i = 0; i < this.wheel.length; i++) {
			this.wheel[i] = new Wheel();
		}
		this.engine = new Engine("petrol", 6, 350);
		this.fuel = 40; // default fuel amount
		this.gasTank = 100;
	}

	public Car(String model, Wheel[] wheel, Engine engine, int fuel, int gasTank) {
		this.model = model;
		this.wheel = wheel;
		this.engine = engine;
		this.fuel = fuel;
		this.gasTank = gasTank;
	}

	public void setWheel(Wheel[] wheel) {
		this.wheel = wheel;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void addFuel(int fuel) {
		if (fuel > gasTank) {
			fuel = gasTank;
		}
		this.fuel += fuel;
	}

	public String getModel() {
		return this.model;
	}

	public Wheel[] getWheels() {
		return this.wheel;
	}

	public Engine getEngine() {
		return this.engine;
	}

	public int getFuel() {
		return this.fuel;
	}

	public int getGasTank() {
		return this.gasTank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + Arrays.hashCode(wheel);
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
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (!Arrays.equals(wheel, other.wheel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", wheel=" + Arrays.toString(wheel) + ", engine=" + engine + "]";
	}

}
