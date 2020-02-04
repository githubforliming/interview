package singleton;
/**
 * 懒汉式  用的时候才去new对象
 * @author LM
 *
 */
public class Mgr06 {
	// 私有化 其他类不能new
	private Mgr06() {}

	// 需要加上 volitile 否则可能会出现问题 （对象new完了 但是没有赋值到分配的空间）
	private static volatile  Mgr06 INSTANCE ;
	 
	// 获取对象实例  双重判断
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
