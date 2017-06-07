package com.aravindh.dsa.problemSolving;

/**
 * Given two Strings, check if the strings are one edit away then return TRUE else FALSE. The possible edits are
 *  -Insert one char
 *  -Delete one char
 *  -Replace one char by another
 *
 * Created by aravindhravindran on 7/6/17.
 */
public class OneAway {
    public boolean isOneEditAway(String source, String target){
        if(source.length() == target.length()){
            //Either equal or replace
            return isOneEditReplace(source, target);
        }else if(source.length()+1 == target.length()){
            return isOneEditInsert(source, target);
        }else if(source.length()-1 == target.length()){
            return isOneEditInsert(target, source);
        } else {
            return false;
        }
    }

    private boolean isOneEditReplace(String first, String second){
        boolean isDiff = false;
        for(int i =0 ; i < first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                if(!isDiff){
                    isDiff = true;
                }else{
                    return false;
                }
            }
        }
        //Both are equal/ No diff
        if(!isDiff){
            return false;
        }
        return true;
    }

    private boolean isOneEditInsert(String smaller,String larger){
        boolean isDiff = false;
        for(int i =0, j =0; i<smaller.length() && j < larger.length();i++, j++){
            if(smaller.charAt(i) != larger.charAt(j)){
                if(!isDiff){
                    isDiff = true;
                }else{
                    return false;
                }
                j++;
                if(smaller.charAt(i) != larger.charAt(j)){
                        return false;
                }
            }
        }
        return true;
    }
}
