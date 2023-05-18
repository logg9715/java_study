package test;

public class Student {
	// 필드 선언
	private String name, dept, tel;
	private int stuId;
	
	// 기본 생성자
	public Student() {
	}

	public Student(String name, String dept, String tel, int stuId) {
		super();
		this.name = name;
		this.dept = dept;
		this.tel = tel;
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", dept=" + dept + ", tel=" + tel + ", stuId=" + stuId + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	
	

}
