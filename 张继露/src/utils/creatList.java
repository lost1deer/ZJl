package utils;

import entity.NewsList;

import java.util.ArrayList;
import java.util.List;
public class creatList {

    public static List creatList1(){
        List arr1=new ArrayList();
        NewsList news1 = new NewsList();
        arr1=news1.getNews();
        return arr1;
    }
    public static List creatList2(){
        List arr2=new ArrayList();
        NewsList news1 = new NewsList();
        arr2=news1.getTypes();
        return arr2;
    }
    public static List creatList3(){
        List arr3=new ArrayList();
        NewsList news1 = new NewsList();
        arr3=news1.getAuthors();
        return arr3;
    }
    public static List creatList4(){
        List arr4=new ArrayList();
        NewsList news1 = new NewsList();
        arr4=news1.getClicks();
        return arr4;
    }
    public static List creatList5(){
        List arr5=new ArrayList();
        NewsList news1 = new NewsList();
        arr5=news1.getUpdatetimes();
        return arr5;
    }
    public static List creatList6(){
        List arr6=new ArrayList();
        NewsList news1 = new NewsList();
        arr6=news1.getIds();
        return arr6;
    }


}
