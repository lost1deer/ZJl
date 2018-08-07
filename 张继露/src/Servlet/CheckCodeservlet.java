package Servlet;


import entity.Users;
import utils.dao;
import utils.jdbcUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CheckCodeservlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //1、获取请求参数CHECK_CODE_PARAM_NAME
        String name = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
       /* String parameCode = request.getParameter("CHECK_CODE_PARAM_NAME");*/
        //2、获取session属性值CHECK_CODE_KEY
       /* String sessionCode = (String) request.getSession().getAttribute("CHECK_CODE_KEY");
        //3、比对，看是否一致，若一致，验证码正确，否则错误
        System.out.println(parameCode + "\n" + sessionCode);*/
        boolean flag=true;

        Users user1 = new Users();
        ArrayList<String> l1=user1.getName();

        ArrayList<String> l2=user1.getPwd();

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));  //.get(index)
            System.out.println(l2.get(i));
       }
        for(int i=0;i< l1.size();i++){
            if(l1.get(i).equals(name)&&l2.get(i).equals(pwd)) {

                System.out.println("hhh");
                //request.getRequestDispatcher(request.getContextPath() + "/Servlet.PagingServlet").forward(request,response);
                getServletContext().getRequestDispatcher("/Servlet.PagingServlet").forward(request, response);
                System.out.println("执行");
                flag=false;
                break;
            }}
            if(flag){
                request.getRequestDispatcher(request.getContextPath() + "/test.jsp").forward(request,response);
                return;
            }

    }


            /*else{
                    *//*request.getSession().setAttribute("message", "验证码不一致！");*//*
                    request.getRequestDispatcher(request.getContextPath() + "/test.jsp").forward(request,response);
                    return;
                }*/



        /*if(flag){
            response.sendRedirect("/Unsucess.jsp");
        }*/



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
        /*ResultSet rs1 = null;
        try {
            rs1 = stmt1.executeQuery("select Username,Password from Users");
            while (rs1.next()){
                if(rs1.getString("Username").equals(name)){
                ResultSet rs=null;
                rs =stmt1.executeQuery("select Password from Users");
                while(rs.next()){
                    if(rs.getString("Password").equals(pwd)){
                        if(parameCode != null && parameCode.equals(sessionCode)){
                            response.sendRedirect(request.getContextPath() + "/success.jsp");
                        }else{
                            request.getSession().setAttribute("message", "验证码不一致！");
                            response.sendRedirect(request.getContextPath() + "/test.jsp");
                            return;
                        }
                    }
                }}else{
                    response.sendRedirect("Unsuccess.jsp");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

            // 校验用户名和密码是否正确
            /*if (!("admin".equals(name) && "123".equals(pwd))) {// 验证成功
                response.sendRedirect("Unsuccess.jsp");

            } else {// 校验不成功，则留在跳转到login.jsp页面
                if (!(parameCode != null && parameCode.equals(sessionCode))) {
                    request.getSession().setAttribute("message", "验证码不一致！");
                    response.sendRedirect(request.getContextPath() + "/test.jsp");
                    return;
                } else {
                    HttpSession session = request.getSession();//获取session
                    session.setAttribute("name", name);// 将用户名和密码保存在session中
                    session.setAttribute("pwd", pwd);// 将用户名和密码保存在session中
                    response.sendRedirect(request.getContextPath() + "/success.jsp");
                }

            }*/
        /*String parameCode=request.getParameter("CHECK_CODE_PARAM_NAME");
        //2、获取session属性值CHECK_CODE_KEY
        String sessionCode=(String)request.getSession().getAttribute("CHECK_CODE_KEY");
        //3、比对，看是否一致，若一致，验证码正确，否则错误
        System.out.println(parameCode+"\n"+sessionCode);
        if( !(parameCode != null && parameCode.equals(sessionCode))){
            request.getSession().setAttribute("message", "验证码不一致！");
            response.sendRedirect(request.getContextPath()+"/test.jsp");
            return;
        }else{
            response.sendRedirect(request.getContextPath()+"/success.jsp");
        }
        System.out.println("受理请求！");
    }
*/

