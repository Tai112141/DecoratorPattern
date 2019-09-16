
public class jelly extends CondimentDecorator {
Baverage beverage;
	
	public jelly(Baverage beverage){
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription() + ",jelly";
	}
	public double cost(){
		return .10 + beverage.cost();
	}

}
