package beansdomain;

import java.io.Serializable;

import daodto.CuserDAO;
import daodto.CuserDTO;

public class Cuser implements Serializable {
	private String cuserid; // 商品ID
	private String cuserpasswd; // 定価
	private String cuserlname; // 価格（販売予定価格）
	private String cuserfname; // 商品名
	private CuserDAO cuserDAO; // DAOインスタンス変数

	public Cuser() {
	} // 引数なしのコンストラクタ。コンストラクタが一つもないときは自動作成されるが、
		// 下で引数ありのコンストラクタを利用するので、これは必須

	public Cuser(String cuserid) throws Exception {
		this.cuserDAO = new CuserDAO();
		// DAOで検索し、その結果をDTOで受け取る
		CuserDTO cuserDTO = cuserDAO.cuserRefer(cuserid);
		// 受け取ったデータをBeans(ドメイン（このオブジェクト））に入れなおす
		// 一見無駄とも思える行為だが、内輪ルールとして行う
		this.cuserid = cuserDTO.getcuserid();
		this.cuserpasswd = cuserDTO.getCuserPasswd();
		this.cuserlname = cuserDTO.getCuserLname();
		this.cuserfname = cuserDTO.getCuserFname();
	}

	public String getcuserid() {
		return cuserid;
	}

	public String getcuserpasswd() {
		return cuserpasswd;
	}

	public String getcuserlname() {
		return cuserlname;
	}

	public String getcuserfname() {
		return cuserfname;
	}

	public void setCuserId(String adminid) {
		this.cuserid = adminid;
	}

	public void setCuserPasswd(String passwd) {
		this.cuserpasswd = passwd;
	}

	public void setCuserLname(String lastname) {
		this.cuserlname = lastname;
	}

	public void setCuserFname(String firstname) {
		this.cuserfname = firstname;
	}

	public boolean isExist() {
		if (this.cuserfname == null) {
			return false;
		} else {
			return true;
		}
	}

}
