
public class Baggage {

	//属性（フィールド）

	private String name;
	private int weight;
	private boolean isEmpty;

	//コンストラクタ
	Baggage(String name, int weight,boolean isEmpty){
		setName(name);
		setWeight(weight);
		setIsEmpty(isEmpty);

	}
	Baggage(String name, int weight){
		this(name, weight, true);
	}
	Baggage(boolean isEmpty){
		this();
		if(isEmpty) {
			setName("空きスペース");
			setWeight(0);
			setIsEmpty(isEmpty);
		}

	}
	Baggage(){
		this("不明",0, true);

	}


	//メソッド

	public void setIsEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	public boolean getIsEmpty() {
		return this.isEmpty;
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
