package ru.stesting.jtraining.addressbook.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

  @Test
  public void ContactCreationTests() {
    app.gotoEditAddContactPage();
    app.fillContractForm(new ShortContactData("Alexei", "Barancev", "barancev@gmail.com"));
    app.submitContactInfo();
    app.returnToHomePage();
  }

}
