
public abstract class Building {

	//属性（フィールド）

	private String name;

	Building(String name){
		setName(name);

	}
	Building(){
		setName("不明");

	}


	//メソッド
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public String toString() {
		return "拠点名「"+ this.name +"」";
	}

	public void showInfo() {
		System.out.println(this);

	}

}
