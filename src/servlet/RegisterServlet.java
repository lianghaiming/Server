package servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import base.UserDao;
import base.UserDaoImpl;
import util.LogUtil;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LogUtil.print("hello");
	
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		StringBuffer json = new StringBuffer();  
		String line = null;  
		try {  
		    BufferedReader reader = req.getReader();  
		    while((line = reader.readLine()) != null) {  
		        json.append(line);  
		    }  
		}  
		catch(Exception e) {  
		   e.printStackTrace();  
		}  
		System.out.println("client json data="+json.toString());  
		
		String ret = null;
		  
		try {
			JSONObject jsonObj = new JSONObject(json.toString());
			String name = (String) jsonObj.get("account");
			String passwd = (String) jsonObj.get("password");
			UserDao userDao = new UserDaoImpl();
			if(userDao.Register(name, passwd) != 0) {
				ret = "成功";
				LogUtil.print("成功");
			} else {
				ret = "失败";
				LogUtil.print("失败");
			}
			LogUtil.print(name + " " + passwd);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  


		JSONObject jjj = new JSONObject();
		
		try {
			jjj.put("code",  200);
			jjj.put("token", ret);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.write(jjj.toString());
		out.flush();
		out.close();
		LogUtil.print("request finish");

	}


}
