package Servlet;

import utils.delete;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        delete delete1=new delete();
        int id = Integer.parseInt(request.getParameter("Id"));
        System.out.println(request.getParameter("Id"));
        delete1.delete(id);
        request.getRequestDispatcher("/Servlet.PagingServlet").forward(request,response);


    }




}
