package entity;

import utils.dao;

import java.util.ArrayList;

public class Users {

    public ArrayList<String> getName(){
        dao d1=new dao();
        ArrayList<String> li1=new ArrayList<>();
        li1=d1.getUsers();
        return li1;
    }
    public ArrayList<String> getPwd(){
        dao d2=new dao();
        ArrayList<String> li2=new ArrayList<>();
        li2=d2.getPass();
        return li2;
    }
    /*public static void main(String []args){

       dao d1=new dao();
       ArrayList<String> li1=d1.getUsers();
       ArrayList<String> li2=d1.getPass();
       for (int i = 0; i < li1.size(); i++) {
           System.out.println(li1.get(i));  //.get(index)
           System.out.println(li2.get(i));
        }
   }*/

}
