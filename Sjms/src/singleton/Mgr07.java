package singleton;
/**
 * ��̬�ڲ���  
 * ��̬�ڲ��� ���ⲿ����ص�ʱ�� ���ǲ��ᱻ���ص�
 * ����getinstance ��ʱ�� ��̬�ڲ���Ż���� 
 * ��ô��֤���߳����⣿ ������Լ���֤��  ������ڼ���class��ʱ�� ���Լ���ֻ֤����һ�� 
 * @author LM
 *
 */
public class Mgr07 {
	// ˽�л� �����಻��new
	private Mgr07() {}

	private static class  Mgr07Holder{
		private final static Mgr07 INSTANCE  = new Mgr07();
	}
	
	public static Mgr07 getInstance() {
		return Mgr07Holder.INSTANCE;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr07.getInstance().hashCode());
			}).start();;
		}
	}
	
}
