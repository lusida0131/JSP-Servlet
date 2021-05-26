package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import dto.MemberVO;

public class MemberDAO {
	private MemberDAO() { }
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	public Connection getConnection() throws Exception {
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/member");
		conn = ds.getConnection();
		return conn;
	}
	public int userCheck(String useid, String pwd) {
		int result = -1;
		String sql = "select pwd from member where useid=?";
		ResultSet rs = null;
		try(Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setString(1, useid);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					if(rs.getString("pwd") != null && rs.getString("pwd").equals(pwd)) 
						result = 1;
					 else
						result = 0;
				}else
					result = -1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	public MemberVO getMember(String useid) {
		MemberVO mVO = null;
		String sql = "select * from member where useid=?";
		ResultSet rs = null;
		try(Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setString(1, useid);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					mVO = new MemberVO();
					mVO.setName(rs.getString("name"));
					mVO.setUseid(rs.getString("useid"));
					mVO.setPwd(rs.getString("pwd"));
					mVO.setEmail(rs.getString("email"));
					mVO.setPhone(rs.getString("phone"));
					mVO.setGrade(rs.getInt("grade"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if(rs != null)
							rs.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return mVO; 
	}
	public int confirmID(String useid) {
		int result = -1;
		String sql = "select useid from member where useid=?";
		ResultSet rs = null;
		try(Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setString(1, useid);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					result = 1;
					} else
						result = -1;
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if(rs != null)
							rs.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return result; 
	}
	public int insertMember(MemberVO mVO) {
		int result = -1;
		String sql = "insert into member values(?,?,?,?,?,?)";
		try(Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setString(1,mVO.getName());
				pstmt.setString(2,mVO.getUseid());
				pstmt.setString(3,mVO.getPwd());
				pstmt.setString(4,mVO.getEmail());
				pstmt.setString(5,mVO.getPhone());
				pstmt.setInt(6,mVO.getGrade());
				result = pstmt.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return result;
	}
	public int updateMember(MemberVO mVO) {
		int result = -1;
		String sql = "update member set pwd=?,email=?,"
						+ "phone=?,grade=? where useid=?";
		try(Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setString(1,mVO.getPwd());
				pstmt.setString(2,mVO.getEmail());
				pstmt.setString(3,mVO.getPhone());
				pstmt.setInt(4,mVO.getGrade());
				pstmt.setString(5,mVO.getUseid());
				result = pstmt.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return result;
	}
}
