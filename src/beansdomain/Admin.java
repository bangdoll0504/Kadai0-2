package beansdomain;

import java.io.Serializable;

import daodto.AdminDAO;
import daodto.AdminDTO;

public class Admin implements Serializable {
	private String adminid; // 商品ID
	private String passwd; // 定価
	private String lastname; // 価格（販売予定価格）
	private String firstname; // 商品名
	private AdminDAO adminDAO; // DAOインスタンス変数

	public Admin() {
	} // 引数なしのコンストラクタ。コンストラクタが一つもないときは自動作成されるが、
		// 下で引数ありのコンストラクタを利用するので、これは必須

	public Admin(String adminid) throws Exception {
		this.adminDAO = new AdminDAO();
		// DAOで検索し、その結果をDTOで受け取る
		AdminDTO adminDTO = adminDAO.adminRefer(adminid);
		// 受け取ったデータをBeans(ドメイン（このオブジェクト））に入れなおす
		// 一見無駄とも思える行為だが、内輪ルールとして行う
		this.adminid = adminDTO.getAdminid();
		this.passwd = adminDTO.getPasswd();
		this.lastname = adminDTO.getLastname();
		this.firstname = adminDTO.getFirstname();
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

	public void setpasswd(String passwd) {
		this.passwd = passwd;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isExist() {
		if (this.firstname == null) {
			return false;
		} else {
			return true;
		}
	}

}
