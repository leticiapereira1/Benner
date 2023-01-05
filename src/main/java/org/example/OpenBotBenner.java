package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenBotBenner {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        DesktopOptions options = new DesktopOptions();



        options.setApplicationPath("C:\\Program Files (x86)\\Power Automate Desktop\\PAD.Console.Host.exe");

        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);
        //winium precisa ficar aberto na estação

        Thread.sleep(90000);


        driver.findElement(By.name("Meus fluxos")).click();

        driver.findElement(By.className("DataGridCell")).click();

        driver.findElement(By.name("Executar")).click();


        Thread.sleep(90000);

        driver.quit();









    }



}
