package base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;
import util.DBUtil;
import util.LogUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public User Login(String account, String password) {
		return null;
	}

	@Override
	public int Register(String account, String password) {
		return 0;
	}

	@Override
	public User isExist(String account) {
		return null;
	}
//	DBUtil util;
//	Connection conn;
//	User user = null;
//	
//	public UserDaoImpl() {
//		DBUtil dbUtil = new DBUtil();
//		conn = dbUtil.openConnection();
//	}
//	
//	public static void main(String[] args) {
//		UserDao dao = new UserDaoImpl();
//		System.out.println(dao.Register("132456", "123465"));
//		// // User u = dao.login("login01", "123");
//		// int rs = dao.UpdatePWD("login01", "123", "234");
//		// System.out.println(rs);
//	}
//	
//	
//	@Override
//	public User Login(String account, String password) {
//		// 查询SQL语句
//		String sql = " select account,password"
//				+ " from user_table " + " where account=? and password=? ";
//		try {
//			// 获得预定义语句
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			// 设置查询参数
//			pstmt.setString(1, account);
//			pstmt.setString(2, password);
//			// 执行查询
//			ResultSet rs = pstmt.executeQuery();
////			if (rs.next()) {
////
////				String name = rs.getString(1);
////				String pwd = rs.getString(2);
////	
////				// 封装用户信息
////				User u = new User();
////				u.name
////				return u;
////			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			util.closeConn(conn);
//		}
//		return null;
//	}
//	@Override
//	public User isExist(String account) {
//		// TODO Auto-generated method stub
//		// 查询SQL语句
//		String sql = " select account,password from user_table where account = ?";
//		// System.out.println(account + "  " + password);
//		try {
//			// 获得预定义语句
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			// 设置查询参数
//			pstmt.setString(1, account);
//
//			// 执行查询
//			ResultSet rs = pstmt.executeQuery();
//			User user = null;
//			if (rs.next()) {
//				user = new User();
//				user.setAccount(rs.getString(1));
//				user.setPassword(rs.getString(2));
//			}
//			return user;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
////			util.closeConn(conn);
//		}
//		return null;
//	}
//	@Override
//	public int Register(String account, String password) {
//		User user = isExist(account);
//		if(user != null) {
//			LogUtil.print("已经存在 " + user.getAccount() + " " + user.getPassword());
//			return 0;
//		}
//
//		// 查询SQL语句
//		String sql = " insert into user_table(account,password) "
//				+ " values(?,?)";
//		try {
//			// 获得预定义语句
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			// 设置查询参数
//			pstmt.setString(1, account);
//			pstmt.setString(2, password);
//			// 执行查询
//			int rs = pstmt.executeUpdate();
//
//			return rs;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
////			util.closeConn(conn);
//		}
//		return 0;
//	}

}
