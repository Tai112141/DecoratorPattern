
public class Whip extends CondimentDecorator {
Baverage beverage;
	
	public Whip(Baverage beverage){
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription() + ",Whip";
	}
	public double cost(){
		return .10 + beverage.cost();
	}
}
