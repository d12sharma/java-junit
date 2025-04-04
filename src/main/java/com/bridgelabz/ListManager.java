package com.bridgelabz;

import java.util.List;

public class ListManager {
    public static void addElement(List<Integer> list , int number){
        list.add(number);
    }
    public static void removeElement(List<Integer>list,int number){
        list.remove(Integer.valueOf(number));
    }
    public static int getsize(List<Integer> list){
        return list.size();
    }
}
