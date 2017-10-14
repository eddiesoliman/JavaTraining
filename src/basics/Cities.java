package basics;

public class Cities {

	public static void main(String[] args) {
		
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas" };
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);

		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		boolean stateFound = false;
		int n = 0;
		while (!stateFound ) {
			String state = states[n];
			if (state == "Texas") {
				System.out.println(states[n]);
				stateFound = true;
			}
			n++;
		}
		
		
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);

		}
		
		
		String[] countries;
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "China";
		countries[2] = "Russia";
		
		int i = 0;
		do {
			System.out.println(countries[i]);
			i += 1;
		} while ( i < 3);

	}

}
