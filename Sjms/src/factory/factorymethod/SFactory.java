package factory.factorymethod;

/**
 * 简单工厂  扩展性不好  可以每一种交通工具都有自己的一个Factory
 * 
 * @author LM
 *
 */
public class SFactory {
	public Car createCar() {
		// 处理一些东西
		return new Car();
	}

	public PPlane createPPlane() {
		// 处理一些东西
		return new PPlane();
	}

}
