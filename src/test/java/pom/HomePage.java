package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.BasePage;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUsername")
	private WebElement userTxtBox;
	@FindBy(id="txtPassword")
	private WebElement pwdTxtBox;
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_menu;
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_menu;
	@FindBy(id="firstName")
	private WebElement firstName;
	@FindBy(id="lastName")
	private WebElement lastName;
	@FindBy(id="btnSave")
	private WebElement saveBtn;
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement firstName1;
	
	public void setUserName(String un){
		userTxtBox.sendKeys(un);
	}
	public void setPwd(String pwd){
		pwdTxtBox.sendKeys(pwd);
	}
	public void clickLogin(){
		loginBtn.click();
	}
	public void clickPim_Menu(){
		pim_menu.click();
	}
	public void clickAddEmp_Menu(){
		addEmp_menu.click();
	}
	public void setFirstName(String fn){
		firstName.sendKeys(fn);
	}
	public void setLastName(String ln){
		lastName.sendKeys(ln);
	}
	public void clickSaveBtn(){
		saveBtn.click();
	}
	public void verifyFirstName(String eFn){
		String aFn = firstName1.getAttribute("value");
		Assert.assertEquals(aFn, eFn);
	}
	
	// to sort the elements in the list box
	
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement addEmpList_Btn;
	public void clickAddEmp_Btn(){
		addEmpList_Btn.click();
	}

}
