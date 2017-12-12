package com.aravindh.dsa.problemSolving;

import java.util.List;

/**
 * This is finding the middle element of two sorted array and not finding median.
 * This approach is for two sorted arrays with equal sizes.
 *
 * Created by aravindhravindran on 16/11/17.
 */
public class MedianOfTwoSortedArrays {
    public Integer getMedian(List<Integer> a, List<Integer> b){
        if(a.isEmpty() && b.isEmpty()){
            return null;
        }
        if(a.size() == b.size()){
            return getMedianEqualSize(a, b);
        }
        return 0;
    }

    private Integer getMedianEqualSize(List<Integer> a, List<Integer> b){
        int start1 = 0;
        int end1 = a.size()-1;

        int start2 = 0;
        int end2 = b.size()-1;

        while(start1 < end1 && start2 < end2) {
            Integer m1 = getMiddleElement(a, start1, end1);
            Integer m2 = getMiddleElement(b, start2, end2);
            if(m1.equals(m2)){
                return m1;
            }
            if(m1 > m2){
                start2 = ((start2+end2)/2)+1;
                end1 = ((start1+end1)/2)-1;
            }else{
                start1 = ((start1+end1)/2)+1;
                end2 = ((start2+end2)/2)-1;
            }
        }
        if(start1 <= end1) {
            return getMiddleElement(a, start1, end1);
        }else{
            return getMiddleElement(b, start2, end2);
        }
    }

    private Integer getMiddleElement(List<Integer> list, int start, int end) {
        if(start > end){
            return null;
        }
        int midIdx = (start + end) / 2;
        if(midIdx >= list.size()){
            return null;
        }
        return list.get(midIdx);
    }


}
