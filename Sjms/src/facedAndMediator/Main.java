package facedAndMediator;

public class Main {
	public static void main(String[] args) {
		// Ա��A  Ա��B  Ա��C  �����˲���ʶ  Ա��A ���  ������ҪB C ���� ��Ҫ�鳤Leader֪ͨ
		Leader leader = new Leader();
		Emp empA = new Emp(leader, "A");
		Emp empB = new Emp(leader, "B");
		Emp empC = new Emp(leader, "C");
		
		empA.qj("�Կ����ۣ�");
		
	}
}
