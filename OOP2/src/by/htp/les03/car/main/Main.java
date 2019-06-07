package by.htp.les03.car.main;

import by.htp.les03.car.entity.Car;
import by.htp.les03.car.logic.CarLogic;

public class Main {

	public static void main(String[] args) {

		int fuel = 20;
		Car car = new Car();
		CarLogic.drive(car);
		CarLogic.refuel(car, fuel);
		CarLogic.changeWheel(car);
		System.out.println(car.getModel());

	}

}
