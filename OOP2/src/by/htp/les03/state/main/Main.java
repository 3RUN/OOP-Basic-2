package by.htp.les03.state.main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import by.htp.les03.state.entity.Area;
import by.htp.les03.state.entity.City;
import by.htp.les03.state.entity.Region;
import by.htp.les03.state.entity.State;

public class Main {

	private static DecimalFormat decimal = new DecimalFormat("#.##");

	public static void main(String[] args) {

		City[] cityKchr = new City[5];
		cityKchr[0] = new City("Cherkessk", 122395, 69.8D);
		cityKchr[1] = new City("Karachaevsk", 21047, 11.84D);
		cityKchr[2] = new City("Teberda", 8644, 10.57D);
		cityKchr[3] = new City("Uchkeken", 16512, 15.15D);
		cityKchr[4] = new City("Pervomaisk", 12245, 8.45D);

		City[] cityStav = new City[5];
		cityStav[0] = new City("Essentuki", 110479, 50.0D);
		cityStav[1] = new City("Pyatigorsk", 146262, 97.0D);
		cityStav[2] = new City("Kislovodsk", 129098, 72.0D);
		cityStav[3] = new City("Zheleznovodsk", 24768, 93.13D);
		cityStav[4] = new City("Stavropol", 433931, 171.7D);

		City[] cityMos = new City[5];
		cityMos[0] = new City("Moscow", 12615882, 2561.5D);
		cityMos[1] = new City("Domodedovo", 54080, 159.27D);
		cityMos[2] = new City("Vostriakovo", 16646, 25.0D);
		cityMos[3] = new City("Balashiha", 468221, 62.80D);
		cityMos[4] = new City("Chernoe", 4047, 32.8D);

		// Karachai-Cherkess region
		List<City> pricubanskCities = new ArrayList<City>();
		pricubanskCities.add(cityKchr[0]);
		Area pricubansk = new Area("Pricubansky area", "Cherkessk", pricubanskCities);

		List<City> karachaevskCities = new ArrayList<City>();
		karachaevskCities.add(cityKchr[1]);
		Area karachaevsk = new Area("Karachaevski area", "Karachaevsk", karachaevskCities);

		List<City> teberdaCities = new ArrayList<City>();
		teberdaCities.add(cityKchr[2]);
		Area teberda = new Area("Teberdinski area", "Teberda", teberdaCities);

		List<City> malokarachaiCities = new ArrayList<City>();
		malokarachaiCities.add(cityKchr[3]);
		malokarachaiCities.add(cityKchr[4]);
		Area malokarachaevsk = new Area("Malokarachaevski area", "Uchkeken", malokarachaiCities);

		List<Area> kchrArea = new ArrayList<Area>();
		kchrArea.add(pricubansk);
		kchrArea.add(karachaevsk);
		kchrArea.add(teberda);
		kchrArea.add(malokarachaevsk);
		Region karachaiRegion = new Region("Karachay Cherkess Republic", "Cherkessk", kchrArea);

		// Stavropolski region
		List<City> kmvCities = new ArrayList<City>();
		kmvCities.add(cityStav[0]);
		kmvCities.add(cityStav[1]);
		kmvCities.add(cityStav[2]);
		kmvCities.add(cityStav[3]);
		Area kmv = new Area("Kavkazskie Mineralnie Vodi", "Pyatigorsk", kmvCities);

		List<City> stavropolCities = new ArrayList<City>();
		stavropolCities.add(cityStav[4]);
		Area stavropol = new Area("Stavropolski area", "Stavropol", stavropolCities);

		List<Area> stavropolArea = new ArrayList<Area>();
		stavropolArea.add(kmv);
		stavropolArea.add(stavropol);
		Region stavropolRegion = new Region("Stavropolski region", "Stavropol", stavropolArea);

		// Moscow region
		List<City> moscowCities = new ArrayList<City>();
		moscowCities.add(cityMos[0]);
		Area moscow = new Area("Moscow area", "Moscow", moscowCities);

		List<City> domodedovoCities = new ArrayList<City>();
		domodedovoCities.add(cityMos[1]);
		domodedovoCities.add(cityMos[2]);
		Area domodedovo = new Area("Domodedovo area", "Domodedovo", domodedovoCities);

		List<City> balashihaCities = new ArrayList<City>();
		balashihaCities.add(cityMos[3]);
		balashihaCities.add(cityMos[4]);
		Area balashiha = new Area("Balashiha area", "Balashiha", balashihaCities);

		List<Area> moscowArea = new ArrayList<Area>();
		moscowArea.add(moscow);
		moscowArea.add(domodedovo);
		moscowArea.add(balashiha);
		Region moscowRegion = new Region("Moscow region", "Moscow", moscowArea);

		List<Region> region = new ArrayList<Region>();
		region.add(moscowRegion);
		region.add(stavropolRegion);
		region.add(karachaiRegion);
		State Russia = new State("Russian Fediration", "Moscow", region);

		System.out.println("The capital of Russian Fediration is " + Russia.getCapital() + ".");
		System.out.println("Russian Fediration has total of " + Russia.getRegions().size() + " regions.");
		System.out.println(
				"Square of Russian Fediration equals to " + decimal.format(Russia.getSquare()) + " square kilometers.");

		System.out.println("\nShow capitals of all (known) regions of Russian Fediration:");
		int i = 0;
		for (i = 0; i < Russia.getRegions().size(); i++) {

			String nameOfRegion = Russia.getRegions().get(i).getName();
			String capitalOfRegion = Russia.getRegions().get(i).getCenter();
			System.out.println("Capital of " + nameOfRegion + " is " + capitalOfRegion + ".");

		}

	}

}
