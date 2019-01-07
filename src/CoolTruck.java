
public class CoolTruck extends Truck implements Cooler {
	Boolean isCooling=false;

	CoolTruck(){
		switchCooler(true);
	}
	CoolTruck(int carNum){
		super(carNum);
		switchCooler(true);
	}




	@Override
	public boolean isCool() {
		// TODO 自動生成されたメソッド・スタブ
		return this.isCooling;
	}

	@Override
	public boolean switchCooler() {
		this.isCooling = !this.isCooling;
		// TODO 自動生成されたメソッド・スタブ
		return this.isCooling;
	}

	@Override
	public boolean switchCooler(Boolean isCooling) {
		this.isCooling = isCooling;
		// TODO 自動生成されたメソッド・スタブ
		return this.isCooling;
	}

}
