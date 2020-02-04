package singleton;
/**
 * 不仅单例 还防止了反射创建多个对象 
 * 枚举类没有构造方法 就算是拿到class文件 也没有办法构造它的对象
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
