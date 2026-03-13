package org.amazon.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");

        EdgeDriver obj=new EdgeDriver();
        obj.get("http://leaftaps.com/opentaps/control/main");


        obj.manage().window().maximize();

        obj.findElement(By.id("username")).sendKeys("DemoCSR");

        obj.findElement(By.id("password")).sendKeys("crmsfa");
        
        obj.findElement(By.className("decorativeSubmit")).click();
        
        obj.findElement(By.linkText("CRM/SFA")).click();

        obj.findElement(By.linkText("Accounts")).click();

        obj.findElement(By.linkText("Create Account")).click();

        obj.findElement(By.id("accountName")).sendKeys("Vidhyaa");

        obj.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

        WebElement a= obj.findElement(By.name("industryEnumId"));
        Select obj2= new Select(a);
        obj2.selectByIndex(3);

        WebElement b=obj.findElement(By.name("ownershipEnumId"));
        Select obj3=new Select(b);
        obj3.selectByContainsVisibleText("S-Corporation");

        WebElement c =obj.findElement(By.id("dataSourceId"));
        Select obj4=new Select(c);
        obj4.selectByValue("LEAD_EMPLOYEE");

        WebElement d=obj.findElement(By.id("marketingCampaignId"));
        Select obj5=new Select(d);
        obj5.selectByIndex(6);

        WebElement e=obj.findElement(By.id("generalStateProvinceGeoId"));
        Select obj6=new Select(e);
        obj6.selectByValue("TX");

        obj.findElement(By.className("smallSubmit")).click();

        obj.close();;







        



    }

}
