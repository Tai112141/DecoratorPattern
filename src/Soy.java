
public class Soy extends CondimentDecorator {
Baverage beverage;
	
	public Soy(Baverage beverage){
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription() + ",Soy";
	}
	public double cost(){
		return .15 + beverage.cost();
	}

}
