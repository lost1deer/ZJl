package Servlet;

import utils.update;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        System.out.println("000");
        String newslist=request.getParameter("newslist");
        String type=request.getParameter("type");
        String author=request.getParameter("author");
        String updatetime=request.getParameter("updatetime");
        int id= Integer.parseInt(request.getParameter("id"));
        int click= Integer.parseInt(request.getParameter("click"));
        System.out.println(newslist+""+id+"000");
        update update1=new update();
        update1.update(id,newslist,type,author,updatetime);
        request.getRequestDispatcher("/Servlet.PagingServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
