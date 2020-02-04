package singleton;
/**
 * ����ʽ  �õ�ʱ���ȥnew����
 * @author LM
 *
 */
public class Mgr04 {
	// ˽�л� �����಻��new
	private Mgr04() {}

	private static  Mgr04 INSTANCE ;
	 
	// ��ȡ����ʵ��   ������ ���Ծ�û�ж��߳����� ���ǻ���� ���������Mgr04.class ����
	public static synchronized Mgr04 getInstance() {
		if (INSTANCE == null) {
			// ˯��1������Ϊ�˲��� ���̳߳��ֵ����� 
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			INSTANCE  = new Mgr04();
		}
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr04.getInstance().hashCode());
			}).start();;
		}
	}
	
}
