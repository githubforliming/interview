package singleton;
/**
 * Ψһ�����⣺�����õ������ò��� INSTANCE ���ᱻʵ����
 * 
 * @author LM
 *
 */
public class Mgr01 {
	// ˽�л� �����಻��new
	private Mgr01() {}

	//��ֻload���ڴ�һ��  static����load��֮�� ���Ͼͼ��ص�
	private static final Mgr01 INSTANCE = new Mgr01();
	
	// ��ȡ����ʵ�� 
	public Mgr01 getInstance() {
		return INSTANCE;
	}
	
}
