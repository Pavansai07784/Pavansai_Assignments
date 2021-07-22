import java.util.Objects;

public class Employee {

	private int Empid;
	private String EmpName;
	public Employee(int empid, String empName) {
		super();
		Empid = empid;
		EmpName = empName;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", EmpName=" + EmpName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(EmpName, Empid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(EmpName, other.EmpName) && Empid == other.Empid;
	}	
}
