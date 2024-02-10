package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.db.HibernateUtil;
import com.entity.User;

import jakarta.servlet.http.HttpSession;


@WebServlet("/userRegister")
public class RegisterServlet extends HttpServlet {
		
		private static final long serialVersionUID = 1L;

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
			super.doGet(req, resp);	
		}
		
		
		
			protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
				
				String fullName= req.getParameter("fullName");
				String email= req.getParameter("email");
				String password= req.getParameter("password");
				String about= req.getParameter("about");
				
				User u = new User(fullName, email, password, about);
				
				//System.out.println(u);
				
				UserDao dao=new UserDao(HibernateUtil.getSessionFactory());
				boolean f = dao.saveuser(u);
				
				HttpSession session = (HttpSession) req.getSession();
				
				
				if(f){
				    session.setAttribute("msg", "Register successfully");
					//System.out.println("Register successfully");
				}else {
					session.setAttribute("msg", "Something wrong on server");
					//System.out.println("Something wrong on server");
				}
				
			}
			
			
		
		
		

		
	}
