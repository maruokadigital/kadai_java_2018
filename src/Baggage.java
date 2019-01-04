
public class Baggage {

	//属性（フィールド）

	private String name;
	private int weight;
	private boolean exist;

	//コンストラクタ
	Baggage(String name, int weight,boolean exist){
		setName(name);
		setWeight(weight);
		setExist(exist);

	}
	Baggage(String name, int weight){
		this(name, weight, true);
	}
	Baggage(boolean exist){
		this();
		if(exist) {
			setName("空きスペース");
			setWeight(0);
			setExist(exist);
		}

	}
	Baggage(){
		this("不明",0, true);

	}


	//メソッド

	public void setExist(boolean exist) {
		this.exist = exist;
	}
	public boolean getExist() {
		return this.exist;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return this.weight;
	}

	public void showInfo() {
		System.out.println("荷物の名前「"+ this.name +"」　重さ：" + this.weight+"kg");
	}

}
