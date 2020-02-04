package singleton;
/**
 * Mgr01 ����һ��д��
 * @author LM
 *
 */
public class Mgr02 {
	// ˽�л� �����಻��new
	private Mgr02() {}

	//��ֻload���ڴ�һ��  static����load��֮�� ���Ͼͼ��ص�
	private static final Mgr02 INSTANCE ;
	static {
		INSTANCE = new Mgr02();
	}
	
	// ��ȡ����ʵ�� 
	public Mgr02 getInstance() {
		return INSTANCE;
	}
	
}
