package ru.stesting.jtraining.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Naum.Ginzburg on 05.04.2017.
 */
public class NavigationHelper {
    private FirefoxDriver wd;

    public void gotoGroupPage() {
      wd.findElement(By.linkText("groups")).click();
    }
}
