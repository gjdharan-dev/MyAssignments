package org.amazon.week4Assignmesnts.Classroomactitivity;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowhandlingirctc {

    public static void main(String[] args) {
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("guest");

        ChromeDriver obj=new ChromeDriver(opt);
        obj.get("https://www.irctc.co.in/nget/train-search");
        obj.manage().window().maximize();
        obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        obj.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
        Set<String> windowHandles = obj.getWindowHandles();
        List<String> childAddress=new ArrayList<String>(windowHandles);
        String id1 = childAddress.get(1);
        obj.switchTo().window(id1);
        String title = obj.getTitle();
        System.out.println(title);
        String string1 = childAddress.get(0);
        obj.switchTo().window(string1);
        obj.close();



    }

}
