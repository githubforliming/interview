package factory.factorymethod;

public class CarFactory {
	// ����ֵ������Car Ҳ������moveable
	public Moveable createCar() {
		//��һЩ����
		System.out.println("����car ����һЩʲô������");
		Car car = new Car();
		System.out.println("������car  ����һЩʲô����");
		return car;
	}
	
}
