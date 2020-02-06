package factory.abstractfactory;

/**
 *  魔法工厂 创建 扫帚 魔法棒 西餐
 * @author LM
 *
 */
public class MofaFactory extends AbstactFactory {

	@Override
	Food creatFood() {
		 return new Xican();
	}

	@Override
	Jiaotonggongju creatJtgj() {
		 return new Saozhou();
	}

	@Override
	Wuqi creatWuqi() {
		 return new Mofabang();
	}

}
