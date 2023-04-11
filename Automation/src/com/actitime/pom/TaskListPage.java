package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNew;
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustomer;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerName;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;
	@FindBy(xpath="(//div[.='- Select Customer -'])[1]")
	private WebElement selectCustomerDD;
	@FindBy(xpath="//div[.='Anvesh' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
   @FindBy(xpath="//div[.='Create Customer']")
    private WebElement createCustomer;
   @FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
   private WebElement ActualCustomerCreated;
   @FindBy(xpath="//div[.='+ New Project']")
  private WebElement newProject;
   @FindBy(xpath="(//input[@type='text' and @placeholder='Enter Project Name'])[2]")
   private WebElement enterProjectName;
  
   @FindBy(xpath="(//div[.='-- Please Select Customer to Add Project for  --'])[2]")
   private WebElement selectCustomer;
   @FindBy(xpath="//textarea[@placeholder='Add Project Description']")
   private WebElement projectDescription;
   @FindBy(xpath="//div[.='Create Project']")
   private WebElement createProject;
   @FindBy(xpath="//div[.='+ New Tasks']")
   private WebElement newTask;
   @FindBy(xpath="(//div[@class='inputPlaceholder'])[1]")
   private WebElement enterCustomerandProject;
   @FindBy(xpath="//div[.='Anvesh' and @class='itemRow cpItemRow ']")
  private WebElement selectCustomerandProject;
   @FindBy(xpath="(//div[@class='inputPlaceholder'])[1]")
   private WebElement selectProject;
  
   
public TaskListPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}


 
public WebElement getAddNew() {
	return addNew;
}


 
public WebElement getNewCustomer() {
	return newCustomer;
}

 
 
public WebElement getEnterCustomerName() {
	return enterCustomerName;
}


 
 
public WebElement getEnterCustomerDescription() {
	return enterCustomerDescription;
}


 
public WebElement getSelectCustomerDD() {
	return selectCustomerDD;
}


 
public WebElement getOurCompany() {
	return ourCompany;
}


 
public WebElement getCreateCustomer() {
	return createCustomer;
}


 
 
public WebElement getActualCustomerCreated() {
	return ActualCustomerCreated;
}



/**
 * @return the newProject
 */
public WebElement getNewProject() {
	return newProject;
}



/**
 * @return the enterProjectName
 */
public WebElement getEnterProjectName() {
	return enterProjectName;
}



/**
 * @return the selectCustomer
 */
public WebElement getSelectCustomer() {
	return selectCustomer;
}



/**
 * @return the projectDescription
 */
public WebElement getProjectDescription() {
	return projectDescription;
}



/**
 * @return the createProject
 */
public WebElement getCreateProject() {
	return createProject;
}

}