package facedAndMediator;

public class Main {
	public static void main(String[] args) {
		// 员工A  员工B  员工C  三个人不认识  员工A 请假  工作需要B C 来做 需要组长Leader通知
		Leader leader = new Leader();
		Emp empA = new Emp(leader, "A");
		Emp empB = new Emp(leader, "B");
		Emp empC = new Emp(leader, "C");
		
		empA.qj("脑壳子疼！");
		
	}
}
