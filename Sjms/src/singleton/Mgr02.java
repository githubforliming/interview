package singleton;
/**
 * Mgr01 的另一种写法
 * @author LM
 *
 */
public class Mgr02 {
	// 私有化 其他类不能new
	private Mgr02() {}

	//类只load到内存一次  static是类load完之后 马上就加载的
	private static final Mgr02 INSTANCE ;
	static {
		INSTANCE = new Mgr02();
	}
	
	// 获取对象实例 
	public Mgr02 getInstance() {
		return INSTANCE;
	}
	
}
