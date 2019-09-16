
public class SteamedMilk extends CondimentDecorator {
Baverage beverage;
	
	public SteamedMilk(Baverage beverage){
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription() + ",SteamedMilk";
	}
	public double cost(){
		return .10 + beverage.cost();
	}
}
