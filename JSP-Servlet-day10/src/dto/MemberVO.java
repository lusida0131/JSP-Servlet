package dto;
public class MemberVO {
	private String name;
	private String useid;
	private String pwd;
	private String email;
	private String phone;
	private int grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUseid() {
		return useid;
	}
	public void setUseid(String useid) {
		this.useid = useid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "MemberVO[name=" + name + ", useid=" + useid + ", pwd=" + pwd + ", email=" + email + ",phone=" + phone +",grade=" +grade +"]";
	}
	
}
