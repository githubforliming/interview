package singleton;
/**
 * 懒汉式  用的时候才去new对象
 * @author LM
 *
 */
public class Mgr03 {
	// 私有化 其他类不能new
	private Mgr03() {}

	private static  Mgr03 INSTANCE ;
	 
	// 获取对象实例   多线程访问 有问题
	public static Mgr03 getInstance() {
		if (INSTANCE == null) {
			// 睡眠1毫秒是为了测试 多线程出现的问题 
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
