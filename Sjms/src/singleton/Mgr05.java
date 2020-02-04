package singleton;
/**
 * ����ʽ  �õ�ʱ���ȥnew����
 * @author LM
 *
 */
public class Mgr05 {
	// ˽�л� �����಻��new
	private Mgr05() {}

	private static  Mgr05 INSTANCE ;
	 
	// ��ȡ����ʵ�� 
	public static  Mgr05 getInstance() {
		if (INSTANCE == null) {
			// ��ͼͨ��synchronized ��ȡһ��ʵ�� ��ʵ�ǲ��е� ����߳�ͬʱ��ȡ�� ���Ŷ�new�¶��� 
			synchronized(Mgr05.class) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			INSTANCE  = new Mgr05();
		}
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr05.getInstance().hashCode());
			}).start();;
		}
	}
	
}
