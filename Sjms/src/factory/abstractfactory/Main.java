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
		
		
		// car ak47  bread  ��һ����
		// saozhou mofabang xican ��һ����
		
		// ���ⶨ���Ʒһ��  
			// ���󹤳� 
		AbstactFactory factory = new MofaFactory();
		
		Jiaotonggongju jtgj = factory.creatJtgj();
		jtgj.go();
		Wuqi wuqi = factory.creatWuqi();
		wuqi.shoot();
		Food food = factory.creatFood();
		food.printName();
		
		// ��������  ��Ե�����Ʒ����չ�ȽϷ���  �����һ�������� ֱ������һ��FangBianmian.java  + FangBianMianFactory.java
		// ���󹤳������һ�������� �����Ѿ�ʵ����AbstractFactory ��Factory ����Ҫ�޸�  �Ƚ��鷳 
		
		// ���󹤳��ڲ�Ʒһ����չ���� 
		
	    
	}
}
