package org.amazon.week4Assignmesnts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

    public static void main(String[] args) {
        ChromeOptions opt=new ChromeOptions();

        opt.addArguments("guest");
        
        ChromeDriver obj=new ChromeDriver(opt);
        obj.get("http://leaftaps.com/opentaps/control/login");
        obj.manage().window().maximize();
        obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        obj.findElement(By.id("username")).sendKeys("Demosalesmanager");
        obj.findElement(By.id("password")).sendKeys("crmsfa");
        obj.findElement(By.className("decorativeSubmit")).click();
        obj.findElement(By.linkText("CRM/SFA")).click();
        obj.findElement(By.linkText("Contacts")).click();
        obj.findElement(By.linkText("Merge Contacts")).click();
        obj.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
        Set<String> windowHandles = obj.getWindowHandles();
        System.out.println(windowHandles);
        List<String> addres1=new ArrayList<String>(windowHandles);   
        String childwindow = addres1.get(1);  
        obj.switchTo().window(childwindow);
        obj.findElement(By.linkText("DemoCustomer")).click();
        String parentaddress = addres1.get(0);
        obj.switchTo().window(parentaddress);
        obj.findElement(By.xpath("//a[contains(@href, 'ComboBox_partyIdTo')]/img")).click();
        Set<String> contactWindowID = obj.getWindowHandles();
        List<String> contactIdList=new ArrayList<String>(contactWindowID);
        String windowid2 = contactIdList.get(1);
        obj.switchTo().window(windowid2);
        obj.findElement(By.linkText("DemoLBCust")).click();
        String windowid3 = contactIdList.get(0);
        obj.switchTo().window(windowid3);
        obj.findElement(By.linkText("Merge")).click();
        Alert alert1 = obj.switchTo().alert();
        alert1.accept();
        String title3 = obj.getTitle();
        System.out.println(title3);

        





      

        

    }

}
