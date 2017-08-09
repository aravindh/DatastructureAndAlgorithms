package com.aravindh.dsa.problemSolving;

import java.util.ArrayList;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        if(a.isEmpty()){
            a.add(1);
            return a;
        }
        reverse(a);
        int carry = 1;
        for(int i = 0; i < a.size(); i++ ){
            int sum = a.get(i)+carry;
            if(sum >=10){
                a.set(i, sum%10);
                carry = sum/10;
            }else{
                a.set(i, sum);
                carry = 0;
            }
        }
        if(carry > 0){
            a.add(carry);
        }
        //System.out.println(a);
        reverse(a);
        //System.out.println(a);
        for(int i=0; i < a.size()&& a.get(i) == 0; ){
            //System.out.println("zero "+i);
            a.remove(i);
        }

        return a;
    }

    private void reverse(ArrayList<Integer> a){
        int start = 0;
        int end = a.size()-1;
        while(start < end){
            int temp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            start++;end--;
        }
    }
}
