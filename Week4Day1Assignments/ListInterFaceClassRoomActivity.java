package org.amazon.week4Assignmesnts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterFaceClassRoomActivity {

    public static void main(String[] args) {
        
        ChromeDriver obj=new ChromeDriver();
        obj.get( "https://www.amazon.in/");
        obj.manage().window().maximize();
        obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        obj.findElement(By.linkText("Mobiles")).click();
       
        List<WebElement> elements = obj.findElements(By.xpath("//span[@class='a-price-whole']"));
        List<Integer> priceList=new ArrayList<Integer>();


        int size = elements.size();
        for(int i=0;i<size;i++){
            String text = elements.get(i).getText();
            text = text.replace(",", "");// remove comma
            if(!text.isEmpty()){
                 priceList.add(Integer.parseInt(text));// covert text to integer for sorting
            }
        }

            Collections.sort(priceList);
            Integer lowestPrc = priceList.get(0);
        

            System.out.println("The lowesr price is:"+lowestPrc);


        }

        
      
    }


