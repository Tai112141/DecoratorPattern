
public class Mocha extends CondimentDecorator {
	Baverage beverage;
	
	public Mocha(Baverage beverage){
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription() + ",Mocha";
	}
	public double cost(){
		return .20 + beverage.cost();
	}
}
