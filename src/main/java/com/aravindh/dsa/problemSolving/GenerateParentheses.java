package com.aravindh.dsa.problemSolving;

import java.util.*;

public class GenerateParentheses {


    public List<String> generate(int n){
        List<String> list = generateParenthesis(n);
        Collections.sort(list);
        return list;
    }

    Map<Integer, Set<String>> nVsParenthesisSets = new HashMap();

    public List<String> generateParenthesis(int n) {
        if(nVsParenthesisSets.containsKey(n)){
            return new ArrayList(nVsParenthesisSets.get(n));
        }
        Set<String> generatedParentheses = new LinkedHashSet<>();
        if(n <= 0){
            nVsParenthesisSets.put(0, Collections.EMPTY_SET);
            return new ArrayList(nVsParenthesisSets.get(0));
        }
        if(n == 1){
            generatedParentheses.add("()");
            nVsParenthesisSets.put(1, generatedParentheses);
            return new ArrayList(nVsParenthesisSets.get(n));
        }
        for(int i= 0; i <= n-1; i++){
            List<String> setsInside = generateParenthesis(i);
            List<String> setsOutside = generateParenthesis(n-1-i);
            int size = Math.max(setsInside.size(), setsOutside.size());
            for(int x = 0; x < size; x++){
                for(int y = 0; y< size; y++){
                    String insideSet = x < setsInside.size()?setsInside.get(x) : "";
                    String outsideSet = y < setsOutside.size()?setsOutside.get(y) : "";
                    String set = "(" + insideSet + ")" + outsideSet;
                    if(set.length() == n*2) {
                        generatedParentheses.add(set);
                    }
                }
            }
        }
        nVsParenthesisSets.put(n, generatedParentheses);
        return new ArrayList(nVsParenthesisSets.get(n));
    }


}
