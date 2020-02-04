package singleton;
/**
 * ����ʽ  �õ�ʱ���ȥnew����
 * @author LM
 *
 */
public class Mgr03 {
	// ˽�л� �����಻��new
	private Mgr03() {}

	private static  Mgr03 INSTANCE ;
	 
	// ��ȡ����ʵ��   ���̷߳��� ������
	public static Mgr03 getInstance() {
		if (INSTANCE == null) {
			// ˯��1������Ϊ�˲��� ���̳߳��ֵ����� 
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			INSTANCE  = new Mgr03();
		}
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr03.getInstance().hashCode());
			}).start();;
		}
	}
	
}
