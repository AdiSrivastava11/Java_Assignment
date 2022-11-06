package containmentex1;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private int deptno;
	private String deptname;
	private int deptct;
	private String depthead;
	
	private List<Employee> emplst;

	public Department(int deptno, String deptname, int deptct, String depthead) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.deptct = deptct;
		this.depthead = depthead;
		
		this.emplst = new ArrayList<Employee>();
	}

	

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getDeptct() {
		return deptct;
	}

	public void setDeptct(int deptct) {
		this.deptct = deptct;
	}

	public String getDepthead() {
		return depthead;
	}

	public void setDepthead(String depthead) {
		this.depthead = depthead;
	}

	public List<Employee> getEmplst() {
		return emplst;
	}

	public void setEmplst(List<Employee> emplst) {
		this.emplst = emplst;
	}
}
