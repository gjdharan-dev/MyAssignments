package org.amazon.seliniumbasicslocatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

    public static void main(String[] args) {
    
      System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");

        
      EdgeDriver obj=new EdgeDriver();
      obj.get("http://leaftaps.com/opentaps/control/main");
      obj.manage().window().maximize();
      obj.findElement(By.id("username")).sendKeys("DemoCSR");
      obj.findElement(By.id("password")).sendKeys("crmsfa");
      obj.findElement(By.className("decorativeSubmit")).click();
      obj.findElement(By.linkText("CRM/SFA")).click();
      obj.findElement(By.linkText("Leads")).click();
      obj.findElement(By.linkText("Create Lead")).click();
      obj.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidhyaa");
      obj.findElement(By.id("createLeadForm_lastName")).sendKeys("Dharan");
      obj.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
      obj.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Salsforce");
      obj.findElement(By.name("submitButton")).click();
      obj.close();
      





    }

}
