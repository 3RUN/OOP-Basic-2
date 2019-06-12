package by.htp.les03.state.logic;

import by.htp.les03.state.entity.Area;
import by.htp.les03.state.entity.Region;
import by.htp.les03.state.entity.State;

public class StateLogic {

	public void addRegion(State state, Region region) {
		state.getRegions().add(region);
	}

	public void removeRegion(State state, Region region) {
		int i = 0;
		for (i = 0; i < state.getRegions().size(); i++) {

			// get name of the region we are about to check
			String tempArea = state.getRegions().get(i).getName();
			// compare it with the name of the given region
			if (tempArea.equals(region.getName())) {
				state.getRegions().remove(i);
			}

		}
	}

	public void update(State state, Region region, Area area) {
		AreaLogic areaLogic = new AreaLogic();
		areaLogic.update(area);

		RegionLogic regionLogic = new RegionLogic();
		regionLogic.update(region);

		int i = 0;
		int population = 0;
		double square = 0;
		for (i = 0; i < state.getRegions().size(); i++) {
			population += state.getRegions().get(i).getPopulation();
			square += state.getRegions().get(i).getSquare();
		}

		state.setPopulation(population);
		state.setSquare(square);
	}

}
