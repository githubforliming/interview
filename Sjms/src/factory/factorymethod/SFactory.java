package factory.factorymethod;

/**
 * �򵥹���  ��չ�Բ���  ����ÿһ�ֽ�ͨ���߶����Լ���һ��Factory
 * 
 * @author LM
 *
 */
public class SFactory {
	public Car createCar() {
		// ����һЩ����
		return new Car();
	}

	public PPlane createPPlane() {
		// ����һЩ����
		return new PPlane();
	}

}
