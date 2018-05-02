package com.aravindh.dsa.problemSolving;

/**
 * Given a string aaabbb, compress the like a3b3.
 *
 * Note:
 *  If the compressed string is larger than the actual string then return the original string.
 *
 * Created by aravindhravindran on 7/6/17.
 */
public class RunLengthCompression {
    public String encode(String source){
        StringBuilder encoded = new StringBuilder();
        if(source.length() == 0){
            return source;
        }
        Character prev = source.charAt(0);
        int count =1;
        for(int i=1; i< source.length(); i++){
            Character curr =source.charAt(i);
            if(curr.equals(prev)){
                count++;
            }else{
                encoded.append(prev);
                if(count > 1){
                   encoded.append(count);
                }
                count =1;
            }
            prev = curr;
        }
        encoded.append(prev);
        if(count > 1){
            encoded.append(count);
        }
        return encoded.toString();
    }
}
