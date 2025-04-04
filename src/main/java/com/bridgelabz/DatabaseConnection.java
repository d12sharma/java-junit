package com.bridgelabz;

public class DatabaseConnection {
    static boolean isconnected;
    public static void connected(){
        isconnected=true;
        System.out.println("Succesfully connected");

    }
    public  static  void disconnected(){
        isconnected=false;
        System.out.println("Disconnected");
    }
    public static boolean Isconnected(){
        return isconnected;
    }
}
