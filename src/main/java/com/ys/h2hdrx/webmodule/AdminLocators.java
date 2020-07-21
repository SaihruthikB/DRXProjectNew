package com.ys.h2hdrx.webmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//import com.ys.h2hdrx.adminmodule.Back;

public class AdminLocators extends Driver {
	
	public AdminLocators(WebDriver driver) {
		this.driver = driver;
    }
	//search user
	@FindBy(how = How.NAME, using = "profile")
	public WebElement profile;
	//@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[12]/td[4]/select") public WebElement trunk_profile;
	@FindBy(how = How.XPATH, using="//*[@id='contentsSearch']/table/tbody/tr[2]/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[2]") public WebElement searchuserinfo;
	@FindBy(how = How.LINK_TEXT, using = "Next>>") public WebElement adminedit_next;
	String user1="//*[@id='scrollableTBodyThreeFourth']/table/tbody/tr[";
	String user2="]/td[2]";
	public String userslist(int i){
		String userslist = driver.findElement(By.xpath(user1+i+user2)).getText();
		return userslist;
	}
	String radio1="//*[@id='scrollableTBodyThreeFourth']/table/tbody/tr[";
	String radio2="]/td[1]/input";
	public WebElement radiobuttons(int i){
		return  driver.findElement(By.xpath(radio1+i+radio2));
	}
	@FindBy(how = How.NAME, using = "disableUser") public WebElement disable_checkbox; 
	@FindBy(how = How.LINK_TEXT, using = "Save") public WebElement edit_save;
	@FindBy(how = How.LINK_TEXT, using = "Back") public WebElement edit_back;
	@FindBy(how = How.LINK_TEXT, using = "Reset") public WebElement edit_reset;
	@FindBy(how = How.NAME, using = "lastName") public WebElement edit_lastname; 
	@FindBy(how = How.NAME, using = "firstName") public WebElement edit_firstname; 
	@FindBy(how = How.XPATH, using="//*[@id='scrollableTBodyThreeFourth']/table/tbody/tr/td[1]/input") public WebElement search_firstcheckbox;
	//login
	@FindBy(how = How.NAME, using = "userId")
	public WebElement userid_txt;

	@FindBy(how = How.NAME, using = "password")
	public WebElement password_txt;

	@FindBy(how = How.LINK_TEXT, using = "Login")
	public WebElement adminlogin_btn;
	//supervisior
	@FindBy(how = How.XPATH, using = "//*[@id='stateCombo']/option[14]") public WebElement sup_state;
	@FindBy(how = How.NAME, using = "state") public WebElement edit_state;
//register doctor
	@FindBy(how = How.LINK_TEXT, using = "Register Doctor")
	public WebElement registerdoctor_tab;
	//@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]")
	//public WebElement vendor;
	@FindBy(how = How.NAME, using = "vendorId")public WebElement registerdoctor_vendor;
	@FindBy(how = How.NAME, using = "practiceId")public WebElement  registerdoctor_practice;
	@FindBy(how = How.NAME, using = "lastName") public WebElement  registerdoctor_lastname;
	@FindBy(how = How.NAME, using = "firstName") public WebElement  registerdoctor_firstname;
    @FindBy(how = How.NAME, using = "clinicName") public WebElement  registerdoctor_clinicname;
	@FindBy(how = How.NAME, using = "addressLine1") public WebElement  registerdoctor_addressline1;
	@FindBy(how = How.NAME, using = "city") public WebElement  registerdoctor_city;
	@FindBy(how = How.NAME, using = "state") public WebElement  registerdoctor_state;
	@FindBy(how = How.NAME, using = "zip") public WebElement  registerdoctor_zip;
	@FindBy(how = How.NAME, using = "telclinicCode") public WebElement  registerdoctor_telcliniccode;
	@FindBy(how = How.NAME, using = "telclinicNo1") public WebElement  registerdoctor_telcliniccode1;
	@FindBy(how = How.NAME, using = "telclinicNo2") public WebElement  registerdoctor_telcliniccode2;
	@FindBy(how = How.NAME, using = "faxAreaCode") public WebElement  registerdoctor_faxAreaCode;
	@FindBy(how = How.NAME, using = "faxNumberOne")public WebElement  registerdoctor_faxAreaCode1;
	@FindBy(how = How.NAME, using = "faxNumberTwo")public WebElement  registerdoctor_faxAreaCode2;
	@FindBy(how = How.NAME, using = "npi") public WebElement  registerdoctor_npi;
	@FindBy(how = How.NAME, using = "deano") public WebElement  registerdoctor_deano;
	@FindBy(how = How.XPATH, using = "/html/body/button[1]") public WebElement npi_generator;
	@FindBy(how = How.LINK_TEXT, using = "Register")  public WebElement registration_register;
	@FindBy(how = How.NAME, using = "sureScript") public WebElement registerwithsurescript_checkbox;
	@FindBy(how = How.NAME, using = "refill")  public WebElement register_refillcheckbox;
    @FindBy(how = How.NAME, using = "cancel") public WebElement register_cancelcheckbox;
    @FindBy(how = How.NAME, using = "controlSubstances") public WebElement register_controlcheckbox;
    @FindBy(how = How.LINK_TEXT, using = "Change Password") public WebElement register_changepassword;
    @FindBy(how = How.NAME, using = "newPassword") public WebElement changepsw_newpsw;
    @FindBy(how = How.XPATH, using = " //*[@id='confirmNewPassword']")public WebElement changepsw_confirmpsw;
    @FindBy(how = How.LINK_TEXT, using = "Save") public WebElement changepsw_save;
    @FindBy(how = How.LINK_TEXT, using = "<< Back")  public WebElement changepsw_back;
    //edit
	@FindBy(how = How.NAME, using = "userId") public WebElement edit_userid;
	@FindBy(how = How.LINK_TEXT, using = "Search") public WebElement edit_search;
	@FindBy(how = How.NAME, using = "doctorId") public WebElement edit_radio;
	@FindBy(how = How.LINK_TEXT, using = "Edit") public WebElement edit_button;
	@FindBy(how = How.LINK_TEXT, using = "Change UserId") public WebElement edit_changeuserid;
	@FindBy(how = How.NAME, using = "userId")public WebElement userid;
public String register_userid(){
	String str = userid.getText();
	return str;
}
//supervisior
@FindBy(how = How.XPATH, using = "//*[@id='supervisor']/select/option[1]") public WebElement supdisable_firstone;

@FindBy(how = How.XPATH, using = "//*[@id='supervisor']/select/option[495]")  public WebElement sup_enabletone;
//*[@id="supervisorId"]/option[495]

}
