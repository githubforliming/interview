package factory.abstractfactory;

/**
 *  现代化工厂  创建车 枪  面包
 * @author LM
 *
 */
public class XiandaiFactory extends AbstactFactory {

	@Override
	Food creatFood() {
		return  new Bread();
	}

	@Override
	Jiaotonggongju creatJtgj() {
		return new Car();
	}

	@Override
	Wuqi creatWuqi() {
		return new AK47();
	}

}
