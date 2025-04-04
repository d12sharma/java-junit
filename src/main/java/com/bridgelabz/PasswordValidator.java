package com.bridgelabz;
import java.util.regex.*;
public class PasswordValidator {
    public boolean CheckPassword(String str) {


        String regex = "^(?=.*[A-Z])(?=.*[\\d]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher mat = pattern.matcher(str);

        if(mat.find()){
            return true;

        }
        else {
            return false;
        }

    }

}
