
public class Satelite extends Building {

	Baggage baggage;
	Truck truck;

	Satelite(String name){
		super(name);
	}
	Satelite(){
		super();
	}

	public void setBaggage(Baggage baggage) {
		if(this.baggage.getExist()) {

			System.out.println("荷物が既にあります");

		}else {
			System.out.println("荷物を積みます");
			this.baggage = baggage;

		}

	}
	public Baggage getBaggage() {
		return this.baggage;
	}
	public void sekisai(Truck truck, Baggage baggage) {

	}



}
