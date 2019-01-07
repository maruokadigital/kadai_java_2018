
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		runKadai1();
		runKadai2();

	}
	static void runKadai1() {
		Baggage tsukue =new Baggage("机",5);
		Satelite fukui = new Satelite("福井");
		Satelite takefu = new Satelite("武生");
		Truck t1 = new Truck(1234);

		System.out.println("========初期状態の情報========");
		tsukue.showInfo();
		showAllInfo(fukui,takefu,t1);

		System.out.println("========荷物を福井で預かりました========");
		fukui.setBaggage(tsukue);
		fukui.setTruck(t1);
		showAllInfo(fukui,takefu,t1);


		System.out.println("========荷物を福井で積載しました========");
		fukui.sekisai(t1);
		showAllInfo(fukui,takefu,t1);

		System.out.println("========荷物を武生に届けました========");
		takefu.setTruck(fukui.releaseTruck());
		takefu.nioroshi();
		showAllInfo(fukui,takefu,t1);

	}
	static void runKadai2() {
		System.out.println("========荷物と拠点をクール便対応にします========");

		Baggage iceCream = new Baggage("アイスクリーム",10);
		iceCream.setNeedCooler(true);


		CoolSatelite fukui = new CoolSatelite("福井");
		Satelite takefu = new Satelite("武生");
		Truck t1 = new Truck(1234);
		CoolTruck ct1 = new CoolTruck(1192);

		System.out.println("========トラックがクール便対応か確認します========");
		iceCream.anserLoadableOn(t1);
		iceCream.anserLoadableOn(ct1);
		ct1.setBaggage(iceCream);

	}

	static void showAllInfo(Satelite a ,Satelite b ,Truck c) {
		a.showInfo();
		b.showInfo();
		c.showInfo();
	}
}
