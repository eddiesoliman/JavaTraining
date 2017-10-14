package basics;

public class Weather {
	public static void main(String[] args) {
		int temperature = 55;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and a t-shirt");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans");
			System.out.println("Wear hat!");
		}
		else if ((temperature > 50) || sunCondition == "Overcast")
			System.out.println("Cool day!");
		else {
			System.out.println("It's cold! - wear a jacket!");
		}
	}

}
