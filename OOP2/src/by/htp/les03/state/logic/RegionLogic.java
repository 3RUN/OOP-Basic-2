package by.htp.les03.state.logic;

import by.htp.les03.state.entity.Area;
import by.htp.les03.state.entity.Region;

public class RegionLogic {

	public void addArea(Region region, Area area) {
		region.getAreas().add(area);
	}

	public void removeArea(Region region, Area area) {
		int i = 0;
		for (i = 0; i < region.getAreas().size(); i++) {

			// get name of the area we are about to check
			String tempArea = region.getAreas().get(i).getName();
			// compare it with the name of the given area
			if (tempArea.equals(area.getName())) {
				region.getAreas().remove(i);
			}

		}

	}

	public void updateSquare(Region region) {
		int i = 0;
		double square = 0;
		for (i = 0; i < region.getAreas().size(); i++) {
			square += region.getAreas().get(i).getSquare();
		}

		region.setSquare(square);
	}

	public void updatePopulation(Region region) {
		int i = 0;
		int population = 0;
		for (i = 0; i < region.getAreas().size(); i++) {
			population += region.getAreas().get(i).getPopulation();
		}

		region.setPopulation(population);
	}

	public void update(Region region) {
		updateSquare(region);
		updatePopulation(region);
	}

}
