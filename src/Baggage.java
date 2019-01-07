
public class Baggage {

	//属性（フィールド）

	private String name;
	private int weight;
	private boolean exist;
	private boolean needCooler;

	//コンストラクタ
	Baggage(String name, int weight,boolean exist){
		setName(name);
		setWeight(weight);
		setExist(exist);
		setNeedCooler(false);

	}
	Baggage(String name, int weight){
		this(name, weight, true);
	}
	Baggage(boolean exist){
		this();
		if(!exist) {
			setName("空きスペース");
			setWeight(0);
			setExist(exist);
		}

	}
	Baggage(){
		this("不明",0, true);

	}


	//メソッド
	public boolean isEmpty() {
		return !this.exist;
	}
	public void setNeedCooler(boolean b) {
		this.needCooler = b;
	}
	public void setNeedCooler() {
		setNeedCooler(true);
	}
	public boolean getNeedCooler() {
		return this.needCooler;
	}


	public void setExist(boolean exist) {
		this.exist = exist;
	}
	public boolean isExist() {
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
	public boolean anserLoadableOn(Object o) {
		String mes;
		boolean answer=false;

		if(o instanceof CoolTruck) {
			CoolTruck obj = (CoolTruck)o;
			if (obj.isCooling) {
				mes = "可能：カーナンバー「"+obj.getCarNum()+"」に荷物「"+this.name+"」に保存可能";
				answer=true;
			}else {
				mes = "不可：ナンバー「"+obj.getCarNum()+"」に荷物「"+this.name+"」に保存できません";
				answer=false;

			}

		}else if(o instanceof CoolSatelite) {
			CoolSatelite obj = (CoolSatelite)o;
			if (obj.isCooling) {
				mes = "可能：拠点「"+obj.getName()+"」に荷物「"+this.name+"」に保存可能";
				answer=true;
			}else {
				mes = "不可：拠点「"+obj.getName()+"」に荷物「"+this.name+"」に保存できません";
				answer=false;

			}


		}else {
			mes ="不可：この荷物をここに保存できません";
			answer=false;
		}

		System.out.println(mes);
		return answer;
	}

	public void showInfo() {
		if(this.isEmpty()) {
			System.out.println("荷物はありません");

		}else {
			System.out.println("荷物の名前「"+ this.name +"」　重さ：" + this.weight+"kg");
		}
	}

}
