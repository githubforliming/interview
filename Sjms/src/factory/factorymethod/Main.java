package factory.factorymethod;

public class Main {
	public static void main(String[] args) {
//		Moveable moveable = new SFactory().createCar();
		Moveable moveable = new CarFactory().createCar();
		
		moveable.go();
	}
}
