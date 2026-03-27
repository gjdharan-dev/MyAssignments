package org.amazon.week4Assignmesnts;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetHomeAsssignmet {

    public static void main(String[] args) {
        
      String companyName = "google";

      Set<Character> setcompany = new LinkedHashSet<>();

      char[] charArray = companyName.toCharArray();

      for (char c:charArray){
            setcompany.add(c);
      } 
      // System.out.println(setcompany);

      for (char c :setcompany){
        System.err.print(c);
        
      }

    }  


}

