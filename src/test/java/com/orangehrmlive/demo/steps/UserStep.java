package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class UserStep {
    @Given("^I am on HomePage & Login to the application$")
    public void iAmOnHomePageLoginToTheApplication() {
        new LoginPage().LoginToApplication("Admin", "admin123");
    }

    @When("^I click On Admin Tab$")
    public void iClickOnAdminTab() {
        new ViewSystemUsersPage().clickAdminLink();
    }

    @Then("^I Verify System Users Text$")
    public void iVerifySystemUsersText() {
        Assert.assertEquals("Not displayed:", "System Users", new ViewSystemUsersPage().getSystemUserText());
    }

    @When("^I click On Add button$")
    public void iClickOnAddButton() {
        new ViewSystemUsersPage().clickAddButton();
    }

    @Then("^I Verify Add User Text$")
    public void iVerifyAddUserText() {
        Assert.assertEquals("Not Displayed:", "Add User", new ViewSystemUsersPage().AddUser());
    }

    @When("^I Select User Role Admin$")
    public void iSelectUserRoleAdmin(String Admin) throws InterruptedException {
        Thread.sleep(500);
        new ViewSystemUsersPage().selectAdminRole(Admin);
    }

    @And("^I enter Employee Name Ananya Dash$")
    public void iEnterEmployeeNameAnanyaDash() throws InterruptedException {
        Thread.sleep(500);
        new ViewSystemUsersPage().enterEmp();
    }

    @And("^I enter User name$")
    public void iEnterUserName() throws InterruptedException {
        Thread.sleep(500);
        new ViewSystemUsersPage().enterUser();
    }

    @And("^I Select status Disable$")
    public void iSelectStatusDisable() throws InterruptedException {
        Thread.sleep(500);
        new ViewSystemUsersPage().selectDisableOption();
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new ViewSystemUsersPage().enterPass();
    }

    @And("^I enter Confirm Password$")
    public void iEnterConfirmPassword() {
        new ViewSystemUsersPage().enterConfirmPass();
    }

    @And("^I click On Save Button$")
    public void iClickOnSaveButton() {
        new ViewSystemUsersPage().clickOnSaveButton();
    }

    @Then("^I verify message Successfully Saved$")
    public void iVerifyMessageSuccessfullySaved() {
    }

    @When("^I Enter username$")
    public void iEnterUsername() {
        new AddUserPage().enterUser();
    }

    @And("^I Select user role$")
    public void iSelectUserRole() throws InterruptedException {
        Thread.sleep(500);
        new AddUserPage().SelectUserRole();
    }

    @And("^I select status$")
    public void iSelectStatus(String Disable) throws InterruptedException {
        Thread.sleep(500);
        new AddUserPage().SelectStatusDisable(Disable);
    }

    @And("^I click on search$")
    public void iClickOnSearch() {
        new AddUserPage().ClickSearchButton();
    }

    @Then("^I should see the user in the list$")
    public void iShouldSeeTheUserInTheList() {
        new AddUserPage().VerifyResultList();
    }


    @And("^I select status enable$")
    public void iSelectStatusEnable() throws InterruptedException {
        Thread.sleep(500);
        new ViewSystemUsersPage().selectEnableOption();
    }

    @And("^I search for user$")
    public void iSearchForUser() {
        new AddUserPage().enterUser();
    }

    @And("^I select the status$")
    public void iSelectTheStatus() throws InterruptedException {
        Thread.sleep(500);
        new AddUserPage().SelectStatusEnable();
    }

    @And("^I select user role$")
    public void iSelectUserRole2() throws InterruptedException {
        Thread.sleep(500);
        new AddUserPage().SelectUserRole();
    }

    @And("^I click on Search$")
    public void iClickOnSearch2() {
        new AddUserPage().ClickSearchButton();
    }

    @And("^I click on check box$")
    public void iClickOnCheckBox() {
        new AddUserPage().clickOnCheckbox();
    }

    @And("^I click delete$")
    public void iClickDelete() throws InterruptedException {
        Thread.sleep(500);
        new AddUserPage().ClickDeleteButton();
    }

    @And("^I click ok on pop up$")
    public void iClickOkOnPopUp() throws InterruptedException {
        Thread.sleep(500);
        new AddUserPage().PopUpClick();
    }

    @Then("^I should see message Successfully Deleted$")
    public void iShouldSeeMessageSuccessfullyDeleted() {
        Assert.assertEquals("Not Displayed:", "No Records Found", new AddUserPage().VerifyMsgCheck());
    }


    @And("^I click search$")
    public void iClickSearch() {
        new AddUserPage().SearchButtonDelete();
    }

    @Then("^I see message No Record Found$")
    public void iSeeMessageNoRecordFound() {
        Assert.assertEquals("Not Displayed:", "No Records Found", new AddUserPage().VerifyNoRecordFound());
    }

    @And("^I select its status$")
    public void iSelectItsStatus(String enable) throws InterruptedException {
        Thread.sleep(500);
        new AddUserPage().SelectStatusDisable(enable);
    }
}
