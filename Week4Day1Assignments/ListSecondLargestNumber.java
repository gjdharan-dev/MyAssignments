package org.amazon.week4Assignmesnts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSecondLargestNumber {
    public static void main(String[] args) {
        
    

   Integer a[]={3,2,11,4,6,7};

   List<Integer> list1 = new ArrayList<Integer>();
  
   
   Collections.addAll(list1, a);

   Collections.sort(list1);

   System.out.println(list1);

   System.out.println("The second largest number is:" +4);
    }

}
