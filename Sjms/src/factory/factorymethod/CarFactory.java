package factory.factorymethod;

public class CarFactory {
	// 返回值可以是Car 也可以是moveable
	public Moveable createCar() {
		//做一些处理
		System.out.println("创建car 先做一些什么处理。。");
		Car car = new Car();
		System.out.println("创建完car  再做一些什么处理");
		return car;
	}
	
}
