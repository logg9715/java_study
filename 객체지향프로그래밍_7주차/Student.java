package test;

public class Student {
	private String name;
	private String hb;
	private String hk;
	private String gm;

	// 생성자
	public Student(String name, String hb, String hk, String gm) {
		super();
		this.name = name;
		this.hb = hb;
		this.hk = hk;
		this.gm = gm;
	}

	public Student() {
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHb() {
		return hb;
	}

	public void setHb(String hb) {
		this.hb = hb;
	}

	public String getHk() {
		return hk;
	}

	public void setHk(String hk) {
		this.hk = hk;
	}

	public String getGm() {
		return gm;
	}

	public void setGm(String gm) {
		this.gm = gm;
	}

	// toString()
	@Override
	public String toString() {
		return "Student [name=" + name + ", hb=" + hb + ", hk=" + hk + ", gm=" + gm + "]";
	};

}