package facedAndMediator;

import java.util.ArrayList;
import java.util.List;

/**
 *     领导
 * @author LM
 *
 */
public class Leader {
	List<Emp> emps = new ArrayList<>();
	/**
	 * 员工请假告诉Leader
	 * @param emp
	 * @param string
	 */
	public void qj(Emp emp, String re) {
		for (int i = 0; i < emps.size(); i++) {
			Emp tmp = emps.get(i);
			if (!tmp.equals(emp)) {
				tmp.notice(emp.name +"请假 因为："+re);
			}
		}
		
	}
	
	/**
	 *    添加员工到Leader
	 * @param emp
	 */
	public void setEmps(Emp emp) {
		emps.add(emp);
	}

}
