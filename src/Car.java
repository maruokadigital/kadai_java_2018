
public abstract class Car {
	private int carNum;

	Car(int carNum){
		setCarNum(carNum);
	}
	Car(){
		setCarNum(0);
	}


	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public int getCarNum() {
		return this.carNum;
	}
	public abstract void showInfo();

}
