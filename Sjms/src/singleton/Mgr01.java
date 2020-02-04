package singleton;
/**
 * 唯一的问题：不管用到还是用不到 INSTANCE 都会被实例化
 * 
 * @author LM
 *
 */
public class Mgr01 {
	// 私有化 其他类不能new
	private Mgr01() {}

	//类只load到内存一次  static是类load完之后 马上就加载的
	private static final Mgr01 INSTANCE = new Mgr01();
	
	// 获取对象实例 
	public Mgr01 getInstance() {
		return INSTANCE;
	}
	
}
