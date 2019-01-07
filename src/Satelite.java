
public class Satelite extends Building {

	Baggage baggage;
	Truck truck;
	private final static Truck KURUMANASHI = new Truck(false);
	private final static Baggage KARAPPO = new Baggage(false);

	Satelite(String name) {
		super(name);
		this.baggage = KARAPPO;
		this.truck = KURUMANASHI;

	}

	Satelite() {
		this("不明な拠点");
	}

	public void setBaggage(Baggage baggage) {
		if(this.baggage.isEmpty()) {
			if(baggage.isEmpty()) {
				System.out.println(getName() + "でやることは何もありません");

			}else {
				this.baggage = baggage;
				System.out.println(getName() + "で荷物「"+this.baggage.getName()+"」を預かります");
			}
		}else {
			System.out.println(getName() + "には荷物「"+this.baggage.getName()+"」が既にあります。何もしません");
		}


	}

	public Baggage getBaggage() {
		return this.baggage;
	}
	public void setTruck(Truck truck) {
		if(this.truck.isExist()) {
			System.out.println(getName() + "にはトラックNo."+this.truck.getCarNum()+"が既に駐車中で止められません");
		}else {
			if(truck.isExist()) {
				this.truck = truck;
				System.out.println(getName() + "にトラックNo."+this.truck.getCarNum()+"を駐車します");
			}else {
				System.out.println(getName() + "でやることは何もありません");
			}
		}
	}

	public Truck getTruck() {
		return this.truck;
	}
	public Truck releaseTruck() {
		Truck t = this.truck;
		this.truck = KURUMANASHI;

		return t;

	}

	public void sekisai(Truck truck, Baggage baggage) {
		if(truck.getBaggage().isEmpty()) {
			if(baggage.isEmpty()) {
				System.out.println(getName() + "でやることは何もありません");
			}else {
				System.out.print(getName() + "で荷物「" + baggage.getName() + "」をトラック");
				truck.setBaggage(baggage);
			}
		}else {
			System.out.println(getName() + "には荷物「"+this.baggage.getName()+"」が既にあります。何もしません");
		}

	}

	public void sekisai(Truck truck) {
		if (this.baggage.isEmpty()) {
			System.out.println(getName() + "には積むべき荷物がありません");

		} else {
			sekisai(truck, this.releaseBaggage());
		}

	}
	public void sekisai() {
		if (this.truck.isExist()) {
			sekisai(truck);

		} else {
			System.out.println(getName() + "にはトラックが駐車していません");
		}

	}

	public Baggage releaseBaggage() {
		Baggage b = this.baggage;
		this.baggage = KARAPPO;

		return b;

	}
	public void nioroshi(Truck truck) {
		if(truck.getBaggage().isEmpty()) {
			System.out.println("トラックに荷物がないので"+getName() + "でやることは何もありません");

		}else {
			if(this.baggage.isEmpty()) {
				setBaggage(truck.releaseBaggage());
			}else {
				System.out.println(getName() + "には荷物「"+this.baggage.getName()+"」が既にあります。何もしません");

			}
		}

	}
	public void nioroshi() {

		if(this.truck.isExist()) {
			nioroshi(this.truck);

		}else {
			System.out.println("トラックがないので"+getName() + "でやることは何もありません");
		}

	}

	public void showInfo() {
		String str = "拠点名「"+getName()+"」";
		if(baggage.isEmpty()) {
			str += ":荷物はありません";
		}else {
			str += ":荷物「" + baggage.getName() + "」";
		}
		System.out.println(str);

		//showInfo("荷物");
	}

	/*
	//ここからは上級者向けの工夫です
	public String toString() {

		return toString(new String[] {}) ;
		//return super+":駐車トラックNo."++" :保管荷物「"+this.baggage.getName()+"」
	}
	public String toString(String... args) {
		String truckInfo = "";
		String baggageInfo = "";

		for(String s:args) {
			if(s.equals("トラック")||s.equals("駐車場")||s.toLowerCase().equals("truck")||s.toLowerCase().equals("trucks")) {
				truckInfo = ":駐車トラック";
				if (this.truck.isExist()) {
					truckInfo +="No."+this.truck.getCarNum();
				}else {
					truckInfo +="はありません。";
				}

			}
			if(s.equals("荷物")||s.toLowerCase().equals("baggage")||s.toLowerCase().equals("baggages")) {
				if(baggage.isEmpty()) {
					baggageInfo = ":荷物はありません";
				}else {
					baggageInfo = ":荷物「" + baggage.getName() + "」";
				}

			}


		}

		return super.toString() + truckInfo + baggageInfo;
	}
	public void showInfo(String... args) {
		System.out.println(toString(args));

	}
	 */


}
