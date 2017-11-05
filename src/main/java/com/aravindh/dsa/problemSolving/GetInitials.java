package com.aravindh.dsa.problemSolving;

/*
* Given a string consisting of lowercase English letters and spaces (may or may not be multiple spaces).
Your task is to print first letter of every word in the string.

Example:
Input:
geeks for geeks
bad is good
geeks geeks
geeks

Output:
gfg
big
gg
gee

*/
public class GetInitials {
   public String getInitials(String name){
       if(name == null || name == ""){
           return null;
       }
       String[] words = name.split(" ");
       StringBuilder initials = new StringBuilder();
       for(String word : words){
           if(initials.length() >= 3){
               break;
           }
           if("".equals(word)){
               continue;
           }
           initials.append(word.charAt(0));
       }
       if(initials.length() ==1){
           String word = words[0];
           if(word.length() >= 2) {
               initials.append(words[0].charAt(1));
           }
           if(word.length() >= 3) {
               initials.append(words[0].charAt(2));
           }
       }
       return initials.toString();
   }
}
