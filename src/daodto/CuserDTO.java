package daodto;

public class CuserDTO {
	private String cuserid; // 管理者ID
	private String cuserpasswd; // パスワード
	private String cuserlname; // 苗字
	private String cuserfname; // 名前

	public CuserDTO() {
		this.cuserid = null;
		this.cuserpasswd = null;
		this.cuserlname = null;
		this.cuserfname = null;
	}

	public String getcuserid() {
		return cuserid;
	}

	public String getCuserPasswd() {
		return cuserpasswd;
	}

	public String getCuserLname() {
		return cuserlname;
	}

	public String getCuserFname() {
		return cuserfname;
	}

	public void setCuserId(String cuserid) {
		this.cuserid = cuserid;
	}

	public void setCuserPasswd(String cuserpasswd) {
		this.cuserpasswd = cuserpasswd;
	}

	public void setCuserLname(String cuserlname) {
		this.cuserlname = cuserlname;
	}

	public void setCuserFname(String cuserfname) {
		this.cuserfname = cuserfname;
	}
}
