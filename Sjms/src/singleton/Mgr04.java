package singleton;
/**
 * 懒汉式  用的时候才去new对象
 * @author LM
 *
 */
public class Mgr04 {
	// 私有化 其他类不能new
	private Mgr04() {}

	private static  Mgr04 INSTANCE ;
	 
	// 获取对象实例   加锁了 所以就没有多线程问题 但是会变慢 这里的锁是Mgr04.class 对象
	public static synchronized Mgr04 getInstance() {
		if (INSTANCE == null) {
			// 睡眠1毫秒是为了测试 多线程出现的问题 
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
