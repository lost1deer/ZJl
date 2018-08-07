package Servlet;

import entity.entityList;
import utils.creatList;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PagingServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("utf-8");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Context-Type","text.html:cahrset=utf-8");


        int pageCurrent;
        if(request.getParameter("pageCurrent")!=null){
            pageCurrent=Integer.parseInt(request.getParameter("pageCurrent").replace("",""));
        }else{
            pageCurrent=1;
        }

        List list1=creatList.creatList1();
        List list2=creatList.creatList2();
        List list3=creatList.creatList3();
        List list4=creatList.creatList4();
        List list5=creatList.creatList5();
        List list6=creatList.creatList6();
        entityList entity1=new entityList(4,list1.size());
        entity1.setPageCurrent(pageCurrent);


        int beginIndex = (pageCurrent-1)*entity1.getPageSize();
        int endIndex = pageCurrent*entity1.getPageSize();

        if(endIndex>=list1.size()){
            endIndex=list1.size();
        }
        if(beginIndex>endIndex){
            beginIndex=0;
            entity1.setPageCurrent(pageCurrent);
        }

        List perList1 = list1.subList(beginIndex,endIndex);
        List perList2 = list2.subList(beginIndex,endIndex);
        List perList3 = list3.subList(beginIndex,endIndex);
        List perList4 = list4.subList(beginIndex,endIndex);
        List perList5 = list5.subList(beginIndex,endIndex);
        List perList6 = list6.subList(beginIndex,endIndex);
        request.setAttribute("perList1",perList1);
        request.setAttribute("perList2",perList2);
        request.setAttribute("perList3",perList3);
        request.setAttribute("perList4",perList4);
        request.setAttribute("perList5",perList5);
        request.setAttribute("perList6",perList6);

        request.setAttribute("pageCurrent",entity1.getPageCurrent());
        request.setAttribute("pageNum",entity1.getPageNum());
        System.out.println("tiaozhuan");
        request.getRequestDispatcher("/controller.jsp").forward(request,response);



    }
}

