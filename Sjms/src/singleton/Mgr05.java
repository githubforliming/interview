package singleton;
/**
 * 懒汉式  用的时候才去new对象
 * @author LM
 *
 */
public class Mgr05 {
	// 私有化 其他类不能new
	private Mgr05() {}

	private static  Mgr05 INSTANCE ;
	 
	// 获取对象实例 
	public static  Mgr05 getInstance() {
		if (INSTANCE == null) {
			// 企图通过synchronized 获取一个实例 其实是不行的 多个线程同时获取锁 会排队new新对象 
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
