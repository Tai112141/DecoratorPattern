
public class StarbuzzCoffee {

	public static void main(String[] args) {
		Baverage beverage = new Espresso();
		System.out.println(beverage.getDescription());
		System.out.println("Price :"+"$" +beverage.cost());
		System.out.println("=============================");
		
		Baverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription());
		System.out.println("Price :"+"$" +beverage2.cost());
		System.out.println("=============================");
		
		Baverage beverage3 = new HoseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription());
		System.out.println("Price :"+"$" +beverage3.cost());
		System.out.println("=============================");
		
		Baverage beverage4 = new Cappuccino();
		beverage4 = new jelly(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Whip(beverage4);
		System.out.println(beverage4.getDescription());
		System.out.println("Price :"+"$" +beverage4.cost());
		System.out.println("=============================");
		
		Baverage beverage5 = new Americano();
		beverage5 = new jelly(beverage5);
		beverage5 = new Soy(beverage5);
		beverage5 = new Whip(beverage5);
		System.out.println(beverage5.getDescription());
		System.out.println("Price :"+"$" +beverage5.cost());
		System.out.println("=============================");
		
	}

}
