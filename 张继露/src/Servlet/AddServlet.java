package Servlet;

import utils.add;
import utils.creatList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        String newslist=new String(request.getParameter("newslist").getBytes("iso-8859-1"),"utf-8");
        String type=new String(request.getParameter("type").getBytes("iso-8859-1"),"utf-8");
        String author=new String(request.getParameter("author").getBytes("iso-8859-1"),"utf-8");
        String updatetime=new String(request.getParameter("updatetime").getBytes("iso-8859-1"),"utf-8");
        creatList creatlist1=new creatList();
        List arr=new ArrayList();
        arr=creatlist1.creatList6();
        int id=arr.size()+1;
        int click= Integer.parseInt(request.getParameter("click"));
        add add1=new add();
        add1.add(id,newslist,type,author,updatetime,click);
        System.out.println(click+id);
        request.getRequestDispatcher("/Servlet.PagingServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
