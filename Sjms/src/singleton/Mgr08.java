package singleton;
/**
 * �������� ����ֹ�˷��䴴��������� 
 * ö����û�й��췽�� �������õ�class�ļ� Ҳû�а취�������Ķ���
 * @author LM
 *
 */
public enum Mgr08 {
	INSTANCE;
	
	public void sys() {
		System.out.println("~~~~~~~~~~");
	}
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr08.INSTANCE.hashCode());
			}).start();;
		}
	}
	
}
