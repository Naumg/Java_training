package ru.stesting.jtraining.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stesting.jtraining.addressbook.model.GroupData;

/**
 * Created by Naum.Ginzburg on 05.04.2017.
 */
public class GroupHelper {
    private WebDriver wd;

    public GroupHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getName());
        wd.findElement(By.xpath("//div[@id='content']//label[.='Group header (Logo):']")).click();
        type(By.name("group_footer"), groupData.getName());
        wd.findElement(By.xpath("//div[@id='content']//label[.='Group footer (Comment):']")).click();
    }

    private void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }
}
