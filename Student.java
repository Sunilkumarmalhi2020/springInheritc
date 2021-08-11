package springCoreInheritance;

public class Student {

	private String id;
	private String stdName;
	private String addres;
	private String deptName;
	public Student() {
		
	}
	public Student(String id, String stdName, String addres, String deptName) {
		super();
		this.id = id;
		this.stdName = stdName;
		this.addres = addres;
		this.deptName = deptName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", stdName=" + stdName + ", addres=" + addres + ", deptName=" + deptName + "]";
	}

	
	
	
}
