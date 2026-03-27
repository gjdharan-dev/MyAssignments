package org.amazon.week4Assignmesnts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersectionList {

    public static void main(String[] args) {

        Integer a[]={3,2,11,4,6,7};

        Integer b[]={1,2,8,4,9,7};

        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();

        Collections.addAll(list1, a);
        Collections.addAll(list2, b);

        for (int i=0;i<list1.size();i++){

            if(list1.get(i)==list2.get(i)){
                System.out.println(list1.get(i));
            }
        
        }



        
    }

}
