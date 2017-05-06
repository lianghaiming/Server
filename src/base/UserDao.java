package base;

import entity.User;

public interface UserDao {
	
	public User Login(String account, String password);
	
	public int Register(String account, String password);
	
	public User isExist(String account);

}
