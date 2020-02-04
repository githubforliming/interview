package singleton;
/**
 * ����ʽ  �õ�ʱ���ȥnew����
 * @author LM
 *
 */
public class Mgr06 {
	// ˽�л� �����಻��new
	private Mgr06() {}

	// ��Ҫ���� volitile ������ܻ�������� ������new���� ����û�и�ֵ������Ŀռ䣩
	private static volatile  Mgr06 INSTANCE ;
	 
	// ��ȡ����ʵ��  ˫���ж�
	public static  Mgr06 getInstance() {
		if (INSTANCE == null) {
			synchronized(Mgr06.class) {
				if (INSTANCE == null) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					INSTANCE  = new Mgr06();
				}
			}
		}
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr06.getInstance().hashCode());
			}).start();;
		}
	}
	
}
