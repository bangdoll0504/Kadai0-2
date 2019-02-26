package daodto;

public class AdminDTO {
	private String adminid; // 管理者ID
	private String passwd; // パスワード
	private String lastname; // 苗字
	private String firstname; // 名前

	public AdminDTO() {
		this.adminid = null;
		this.passwd = null;
		this.lastname = null;
		this.firstname = null;
	}

	public String getAdminid() {
		return adminid;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getLastname() {
		return lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setadminid(String adminid) {
		this.adminid = adminid;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}
