package com.bitcamp.app.calculator;

import android.widget.EditText;

/**
 * Created by 1027 on 2018-02-05.
 */

public class Command {
    public static int num(EditText num){
    return Integer.parseInt(String.valueOf(num.getText()));
    }
    public static int calc(EditText res1,EditText res2,String opcode){
                int result = 0;
                switch (opcode){
                    case "+":
                        result = num(res1)+num(res2);
                        break;
                    case "-":
                result = num(res1)-num(res2);
                break;
            case "*":
                result = num(res1)*num(res2);
                break;
            case "/":
                result = num(res1)/num(res2);
                break;

        }
        return result;
    }
}
