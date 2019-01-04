
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Baggage tsukue =new Baggage("机",5);
		Satelite fukui = new Satelite("福井");
		Satelite takefu = new Satelite("武生");
		Truck t1 = new Truck(1234);

		System.out.println("========初期状態の情報========");
		tsukue.showInfo();
		fukui.showInfo();
		takefu.showInfo();
		t1.showInfo();

		System.out.println("========荷物を福井で積載しました========");

		fukui.setBaggage(tsukue);
		fukui.setTruck(t1);
		fukui.sekisai();

		fukui.showInfo();
		takefu.showInfo();
		t1.showInfo();

		System.out.println("========荷物を武生に届けました========");


		takefu.setTruck(fukui.releaseTruck());
		takefu.nioroshi();

		fukui.showInfo();
		takefu.showInfo();
		t1.showInfo();
	}


}
