package member.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import encript.SHA256;
import encript.BCrypt;
import member.dto.MemberVO;
import product.dto.ProductVO;
import util.DBManager;

public class MemberDAO {
   private MemberDAO() {
   }

   private static MemberDAO instance = new MemberDAO();

   public static MemberDAO getInstance() {
      return instance;
   }
   public List<MemberVO> selectAllMembers() {
		// 최근 등록한 상품 먼저 출력하기
		String sql = "select * from member ";
		List<MemberVO> list = new ArrayList<MemberVO>();
		try (Connection conn = DBManager.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); ) {
			while (rs.next()) { // 이동은 행(로우) 단위로
				MemberVO mVo = new MemberVO();
				mVo.setName(rs.getString("name"));
				mVo.setUserid(rs.getString("userid"));
				mVo.setPwd(rs.getString("pwd"));
				mVo.setEmail(rs.getString("email"));
				mVo.setPhone(rs.getString("phone"));
				mVo.setGrade(rs.getInt("grade"));
				list.add(mVo);
			}// while문 끝
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}// selectAllProducts() {
   

   public Connection getConnection() throws Exception {
      Connection conn = null;
      Context initContext = new InitialContext();
      Context envContext = (Context) initContext.lookup("java:/comp/env");
      DataSource ds = (DataSource) envContext.lookup("jdbc/member");
      conn = ds.getConnection();
      return conn;
   }

   // 사용자 인증시 사용하는 메소드
   public int userCheck(String userid, String pwd) {
      int result = -1;
      String sql = "select pwd from member where userid=?";
      ResultSet rs = null;
      try (Connection conn = getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql); ){
         pstmt.setString(1, userid);
         rs = pstmt.executeQuery();
         if (rs.next()) {
            if (rs.getString("pwd") != null
                 && BCrypt.checkpw(pwd, rs.getString("pwd"))) {

               result = 1;
            } else if (rs.getString("pwd") != null && rs.getString("pwd").equals(pwd)) {
            	result = 1;
            }     
            else {
               result = 0;
            }
         } else {
            result = -1;
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (rs != null)
               rs.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
      return result;
   }

   // 아이디로 회원 정보 가져오는 메소드
   public MemberVO getMember(String userid) {
      MemberVO mVo = null;
      String sql = "select * from member where userid=?";
      ResultSet rs = null;
      try (Connection conn = getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql);) {
         pstmt.setString(1, userid);
         rs = pstmt.executeQuery();
         if (rs.next()) {
            mVo = new MemberVO();
            mVo.setName(rs.getString("name"));
            mVo.setUserid(rs.getString("userid"));
            mVo.setPwd(rs.getString("pwd"));
            mVo.setEmail(rs.getString("email"));
            mVo.setPhone(rs.getString("phone"));
            mVo.setGrade(rs.getInt("grade"));
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (rs != null)
               rs.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
      return mVo;
   }

   public int confirmID(String userid) {
      int result = -1;
      String sql = "select userid from member where userid=?";
      ResultSet rs = null;
      try (Connection conn = getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql); ) {
         pstmt.setString(1, userid);
         rs = pstmt.executeQuery();
         if (rs.next())
            result = 1;
         else
            result = -1;
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (rs != null)
               rs.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
      return result;
   }

   public int insertMember(MemberVO mVo) {
      int result = -1;
      SHA256 sha = SHA256.getInsatnce();
      String sql = "insert into member values(?, ?, ?, ?, ?, ?)";
      try (Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql); ) {
    	  
         pstmt.setString(1, mVo.getName());
         pstmt.setString(2, mVo.getUserid());
         pstmt.setString(3, BCrypt.hashpw(mVo.getPwd(), BCrypt.gensalt(10)));
         pstmt.setString(4, mVo.getEmail());
         pstmt.setString(5, mVo.getPhone());
         pstmt.setInt(6, mVo.getGrade());
         result = pstmt.executeUpdate();
      } catch (Exception e) {
         e.printStackTrace();
      }
      return result;
   }

   public int updateMember(MemberVO mVo) {
      int result = -1;
      String sql = "update member set pwd=?, email=?,"
            + "phone=?, grade=? where userid=?";
      try (Connection conn = getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql); ) {
         pstmt.setString(1, BCrypt.hashpw(mVo.getPwd(), BCrypt.gensalt(10)));
         pstmt.setString(2, mVo.getEmail());
         pstmt.setString(3, mVo.getPhone());
         pstmt.setInt(4, mVo.getGrade());
         pstmt.setString(5, mVo.getUserid());
         result = pstmt.executeUpdate();
      } catch (Exception e) {
         e.printStackTrace();
      }
      return result;
   }
}