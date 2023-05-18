package test;

public class Student {
	// 필드 선언
	private String name;
	private String stdNum;
	private String major;
	private String subject;

	// 기본 생성자
	Student() {
	}

	public Student(String name, String stdNum, String major, String subject) {
		super();
		this.name = name;
		this.stdNum = stdNum;
		this.major = major;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "[이름=" + name + ", 학번=" + stdNum + ", 전공=" + major + ", 과목=" + subject + "]";
	}

}
