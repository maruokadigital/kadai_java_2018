
public class Truck extends Car {

	private Baggage baggage;
	private final static Baggage KARAPPO = new Baggage(false);

	Truck(){
		setBaggage(KARAPPO) ;
	}

	public void setBaggage(Baggage baggage) {
		if(this.baggage.getExist()) {

			System.out.println("荷物が既にあります");

		}else {
			System.out.println("荷物を積みます");
			this.baggage = baggage;

		}

	}
	public void showInfo() {
		String bName = this.baggage.getName();
		int bWeight = this.baggage.getWeight();

		System.out.println("カーナンバー「"+ this.getCarNum()+"」 荷物名「"+bName+"」重さ　"+bWeight+"kg");


	}

}
