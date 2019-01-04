
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Baggage tsukue =new Baggage("机",5);
		tsukue.showInfo();

		Satelite fukui = new Satelite("福井");
		fukui.showInfo();

		Satelite takefu = new Satelite("武生");
		takefu.showInfo();

		fukui.setBaggage(tsukue);


	}

}
