package factory.abstractfactory;

/**
 *  ħ������ ���� ɨ�� ħ���� ����
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
