package org.amazon.week4Assignmesnts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
    public static void main(String[] args) {

    Integer a[]={1,2,3,4,10,6,8};

    List<Integer> numList=new ArrayList<Integer>();

    Collections.addAll(numList, a);
    Collections.sort(numList);
    System.out.println(numList);


    for (int i=0;i<numList.size()-1;i++){

        int currentnum=numList.get(i);
        int nextnum=numList.get(i+1);

        if(currentnum+1!=nextnum){
            for(int j=currentnum+1;j<nextnum;j++)
                System.out.println(j);
        }

    }
      
    }

}
