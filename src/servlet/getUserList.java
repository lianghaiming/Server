package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import base.UserDao;
import base.UserDaoImpl;
import entity.User;
import util.LogUtil;

public class getUserList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> list = new ArrayList<>();
		User u1 = new User();
		u1.age = 10;
		u1.name = "hello";
		
		User u2 = new User();
		u2.age = 20;
		u2.name = "hi";
		
		
		
		list.add(u1);
		list.add(u2);
		
		JSONObject data = new JSONObject();
		JSONArray json = new JSONArray();
		try {
			
			data.put("code", 200);
			
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("age", u1.age);
			jsonObject.put("name", u1.name);
			
			json.put(jsonObject);
			
			
			JSONObject jsonObject1 = new JSONObject();
			jsonObject1.put("age", u2.age);
			jsonObject1.put("name", u2.name);
			
			json.put(jsonObject1);
			
			
			data.put("data", json);

			
			
			LogUtil.print(data.toString());
			
			resp.setContentType("text/html;charset=UTF-8");
			resp.getWriter().println(data.toString());
			resp.getWriter().flush();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		User u1 = new User();
		u1.age = 10;
		u1.name = "hello";
		
		User u2 = new User();
		u2.age = 20;
		u2.name = "hi";
		
		list.add(u1);
		list.add(u2);
		JSONObject data = new JSONObject();
		JSONArray json = new JSONArray();
		try {
			
			data.put("code", 200);
			
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("age", u1.age);
			jsonObject.put("name", u1.name);
			
			json.put(jsonObject);
			
			
			JSONObject jsonObject1 = new JSONObject();
			jsonObject1.put("age", u2.age);
			jsonObject1.put("name", u2.name);
			
			json.put(jsonObject1);
			
			
			data.put("data", json);

			
			
			LogUtil.print(data.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	

}
