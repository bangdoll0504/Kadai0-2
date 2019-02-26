package daodto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO {
	private Connection con;

	public AdminDAO() throws Exception {
		DBManagerAdmin dbManagerAdmin = DBManagerAdmin.getDBManagerAdmin();
		this.con = dbManagerAdmin.getConnection();
	}

	public AdminDTO adminRefer(String adminid) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		AdminDTO adminDTO = new AdminDTO();
		adminDTO.setadminid(adminid);
		String sql = "SELECT * FROM cuser where cuid=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, adminid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				adminDTO.setadminid(rs.getString("cuid"));
				adminDTO.setPasswd(rs.getString("password"));
				adminDTO.setLastname(rs.getString("lname"));
				adminDTO.setFirstname(rs.getString("fname"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		return adminDTO;

	}

}
