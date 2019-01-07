
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		runKadai1();
		runKadai2();
		runKadai3();

	}
	static void runKadai1() {
		System.out.println("====================================================");
		System.out.println("==========課題の通りにメソッドを作った場合==========");
		System.out.println("====================================================");
		Baggage tsukue =new Baggage("机",5);
		Satelite fukui = new Satelite("福井");
		Satelite takefu = new Satelite("武生");
		Truck truck = new Truck(1234);

		System.out.println("========初期状態の情報========");
		tsukue.showInfo();
		showAllInfo(fukui,takefu,truck);

		System.out.println("========荷物を福井で預かりました========");
		fukui.setBaggage(tsukue);
		showAllInfo(fukui,takefu,truck);


		System.out.println("========荷物を福井で積載しました========");
		fukui.sekisai(truck,tsukue);
		showAllInfo(fukui,takefu,truck);

		System.out.println("========荷物を武生に届けました========");
		takefu.nioroshi(truck,tsukue);
		showAllInfo(fukui,takefu,truck);


		System.out.println("=");

	}
	static void runKadai2() {
		System.out.println("====================================================");
		System.out.println("=====荷物を手放すメソッドを追加して改良します======");
		System.out.println("====================================================");
		Baggage tsukue =new Baggage("机",5);
		Satelite fukui = new Satelite("福井");
		Satelite takefu = new Satelite("武生");
		Truck truck = new Truck(1234);

		System.out.println("========初期状態の情報========");
		tsukue.showInfo();
		showAllInfo(fukui,takefu,truck);

		System.out.println("========荷物を福井で預かりました========");
		fukui.setBaggage(tsukue);
		fukui.setTruck(truck);
		showAllInfo(fukui,takefu,truck);


		System.out.println("========荷物を福井で積載しました========");
		fukui.sekisai(truck);
		showAllInfo(fukui,takefu,truck);

		System.out.println("========荷物を武生に届けました========");
		takefu.setTruck(fukui.releaseTruck());
		takefu.nioroshi();
		showAllInfo(fukui,takefu,truck);

		System.out.println("=");
	}
	static void runKadai3() {
		System.out.println("====================================================");
		System.out.println("==========荷物と拠点をクール便対応にします==========");
		System.out.println("====================================================");

		Baggage iceCream = new Baggage("アイスクリーム",10);
		iceCream.setNeedCooler(true);


		CoolSatelite fukui = new CoolSatelite("福井");
		Satelite takefu = new Satelite("武生");
		Truck truck = new Truck(1234);
		CoolTruck coolTruck = new CoolTruck(1192);

		System.out.println("========トラックがクール便対応か確認します========");
		iceCream.anserLoadableOn(truck);
		iceCream.anserLoadableOn(coolTruck);
		coolTruck.setBaggage(iceCream);

		System.out.println("========荷物を福井で預かりました========");
		fukui.setBaggage(iceCream);
		fukui.setTruck(truck);
		showAllInfo(fukui,takefu,truck);


		System.out.println("========荷物を福井で積載しました========");
		fukui.sekisai(truck);
		showAllInfo(fukui,takefu,truck);

		System.out.println("========荷物を武生に届けました========");
		takefu.setTruck(fukui.releaseTruck());
		takefu.nioroshi();
		showAllInfo(fukui,takefu,truck);

		System.out.println("=");
	}

	static void showAllInfo(Satelite a ,Satelite b ,Truck c) {
		a.showInfo();
		b.showInfo();
		c.showInfo();
	}
}
