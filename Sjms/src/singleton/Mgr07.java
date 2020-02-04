package singleton;
/**
 * 静态内部类  
 * 静态内部类 在外部类加载的时候 它是不会被加载的
 * 调用getinstance 的时候 静态内部类才会加载 
 * 怎么保证的线程问题？ 虚拟机自己保证的  虚拟机在加载class的时候 会自己保证只加载一次 
 * @author LM
 *
 */
public class Mgr07 {
	// 私有化 其他类不能new
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
