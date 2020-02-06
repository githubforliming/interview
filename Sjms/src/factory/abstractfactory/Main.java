package factory.abstractfactory;

public class Main {
	public static void main(String[] args) {
//		Car car = new Car();
//		car.go();
//		
//		AK47 ak47 = new AK47();
//		ak47.shoot();
//		
//		Bread bread = new Bread();
//		bread.printName();
//		
//		
//		//------------------
//		Saozhou saozhou = new Saozhou();
//		saozhou.go();
//		
//		Mofabang mofabang = new Mofabang();
//		mofabang.shoot();
//		
//		Xican xican = new Xican();
//		xican.printName();
		
		
		// car ak47  bread  是一个族
		// saozhou mofabang xican 是一个族
		
		// 任意定义产品一族  
			// 抽象工厂 
		AbstactFactory factory = new MofaFactory();
		
		Jiaotonggongju jtgj = factory.creatJtgj();
		jtgj.go();
		Wuqi wuqi = factory.creatWuqi();
		wuqi.shoot();
		Food food = factory.creatFood();
		food.printName();
		
		// 工厂方法  针对单个物品的扩展比较方便  比如加一个方便面 直接诶加一个FangBianmian.java  + FangBianMianFactory.java
		// 抽象工厂如果加一个方便面 所有已经实现了AbstractFactory 的Factory 都需要修改  比较麻烦 
		
		// 抽象工厂在产品一族扩展方便 
		
	    
	}
}
