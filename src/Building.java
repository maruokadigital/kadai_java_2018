
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

	public void showInfo() {
		System.out.println("拠点名「"+ this.name +"」" );

	}

}
