package facedAndMediator;

/**
 * Ա��
 * 
 * @author LM
 *
 */
public class Emp {

	Leader leader;

	public String name;

	// �쵼 + Ա������
	public Emp(Leader leader, String name) {
		this.leader = leader;
		this.name = name;
		leader.setEmps(this);
	}

	void qj(String re) {
		leader.qj(this, re);
	}
	
	// �����쵼֪ͨ
	void notice(String msg) {
		System.out.println(this.name+"�յ���"+msg);
	}
}
