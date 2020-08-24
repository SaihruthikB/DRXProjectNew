package com.ys.h2hdrx.webmodule;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Webmoduleobjects extends Driver {
	// to find elements and elements

	// divToolTipCheck divToolTip
	WebDriver driver;

	public Webmoduleobjects(WebDriver localdriver) {
		this.driver = localdriver;
	}
	/*
	 * public Webmoduleobjects() { PageFactory.initElements(driver, this); }
	 */

	// Login

	@FindBy(how = How.NAME, using = "userId")
	public WebElement userid_txt;

	@FindBy(how = How.NAME, using = "password")
	public WebElement password_txt;

	@FindBy(how = How.XPATH, using = "//div[@class='col-xs-8 col-sm-8']/span/a[@class='squarebutton']/span[text()='Login']")
	public WebElement userlogin_btn;

	// single validation

	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//*[@id='loginScreen']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/li")
	 * public WebElement user_val;
	 */

	/*
	 * public String userVal() { String useridVal = user_val.getText(); return
	 * useridVal; }
	 */

	// More than 2 validations validation
	@FindBy(how = How.XPATH, using = "//*[@id=\"command.errors\"]")
	public WebElement user_val;//*[@id='command.errors']

	// *[@id="loginScreen"]/table/tbody/tr[1]/td/table/tbody/tr/td[2]
	public String useridVal() {
		String useridVal = user_val.getText();
		return useridVal;
	}

	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//*[@id='loginScreen']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/li[2]")
	 * public WebElement pswd_val;
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='command.errors']")
	public WebElement pswd_val;

	public String pswdVal() {
		String useridVal = pswd_val.getText();
		return useridVal;
	}

	@FindBy(how = How.LINK_TEXT, using = "Login")
	public WebElement adminlogin_btn;

	@FindBy(how = How.LINK_TEXT, using = "Search")
	public WebElement Search_LinkText;

	@FindBy(how = How.LINK_TEXT, using = "Edit")
	public WebElement admin_EditUser;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyThreeFourth']/table/tbody/tr/td[1]/input")
	public WebElement admin_selectUser_rbtn;

	@FindBy(how = How.NAME, using = "newPassword")
	public WebElement admin_changepassword_newpassword;

	@FindBy(how = How.NAME, using = "confirmNewPassword")
	public WebElement admin_changepassword_confirmpassword;

	@FindBy(how = How.LINK_TEXT, using = "Save")
	public WebElement save_lnkText;

	@FindBy(how = How.LINK_TEXT, using = "Logoff")
	public WebElement web_logoff;

	// @FindBy(how=How.XPATH,using = "//*[@id='login_button']/span")WebElement
	// userlogin_btn;
	// @FindBy(how=How.TAG_NAME,using = "title")WebElement page_title;
	public String pageTitle_txt() {
		String title = driver.getTitle();
		return title;
		// to get the text of the title and return title name
	}

	@FindBy(how = How.XPATH, using = "//*[@id='divonbehalfHeader']/table/tbody/tr/td[2]/a/span")
	public WebElement onbehalf_close_xpath;
	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//*[@id='divonbehalfDetails']/table[1]/tbody/tr/td[2]/a/span") public
	 * WebElement onbehalf_close_xpath;
	 */

	@FindBy(how = How.XPATH, using = "html/body/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/p/input")
	public WebElement agree_cbox;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/span/a[1]")
	public WebElement agree_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='divPasswordChange']/table[1]/tbody/tr/td/b")
	public WebElement pswdchange_popup;

	public String pswdchange_txt() {
		String pswdchange = pswdchange_popup.getText();
		return pswdchange;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='divPasswordChange']/table[2]/tbody/tr/td[2]/li[1]")
	public WebElement pswdchange_popup_oldpswrd_val;

	public String pswdchange_popup_oldpswrd_valtxt() {
		String pswdchange = pswdchange_popup_oldpswrd_val.getText();
		return pswdchange;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='divPasswordChange']/table[2]/tbody/tr/td[2]/li[2]")
	public WebElement pswdchange_popup_newpswrd_val;

	public String pswdchange_popup_newpswrd_valtxt() {
		String pswdchange = pswdchange_popup_newpswrd_val.getText();
		return pswdchange;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='divPasswordChange']/table[2]/tbody/tr/td[2]/li[3]")
	public WebElement pswdchange_popup_cnfrmpswrd_val;

	public String pswdchange_popup_cnfrmpswrd_valtxt() {
		String pswdchange = pswdchange_popup_cnfrmpswrd_val.getText();
		return pswdchange;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='divPasswordChange']/table[2]/tbody/tr/td[2]/li")
	public WebElement pswdchange_popup_val;

	public String pswdchange_popup_valtxt() {
		String pswdchange = pswdchange_popup_val.getText();
		return pswdchange;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='divPasswordChange']/table[3]/tbody/tr[3]/td[3]/input")

	public WebElement pswdchange_popup_oldpswrd_txt;
	@FindBy(how = How.NAME, using = "oldPassword")
	public WebElement myprofile_oldpswrd_txt;
	@FindBy(how = How.NAME, using = "newPassword")
	public WebElement myprofile_newpswrd_txt;
	@FindBy(how = How.NAME, using = "confirmationPassword")
	public WebElement myprofile_confirmpswrd_txt;
	@FindBy(how = How.XPATH, using = "//*[@id='divPasswordChange']/table[3]/tbody/tr[4]/td[3]/input")
	public WebElement pswdchange_popup_newpswrd_txt;

	@FindBy(how = How.XPATH, using = "//*[@id='divPasswordChange']/table[3]/tbody/tr[5]/td[3]/input")
	public WebElement pswdchange_popup_confirmnewpswrd_txt;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/div/table[4]/tbody/tr/td[1]/span/a")
	public WebElement pswdchange_popup_submit_btn;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/div/table[4]/tbody/tr/td[2]/span/a")
	public WebElement pswdchange_popup_reset_btn;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/div/table[4]/tbody/tr/td[3]/span/a")
	public WebElement pswdchange_popup_cancel_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='col-xs-8 col-sm-8']/span/a[@class='squarebutton']/span[text()='reset']")
	public WebElement resetlogin_btn;

	@FindBy(how = How.LINK_TEXT, using = "My Profile")
	public WebElement myprofile_lnk;
	// my profile staff authorization
	@FindBy(how = How.LINK_TEXT, using = "Staff Authorization")
	public WebElement staffauthrozation_lnk;
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr/td[3]")
	public WebElement staff_sp;

	public WebElement staff_spcheckbox() {
		return staff_sp;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr/td[4]")
	public WebElement staff_pr;

	public WebElement staff_prcheckbox() {
		return staff_pr;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr/td[5]")
	public WebElement staff_epa;

	public WebElement staff_epacheckbox() {
		return staff_epa;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr/td[6]")
	public WebElement staff_epm;

	public WebElement staff_epmcheckbox() {
		return staff_epm;

	}

	String Staff_obn_checkbox1 = "//*[@id='scrollableTBodyFull']/table/tbody/tr[";
	String Staff_obn_checkbox2 = "]/td[7]";

	public WebElement Staff_obn_checkboxes(int i) {
		return driver.findElement(By.xpath(Staff_obn_checkbox1 + i + Staff_obn_checkbox2));

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"formNoSearch\"]/div/div[1]")
	//*[@id='formNoSearch']/table[2]/tbody/tr[6]/td
	public WebElement staff_sucess;

	public String staff_sucessmsg() {
		String validationtxt = staff_sucess.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"formNoSearch\"]/div/table[1]/tbody/tr/td[2]/input")
	//*[@id='formNoSearch']/table[1]/tbody/tr/td[2]/input
	public WebElement satff_search;
	@FindBy(how = How.XPATH, using = "//*[@id=\"scrollableTBodyFull\"]/table/tbody")
	//*[@id='scrollableTBodyFull']/table
	public WebElement satff_webtable;
	String Staff_name1 = "//div[@id='scrollableTBodyFull']/table/tbody/tr[";
	//*[@id='scrollableTBodyFull']/table/tbody
	String Staff_name2 = "]/td[1]";

	public String Staff_names(int i) {
		String names = driver.findElement(By.xpath(Staff_name1 + i + Staff_name2)).getText();
		return names;
	}
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr[3]/td[2]")public WebElement satff_profile;
	public String Staff_profilenames(int i) {
		String names = satff_profile.getText();
		return names;
	}
	// my profile favourite drug
	@FindBy(how = How.LINK_TEXT, using = "Favorite Drugs")
	public WebElement favourite_lnk;
	@FindBy(how = How.XPATH, using = "//*[@id=\"criteriaSearch\"]/div/div[5]/div")
	//*[@id='criteriaSearch']/table/tbody/tr[6]/td
	public WebElement practicelist_sucess;

	public String addpractice_sucess(int i) {
		String str = practicelist_sucess.getText();
		return str;

	}

	@FindBy(how = How.LINK_TEXT, using = "Add to Practice List")
	public WebElement practicelist_but;
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyHalf']/table")
	public WebElement favouritedrug_table;
	String favouritedruglistxpath1 = "//*[@id='scrollableTBodyHalf']/table/tbody/tr[";

	String favouritedrugxlistpath2 = "]/td[2]";
	String favouritedrugcheckbox1 = "//*[@id='scrollableTBodyHalf']/table/tbody/tr[";
	String favouritedrugcheckbox2 = "]/td[1]/input";

	public WebElement favoDrugs_checkboxes(int i) {
		return driver.findElement(By.xpath(favouritedrugcheckbox1 + i + favouritedrugcheckbox2));

	}

	String favouritedrugquantity1 = "//*[@id='scrollableTBodyHalf']/table/tbody/tr[";
	String favouritedrugquantity2 = "]/td[5]/input";

	public WebElement favoDrugs_quantity(int i) {
		return driver.findElement(By.xpath(favouritedrugquantity1 + i + favouritedrugquantity2));

	}

	String favouritedrugrefill1 = "//*[@id='scrollableTBodyHalf']/table/tbody/tr[";
	String favouritedrugrefill2 = "]/td[5]/input";

	public WebElement favoDrugs_refill(int i) {
		return driver.findElement(By.xpath(favouritedrugrefill1 + i + favouritedrugrefill2));

	}

	String favouritedrugqualifier1 = "//*[@id='scrollableTBodyHalf']/table/tbody/tr[";
	String favouritedrugqualifier2 = "]/td[4]/select";

	public WebElement favoDrugs_qualifier(int i) {
		return driver.findElement(By.xpath(favouritedrugqualifier1 + i + favouritedrugqualifier2));

	}

	@FindBy(how = How.NAME, using = "qtyQualifier")
	public WebElement qualifier_option;
	@FindBy(how = How.NAME, using = "drugInformation")
	public WebElement freeoct;
	@FindBy(how = How.NAME, using = "qty")
	public WebElement quantity;
	@FindBy(how = How.NAME, using = "refil")
	public WebElement refill;

	public String favoDrugs_list(int i) {
		String str = driver.findElement(By.xpath(favouritedruglistxpath1 + i + favouritedrugxlistpath2)).getText();
		return str;

	}

	public WebElement favoDrugs_lists(int i) {
		return driver.findElement(By.xpath(favouritedruglistxpath1 + i + favouritedrugxlistpath2));

	}

	// practice favorite drug
	@FindBy(how = How.LINK_TEXT, using = "PracticeFavoriteDrugs")
	public WebElement practicefavorite_lnk;
	@FindBy(how = How.NAME, using = "DrugName")
	public WebElement practicesearch_txt;
	@FindBy(how = How.XPATH, using = "//*[@id=\"scrollableTBodyFull\"]/table")
	//*[@id='formNoSearch']/table[3]/tbody/tr[3]
	public WebElement practicefavdrug_table;
	String qualifier1 = "//*[@id='scrollableTBodyFull']/table/tbody/tr[";
	String qualifier2 = "]/td[5]";

	public String favorite_qualifier(int i) {
		String medication_druglist = driver.findElement(By.xpath(qualifier1 + i + qualifier2)).getText();
		return medication_druglist;

	}

	String practicedrug1 = "//*[@id='scrollableTBodyFull']/table/tbody/tr[";
	String practicedrug2 = "]/td[2]";

	public WebElement favorite_druglink(int i) {
		return driver.findElement(By.xpath(practicedrug1 + i + practicedrug2));

	}

	String medPhysician1 = "//*[@id='scrollableTBodyFull']/table/tbody/tr[1";
	String medPhysician2 = "]/td[8]";

	public String med_physiciannames(int i) {
		String medication_druglist = driver.findElement(By.xpath(medPhysician1 + i + medPhysician2)).getText();
		return medication_druglist;

	}

	// my profile set drug intetaction
	@FindBy(how = How.LINK_TEXT, using = "Set Drug Interaction Level")
	public WebElement setdruginteraction_lnk;
	@FindBy(how = How.XPATH, using = "//*[@id=\"formNoSearch\"]/div/div/div[2]/div/b")
	//*[@id='formNoSearch']/table/tbody/tr[4]/td/b
	public WebElement setdrugsucess_msg;

	public String setdrugsucess_msg() {
		String validationtxt = setdrugsucess_msg.getText();
		return validationtxt;
	}

	@FindBy(how = How.NAME, using = "drugInteractLevel")
	public WebElement setdrug_druginteraction;
	@FindBy(how = How.NAME, using = "allergyInteractLevel")
	public WebElement setdrug_allergies;
	// my profile clinic
	// update clinic
	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[1]")
	public WebElement adrees_vali;
	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[2]")
	public WebElement city_vali;

	public String adrees_validation() {
		String validationtxt = adrees_vali.getText();
		return validationtxt;
	}

	public String city_validation() {
		String validationtxt = city_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.LINK_TEXT, using = "Update")
	public WebElement update;
	@FindBy(how = How.NAME, using = "city")
	public WebElement city;
	@FindBy(how = How.NAME, using = "addressLineOne")
	public WebElement address;
	@FindBy(how = How.NAME, using = "address1")
	public WebElement addressone;
	// add clinic
	@FindBy(how = How.NAME, using = "location")
	public WebElement practicename;
	@FindBy(how = How.NAME, using = "zip")
	public WebElement zip;
	@FindBy(how = How.NAME, using = "telephoneNo")
	public WebElement telphone;
	@FindBy(how = How.NAME, using = "telephoneNo1")
	public WebElement telphone1;
	@FindBy(how = How.NAME, using = "telephoneNo2")
	public WebElement telphone2;
	@FindBy(how = How.NAME, using = "telHomeCode")
	public WebElement telhome;
	@FindBy(how = How.NAME, using = "telHomeNo1")
	public WebElement telhome1;
	@FindBy(how = How.NAME, using = "telHomeNo2")
	public WebElement telhome2;
	@FindBy(how = How.NAME, using = "telWorkCode")
	public WebElement telwork;
	@FindBy(how = How.NAME, using = "telWorkNo1")
	public WebElement telwork1;
	@FindBy(how = How.NAME, using = "telWorkNo2")
	public WebElement telwork2;
	@FindBy(how = How.NAME, using = "faxNo")
	public WebElement faxNo;
	@FindBy(how = How.NAME, using = "faxNo1")
	public WebElement faxNo1;
	@FindBy(how = How.NAME, using = "faxNo2")
	public WebElement faxNo2;
	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[1]")
	public WebElement addrees_vali;

	public String addaddrees_validation() {
		String validationtxt = addrees_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[2]")
	public WebElement acity_vali;

	public String addcity_validation() {
		String validationtxt = acity_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[3]")
	public WebElement telphone_vali;

	public String addtelpone_validation() {
		String validationtxt = telphone_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[4]")
	public WebElement fax_vali;

	public String addfax_validation() {
		String validationtxt = fax_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[5]")
	public WebElement zip_vali;

	public String addzip_validation() {
		String validationtxt = zip_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[1]")
	public WebElement emptypractice_vali;
	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li")
	public WebElement myprofile_oldpswval;

	public String myprofileoldpsw_validation() {
		String validationtxt = myprofile_oldpswval.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"formNoSearch\"]/div/div/div[6]/div")
	//*[@id='formNoSearch']/table/tbody/tr[10]/td
	public WebElement myprofile_sucess;

	public String myprofile_sucess_message() {
		String validationtxt = myprofile_sucess.getText();
		return validationtxt;
	}

	// *[@id="formNoSearch"]/table/tbody/tr[1]/td[2]/li
	public String emptypractice_validation() {
		String validationtxt = emptypractice_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[2]")
	public WebElement emptyaddrees_vali;

	public String emptyaddress_validation() {
		String validationtxt = emptyaddrees_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[3]")
	public WebElement emptycity_vali;

	public String emptycity_validation() {
		String validationtxt = emptycity_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[4]")
	public WebElement emptystate_vali;

	public String emptystate_validation() {
		String validationtxt = emptystate_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[5]")
	public WebElement emptytelphone_vali;

	public String emptytelpone_validation() {
		String validationtxt = emptytelphone_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[6]")
	public WebElement emptyfax_vali;

	public String emptyfax_validation() {
		String validationtxt = emptyfax_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[7]")
	public WebElement emptyzip_vali;

	public String emptyzip_validation() {
		String validationtxt = emptyzip_vali.getText();
		return validationtxt;
	}

	@FindBy(how = How.LINK_TEXT, using = "Clinic Information")
	public WebElement clinicinformation_link;

	@FindBy(how = How.LINK_TEXT, using = "Update Clinic")
	public WebElement updateclinic_btn;

	@FindBy(how = How.LINK_TEXT, using = "Add Clinic")
	public WebElement addclinic_btn;
	@FindBy(how = How.LINK_TEXT, using = "Remove Clinic")
	public WebElement remove_btn;
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table")
	public WebElement clinic_webtable;
	String clinic1 = "//*[@id='scrollableTBodyFull']/table/tbody/tr[";
	String clinic2 = "]/td[2]";

	public String clinic_infor(int i) {

		String flag = driver.findElement(By.xpath(clinic1 + i + clinic2)).getText();
		return flag;
	}

	public WebElement clinic_information(int i) {

		return driver.findElement(By.xpath(clinic1 + i + clinic2));

	}

	public String clinic_val() {

		String flag = clinicinformation_validation.getText();
		return flag;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li")
	public WebElement clinicinformation_validation;

	String ture = "//*[@id='scrollableTBodyFull']/table/tbody/tr[";
	String ture1 = "]/td[5]";

	public String clinic_truestatus(int i) {
		String str = driver.findElement(By.xpath(ture + i + ture1)).getText();
		return str;

	}

	String clinic_checkbox = "//*[@id='scrollableTBodyFull']/table/tbody/tr[";
	String clinic_checkbox1 = "]/td[1]/input";

	public WebElement clinic_checkboxes(int i) {
		return driver.findElement(By.xpath(clinic_checkbox + i + clinic_checkbox1));

	}

	public String clinicInformationValidationTxt() {
		String validationtxt = clinicinformation_validation.getText();
		return validationtxt;
	}
	// my profile pesonal profile

	@FindBy(how = How.LINK_TEXT, using = "Personal Profile")
	public WebElement myprofile_personalprofiel;
	@FindBy(how = How.NAME, using = "lastName")
	public WebElement myprofile_personallastname;

	public String personal_lastname_txt() {
		String val = myprofile_personallastname.getText();
		return val;
	}

	// myprofile change password
	@FindBy(how = How.LINK_TEXT, using = "Change Password")
	public WebElement myprofile_ChangePassword;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[3]/td[2]/input")
	public WebElement myprofile_ChangePassword_oldpass;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[5]/td[2]/input")
	public WebElement myprofile_ChangePassword_newpass;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[7]/td[2]/input")
	public WebElement myprofile_ChangePassword_confirmpass;

	@FindBy(how = How.XPATH, using = "(//*[@id=\"paddedLinks\"])[2]")
	public WebElement update_LinkText;
	@FindBy(how = How.XPATH, using = "//*[@id='formPatientProfile']/table/tbody/tr[1]/td")
	public WebElement updatedrug_val_txt;

	public String update_sigvali() {
		String val = updatedrug_val_txt.getText();
		return val;
	}

	@FindBy(how = How.LINK_TEXT, using = "Reset")
	public WebElement reset_LinkText;

	@FindBy(how = How.LINK_TEXT, using = "Register")
	public WebElement register_LinkText;

	@FindBy(how = How.LINK_TEXT, using = "Saved Prescriptions")
	public WebElement savedPrescriptions_LinkText;

	@FindBy(how = How.LINK_TEXT, using = "Confirm Prescription(s)")
	public WebElement confirmPrescription_LinkText;

	@FindBy(how = How.LINK_TEXT, using = "Remove *")
	public WebElement Remove_LinkText;

	@FindBy(how = How.LINK_TEXT, using = "<< Back")
	//*[@id=\"paddedLinks\"]/a
	public WebElement back_LinkText;
	@FindBy(how = How.XPATH, using = "//*[@id=\"formPatientProfile\"]/div/div[1]")
	//*[@id='formPatientProfile']/table/tbody/tr[1]/td/b
	public WebElement updatedrug_sucess_txt;
	@FindBy(how = How.XPATH, using = "//*[@id='doctors']/option") public WebElement report_doctorname;
	public String report_savedocotor(){
		String str = report_doctorname.getText();
		return str;
		
	}
	public String update_sucess() {
		String sucess = updatedrug_sucess_txt.getText();
		return sucess;

	}

	@FindBy(how = How.LINK_TEXT, using = "Patient Registration")
	public WebElement patientReg_link;

	@FindBy(how = How.LINK_TEXT, using = "On Behalf")
	public WebElement onbehalf_link;
	@FindBy(how = How.XPATH, using = "//*[@id='divDetails']")
	public WebElement onbehalftable;
	String onbehalfname1 = "//*[@id='divonbehalfDetails'	]/table[";
	String onbehalfname2 = "]/tbody/tr/td";

	public String onbehalflist(int i) {
		String lists = driver.findElement(By.xpath(onbehalfname1 + i + onbehalfname2)).getText();
		return lists;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='divonbehalfDetails']/table")
	public WebElement onbehalflist;
	// Patient Search
	@FindBy(how = How.LINK_TEXT, using = "PATIENT SEARCH")
	public WebElement patientsearch_link;
	/*
	 * @FindBy(how = How.LINK_TEXT, using = "Search") public WebElement
	 * search_btn;
	 */
	@FindBy(how = How.LINK_TEXT, using = "Search")
	public WebElement search_btn;
	/*
	 * @FindBy(how = How.XPATH, using = "//*[@id='paddedLinks']/a")public
	 * WebElement search_btn;
	 */
	@FindBy(how = How.LINK_TEXT, using = "PATIENT SEARCH")
	public WebElement patientSearch_LinkText;
	@FindBy(how = How.XPATH, using = "//*[@id='dataLinks']/a")
	public WebElement search_patientlink;
	@FindBy(how = How.NAME, using = "hostPatientId")
	public WebElement search_patientid;
	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//*[@id='criteriaSearch']/table/tbody/tr[1]/td/li") public WebElement
	 * patient_val;
	 * 
	 * public String patientValidation(){ String validation =
	 * patient_val.getText(); return validation; }
	 */

	@FindBy(how = How.NAME, using = "lastName")
	public WebElement patientsearch_lastname_txt;
	@FindBy(how = How.NAME, using = "firstName")
	public WebElement patientsearch_firstname_txt;

	@FindBy(how = How.NAME, using = "dateOfBirth")
	public WebElement patientsearch_dob_txt;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyThreeFourth']/table/tbody/tr/td[3]")
	public WebElement patient_dobin_table;

	public String patientDOBinTable() {
		String dob = patient_dobin_table.getAttribute("value");
		return dob;
	}

	@FindBy(how = How.LINK_TEXT, using = "More..")
	public WebElement more_linktext;

	// Search, Reset button using above linktexts
	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//*[@id='scrollableTBodyThreeFourth']/table/tbody/tr[1]/td[2]/span/a")
	 * public WebElement patient_select_link;
	 */
	@FindBy(how = How.XPATH, using = "//*[@id=\"scrollableTBodyThreeFourth\"]/table/tbody/tr[1]/td[2]/a")
	public WebElement patient_select_link;
	// patientregistration
	@FindBy(how = How.XPATH, using = "(//*[@id=\"leftNav\"]/a)[1]")
	//*[@id='leftNavigation']/table/tbody/tr/td/table/tbody/tr[2]
	public WebElement Patienregistartion_tab;
	@FindBy(how = How.LINK_TEXT, using = "Register")
	public WebElement register_registerbut;
	@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='Last Name is required.']")
	//(//span[@id='command.errors']/child::node())[1]
	//*[@id='formNoSearch']/table/tbody/tr[1]/td/li[1]
	public WebElement Patienregistartion_lastname_val;
	@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='Zip Code Required.']")
	public WebElement Patienregistartion_zip_val;
	@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='City Required.']")
	public WebElement Patienregistartion_city_val;
	@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='Date of Birth is required.']")
	////*[@id='formNoSearch']/table/tbody/tr[1]/td/li[6]
	public WebElement Patienregistartion_dateofbirth_val;
	@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='Gender is Required.']")
	//*[@id='formNoSearch']/table/tbody/tr[1]/td/li[7]
	public WebElement Patienregistartion_gender_val;
	@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='Address is required.']")
	//*[@id='formNoSearch']/table/tbody/tr[1]/td/li[3]
	public WebElement Patienregistartion_addrees_val;
	@FindBy(how = How.NAME, using = "middleName")
	public WebElement Patienregistartion_middle_txt;
	@FindBy(how = How.NAME, using = "gender")
	public WebElement Patienregistartion_gender_txt;

	public String Register_addrees_val() {
		String val = Patienregistartion_addrees_val.getText();
		return val;

	}

	public String Register_zip_val() {
		String val = Patienregistartion_zip_val.getText();
		return val;

	}

	public String Register_city_val() {
		String val = Patienregistartion_city_val.getText();
		return val;

	}

	public String Register_dateofbirth_val() {
		String val = Patienregistartion_dateofbirth_val.getText();
		return val;

	}

	public String Register_gender_val() {
		String val = Patienregistartion_gender_val.getText();
		return val;

	}

	public String Register_lastname_val() {
		String val = Patienregistartion_lastname_val.getText();
		return val;

	}

	@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='First Name is Required.']")
	//*[@id='formNoSearch']/table/tbody/tr[1]/td/li[2]
	public WebElement Patienregistartion_first_val;

	public String Register_firstname_val() {
		String val = Patienregistartion_first_val.getText();
		return val;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td/li[8]")
	public WebElement Patienregistartion_teleponehome_val;

	public String Register_teleponehome_val() {
		String val = Patienregistartion_teleponehome_val.getText();
		return val;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td/li[9]")
	public WebElement Patienregistartion_teleponework_val;

	public String Register_teleponework_val() {
		String val = Patienregistartion_teleponework_val.getText();
		return val;

	}

	@FindBy(how = How.NAME, using = "selectedPerson")
	public WebElement patient_registration_checkbox;
	@FindBy(how = How.LINK_TEXT, using = "GoToRxpad")
	public WebElement patient_registration_gotorxpad;
	// RxPad
	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[1]/a/b")
	public WebElement RxPad_tab;

	@FindBy(how = How.LINK_TEXT, using = "Drug Search")
	public WebElement drugSearch_LinkText;

	@FindBy(how = How.LINK_TEXT, using = "Time")
	public WebElement time_rxpad_btn;

	@FindBy(how = How.LINK_TEXT, using = "Done")
	public WebElement done_time_rxpad_btn;

	@FindBy(how = How.LINK_TEXT, using = "use free text")
	public WebElement useFreetext_btn;

	@FindBy(how = How.LINK_TEXT, using = "use codified sig")
	public WebElement useCodifiedsig_btn;

	@FindBy(how = How.LINK_TEXT, using = "Payer/PBM Specified Alternatives")
	public WebElement pbmAlternatives_btn;

	@FindBy(how = How.LINK_TEXT, using = "Therapeutical Alternatives")
	public WebElement therapeuticalAlternatives_btn;
	// pharmacy
	@FindBy(how = How.LINK_TEXT, using = "Search Pharmacy")
	public WebElement searchPharmacy_btn;
	// @FindBy(how = How.XPATH, using = "//*[@id='state']") public WebElement
	// search_statetable;
	@FindBy(how = How.NAME, using = "state")
	public WebElement search_statetable;
	@FindBy(how = How.LINK_TEXT, using = "DETAILED HELP")
	public WebElement searchphar_detailedhelp;
	@FindBy(how = How.LINK_TEXT, using = "QUICK REFERENCE")
	public WebElement searchphar_quickreference;
	// Back, searchpharmacy, reset buttons in search pharmacy can be used above
	// linktext
	@FindBy(how = How.LINK_TEXT, using = "Next Prescription >>")
	public WebElement nextPrescription_btn;

	@FindBy(how = How.LINK_TEXT, using = "<< Previous Prescription")
	public WebElement previousPrescription_btn;

	// Confirmprescription, reset can be used above linktext
	@FindBy(how = How.NAME, using = "drugName")
	public WebElement drugName_txt;
	@FindBy(how = How.LINK_TEXT, using = "Free Text Medication")
	public WebElement freetext_tab;
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyDrugSearchDrugList']/table/tbody/tr[1]/td[1]/a")
	public WebElement drugSearch_Selecting_link;

	@FindBy(how = How.NAME, using = "quantity")
	public WebElement rxpad_quantity_txt;

	@FindBy(how = How.NAME, using = "state")
	public WebElement drugSearch_state_txt;

	@FindBy(how = How.NAME, using = "name")
	public WebElement pharmacy_name_txt;

	@FindBy(how = How.LINK_TEXT, using = "CA Pharmacy 10.6MU")
	public WebElement capharmacy_lnk;

	@FindBy(how = How.LINK_TEXT, using = "Edit")
	public WebElement edit_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table[2]/tbody/tr[1]/td[2]/table[2]/tbody/tr[2]/td[5]/span/a")
	public WebElement Edit2_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table[2]/tbody/tr[1]/td[2]/table[2]/tbody/tr[2]/td[1]/input")
	public WebElement confirmScreen_2prescriptionselect;

	@FindBy(how = How.LINK_TEXT, using = "Add to Medication History *")
	public WebElement add2medicationHistory_btn;

	@FindBy(how = How.LINK_TEXT, using = "Close")
	public WebElement Detailslink;
	@FindBy(how = How.NAME, using = "selectedRx")
	public WebElement confirmscreen_prescriptionselect_name_txt;

	@FindBy(how = How.LINK_TEXT, using = "View Rx")
	public WebElement viewRx_lnk;

	// remove use as above
	@FindBy(how = How.LINK_TEXT, using = "Send to Pharmacy")
	public WebElement sendToPharmacy_lnkTxt;

	@FindBy(how = How.LINK_TEXT, using = "Send And Print")
	public WebElement sendAndPrint_lnkTxt;
	// print

	@FindBy(how = How.LINK_TEXT, using = "Print")
	public WebElement Print_lnkTxt;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyOneFourth']/table/tbody/tr/td/span")
	public WebElement Print_popup;

	public String print_pouptxt() {
		String print_pouptxt = Print_popup.getText();
		return print_pouptxt;
	}

	@FindBy(how = How.LINK_TEXT, using = "Add to Medication History *")
	public WebElement addToMedication_lnkTxt;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyOneFourth']/table/tbody/tr/td/li")
	public WebElement popup_success;

	public String trxn_sucess_msg() {
		String txnsucessmsg = popup_success.getText();
		return txnsucessmsg;
	}

	public String Firstdrug_txt() {
		String Firstdrugtxt = Firstdrug.getText();
		return Firstdrugtxt;
	}

	public String MedicationHistoryStatus_txt() {
		String statustxt = medicationHistoryStatus.getText();
		return statustxt;
	}

	// rx pad tab
	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[1]/a")
	public WebElement rxpadtab;
	// SS Medication History
	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[2]/a/b")
	public WebElement SSMedicationHistory_tab;

	@FindBy(how = How.NAME, using = "consent")
	public WebElement SSMH_Consent;

	@FindBy(how = How.XPATH, using = "//*[@id='formPatientProfileTabs']/table[2]/tbody/tr[8]/td[2]/button")
	public WebElement SSMH_gethistory_btn;

	@FindBy(how = How.LINK_TEXT, using = "<< Back to SS Medication History")
	public WebElement SSMH_BacktoMH;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyRxHistory']/table/tbody/tr[5]/td[1]/span/a")
	public WebElement SSMH_PBMCheck;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyRxHistory']/table/tbody/tr[5]/td[1]/span/a")
	public WebElement SSMH_FillsCheck;

	public String pbmdrug() {
		String pbmdrug = SSMH_PBMCheck.getText();
		return pbmdrug;
	}

	public String fillsdrug() {
		String pbmdrug = SSMH_PBMCheck.getText();
		return pbmdrug;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formPatientProfileTabs']/table[2]/tbody/tr[4]/td[1]/input")
	public WebElement SSMH_Fills_rbtn;

	// Allergies
	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[3]/a")
	public WebElement Allergies_tab;
	@FindBy(how = How.XPATH, using = "//div[@id='targetDiv']/div")
	//*[@id=\"targetDiv\"]/descendant::div[@class='lblAllergyDrugNames']
	//*[@id='names']  
	public WebElement drugdropdown;
	String drugname1 = "//*[@id='names']/option[";
	String drugname2 = "]";

	public String Druglist(int i) {
		String str = driver.findElement(By.xpath(drugname1 + i + drugname2)).getText();
		return str;
	}

	public WebElement Druglists(int i) {
		return driver.findElement(By.xpath(drugname1 + i + drugname2));

	}

	@FindBy(how = How.XPATH, using = "//div[@id='formTabsNoProfile']/div/table[2]/tbody/tr")
	//*[@id='formTabsNoProfile']/table[1]/tbody/tr[4]/td/table[2]/tbody/tr[1]
	public WebElement allergies_tab;
	String reaction1 = "//*[@id=\"formTabsNoProfile\"]/div/table[2]/tbody/tr[1]/td[";
	//*[@id='formTabsNoProfile']/table[1]/tbody/tr[4]/td/table[2]/tbody/tr[1]/td
	String reaction2 = "]"; /// input remove

	public String allergyreactions(int j) {
		String reactions = driver.findElement(By.xpath(reaction1 + j + reaction2)).getText();
		return reactions;

	}

	String reactioncheckbox1 = "//*[@id=\"formTabsNoProfile\"]/div/table[2]/tbody/tr/td[";
	//*[@id='formTabsNoProfile']/table[1]/tbody/tr[4]/td/table[2]/tbody/tr[1]/td
	String reactioncheckbox2 = "]/input";

	public WebElement allergyreactioncheckbox(int j) {
		return driver.findElement(By.xpath(reactioncheckbox1 + j + reactioncheckbox2));

	}

	// @FindBy(how = How.LINK_TEXT, using = "Inactivate") public WebElement
	// allergies_inactivelnk;
	@FindBy(how = How.NAME, using = "otherAllergies")
	public WebElement otherallergies_txt;
	@FindBy(how = How.XPATH, using = "//*[@id=\"calendarDiv\"]/div[5]/table/tbody/tr[4]/td[6]")
	public WebElement allergies_calendertomarow;
	@FindBy(how = How.XPATH, using = "//*[@id=\"formTabsNoProfile\"]/div/div[6]/div/a/img")
	//*[@id='formTabsNoProfile']/table[1]/tbody/tr[6]/td/a/img
	public WebElement allergies_calender;
	@FindBy(how = How.XPATH, using = "//*[@id=\"calendarDiv\"]/div[5]/table/tbody/tr[2]/td[7]")
	public WebElement allergies_todaydate;
	@FindBy(how = How.XPATH, using = "//*[@id=\"note\"]")
	//html/body/div[2]/form/div[3]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td/div/table[2]/tbody/tr/td[2]/textarea
	public WebElement allergies_note;
	String inactive1 = "//*[@id='scrollableTBodyFull']/table/tbody/tr[";
	String saveddrug2 = "]/td[2]";
	String inactive2 = "]/td[6]/u/a[3]";
	String edit2 = "]/td[6]/u/a[1]";
	String delete2 = "]/td[6]/u/a[2]";

	public String Savedprescriptiondrug(int i) {
		String str = driver.findElement(By.xpath(inactive1 + i + saveddrug2)).getText();
		return str;
	}

	public WebElement inactive(int i) {
		return driver.findElement(By.xpath(inactive1 + i + inactive2));

	}

	public WebElement edit(int i) {
		return driver.findElement(By.xpath(inactive1 + i + edit2));

	}

	public WebElement delete(int i) {
		return driver.findElement(By.xpath(inactive1 + i + delete2));

	}

	/*
	 * public WebElement drugdrodown() { return
	 * driver.findElement(By.name(drugdropdown));
	 * 
	 * }
	 */ @FindBy(how = How.LINK_TEXT, using = "Add New Allergy")
	public WebElement addAllergy_btn;

	@FindBy(how = How.NAME, using = "noKnownAllergy")
	public WebElement noknownAllergy_ckbox;
	@FindBy(how = How.XPATH, using = "//*[@id=\"formTabsNoProfile\"]/div/div[2]/label")
	public WebElement noallergies; ////*[@id='formTabsNoProfile']/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td

	public String noallergies() {
		String str = noallergies.getText();
		return str;
	}

	@FindBy(how = How.LINK_TEXT, using = "Add")
	public WebElement add_btn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"targetDiv\"]/div/label[1]")
	////*[@id='formPatientProfileTabs']/table/tbody/tr[3]/td/table/tbody/tr
	public WebElement allergies_header;

	public String allergiesheader() {
		String str = allergies_header.getText();
		return str;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"formTabsNoProfile\"]/div/table[2]/tbody/tr[1]/td[2]/input")
	public WebElement allergies_sort;
	String staus2 = "]/td[5]";

	public String allergiesstatus(int i) {
		String str = driver.findElement(By.xpath(Staff_name1 + i + staus2)).getText();
		return str;
	}

	// Saved Prescriptions Patient
	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[4]/a/b")
	public WebElement savedPrescriptionsPatient_tab;

	@FindBy(how = How.LINK_TEXT, using = "//*[@id='blueLinks']/a/span")
	public WebElement prescriber_details_link;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr/td[6]/span/a")
	public WebElement savedprescription_pharmacy_lnk;

	// Fav Drugs Patient
	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[5]/a/b")
	public WebElement favDrugPatient_tab;

	@FindBy(how = How.XPATH, using = "//*[@id='fontALL']/a/span")
	public WebElement favdrug_all;

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	public WebElement delete_lnktxt;

	@FindBy(how = How.NAME, using = "DrugName")
	public WebElement fav_drugName_txt;
	// patient profile
	@FindBy(how = How.LINK_TEXT, using = "Patient Profile")
	public WebElement patientprofiletab;
	@FindBy(how = How.XPATH, using = "//*[@id=\"formTabsNoProfile\"]/div/div[2]")
	//*[@id='formTabsNoProfile']/table/tbody/tr[2]/td
	public WebElement pesonalprofilesucess;

	public String personalsucess() {
		String list = pesonalprofilesucess.getText();
		return list;
	}

	// insurance information
	@FindBy(how = How.LINK_TEXT, using = "Insurance Information")
	public WebElement patientprofile_insurancetab;
	@FindBy(how = How.LINK_TEXT, using = "View Details")
	public WebElement insurance_viewdetails;
	@FindBy(how = How.XPATH, using = "(//*[@id=\"paddedLinks\"]/a)[1]")
	public WebElement insurance_back;

	@FindBy(how = How.XPATH, using = "//*[@id='formTabsNoProfile']/table/tbody/tr[1]/td")
	public WebElement insurance_details;

	public String insurance_details() {
		String list = insurance_details.getText();
		return list;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"formTabsNoProfile\"]/div/table[1]/tbody/tr/td[2]")
	//*[@id='formTabsNoProfile']/table/tbody/tr[3]/td[2]
	public WebElement insurance_results;

	public String insurance_results() {
		String list = insurance_results.getText();
		return list;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"formTabsNoProfile\"]/div/table[1]/tbody/tr/td[2]/b")
	//*[@id='formTabsNoProfile']/table/tbody/tr[3]/td[2]/b
	public WebElement insurance_noresult;

	public String insurance_noresultmsg() {
		String list = insurance_noresult.getText();
		return list;
	}

	@FindBy(how = How.NAME, using = "selectedInsurance")
	public WebElement insurance_radio;
	// pharmacy information'
	@FindBy(how = How.LINK_TEXT, using = "Patient_pharmacyprofile")
	public WebElement pharmacyinfo_tab;

	// insurance patient information
	@FindBy(how = How.LINK_TEXT, using = "PATIENT SEARCH")
	public WebElement patientsearch_tab;
	@FindBy(how = How.NAME, using = "hostPatientId")
	public WebElement patient_id;
	@FindBy(how = How.LINK_TEXT, using = "BRUCE PALTROW")
	public WebElement patientsearch_patient;
	// default physicain
	@FindBy(how = How.LINK_TEXT, using = "Default Physician")
	public WebElement deafaultphysician_tab;
	@FindBy(how = How.XPATH, using = "//*[@id='blueLinks']/select/option[7]") public WebElement low_supervisiordropdown;
    public String lowprofile_supervisior(){
    	String str = low_supervisiordropdown.getText();
    	return str;
    }
  
	@FindBy(how = How.NAME, using = "defaultPhysicianId")
	public WebElement deafaultphysician_list;
	@FindBy(how = How.XPATH, using = "//*[@id='formPatientProfileTabs']/table/tbody/tr[3]")
	public WebElement defaultphysician_sucess;
	// reports
	/////****************************************************/////
	/*@FindBy(how = How.LINK_TEXT, using = "Reports")
	public WebElement reports_tab;*/
	/*@FindBy(how = How.LINK_TEXT, using = "Saved Prescription") 
	public WebElement reports_Savedprescriptintab;
	@FindBy(how = How.LINK_TEXT, using = "Pending Refills") 
	public WebElement reports_pendingrefilltab;
	@FindBy(how = How.LINK_TEXT, using = "Generate Report")
	public WebElement generatereport_but;
	@FindBy(how = How.LINK_TEXT, using = "<< Back")
	public WebElement reports_back;
	@FindBy(how = How.XPATH, using = "/html/body")
	public WebElement generatereport_error;

	public String generatereport_error(int i) {
		String list = generatereport_error.getText();
		return list;
	}

	@FindBy(how = How.LINK_TEXT, using = "Patient Prescription")
	public WebElement reports_prescription;
	@FindBy(how = How.NAME, using = "patientFirstName")
	public WebElement report_first_txt;

	@FindBy(how = How.NAME, using = "patientLastName")
	public WebElement report_lastname_txt;
	@FindBy(how = How.XPATH, using = "//*[@id=\"divPatientSearch\"]/table")
	public WebElement reports_search;
	String patientxpath1 = "//*[@id=\"divPatientSearch\"]/table/tbody/tr[";
	String patientxpath2 = "]/td[1]";
	String patientaddressxpath2 = "]/td[2]";	
	String patientaddxpath2 = "]/td[4]/a";

	public String patientlist(int i) {
		String list = driver.findElement(By.xpath(patientxpath1 + i + patientxpath2)).getText();
		return list;
	}

	public String patientaddresslist(int i) {
		String list = driver.findElement(By.xpath(patientxpath1 + i + patientaddressxpath2)).getText();
		return list;
	}

	public WebElement patientaddlist(int i) {
		return driver.findElement(By.xpath(patientxpath1 + i + patientaddxpath2));

	}

	// *[@id="divPatientSearch"]/table/tbody/tr/td/table/tbody/tr[

	public WebElement patientlists(int i) {
		return driver.findElement(By.xpath(patientxpath1 + i + patientxpath2));

	}

	@FindBy(how = How.LINK_TEXT, using = "Add")
	public WebElement reports_add;
	@FindBy(how = How.LINK_TEXT, using = "Remove")
	public WebElement reports_remove;
	@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/table/tbody/tr[2]/td/table/tbody/tr/td/table[1]/tbody/tr[2]/td")
	public WebElement reports_breifcase;

	public String reports_breifcase() {
		String list = reports_breifcase.getText();
		return list;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='patientOptions']/option")
	public WebElement reports_options;
	// rx pad prescription report
	@FindBy(how = How.LINK_TEXT, using = "Prescription Report")
	public WebElement rxpad_prescriptionreport;

	// prescription report
	@FindBy(how = How.LINK_TEXT, using = "Prescriber History")
	public WebElement reports_prescriptionhistorytab;
	// from date
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentsSearch\"]/div[1]/div[1]/div[2]/div[4]/div/a/img")
	public WebElement report_fromdate;
	@FindBy(how = How.XPATH, using = "//*[@id='calendar_month_txt']")
	public WebElement fromdate_month;
	@FindBy(how = How.XPATH, using = "//*[@id='monthDropDown']")
	public WebElement fromdate_tablemonth;
	@FindBy(how = How.XPATH, using = "html/body/div/div[5]/table/tbody")
	public WebElement fromdate_tableday;

	
	 * String month1="//*[@id='monthDiv_"; String month2="0']";
	 
	String month1 = "/html/body/div/div[3]/div[";
	String month2 = "]";

	// monthDropDown
	public String calmonth(int i) {
		String cal = driver.findElement(By.xpath(month1 + i + month2)).getText();
		return cal;
	}

	public WebElement calmonths(int i) {
		return driver.findElement(By.xpath(month1 + i + month2));

	}

	// year
	@FindBy(how = How.ID, using = "calendar_year_txt")
	public WebElement fromdate_year;
	String year1 = "/html/body/div/div[4]/div[";
	String year2 = "]";

	// monthDropDown
	public String calyear(int j) {
		String cal = driver.findElement(By.xpath(year1 + j + year2)).getText();
		return cal;
	}

	public WebElement calyears(int j) {
		return driver.findElement(By.xpath(year1 + j + year2));

	}

	String date1 = "html/body/div/div[5]/table/tbody/tr[";
	String date2 = "]/td[";

	// String date3="]";
	public String date(int k) {
		String cal = driver.findElement(By.xpath(date1 + k + date2 + "]")).getText();
		return cal;
	}

	// to date
	@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/table/tbody/tr[2]/td/table/tbody/tr/td/table[1]/tbody/tr[7]/td[2]/table[2]/tbody/tr[3]/td[2]/a/img")
	public WebElement report_todate;*/
	
	/////*******************************************************
	
	/*
	 * @FindBy(how = How.XPATH, using = "//*[@id='calendar_month_txt']") public
	 * WebElement todate_month;
	 * 
	 * @FindBy(how = How.XPATH, using = "//*[@id='monthDropDown']") public
	 * WebElement fromdate_tablemonth;
	 * 
	 * @FindBy(how = How.XPATH, using = "html/body/div/div[5]/table/tbody")
	 * public WebElement fromdate_tableday;
	 * 
	 * String month1="//*[@id='monthDiv_"; String month2="0']"; String
	 * month1="/html/body/div/div[3]/div["; String month2="]"; //monthDropDown
	 * public String calmonth(int i){ String cal =
	 * driver.findElement(By.xpath(month1+i+month2)).getText(); return cal; }
	 * public WebElement calmonths(int i){ return
	 * driver.findElement(By.xpath(month1+i+month2));
	 * 
	 * }
	 */ // Medication History

	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[6]/a/b")
	public WebElement medicationHistory_tab;

	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//*[@id='contentsMedicationHistoryTabs']/table") public WebElement
	 * medicationhistory_table;
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody") //tbody should be removed
	public WebElement medicationhistory_table;
	@FindBy(how = How.NAME, using = "updatedComments")
	public WebElement updatedrug_comment_txt;
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/div")
	//*[@id='scrollableTBodyFull']/table/tbody
	public WebElement cancel_table;
	@FindBy(how = How.LINK_TEXT, using = "Update Drug")
	public WebElement updateDrug_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr[1]/td[1]/input")
	public WebElement medicationHistory_selectRecord_rbtn;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr[1]/td[2]")
	public WebElement Firstdrug;

	@FindBy(how = How.XPATH, using = "//*[@id='tooltipTD']")
	public WebElement medicationHistoryStatus;

	@FindBy(how = How.ID, using = "html/body/div[2]/form/div[3]/div[3]/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[1]/td[8]/span/a")
	public WebElement medicationhistory_physician_lnk;

	@FindBy(how = How.ID, using = "html/body/div[2]/form/div[3]/div[3]/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[1]/td[10]/a/img")
	public WebElement reprint_icon;

	@FindBy(how = How.LINK_TEXT, using = "Inactivate drugs")
	public WebElement mh_inactivatedrug;
	@FindBy(how = How.XPATH, using = "//*[@id='drugInactivationPage']/table/tbody/tr[5]/td[2]/select") public WebElement inactive_inactivereasonoption;
	@FindBy(how = How.LINK_TEXT, using = "Submit")
	public WebElement submit_lnktxt;

	@FindBy(how = How.LINK_TEXT, using = "Back")
	public WebElement mh_back_btn;

	@FindBy(how = How.LINK_TEXT, using = "Active Medication(s)")
	public WebElement mh_activemedications;

	@FindBy(how = How.LINK_TEXT, using = "Complete History")
	public WebElement mh_completehistory;

	@FindBy(how = How.LINK_TEXT, using = "Confirm Cancellation(s)")
	public WebElement mh_confirmcancellation;
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr[1]/td[2]/table[1]/tbody/tr[2]/td[1]/input")
	public WebElement cancel_checkbox;

	@FindBy(how = How.XPATH, using = "//*[@id=\"formPatientProfile\"]/div/div[1]")
	//*[@id='formPatientProfile']/table/tbody/tr[2]/td/span
	public WebElement cancel_cancelscreen;

	public String cancelscreen() {
		String str = cancel_cancelscreen.getText();
		return str;

	}

	@FindBy(how = How.LINK_TEXT, using = "Confirm Reprint/Refax")
	public WebElement mh_reprintrefax;

	@FindBy(how = How.LINK_TEXT, using = "Inactive Medication(s)")
	public WebElement mh_inactivemedications;

	@FindBy(how = How.LINK_TEXT, using = "Send CancelRx")
	public WebElement mh_cc_sendcancelrx;

	@FindBy(how = How.LINK_TEXT, using = "Reprint/Refax")
	public WebElement mh_rprf_reprintrefax;
	// *input[contains(@name,'Email')]
	// rxpad by nagamani
	// rx pad
	@FindBy(how = How.NAME, using = "drugName")
	public WebElement drug_txt;
	@FindBy(how = How.XPATH, using = "//*[@id='drugNames']")
	public WebElement drug_table;

	String drugxpath1 = "//*[@id='drugNames']/option[";
	String drugxpath2 = "]";
	@FindBy(how = How.LINK_TEXT, using = "Drug Search")
	public WebElement drugsearch_txt;
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyDrugSearchDrugList']/table")
	public WebElement druglist_table;
	String druglistxpath1 = "//*[@id='scrollableTBodyDrugSearchDrugList']/table/tbody/tr[";
	String drugxlistpath2 = "]/td[1]/a";
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"scrollableTBodyDrugSearchDrugList\"]/table/tbody/tr[4]/td[1]/a")
	public WebElement drugsearch_detailslink;
	@FindBy(how = How.NAME, using = "quantity")
	public WebElement quantity_txt;
	@FindBy(how = How.NAME, using = "refills")
	public WebElement refill_txt;
	@FindBy(how = How.NAME, using = "sigDoseId")
	public WebElement dose_option;
	@FindBy(how = How.NAME, using = "sigDeliveryId")
	public WebElement delivery_option;
	@FindBy(how = How.NAME, using = "sigDoseUnitsId")
	public WebElement units_option;
	@FindBy(how = How.NAME, using = "sigFreqId")
	public WebElement freq_option;
	@FindBy(how = How.LINK_TEXT, using = "Time")
	public WebElement time_but;
	@FindBy(how = How.NAME, using = "sigTimeBedTime")
	public WebElement time_list;
	@FindBy(how = How.NAME, using = "sigTimeBedTime")
	public WebElement updatedrug_time_list;
	@FindBy(how = How.LINK_TEXT, using = "Done")
	public WebElement time_done;
	@FindBy(how = How.LINK_TEXT, using = "use free text")
	public WebElement usefreetext_but;
	@FindBy(how = How.NAME, using = "sig")
	public WebElement sig_txt;
	@FindBy(how = How.LINK_TEXT, using = "Payer/PBM Specified Alternatives")
	public WebElement payerpbm_but;
	@FindBy(how = How.LINK_TEXT, using = "Therapeutical Alternatives")
	public WebElement therapetical_but;
	@FindBy(how = How.LINK_TEXT, using = "Next Prescription >>")
	public WebElement nextprescription_but;
	@FindBy(how = How.LINK_TEXT, using = "<< Previous Prescription")
	public WebElement previousprescription_but;
	@FindBy(how = How.LINK_TEXT, using = "Confirm Prescription(s)")
	public WebElement confirm_but;
	@FindBy(how = How.LINK_TEXT, using = "Edit")
	public WebElement edit_but;
	@FindBy(how = How.LINK_TEXT, using = "Patient Education")
	public WebElement Patientedc_but;
	@FindBy(how = How.LINK_TEXT, using = "Drug To Food Interactions")
	public WebElement drugtofood_but;
	@FindBy(how = How.LINK_TEXT, using = "Adverse Effects")
	public WebElement adverseEffects_but;
	@FindBy(how = How.XPATH, using = "//*[@id=\"scrollableTBodyFull\"]/div/div/div[4]/div[1]/span/a")
	//*[@id='scrollableTBodyFull']/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]/div/div[2]/a
	public WebElement pharmacy_lnk;
	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//*[@id='divHeader']/table/tbody/tr/td[2]/a/span") public WebElement
	 * close_lnk;
	 */
	//// *[@id='iframesLink']/a/span
	@FindBy(how = How.LINK_TEXT, using = "Close")
	public WebElement close_lnk;
	@FindBy(how = How.LINK_TEXT, using = "Close")
	public WebElement send_close;
	@FindBy(how = How.LINK_TEXT, using = "close")
	public WebElement cancellation_close;
	@FindBy(how = How.LINK_TEXT, using = "Send to Pharmacy")
	public WebElement sendtophar_txt;
	@FindBy(how = How.LINK_TEXT, using = "Close")
	public WebElement altclose_lnk;
	// pharmacy
	@FindBy(how = How.LINK_TEXT, using = "Search Pharmacy")
	public WebElement searchpharmacy_txt;
	@FindBy(how = How.NAME, using = "state")
	public WebElement state_txt;
	// @FindBy(how = How.XPATH, using =
	// "//*[@id='scrollableTBodyDrugSearchAltList']/table/tbody")
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyOneFourth']/table/tbody/tr/td/span")
	public WebElement confirmcancellation;

	public String confirmcancellation_sucess() {
		String pharmacy = confirmcancellation.getText();
		return pharmacy;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"scrollableTBodyFull\"]/div/div[1]/div[1]/div[1]/span[1]")
	//*[@id='scrollableTBodyFull']/table/tbody/tr[1]/td[2]/table[1]/tbody/tr[2]/td[2]
	public WebElement cancel_num;

	public String confirmcancellation_num() {
		String pharmacy = cancel_num.getText();
		return pharmacy;

	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"scrollableTBodyDrugSearchAltList\"]/table")
	public WebElement pharmacy_table;
	
	String pharmacy1 = "//div[@id='scrollableTBodyDrugSearchAltList']/table/tbody/tr[";
	String pharmacy2 = "]/td[1]/a"; //a needto be added 

	public String pharmacy(int i) {
		String pharmacy = driver.findElement(By.xpath(pharmacy1 + i + pharmacy2)).getText();
		return pharmacy;

	}

	// *[@id='resultsPatientProfileTabs']/table
	//// *[@id='contentsPatientProfileTabs']/table/tbody
	String pharmacy_xpath1 = "//*[@id='scrollableTBodyDrugSearchAltList']/table/tbody/tr[";
	String pharmacy_xpath2 = "]/td[1]";
	@FindBy(how = How.LINK_TEXT, using = "Next>>")
	public WebElement next_link;
	@FindBy(how = How.LINK_TEXT, using = " <<Previous")
	public WebElement previous_link;
	// oldapplication
	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//*[@id='Layer1']/table/tbody/tr[3]/td") public WebElement
	 * Alternative_popup;
	 */
	@FindBy(how = How.XPATH, using = "//*[@id='Layer1']/table/tbody/tr[3]/td/table/tbody/tr[1]/td[2]")
	public WebElement Alternative_popup;
	@FindBy(how = How.XPATH, using = "//*[@id=\"command.errors\"]")
	//*[@id='formPatientProfileTabs']/table/tbody/tr[1]
	public WebElement drugsearchvali;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[3]/div/button[1]/span")
	public WebElement schedule_ok;
	@FindBy(how = How.ID, using = "loginUsername")
	public WebElement schedule_email;
	@FindBy(how = How.ID, using = "loginPassword")
	public WebElement schedule_password;
	@FindBy(how = How.XPATH, using = "//*[@id=\"new_user\"]/div[2]/div[3]/input[1]")
	public WebElement schedule_siginbutton;

	public String drugsearch_vali() {
		String drgvali = drugsearchvali.getText();
		return drgvali;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='dataLinks']/a")
	public WebElement savepharmacy_link;

	// drug search list
	public String Drug_list(int i) {
		String str = driver.findElement(By.xpath(drugxpath1 + i + drugxpath2)).getText();
		return str;

	}

	public WebElement Drugsearch(int i) {
		return driver.findElement(By.xpath(drugxpath1 + i + drugxpath2));

	}

	// after drug search list
	public String Drugs_list(int i) {
		String str = driver.findElement(By.xpath(druglistxpath1 + i + drugxlistpath2)).getText();
		return str;

	}

	public WebElement Drugs_lists(int i) {
		return driver.findElement(By.xpath(druglistxpath1 + i + drugxlistpath2));

	}

	public String alternativepopup() {
		String alternativepopup = Alternative_popup.getText();
		return alternativepopup;
	}

	// patient saved prescription
	@FindBy(how = How.XPATH, using = "//*[@id=\"command.errors\"]")
	//*[@id='formPatientProfileTabs']/table/tbody/tr[1]
	public WebElement saved_confirm_val;

	public String confirm_savevali() {
		String validation = saved_confirm_val.getText();
		return validation;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td/li")
	public WebElement docsaved_confirm_val;

	public String docconfirm_savevali() {
		String validation = docsaved_confirm_val.getText();
		return validation;
	}

	@FindBy(how = How.LINK_TEXT, using = "<< Back")//(//span[@id='paddedLinks']/a)[1]
	//*[@id=\"paddedLinks\"]/a)[1]
	public WebElement savedback_but; //*[@id=\"paddedLinks\"])[1] //(//*[@id="paddedLinks"]/a)[1]
	// @FindBy(how = How.XPATH, using =
	// "//*[@id='contentsPatientProfileTabs']/table/tbody/tr/td/table/tbody")public
	// WebElement Saved_table;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody")
	public WebElement Saved_table;
	@FindBy(how = How.XPATH, using = "//div[@id='scrollableTBodyFull']/table/tbody")
	//*[@id='scrollableTBodyFull']/table
	//*[@id='contentsSearch']/table/tbody/tr[2]
	public WebElement docsaved_table;

	@FindBy(how = How.LINK_TEXT, using = "Reset")
	public WebElement savedreset_btn;
	@FindBy(how = How.LINK_TEXT, using = "Remove *")
	public WebElement savedremove_but;
	// ss medication history
	@FindBy(how = How.XPATH, using = "//*[@id='rxhubPBMUniqueId']")
	public WebElement patient_benefit;
	//// *[@id='formPatientProfileTabs']/table/tbody/tr[1]/td[2]/select
	String ssmdrug1 = "//*[@id='scrollableTBodyRxHistory']/table/tbody/tr[";
	String ssmdrug2 = "]/td[1]";

	public String ssm_druglist(int i) {
		String validation = driver.findElement(By.xpath(ssmdrug1 + i + ssmdrug2)).getText();
		return validation;
	}

	public WebElement ssm_druglists(int i) {
		return driver.findElement(By.xpath(ssmdrug1 + i + ssmdrug2));

	}

	String cancelcheck1 = "//*[@id=\"scrollableTBodyFull\"]/div/div[";
	//*[@id='scrollableTBodyFull']/table/tbody/tr[1]/td[2]/table[
	String cancelcheck2 = "]/div[1]/div[1]/input";
	//]/tbody/tr[2]/td[1]/input

	public WebElement cancelcheck1s(int i) {
		return driver.findElement(By.xpath(cancelcheck1 + i + cancelcheck2));

	}

	String ssmdate1 = "//*[@id='scrollableTBodyRxHistory']/table/tbody/tr[";
	String ssmdate2 = "]/td[3]";

	public String ssm_date(int i) {
		String validation = driver.findElement(By.xpath(ssmdate1 + i + ssmdate2)).getText();
		return validation;
	}

	public String patient_benefit() {
		String validation = patient_benefit.getText();
		return validation;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[2]")
	public WebElement ssmedicationhistory_tab;
	@FindBy(how = How.XPATH, using = "//*[@id=\"formPatientProfileTabs\"]/div/table[2]/tbody/tr[6]/td[2]/button")////*[@id='formPatientProfileTabs']/table[2]/tbody/tr[9]/td[2]/button
	public WebElement ssmedicationhistory_gethistory;
	@FindBy(how = How.XPATH, using = "//*[@id='formPatientProfileTabs']/table[1]/tbody/tr/td[1]/a")
	public WebElement ssmedicationhistory_help;
	@FindBy(how = How.XPATH, using = "//*[@id='formPatientProfileTabs']/table[2]/tbody/tr[2]/td/li")
	public WebElement ssmedicationhistory_val;
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyRxHistory']/table")
	public WebElement ssmedicationhistory_pbmwebtable;
	@FindBy(how = How.NAME, using = "consent")
	public WebElement ssmedicationhistory_content;
	@FindBy(how = How.LINK_TEXT, using = "<< Back to SS Medication History")
	public WebElement ssmed_pbmbackbutton;
	@FindBy(how = How.XPATH, using = "//*[@id='formPatientProfileTabs']/table[2]/tbody/tr[5]/td[1]/input")
	public WebElement ssmed_fillradiobutton;

	public String ssmedicationhistory_val() {
		String validation = ssmedicationhistory_val.getText();
		return validation;
	}

	// favourite drug
	@FindBy(how = How.NAME, using = "addToFavoriteDrugs")
	public WebElement favourite_checkbox;
	@FindBy(how = How.XPATH, using = "//*[@id=\"formPatientProfileTabs\"]/div/table[2]/tbody/tr/td[2]/input")
	////*[@id='formPatientProfileTabs']/table[2]/tbody/tr/td[2]/input
	public WebElement favourite_search;
	// medication history
	String drug1 = "//*[@id='scrollableTBodyFull']/table/tbody/tr[";
	//*[@id=\"scrollableTBodyFull\"]/table/tbody/tr[
	String drug2 = "]/td[2]"; //a need to be added at the end 
	String drug3 = "]/td[2]/a";
	String docsav = "]/td[2]/span[@id='dataLinks']/a"; //a need to remove at the end //
	public WebElement medication_druglink(int i) {
		return driver.findElement(By.xpath(drug1 + i + drug3));
	}

	public String medication_druglist(int i) {
		String medication_druglist = driver.findElement(By.xpath(drug1 + i + drug2)).getText();
		return medication_druglist;

	}
	
	public String medication_druglist_PSP(int i) {
		String medication_druglist1 = driver.findElement(By.xpath(drug1 + i + drug3)).getText();
		return medication_druglist1;

	}

	public String medication_druglists(int i) {
		String medication_druglist = driver.findElement(By.xpath(drug1 + i + docsav)).getText();
		return medication_druglist;

	}

	public WebElement save_druglink(int i) {
		return driver.findElement(By.xpath(drug1 + i + drug2));
	}

	public String save_druglist(int i) {
		//String medication_druglist = driver.findElement(By.xpath(drug1 + i + docsav)).getText();
		//need to check above for doctor saved prescriptions
		String medication_druglist = driver.findElement(By.xpath(drug1 + i + drug2)).getText();
		return medication_druglist;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr[1]/td[3]")
	public WebElement Details_lnk;
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr[6]/td[2]/a")
	public WebElement favourite_druglink;
	/*
	 * String checkbox1 = "//*[@id='scrollableTBodyFull']/table/tbody/tr[1";
	 * String checkbox2 = "]/td[1]/input";
	 * 
	 * public WebElement medication_checkboxes(int i) { return
	 * driver.findElement(By.xpath(checkbox1 + i + checkbox2));
	 * 
	 * }
	 */
	// disable
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[3]/div[3]/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[1]/td/li")
	public WebElement disable_val;
	String checkbox1 = "//*[@id=\"scrollableTBodyFull\"]/table/tbody/tr[";
	//*[@id='scrollableTBodyFull']/table/tbody
	String checkbox2 = "]/td[1]/input";

	public WebElement medication_checkboxes(int i) {
		return driver.findElement(By.xpath(checkbox1 + i + checkbox2));

	}

	@FindBy(how = How.XPATH, using = "//*[@id='divDetails']/table[2]/tbody/tr[3]/td[2]")
	public WebElement new_sig;

	public String update_new_sig() {
		String update_new_sig = new_sig.getText();
		return update_new_sig;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='selectall']")
	public WebElement selectall_checkbox;
	// doctor saved prescription
	// doctor saved prescription
	//--------
	@FindBy(how = How.LINK_TEXT, using = "Saved Prescriptions")
	public WebElement doctorsavedprescription_tab;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"targetDiv\"]/div/label[1]")
	public WebElement drugdropdown1;
	
	//(//span[@id='command.errors']/child::node())[1]
		//*[@id='formNoSearch']/table/tbody/tr[1]/td/li[1]
	
	@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='Last Name should be alphabetic characters.']")
	public WebElement Patienregistartion_lastname_val_Charecters;
	
	public String Patienregistartion_lastname_val_Charecters() {
		String val = Patienregistartion_lastname_val_Charecters.getText();
		return val;
	}
		
		@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='First Name is Required.']")
		public WebElement Patienregistartion_FirstName_val_Charecters;
		
		public String Patienregistartion_FirstName_val_Charecters() {
			String val1 = Patienregistartion_FirstName_val_Charecters.getText();
			return val1;	
	}
		@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='City Required.']")
		public WebElement Patienregistartion_City_val_Charecters;
		
		public String Patienregistartion_City_val_Charecters() {
			String val1 = Patienregistartion_City_val_Charecters.getText();
			return val1;	
	}
		
		@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='Zip Code Required.']")
		public WebElement Patienregistartion_Zip_val_Charecters;
		
		public String Patienregistartion_Zip_val_Charecters() {
			String val1 = Patienregistartion_Zip_val_Charecters.getText();
			return val1;	
	}
		
		@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='Invalid Date Of Birth.']")
		public WebElement Patienregistartion_DOB_val_Charecters;
		
		public String Patienregistartion_DOB_val_Charecters() {
			String val1 = Patienregistartion_DOB_val_Charecters.getText();
			return val1;	
	}
		@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='Invalid Telephone No.(Home).']")
		public WebElement Patienregistartion_TelePhoneW_val_Charecters;
		
		public String Patienregistartion_TelePhoneW_val_Charecters() {
			String val1 = Patienregistartion_TelePhoneW_val_Charecters.getText();
			return val1;	
	}
		@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='invalid message address']")
		public WebElement Patienregistartion_AddressNo_val_Charecters;
		
		public String Patienregistartion_AddressNo_val_Charecters() {
			String val1 = Patienregistartion_AddressNo_val_Charecters.getText();
			return val1;	
	}
		@FindBy(how = How.XPATH, using = "//div[@class='warnMessage']/span[text()='Invalid Telephone No.(Work).']")
		public WebElement Patienregistartion_TelephoneWN_Charecters;
		
		public String Patienregistartion_TelephoneWN_val_Charecters() {
			String val1 = Patienregistartion_TelephoneWN_Charecters.getText();
			return val1;	
		
	}
		@FindBy(how = How.NAME, using = "gender")
		public WebElement Patient_gender;
		/*public String Patient_Gender() {
			String val1 = Patient_gender.getText();
			return val1;*/	
		
	//}
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"command.errors\"]")
		public WebElement Patient_saveMessage;
		public String Patient_SaveMess_Val() {
			String val1 = Patient_saveMessage.getText();
			return val1;	
		
	}
		
		//sheduled drugs
		
		@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[3]/div/button[1]/span")
		public WebElement schedule_ok1;
		@FindBy(how = How.ID, using = "user_email")
		public WebElement idme_email;
		@FindBy(how = How.ID, using = "user_password")
		public WebElement idme_password;
		@FindBy(how = How.NAME, using = "commit")
		public WebElement schedule_siginbutton2;
		@FindBy(how=How.XPATH,using="//*[@id='m_address_info_page']/div[3]/div[1]/button")public WebElement idme_homecontinue;
		@FindBy(how=How.XPATH,using="//*[@id='review_info_page']/div[4]/div[1]/button")public WebElement idme_confirmcontinue;
		@FindBy(how=How.XPATH,using="//*[@id='questions']/div[5]/button")public WebElement idme_identifycontinue;
		@FindBy(how=How.XPATH,using="//*[@id='phone_info']/div[6]/div[1]/button")public WebElement idme_phonecontinue;
		@FindBy(how=How.XPATH,using="//*[@id='personal-info']/div[4]/div")public WebElement idme_personLcontinue;
		@FindBy(how=How.XPATH,using="//*[@id='new_multifactor']/div[3]/div/button") public WebElement idme_continue;

		@FindBy(how = How.XPATH, using ="/html/body/div/div/div/div[2]/ul/li[1]/a/div[2]/div") public WebElement idme_startnow;
		@FindBy(how = How.NAME, using = "birth_date")public WebElement idme_dob;

		@FindBy(how = How.NAME, using = "social")public WebElement idme_social;
		@FindBy(how = How.XPATH, using ="//*[@id='phone_info']/div[5]/div[1]/div[1]") public WebElement idme_smartphone;
		@FindBy(how = How.XPATH, using ="//*[@id='review_info_page']/div[3]/div[1]/div/label/span")public WebElement idme_checkbox;

		@FindBy(how = How.XPATH, using ="//*[@id='answers_question_0_1']")public WebElement idme_rockfinanicialcropcheckbox;
		@FindBy(how = How.XPATH, using ="//*[@id='answers_question_1_1']")public WebElement idme_2009cropcheckbox;
		@FindBy(how = How.XPATH, using ="//*[@id='answers_question_2_1']")public WebElement idme_sundersmanufacuringcheckbox;
		@FindBy(how = How.XPATH, using ="/html/body/div/div/div/div[2]/div/div[3]/p/a")public WebElement idme_verifylink;
		
		//paths of ss med:
		@FindBy(how = How.NAME, using = "consent")
			public WebElement ssmedicationhistory_pbmwebtable1;
		
		
		//xpats of patients:

			@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyThreeFourth']/table/tbody") public WebElement patientinfo_table;
			String xpath1="//*[@id='scrollableTBodyThreeFourth']/table/tbody/tr[";
			String xpath2= "]/td[1]";
			public String patientid(int i){
			String patientid = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
			return patientid;

			}

			String pxpath1="//*[@id='scrollableTBodyThreeFourth']/table/tbody/tr[";
			String pxpath2= "]/td[2]/a";
			public String patietname(int i){
			String patientname = driver.findElement(By.xpath(pxpath1+i+pxpath2)).getText();
			return patientname;

			}
			public WebElement patientnames(int i){
			WebElement patientinames = driver.findElement(By.xpath(pxpath1+i+pxpath2));
			return patientinames;

			}
			
			
			// reports
			
			
			@FindBy(how = How.LINK_TEXT, using = "Reports")
			public WebElement reports_tab;
			@FindBy(how = How.LINK_TEXT, using = "Saved Prescription") 
			public WebElement reports_Savedprescriptintab;
			@FindBy(how = How.LINK_TEXT, using = "Pending Refills") 
			public WebElement reports_pendingrefilltab;
			@FindBy(how = How.LINK_TEXT, using = "Generate Report")
			public WebElement generatereport_but;
			@FindBy(how = How.LINK_TEXT, using = "<< Back")
			public WebElement reports_back;
			@FindBy(how = How.XPATH, using = "//*[@id='plugin']")
			public WebElement generatereport_error;

			public String generatereport_error(int i) {
			String list = generatereport_error.getText();
			return list;
			}

			@FindBy(how = How.LINK_TEXT, using = "Patient Prescription")
			public WebElement reports_prescription;
			@FindBy(how = How.NAME, using = "patientFirstName")
			public WebElement report_first_txt;

			@FindBy(how = How.NAME, using = "patientLastName")
			public WebElement report_lastname_txt;
			// trunk5.2
			//@FindBy(how = How.XPATH, using = "//*[@id='divPatientSearch']/table/tbody/tr/td/table")public WebElement reports_search;
			@FindBy(how = How.XPATH, using = "//*[@id='divPatientSearch']")
			public WebElement reports_search;
			//trunk 5.2
			/*String patientxpath1 = "//*[@id='divPatientSearch']/table/tbody/tr/td/table/tbody/tr[";
			String patientxpath2 = "]/td[1]";*/
			String patientxpath1 = "//*[@id='divPatientSearch']/table/tbody/tr[";
			String patientxpath2 = "]/td[1]";
			//trunk6.2 reports
			/*String patientaddressxpath2 = "]/td[2]";
			String patientaddxpath2 = "]/td[4]/a";
			*/

			String patientaddxpath2 = "]/td[2]";

			public String patientlist(int i) {
			String list = driver.findElement(By.xpath(patientxpath1 + i + patientxpath2)).getText();
			return list;
			}

			public String patientaddresslist(int i) {
			String list = driver.findElement(By.xpath(patientxpath1 + i + patientaddxpath2)).getText();
			return list;
			}

			public WebElement patientaddlist(int i) {
			return driver.findElement(By.xpath(patientxpath1 + i + patientaddxpath2));

			}

			// *[@id="divPatientSearch"]/table/tbody/tr/td/table/tbody/tr[

			public WebElement patientlists(int i) {
			return driver.findElement(By.xpath(patientxpath1 + i + patientxpath2));

			}

			@FindBy(how = How.LINK_TEXT, using = "Add")
			public WebElement reports_add;
			@FindBy(how = How.LINK_TEXT, using = "Remove")
			public WebElement reports_remove;
			//trunk 5.2
			/*@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/table/tbody/tr[2]/td/table/tbody/tr/td/table[1]/tbody/tr[2]/td")
			public WebElement reports_breifcase;*/
			@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/div/table[1]/tbody/tr[2]/td") public WebElement reports_breifcase;
			public String reports_breifcase() {
			String list = reports_breifcase.getText();
			return list;
			}
			//trunk 5.2
			/*@FindBy(how = How.XPATH, using = "//*[@id='patientOptions']/option")
			public WebElement reports_options;
			*/
			@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/div/div[1]/div[2]/div[3]/div/div/label")public WebElement reports_options;
			// rx pad prescription report
			@FindBy(how = How.LINK_TEXT, using = "Prescription Report")
			public WebElement rxpad_prescriptionreport;

			// prescription report
			@FindBy(how = How.LINK_TEXT, using = "Prescriber History")
			public WebElement reports_prescriptionhistorytab;
			// from date trunk 5.1
			/*@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/table/tbody/tr[2]/td/table/tbody/tr/td/table[1]/tbody/tr[7]/td[2]/table[2]/tbody/tr[2]/td[2]/a/img")
			public WebElement report_fromdate;*/
			// from date
			@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/div[1]/div[1]/div[2]/div[4]/div/a/img")
			public WebElement report_fromdate;


			@FindBy(how = How.XPATH, using = "//*[@id='calendar_month_txt']")
			public WebElement fromdate_month;
			@FindBy(how = How.XPATH, using = "//*[@id='monthDropDown']")
			public WebElement fromdate_tablemonth;
			@FindBy(how = How.XPATH, using = "html/body/div/div[5]/table/tbody")
			public WebElement fromdate_tableday;

			/*
			* String month1="//*[@id='monthDiv_"; String month2="0']";
			*/
			String month1 = "/html/body/div/div[3]/div[";
			String month2 = "]";

			// monthDropDown
			public String calmonth(int i) {
			String cal = driver.findElement(By.xpath(month1 + i + month2)).getText();
			return cal;
			}

			public WebElement calmonths(int i) {
			return driver.findElement(By.xpath(month1 + i + month2));

			}

			// year
			@FindBy(how = How.ID, using = "calendar_year_txt")
			public WebElement fromdate_year;
			String year1 = "/html/body/div/div[4]/div[";
			String year2 = "]";

			// monthDropDown
			public String calyear(int j) {
			String cal = driver.findElement(By.xpath(year1 + j + year2)).getText();
			return cal;
			}

			public WebElement calyears(int j) {
			return driver.findElement(By.xpath(year1 + j + year2));

			}

			String date1 = "html/body/div/div[5]/table/tbody/tr[";
			String date2 = "]/td[";

			// String date3="]";
			public String date(int k) {
			String cal = driver.findElement(By.xpath(date1 + k + date2 + "]")).getText();
			return cal;
			}

			// to date trunk 6.2
			/*@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/table/tbody/tr[2]/td/table/tbody/tr/td/table[1]/tbody/tr[7]/td[2]/table[2]/tbody/tr[3]/td[2]/a/img")
			public WebElement report_todate;*/
			@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/div[1]/div[1]/div[2]/div[5]/div/a/img")
			public WebElement report_todate;
			
	
		
		
		

	
	
	
		
		
		
		
		
		

}

/*
 * // Patient Search
 * 
 * @FindBy(how = How.LINK_TEXT, using = "PATIENT SEARCH") public WebElement
 * patientSearch_LinkText;
 * 
 * @FindBy(how = How.NAME, using = "lastName") public WebElement
 * patientsearch_lastname_txt;
 * 
 * // Search, Reset button using above linktexts
 * 
 * @FindBy(how = How.XPATH, using =
 * "//*[@id='scrollableTBodyThreeFourth']/table/tbody/tr[1]/td[2]/span/a")
 * public WebElement patient_select_link;
 * 
 * }
 */
