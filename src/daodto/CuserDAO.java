package daodto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CuserDAO {
	private Connection con;

	public CuserDAO() throws Exception {
		DBManagerAdmin dbManagerAdmin = DBManagerAdmin.getDBManagerAdmin();
		this.con = dbManagerAdmin.getConnection();
	}

	public CuserDTO cuserRefer(String cuserid) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CuserDTO cuserDTO = new CuserDTO();
		cuserDTO.setCuserId(cuserid);
		String sql = "SELECT * FROM cuser where cuid=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cuserid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				cuserDTO.setCuserId(rs.getString("cuid"));
				cuserDTO.setCuserPasswd(rs.getString("password"));
				cuserDTO.setCuserLname(rs.getString("lname"));
				cuserDTO.setCuserFname(rs.getString("fname"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		return cuserDTO;

	}

}
