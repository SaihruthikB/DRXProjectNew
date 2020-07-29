package com.ys.h2hdrx.webmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebLocators extends Driver {
	// to find elements and elements

	// divToolTipCheck divToolTip
	WebDriver driver;

	public WebLocators(WebDriver localdriver) {
		this.driver = localdriver;
	}/*
		 * public Objects() { PageFactory.initElements(driver, this); }
		 */

	// Login

	@FindBy(how = How.NAME, using = "userId")
	public WebElement userid_txt;

	@FindBy(how = How.NAME, using = "password")
	public WebElement password_txt;

	@FindBy(how = How.XPATH, using = "")
	public WebElement userlogin_btn;

	// single validation
	@FindBy(how = How.XPATH, using = "//*[@id='loginScreen']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/li")
	public WebElement user_val;
	@FindBy(how = How.XPATH, using = "//*[@id='loginScreen']/table/tbody/tr[4]/td[3]/input/") 
	public WebElement user_val1;
	
	public String userVal() {
		String useridVal = user_val.getText();
		return useridVal;
	}

	// More than 2 validations validation
	@FindBy(how = How.XPATH, using = "//*[@id='loginScreen']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/li[1]")
	public WebElement userid_val;

	public String useridVal() {
		String useridVal = userid_val.getText();
		return useridVal;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='loginScreen']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/li[2]")
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

	@FindBy(how = How.LINK_TEXT, using = "Change Password")
	public WebElement admin_changepswd;

	// @FindBy(how=How.XPATH,using = "//*[@id='login_button']/span")WebElement
	// userlogin_btn;
	// @FindBy(how=How.TAG_NAME,using = "title")WebElement page_title;
	public String pageTitle_txt() {
		String title = driver.getTitle();
		return title;
		// to get the text of the title and return title name
	}

	@FindBy(how = How.XPATH, using = "html/body/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/p/input")
	public WebElement agree_cbox;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/span/a[1]")
	public WebElement agree_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='divPasswordChange']/table[1]/tbody/tr/td/b")
	public WebElement pswdchange_popup;

	public String pswdchange_txt() {
		String pswdchange = pswdchange_popup.getText();
		return pswdchange;
		// to get the text of the title and return title name
	}

	@FindBy(how = How.XPATH, using = "//*[@id='divPasswordChange']/table[3]/tbody/tr[3]/td[3]/input")
	public WebElement pswdchange_popup_oldpswrd_txt;

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

	@FindBy(how = How.XPATH, using = "//*[@id='loginScreen']/table/tbody/tr[8]/td[3]/table/tbody/tr/td[2]/span/a/span")
	public WebElement resetlogin_btn;

	@FindBy(how = How.LINK_TEXT, using = "My Profile")
	public WebElement myprofile_lnk;

	@FindBy(how = How.LINK_TEXT, using = "Change Password")
	public WebElement myprofile_ChangePassword;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[3]/td[2]/input")
	public WebElement myprofile_ChangePassword_oldpass;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[5]/td[2]/input")
	public WebElement myprofile_ChangePassword_newpass;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[7]/td[2]/input")
	public WebElement myprofile_ChangePassword_confirmpass;

	@FindBy(how = How.LINK_TEXT, using = "Update")
	public WebElement update_LinkText;

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
	public WebElement back_LinkText;

	@FindBy(how = How.LINK_TEXT, using = "Patient Registration")
	public WebElement patientReg_link;

	// Patient Search

	@FindBy(how = How.LINK_TEXT, using = "PATIENT SEARCH")
	public WebElement patientSearch_LinkText;

	@FindBy(how = How.NAME, using = "lastName")
	public WebElement patientsearch_lastname_txt;

	// Search, Reset button using above linktexts
	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyThreeFourth']/table/tbody/tr[1]/td[2]/a")
	public WebElement patient_select_link;

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

	@FindBy(how = How.NAME, using = "sig")
	public WebElement sig_txt;

	@FindBy(how = How.LINK_TEXT, using = "Payer/PBM Specified Alternatives")
	public WebElement pbmAlternatives_btn;

	@FindBy(how = How.LINK_TEXT, using = "Therapeutical Alternatives")
	public WebElement therapeuticalAlternatives_btn;

	@FindBy(how = How.LINK_TEXT, using = "Search Pharmacy")
	public WebElement searchPharmacy_btn;

	// Back, searchpharmacy, reset buttons in search pharmacy can be used above
	// linktext
	@FindBy(how = How.LINK_TEXT, using = "Next Prescription >>")
	public WebElement nextPrescription_btn;

	@FindBy(how = How.LINK_TEXT, using = "<< Previous Prescription")
	public WebElement previousPrescription_btn;

	// Confirmprescription, reset can be used above linktext
	@FindBy(how = How.NAME, using = "drugName")
	public WebElement drugName_txt;

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
	public WebElement selectradio_btn;

	@FindBy(how = How.LINK_TEXT, using = "Add to Medication History *")
	public WebElement add2medicationHistory_btn;

	@FindBy(how = How.LINK_TEXT, using = "Close")
	public WebElement Close_lnk;

	@FindBy(how = How.NAME, using = "selectedRx")
	public WebElement confirmscreen_prescriptionselect_name_txt;

	@FindBy(how = How.LINK_TEXT, using = "View Rx")
	public WebElement viewRx_lnk;

	// remove use as above
	@FindBy(how = How.LINK_TEXT, using = "Send to Pharmacy")
	public WebElement sendToPharmacy_lnkTxt;

	@FindBy(how = How.LINK_TEXT, using = "Send And Print")
	public WebElement sendAndPrint_lnkTxt;

	@FindBy(how = How.LINK_TEXT, using = "Print")
	public WebElement Print_lnkTxt;

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

	// Free Text Medication

	@FindBy(how = How.LINK_TEXT, using = "Free Text Medication")
	public WebElement freetextmedication_tab;

	@FindBy(how = How.NAME, using = "drugInformation")
	public WebElement rxotc_dropdown;

	@FindBy(how = How.NAME, using = "qtyQualifier")
	public WebElement qualifier_dropdown;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyOneFourth']/table/tbody/tr/td/span")
	public WebElement addmedicationpopup;

	public String addmedication_sucess_msg() {
		String txnsucessmsg = popup_success.getText();
		return txnsucessmsg;
	}

	// Allergies
	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[3]/a/b")
	public WebElement Allergies_tab;

	@FindBy(how = How.LINK_TEXT, using = "Add New Allergy")
	public WebElement addAllergy_btn;

	@FindBy(how = How.NAME, using = "noKnownAllergy")
	public WebElement noknownAllergy_ckbox;
	
	@FindBy(how = How.XPATH, using = "//*[@id='formTabsNoProfile']/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td")
	public WebElement noknownAllergy_txt;
	
	public String noAllergyText(){
		String validation=noknownAllergy_txt.getText();
		return validation;
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Add")
	public WebElement add_btn;

	// Saved Prescriptions Patient
	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[4]/a/b")
	public WebElement savedPrescriptionsPatient_tab;

	@FindBy(how = How.LINK_TEXT, using = "Details")
	public WebElement Details_lnk;

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

	// Medication History

	@FindBy(how = How.XPATH, using = "//*[@id='tabsPatientProfile']/ul/li[6]/a/b")
	public WebElement medicationHistory_tab;

	@FindBy(how = How.LINK_TEXT, using = "Update Drug")
	public WebElement updateDrug_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr[1]/td[1]/input")
	public WebElement medicationHistory_selectRecord_rbtn;

	@FindBy(how = How.XPATH, using = "//*[@id='scrollableTBodyFull']/table/tbody/tr[1]/td[2]")
	public WebElement Firstdrug;

	@FindBy(how = How.ID, using = "tooltipTD")
	public WebElement medicationHistoryStatus;

	@FindBy(how = How.ID, using = "html/body/div[2]/form/div[3]/div[3]/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[1]/td[8]/span/a")
	public WebElement medicationhistory_physician_lnk;

	@FindBy(how = How.ID, using = "html/body/div[2]/form/div[3]/div[3]/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[1]/td[10]/a/img")
	public WebElement reprint_icon;

	@FindBy(how = How.LINK_TEXT, using = "Inactivate drugs")
	public WebElement mh_inactivatedrug;

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

	@FindBy(how = How.LINK_TEXT, using = "Confirm Reprint/Refax")
	public WebElement mh_reprintrefax;

	@FindBy(how = How.LINK_TEXT, using = "Inactive Medication(s)")
	public WebElement mh_inactivemedications;

	@FindBy(how = How.LINK_TEXT, using = "Send CancelRx")
	public WebElement mh_cc_sendcancelrx;

	@FindBy(how = How.LINK_TEXT, using = "Reprint/Refax")
	public WebElement mh_rprf_reprintrefax;

	// Practice Favorite Drugs
	@FindBy(how = How.LINK_TEXT, using = "PracticeFavoriteDrugs")
	public WebElement practice_favdrug_link;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table[1]/tbody/tr/td/span[1]")
	public WebElement practice_favdrug_text;

	public String practice_favdrugtext() {
		String favoritedrugtext = practice_favdrug_text.getText();
		return favoritedrugtext;
	}

	@FindBy(how = How.LINK_TEXT, using = "Confirm Favorite Drug(s)")
	public WebElement confirm_favorite_drug_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table[1]/tbody/tr[1]/td/li")
	public WebElement confirm_fav_vadation;

	public String practice_favdrudconfirmvalidation() {
		String confirmvalidation = confirm_fav_vadation.getText();
		return confirmvalidation;
	}

	// Default Physician
	@FindBy(how = How.LINK_TEXT, using = "Default Physician")
	public WebElement dafaultphysician_link;

	@FindBy(how = How.XPATH, using = "//*[@id='formPatientProfileTabs']/table/tbody/tr[4]/td/b")
	public WebElement default_physician_validation_txt;

	public String defaultPhysicianValidationtxt() {
		String defaultphysicianvalidation = default_physician_validation_txt.getText();
		return defaultphysicianvalidation;

	}

	// Prescription Report

	@FindBy(how = How.LINK_TEXT, using = "Prescription Report")
	public WebElement prescription_report_link;

	// "Personal Information"

	@FindBy(how = How.LINK_TEXT, using = "Patient Profile")
	public WebElement patient_profile_link;

	@FindBy(how = How.LINK_TEXT, using = "Personal Information")
	public WebElement personla_information_link;

	@FindBy(how = How.XPATH, using = "//*[@id='formTabsNoProfile']/table/tbody/tr[1]/td")
	public WebElement personal_information_validation_txt;

	public String personalinformationvalidationtxt() {
		String updatevalidationtxt = personal_information_validation_txt.getText();
		return updatevalidationtxt;
	}

	// Allergy Information
	@FindBy(how = How.LINK_TEXT, using = "Allergy Information")
	public WebElement allergy_information_link;

	@FindBy(how = How.LINK_TEXT, using = "Add New Allergy")
	public WebElement addnew_allergy_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='formTabsNoProfile']/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/li[1]")
	public WebElement allergy_information_validation_txt;

	public String allergyinformationvalidationtxt() {
		String allergyalidationtxt = allergy_information_validation_txt.getText();
		return allergyalidationtxt;
	}

	// Insurance Information
	@FindBy(how = How.LINK_TEXT, using = "Insurance Information")
	public WebElement insurance_information_link;

	@FindBy(how = How.LINK_TEXT, using = "View Details")
	public WebElement viewdetails_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='formTabsNoProfile']/table/tbody/tr[1]/td/li")
	public WebElement insurance_information_validation_txt;

	public String insuranceinformationvalidationtxt() {
		String insurancevlidationtxt = insurance_information_validation_txt.getText();
		return insurancevlidationtxt;
	}

	// Pharmacy Information

	@FindBy(how = How.LINK_TEXT, using = "Pharmacy Information")
	public WebElement pharmacy_information_link;

	@FindBy(how = How.LINK_TEXT, using = "Add New Pharmacy")
	public WebElement add_nepharmacy_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='criteriaTabsNoProfile']/table/tbody/tr[1]/td/li")
	public WebElement pharmacy_information_validation_txt;

	public String pharmacyinformationvalidationtxt() {
		String pharmacyvlidationtxt = pharmacy_information_validation_txt.getText();
		return pharmacyvlidationtxt;
	}

	// Patient Band

	@FindBy(how = How.XPATH, using = "//*[@id='patientProfile']/table[1]/tbody/tr/td/div/table/tbody/tr[1]/td[2]/a")
	public WebElement patient_name;

	@FindBy(how = How.XPATH, using = "//*[@id='divDetails']")
	public WebElement patientdetails_table;

	@FindBy(how = How.XPATH, using = "//*[@id='divDetails']/table[2]/tbody/tr[2]/td[2]")
	public WebElement patienttable_name;

	public String patientNameinTable() {
		String patientname = patienttable_name.getText();
		return patientname;
	}

	// Doctor Band

	@FindBy(how = How.XPATH, using = "//*[@id='blueLinks']/a/span")
	public WebElement doctor_name;

	@FindBy(how = How.XPATH, using = "//*[@id='divDetailsPrescriber']")
	public WebElement doctordetails_table;

	@FindBy(how = How.XPATH, using = "//*[@id='divDetailsPrescriber']/table[2]/tbody/tr[2]/td[2]")
	public WebElement doctortable_name;

	public String doctorNameinTable() {
		String doctorname = doctortable_name.getText();
		return doctorname;
	}

	// MyProfile Change Password

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li[1]")
	public WebElement changepassword_validation;

	public String changePasswordTxt() {
		String validationtxt = changepassword_validation.getText();
		return validationtxt;
	}

	// Staff Authorization

	@FindBy(how = How.LINK_TEXT, using = "Staff Authorization")
	public WebElement staffauthorization_link;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table[2]/tbody/tr[5]/td/table/tbody/tr[2]/td[8]")
	public WebElement staffauthorization_validation;

	public String staffAuthorizationvalidationTxt() {
		String validationtxt = staffauthorization_validation.getText();
		return validationtxt;
	}

	// Clinic Information
	@FindBy(how = How.LINK_TEXT, using = "Clinic Information")
	public WebElement clinicinformation_link;

	@FindBy(how = How.LINK_TEXT, using = "Update Clinic")
	public WebElement updateclinic_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[1]/td[2]/li")
	public WebElement clinicinformation_validation;

	public String clinicInformationValidationTxt() {
		String validationtxt = clinicinformation_validation.getText();
		return validationtxt;
	}

	// Personal Profile

	@FindBy(how = How.LINK_TEXT, using = "Personal Profile")
	public WebElement personalprofile_link;

	@FindBy(how = How.XPATH, using = "//*[@id='formNoSearch']/table/tbody/tr[2]/td")
	public WebElement personalpeofile_validation;

	public String personalProfileValidationTxt() {
		String validationtxt = personalpeofile_validation.getText();
		return validationtxt;
	}

	// Doctor Favorite Drugs

	@FindBy(how = How.LINK_TEXT, using = "Favorite Drugs")
	public WebElement doctorfavoritedrug_link;

	@FindBy(how = How.XPATH, using = "//*[@id='criteriaSearch']/table/tbody/tr[1]/td/li")
	public WebElement doctorfavoritedrug_validation;

	public String doctorFavoritedrugValidationTxt() {
		String validationtxt = doctorfavoritedrug_validation.getText();
		return validationtxt;
	}
		// Set Drug Interaction Level
	@FindBy(how = How.LINK_TEXT, using = "Set Drug Interaction Level")
	public WebElement setdrugiteractionlevel_link;

	// *input[contains(@name,'Email')]
//admin
	@FindBy(how = How.XPATH, using = "//*[@id='contentsSearch']/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]")
	public WebElement vendor;

}


