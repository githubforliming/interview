package facedAndMediator;

/**
 * 员工
 * 
 * @author LM
 *
 */
public class Emp {

	Leader leader;

	public String name;

	// 领导 + 员工名称
	public Emp(Leader leader, String name) {
		this.leader = leader;
		this.name = name;
		leader.setEmps(this);
	}

	void qj(String re) {
		leader.qj(this, re);
	}
	
	// 接收领导通知
	void notice(String msg) {
		System.out.println(this.name+"收到："+msg);
	}
}
