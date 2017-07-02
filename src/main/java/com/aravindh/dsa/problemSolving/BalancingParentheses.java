package com.aravindh.dsa.problemSolving;


import java.util.Stack;

/**
 * Check for balanced parentheses
 * Note this does not see the validation of expression only validation of brackets
 *
 * Approach 1:
 * We can check for count of each bracket type, but it does not work for below case
 *
 * [)]( or [(])- because the order is also important and
 * "Last Opened should be closed first" -
 *
 * Approach 2: As highlighted in above case "Last Opened should be closed first" and
 * when tracking the list of all unclosed brackets, the addition and removal of brackets
 * happen at the same end of the list - this leads us to "Stack"
 *
 * Created by aravindhravindran on 1/7/17.
 */
public class BalancingParentheses {

    public boolean checkParentheses(String exp){
        Stack<Character> openedParentheses = new Stack<Character>();
        for(Character c : exp.toCharArray()){
            switch (c){
                case '(':{
                    openedParentheses.push(c);
                    break;
                }
                case ')':{
                    if(openedParentheses.isEmpty() || openedParentheses.pop() != '('){
                        return false;
                    }
                    break;
                }
                case '{':{
                    openedParentheses.push(c);
                    break;
                }
                case '}':{
                    if(openedParentheses.isEmpty() || openedParentheses.pop() != '{'){
                        return false;
                    }
                    break;
                }
                case '[':{
                    openedParentheses.push(c);
                    break;
                }
                case ']':{
                    if(openedParentheses.isEmpty() || openedParentheses.pop() != '['){
                        return false;
                    }
                    break;
                }
            }
        }
        if(openedParentheses.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
