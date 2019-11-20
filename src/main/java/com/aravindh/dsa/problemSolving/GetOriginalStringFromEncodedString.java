package com.aravindh.dsa.problemSolving;

import java.util.Stack;

public class GetOriginalStringFromEncodedString {

    public String getEncodedString(String decodedString){

        Stack<Character> expressions = new Stack<>();
        Stack<Integer> repeatCount = new Stack<>();
        int idx = 0;
        while(idx < decodedString.length()){
            Character currChar = decodedString.charAt(idx++);
            if(Character.isDigit(currChar)){
                repeatCount.push(Character.getNumericValue(currChar));
            }else if(currChar.equals(']')){
                StringBuilder builder= new StringBuilder();
                int count = repeatCount.isEmpty() ? 1 : repeatCount.pop();
                StringBuilder currExp = new StringBuilder();
                while(!expressions.isEmpty() && !expressions.peek().equals('[')){
                    currExp.append(expressions.pop());
                }
                if(!expressions.isEmpty() && expressions.peek().equals('[')){
                    expressions.pop();
                }
                for(int i =0 ; i< count;i ++){
                    builder.append(currExp);
                }
                for(int i =0 ; i< builder.length();i ++){
                    expressions.push(builder.charAt(i));
                }
            }else{
                expressions.push(currChar);
            }
        }

        StringBuilder result = new StringBuilder();
        while(!expressions.isEmpty()){
            result.append(expressions.pop());
        }
        return result.reverse().toString();
    }


}
