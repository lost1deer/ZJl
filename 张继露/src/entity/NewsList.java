package entity;

import utils.dao;

import java.util.ArrayList;

public class NewsList {
    public ArrayList<String> getNews(){
        dao d3=new dao();
        ArrayList<String> li3=new ArrayList<>();
        li3=d3.getNewsList();
        return li3;
    }
    public ArrayList<String> getTypes(){
        dao d3=new dao();
        ArrayList<String> li4=new ArrayList<>();
        li4=d3.getType();
        return li4;
    }
    public ArrayList<String> getAuthors(){
        dao d3=new dao();
        ArrayList<String> li5=new ArrayList<>();
        li5=d3.getAuthor();
        return li5;
    }
    public ArrayList<String> getUpdatetimes(){
        dao d3=new dao();
        ArrayList<String> li6=new ArrayList<>();
        li6=d3.getUpadatetime();
        return li6;
    }
    public ArrayList<Integer> getClicks(){
        dao d3=new dao();
        ArrayList<Integer> li7=new ArrayList<>();
        li7=d3.getClick();
        return li7;
    }
    public ArrayList<Integer> getIds(){
        dao d3=new dao();
        ArrayList<Integer> li8=new ArrayList<>();
        li8=d3.getId();
        return li8;
    }
}
