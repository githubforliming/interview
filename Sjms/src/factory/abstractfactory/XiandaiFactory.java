package factory.abstractfactory;

/**
 *  �ִ�������  ������ ǹ  ���
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
