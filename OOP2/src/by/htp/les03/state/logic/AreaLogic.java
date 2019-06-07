package by.htp.les03.state.logic;

import by.htp.les03.state.entity.Area;
import by.htp.les03.state.entity.City;

public class AreaLogic {

	public static void addCity(Area area, City city) {
		area.getCities().add(city);
	}

	public static void removeCity(Area area, City city) {
		int i = 0;
		for (i = 0; i < area.getCities().size(); i++) {

			// get name of the city we are about to check
			String tempCity = area.getCities().get(i).getName();
			// compare it with the name of the given city
			if (tempCity.equals(city.getName())) {
				area.getCities().remove(i);
			}

		}

	}

	public static void updateSquare(Area area) {
		int i = 0;
		double square = 0;
		for (i = 0; i < area.getCities().size(); i++) {
			square += area.getCities().get(i).getSquare();
		}

		area.setSquare(square);
	}

	public static void updatePopulation(Area area) {
		int i = 0;
		int population = 0;
		for (i = 0; i < area.getCities().size(); i++) {
			population += area.getCities().get(i).getPopulation();
		}

		area.setPopulation(population);
	}

	public static void update(Area area) {
		updateSquare(area);
		updatePopulation(area);
	}

}
