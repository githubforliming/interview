package facedAndMediator;

import java.util.ArrayList;
import java.util.List;

/**
 *     �쵼
 * @author LM
 *
 */
public class Leader {
	List<Emp> emps = new ArrayList<>();
	/**
	 * Ա����ٸ���Leader
	 * @param emp
	 * @param string
	 */
	public void qj(Emp emp, String re) {
		for (int i = 0; i < emps.size(); i++) {
			Emp tmp = emps.get(i);
			if (!tmp.equals(emp)) {
				tmp.notice(emp.name +"��� ��Ϊ��"+re);
			}
		}
		
	}
	
	/**
	 *    ���Ա����Leader
	 * @param emp
	 */
	public void setEmps(Emp emp) {
		emps.add(emp);
	}

}
