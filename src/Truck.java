
public class Truck extends Car {

	private Baggage baggage;
	private final static Baggage KARAPPO = new Baggage(false);
	private boolean exist;


	Truck(){
		this(0);
	}
	Truck(int carNum){
		super(carNum);
		this.baggage = KARAPPO;
		this.exist = true;
	}
	Truck(boolean exist){
		this();
		this.exist = exist;

	}

	public void setBaggage(Baggage baggage) {
		if (baggage.isEmpty()) {
			if (this.baggage.isEmpty()) {
				return;
			} else {
				System.out.println("カーナンバー"+getCarNum()+"には荷物が既にあります。何もしません");
			}
		} else if (this.baggage.isEmpty()) {
			System.out.println("カーナンバー"+getCarNum()+"に荷物「"+baggage.getName()+"」を積みます");
			this.baggage = baggage;

		} else {
			System.out.println("カーナンバー"+getCarNum()+"には荷物が既にあります。何もしません");
		}
	}

	public Baggage getBaggage() {
		return this.baggage;
	}
	public Baggage releaseBaggage() {
		Baggage b = this.baggage;
		this.baggage = KARAPPO;

		return b;

	}
	public String toString() {

		String bName = this.baggage.getName();
		int bWeight = this.baggage.getWeight();

		return "カーナンバー「"+ this.getCarNum()+"」 荷物名「"+bName+"」重さ　"+bWeight+"kg";
	}

	public void showInfo() {

		System.out.println(this);


	}
	public boolean isExist() {
		return this.exist;
	}

}
