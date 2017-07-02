package com.aravindh.dsa.problemSolving;

import java.util.Stack;

/**
 * Created by aravindhravindran on 1/7/17.
 */
public class EvaluationOfPrefixAndPostfix {

    public int evaluatePrefix(String expr){
        if(expr == null || expr.isEmpty()) {
            return 0;
        }
        Stack<Integer> operands = new Stack<Integer>();
        String[] literals = expr.split(" ");
        for(int i = literals.length -1; i >= 0; i--){
            String literal = literals[i];

            if("+".equals(literal)){

                if(operands.isEmpty()){
                    throw new IllegalArgumentException("Invalid expression ");
                }
                Integer val1 = operands.pop();

                if(operands.isEmpty()){
                    throw new IllegalArgumentException("Invalid expression ");
                }
                Integer val2 = operands.pop();
                operands.push(val1+val2);

            }else if("-".equals(literal)){
                if(operands.isEmpty()){
                    throw new IllegalArgumentException("Invalid expression ");
                }
                Integer val1 = operands.pop();

                if(operands.isEmpty()){
                    throw new IllegalArgumentException("Invalid expression ");
                }
                Integer val2 = operands.pop();
                operands.push(val1-val2);

            }else if("*".equals(literal)){
                if(operands.isEmpty()){
                    throw new IllegalArgumentException("Invalid expression ");
                }
                Integer val1 = operands.pop();

                if(operands.isEmpty()){
                    throw new IllegalArgumentException("Invalid expression ");
                }
                Integer val2 = operands.pop();
                operands.push(val1*val2);
            }else if("/".equals(literal)){
                if(operands.isEmpty()){
                    throw new IllegalArgumentException("Invalid expression ");
                }
                Integer val1 = operands.pop();

                if(operands.isEmpty()){
                    throw new IllegalArgumentException("Invalid expression ");
                }
                Integer val2 = operands.pop();
                operands.push(val1/val2);
            }else{
                Integer value = Integer.valueOf(literal);
                operands.push(value);
            }
        }
        if(!operands.isEmpty()){
            return operands.pop();
        }else {
            return 0;
        }
    }

    public int evaluatePostfix(String expr){
        if(expr == null || expr.isEmpty()){
            return 0;
        }
        Stack<Integer> operands = new Stack<Integer>();
        for(String literal : expr.split(" ")){

                if("+".equals(literal)){

                    if(operands.isEmpty()){
                        throw new IllegalArgumentException("Invalid expression ");
                    }
                    Integer val2 = operands.pop();

                    if(operands.isEmpty()){
                        throw new IllegalArgumentException("Invalid expression ");
                    }
                    Integer val1 = operands.pop();
                    operands.push(val1+val2);

                }else if("-".equals(literal)){
                    if(operands.isEmpty()){
                        throw new IllegalArgumentException("Invalid expression ");
                    }
                    Integer val2 = operands.pop();

                    if(operands.isEmpty()){
                        throw new IllegalArgumentException("Invalid expression ");
                    }
                    Integer val1 = operands.pop();
                    operands.push(val1-val2);

                }else if("*".equals(literal)){
                    if(operands.isEmpty()){
                        throw new IllegalArgumentException("Invalid expression ");
                    }
                    Integer val2 = operands.pop();

                    if(operands.isEmpty()){
                        throw new IllegalArgumentException("Invalid expression ");
                    }
                    Integer val1 = operands.pop();
                    operands.push(val1*val2);
                }else if("/".equals(literal)){
                    if(operands.isEmpty()){
                        throw new IllegalArgumentException("Invalid expression ");
                    }
                    Integer val2 = operands.pop();

                    if(operands.isEmpty()){
                        throw new IllegalArgumentException("Invalid expression ");
                    }
                    Integer val1 = operands.pop();
                    operands.push(val1/val2);
                }else{
                    Integer value = Integer.valueOf(literal);
                    operands.push(value);
                }
        }
        if(!operands.isEmpty()){
            return operands.pop();
        }else {
            return 0;
        }
    }
}
