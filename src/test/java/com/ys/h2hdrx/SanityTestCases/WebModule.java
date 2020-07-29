package com.ys.h2hdrx.SanityTestCases;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ys.h2hdrx.adminmodule.AdminLogin;
import com.ys.h2hdrx.webmodule.CaptureScreenshot;
import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.Scroll;
import com.ys.h2hdrx.webmodule.WebLocators;
import com.ys.h2hdrx.webmodule.WebdriverWait;
import com.ys.h2hdrx.webmodule.WriteExcel;
import org.openqa.selenium.Alert;

public class WebModule {
	WebDriver driver;
	WebLocators obj;
	String user;
	String pass;
	public static FileInputStream fi;
	static XSSFWorkbook wb;
	static XSSFSheet s;

	@Test(priority = 1)
	private void weblogin() throws Exception {
		obj = PageFactory.initElements(driver, WebLocators.class);
		fi = new FileInputStream("Input Test Data/LoginUsers.xlsx");
		wb = new XSSFWorkbook(fi);
		s = wb.getSheetAt(1);
		int rowsize = s.getLastRowNum();
		for (int i = 1; i <= rowsize; i++) {
			Row row = s.getRow(i);
			/*
			 * int cellsize = row.getLastCellNum(); for (int j = 0; j <
			 * cellsize-1; j++) {
			 */
			user = row.getCell(0).getStringCellValue();
			pass = row.getCell(1).getStringCellValue();
			System.out.println("user name is: " + user);
			System.out.println("Password name is: " + pass);
			// String doc_name = row.getCell(j+2).getStringCellValue();
			obj.userid_txt.sendKeys(user);
			obj.password_txt.sendKeys(pass);
			obj.userlogin_btn.click();
			System.out.println("page title is: " + obj.pageTitle_txt());
			if (obj.pageTitle_txt().contains("Digital Rx | EUA")) {
				obj.agree_cbox.click();
				obj.agree_btn.click();
				if (obj.pageTitle_txt().contains("Digital Rx | Rx Pad")) {
					System.out.println("User login sucess after agreement page");
				} else {
					System.out.println("User login failed after agreement page");
				}
			} else if (obj.pageTitle_txt().contains("Digital Rx | Login")) {
				if (obj.pswdchange_txt().contains("Password has expired. Please change the password:")) {
					String newpassword = pass + "new";
					obj.pswdchange_popup_cancel_btn.click();
					obj.userid_txt.sendKeys(user);
					obj.resetlogin_btn.click();
					obj.userid_txt.sendKeys(user);
					obj.password_txt.sendKeys(pass);
					obj.userlogin_btn.click();
					obj.pswdchange_popup_oldpswrd_txt.sendKeys(pass);
					obj.pswdchange_popup_reset_btn.click();
					obj.pswdchange_popup_oldpswrd_txt.sendKeys(pass);
					obj.pswdchange_popup_newpswrd_txt.sendKeys(newpassword);
					obj.pswdchange_popup_confirmnewpswrd_txt.sendKeys(newpassword);
					obj.pswdchange_popup_submit_btn.click();
					System.out.println("Password changed to user: " + user);

					// obj.userid_txt.sendKeys(user);
					// obj.resetlogin_btn.click();
					// obj.userid_txt.sendKeys(user);
					// obj.password_txt.sendKeys(password);
					// obj.userlogin_btn.click();

					if (obj.pageTitle_txt().contains("Digital Rx | Rx Pad")) {
						obj.myprofile_lnk.click();
						try {
							obj.myprofile_ChangePassword.click();
							System.out.println("change password exist");
							obj.myprofile_ChangePassword_oldpass.sendKeys(newpassword);
							obj.reset_LinkText.click();
							obj.myprofile_ChangePassword_oldpass.sendKeys(newpassword);
							obj.myprofile_ChangePassword_newpass.sendKeys(pass);
							obj.myprofile_ChangePassword_confirmpass.sendKeys(pass);
							obj.update_LinkText.click();
							System.out.println("changed the password in my profile to: " + pass);
						} catch (Exception e) {
							System.out.println("changepassword is not there");
							AdminLogin admin = new AdminLogin();
							admin.beforeTest();
							admin.loginAdmin();
							admin.editUser(user);
							admin.changePassword(pass);
							System.out.println("Password change in admin module :" + pass);

							// if (obj.pageTitle_txt().contains("Digital Rx | Rx
							// Pad")) {
							// driver.switchTo().window("childwindow");
							// }

						}

					} else {
						System.out.println("User login failed after change password");
					}
				}

				System.out.println("login success for user: " + user + " :for the loop count of: " + i);
			}
			//WebdriverWait.explicitwait((obj.web_logoff));

			patientSearch();
			rxPad();
			savedPrescriptions();
			patientRegistration();
			
			freeTextPad();
			ssMedicationHistory();
			allergies();
			savedPrescriptionsPatient();
			favDrugPatient();
			medicationHistory();
			practiceFavDrugs();
			defaultPhysician();
			prescriptionReport();
			personalInformation();
			allergyInformation();
			insuranceInformation();
			pharmacyInformation();
			patientBand();
			doctorBand();
			changePassword();
			staffAuthorization();
			clinicInformation();
			personalProfile();
			favDrugsDoctor();
			setDrugInteractions();

			obj.web_logoff.click();
		}
	}

	@Test(priority=2)
	public void patientSearch() throws Exception {
		try {
			obj.patientSearch_LinkText.click();
			obj.patientsearch_lastname_txt.sendKeys("a");
			obj.reset_LinkText.click();
			obj.patientsearch_lastname_txt.sendKeys("a");
			obj.Search_LinkText.click();
			obj.patient_select_link.click();
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Patient Search");
		}
		tryPassScreenshot("PatientSearch");
	}

	@Test(priority=17)
	public void savedPrescriptions() throws Exception {
		// Saved Prescriptions left navigation link
		try {
			obj.savedPrescriptions_LinkText.click();
			obj.confirmPrescription_LinkText.click();
			obj.reset_LinkText.click();
			obj.Remove_LinkText.click();
			obj.back_LinkText.click();
			tryPassScreenshot("savedPrescriptionsLeftNavigation");
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("savedPrescriptionsLeftNavigation");
		}
	}

	@Test(enabled = false)
	public void patientRegistration() throws Exception {
		// Patient Registration
		try {
			obj.patientReg_link.click();
			WebdriverWait.explicitwait((obj.register_LinkText));
			obj.register_LinkText.click();
			obj.reset_LinkText.click();

		} catch (Exception e) {
			if (e.getMessage().contains("no such element: Unable to locate element:")) {
				return;
			} else {
				e.printStackTrace();
				catchMethod("PatientRegistration");
			}
		}
		tryPassScreenshot("PatientRegistration");
		patientSearch();
	}

	@Test(priority=3)
	public void rxPad() throws Exception {
		try {// remove,viewrx,back,add to medication history,
			obj.drugName_txt.sendKeys("lipitor");
			obj.drugSearch_LinkText.click();
			obj.back_LinkText.click();
			obj.confirmPrescription_LinkText.click();
			obj.drugName_txt.sendKeys("lipitor");
			obj.drugSearch_LinkText.click();
			obj.drugSearch_Selecting_link.click();
			obj.rxpad_quantity_txt.sendKeys("2");
			obj.searchPharmacy_btn.click();
			Thread.sleep(2000);
			new Select(obj.drugSearch_state_txt).selectByVisibleText("California");
			obj.pharmacy_name_txt.sendKeys("ca");
			Scroll.scrollDown(250);
			obj.searchPharmacy_btn.click();
			obj.capharmacy_lnk.click();
			obj.nextPrescription_btn.click();
			obj.drugName_txt.sendKeys("zestril");
			obj.drugSearch_LinkText.click();
			obj.drugSearch_Selecting_link.click();
			obj.rxpad_quantity_txt.sendKeys("2");
			obj.confirmPrescription_LinkText.click();
			obj.back_LinkText.click();
			obj.confirmPrescription_LinkText.click();
			obj.Edit2_btn.click();
			obj.previousPrescription_btn.click();
			obj.confirmPrescription_LinkText.click();
			obj.selectradio_btn.click();
			obj.add2medicationHistory_btn.click();
			obj.Close_lnk.click();
			obj.confirmscreen_prescriptionselect_name_txt.click();
			obj.viewRx_lnk.click();
			Thread.sleep(2000);
			obj.Close_lnk.click();
			obj.Remove_LinkText.click();
			tryPassScreenshot("RxPad");
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("RxPad");
		}
		try {
			obj.drugName_txt.sendKeys("menest");
			obj.drugSearch_LinkText.click();
			obj.drugSearch_Selecting_link.click();
			obj.rxpad_quantity_txt.sendKeys("2");
			obj.confirmPrescription_LinkText.click();
			obj.sendToPharmacy_lnkTxt.click();
			if (obj.trxn_sucess_msg()
					.contains("(TRANSACTION SUCCESSFUL ; ACCEPTED AND VERIFIED BY ULTIMATE RECEIVER)")) {
				tryPassScreenshot("SendToPharmacy");
				obj.Close_lnk.click();
				obj.medicationHistory_tab.click();
				if ((obj.Firstdrug_txt().contains("menest")) && (obj.MedicationHistoryStatus_txt().equals("E*S"))) {
					tryPassScreenshot("SendToPharmacy in medication sowing as E*S");
				} else {
					WriteExcel.writepassfail("SendToPharmacy drug not stored in medication history",
							"Output Data/SanitytestResult.xlsx", "Fail");
					CaptureScreenshot.Capture("SendToPharmacy drug not stored in medication history", "sanityTesting");
				}
				obj.RxPad_tab.click();
			} else {
				WriteExcel.writepassfail("SendToPharmacy", "Output Data/SanitytestResult.xlsx", "Fail");
				CaptureScreenshot.Capture("SendToPharmacy", "sanityTesting");
				obj.back_LinkText.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("SendToPharmacy");
		}
		
	}

	@Test(priority=16)
	public void freeTextPad() throws Exception {
		try {// remove,viewrx,back,add to medication history,
			obj.freetextmedication_tab.click();
			obj.confirmPrescription_LinkText.click();
		}
			 catch (Exception e) {
			e.printStackTrace();
			catchMethod("Free text medication");
		}
		tryPassScreenshot("FreeTextPad");
	}

	@Test(priority=4)
	public void ssMedicationHistory() throws Exception {
		try {
			obj.patientSearch_LinkText.click();
			obj.patientsearch_lastname_txt.sendKeys("sch");
			obj.Search_LinkText.click();
			driver.findElement(By.linkText("DOROTHY SCHNUR")).click();
			obj.SSMedicationHistory_tab.click();
			new Select(obj.SSMH_Consent).selectByVisibleText("Yes");
			obj.SSMH_gethistory_btn.click();
			tryPassScreenshot("SSPBM");
			if (obj.pbmdrug().equals("NOVOLOG FLEXPEN SYRINGE")) {
				tryPassScreenshot("SS Medication History PBM showing Records");
			} else {
				WriteExcel.writepassfail("SS Medication History PBM not showing Records",
						"Output Data/SanitytestResult.xlsx", "Fail");
				CaptureScreenshot.Capture("SS Medication History PBM not showing Records", "sanityTesting");
			}
			obj.SSMH_BacktoMH.click();
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("SSMedicationHistoryPBM");
		}
		try {

			obj.patientSearch_LinkText.click();
			obj.patientsearch_lastname_txt.sendKeys("white");
			obj.Search_LinkText.click();
			driver.findElement(By.linkText("KARA WHITESIDE")).click();
			obj.SSMedicationHistory_tab.click();
			obj.SSMH_Fills_rbtn.click();
			new Select(obj.SSMH_Consent).selectByVisibleText("Yes");
			obj.SSMH_gethistory_btn.click();
			if (obj.fillsdrug().equals("WARFARIN 10 MG TABLET")) {
				tryPassScreenshot("SS Medication History fills showing Records");
				obj.SSMH_BacktoMH.click();
			} else {
				WriteExcel.writepassfail("SS Medication History Fills not showing Records",
						"Output Data/SanitytestResult.xlsx", "Fail");
				CaptureScreenshot.Capture("SS Medication History Fills not showing Records", "sanityTesting");
			}
			tryPassScreenshot("SSFills");
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("SSMedicationHistoryPBM");
		}
	}

	@Test(priority=5)
	public void allergies() throws Exception {
		try {
			obj.Allergies_tab.click();
			obj.addAllergy_btn.click();
			if (obj.noknownAllergy_txt.getText().contains("No Known Allergy")) {
				obj.noknownAllergy_ckbox.click();
			}
			obj.add_btn.click();
			WebdriverWait.implicitwait(10);	
			if(obj.back_LinkText.isDisplayed()){
				obj.back_LinkText.click();
			}		
			tryPassScreenshot("Allergies");
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Allergies");
		}
	}

	@Test(priority=6)
	public void savedPrescriptionsPatient() throws Exception {
		try {
			obj.savedPrescriptionsPatient_tab.click();
			obj.Firstdrug.click();
			obj.confirmPrescription_LinkText.click();
			obj.savedPrescriptionsPatient_tab.click();
			obj.Details_lnk.click();
			WebdriverWait.implicitwait(10);
			obj.Close_lnk.click();
			obj.savedprescription_pharmacy_lnk.click();
			obj.Close_lnk.click();
			obj.back_LinkText.click();
			obj.confirmPrescription_LinkText.click();
			obj.savedPrescriptionsPatient_tab.click();
			obj.add_btn.click();
			obj.confirmPrescription_LinkText.click();
			obj.savedPrescriptionsPatient_tab.click();
			obj.confirmPrescription_LinkText.click();
			obj.reset_LinkText.click();
			obj.Remove_LinkText.click();
			tryPassScreenshot("SavedPrescriptionsPatient");
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("SavedPrescriptionsPatient");
		}

	}

	@Test(priority=7)
	public void favDrugPatient() throws Exception {
		try {
			obj.favDrugPatient_tab.click();
			obj.Firstdrug.click();
			obj.confirmPrescription_LinkText.click();
			obj.favDrugPatient_tab.click();
			obj.Details_lnk.click();
			obj.Close_lnk.click();
			Thread.sleep(2000);
			obj.fav_drugName_txt.sendKeys("lipitor");
			obj.Search_LinkText.click();
			obj.favdrug_all.click();
			obj.confirmPrescription_LinkText.click();
			obj.back_LinkText.click();
			obj.favDrugPatient_tab.click();
			obj.delete_lnktxt.click();
			obj.Search_LinkText.click();
			tryPassScreenshot("FavDrugPatient");
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("FavDrugPatient");
		}
	}

	@Test(priority=8)
	public void medicationHistory() throws Exception {
		try {
			obj.medicationHistory_tab.click();
			obj.Firstdrug.click();
			WebdriverWait.pageLoadWait(10);
			obj.medicationHistory_tab.click();
			WebdriverWait.implicitwait(10);
			obj.Details_lnk.click();
			obj.Close_lnk.click();
			WebdriverWait.implicitwait(10);
			obj.medicationhistory_physician_lnk.click();
			obj.Close_lnk.click();
			obj.reprint_icon.click();
			obj.back_LinkText.click();
			obj.medicationHistory_selectRecord_rbtn.click();
			obj.confirmPrescription_LinkText.click();
			obj.back_LinkText.click();
			obj.confirmPrescription_LinkText.click();
			obj.medicationHistory_tab.click();
			obj.medicationHistory_selectRecord_rbtn.click();
			obj.mh_inactivatedrug.click();
			obj.submit_lnktxt.click();
			driver.switchTo().alert().accept();
			obj.mh_back_btn.click();
			obj.mh_activemedications.click();
			obj.mh_completehistory.click();
			obj.mh_inactivemedications.click();
			obj.medicationHistory_selectRecord_rbtn.click();
			obj.mh_confirmcancellation.click();
			obj.Remove_LinkText.click();
			obj.mh_cc_sendcancelrx.click();
			obj.back_LinkText.click();
			obj.medicationHistory_selectRecord_rbtn.click();
			obj.updateDrug_btn.click();
			obj.update_LinkText.click();
			obj.reset_LinkText.click();
			obj.back_LinkText.click();
			obj.medicationHistory_selectRecord_rbtn.click();
			obj.mh_reprintrefax.click();
			obj.mh_rprf_reprintrefax.click();
			obj.back_LinkText.click();
			tryPassScreenshot("MedicationHistory");
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("MedicationHistory");
		}
		tryPassScreenshot("MedicationHistory");
	}

	@Test(priority=9)
	public void practiceFavDrugs() throws Exception {

		try {
			obj.practice_favdrug_link.click();
			if (obj.practice_favdrugtext().contains("Practice Favorite Drugs:")) {
				tryPassScreenshot("PracticeFavDrugs Text");
			}
			obj.confirm_favorite_drug_btn.click();
			if (obj.practice_favdrudconfirmvalidation().contains("Please select the prescriptions to confirm.")) {
				tryPassScreenshot("Confirm prescription validation showing");
			}
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("MedicationHistory");
		}
		tryPassScreenshot("PracticeFavDrugs");
	}

	@Test(priority=10)
	public void defaultPhysician() throws Exception {
		try {
			obj.dafaultphysician_link.click();
			if (obj.defaultPhysicianValidationtxt().contains("select the default physician for the Patient.")) {
				tryPassScreenshot("default physician validation message");
			}
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Default Physician");
		}
		tryPassScreenshot("Default Physician");

	}

	@Test(priority=11)
	public void prescriptionReport() throws Exception {
		try {
			obj.prescription_report_link.click();
			/*
			 * String title = driver.getTitle(); System.out.println(
			 * "title is : " + title); for (String childwindow :
			 * driver.getWindowHandles()) { System.out.println(
			 * "childwindow name : " + childwindow); if
			 * (title.equalsIgnoreCase("Error"))
			 * driver.switchTo().window(childwindow); }
			 */

			Object[] allwindows = driver.getWindowHandles().toArray();
			for (int i = 1; i <= allwindows.length; i++) {
				if (i == allwindows.length - 1) {
					driver.switchTo().window(allwindows[1].toString());
					System.out.println("titile is : " + driver.getTitle());
					driver.close();

				}
				driver.switchTo().window(allwindows[0].toString());

			}
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("PrescriptionReport");
		}
		tryPassScreenshot("PrescriptionReport");
	}

	@Test(priority=12)
	public void personalInformation() throws Exception {
		try {
			obj.patient_profile_link.click();
			obj.personla_information_link.click();
			obj.update_LinkText.click();
			if (obj.personalinformationvalidationtxt().contains("Your profile has been modified.")) {
				tryPassScreenshot("personalinformation update validation");
			}
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Personal Information");
		}
		tryPassScreenshot("Personal Information");

	}

	@Test(priority=13)
	public void allergyInformation() throws Exception {
		try {
			obj.patient_profile_link.click();
			obj.allergy_information_link.click();
			obj.addnew_allergy_btn.click();
			obj.add_btn.click();
			if (obj.allergyinformationvalidationtxt().contains("Drug Name is required.")) {
				tryPassScreenshot("allergy information validation text");
			}
			obj.back_LinkText.click();
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Allergy Information");
		}
		tryPassScreenshot("AllergyInformation");
	}

	@Test(priority=14)
	public void insuranceInformation() throws Exception {
		try {
			obj.patient_profile_link.click();
			obj.insurance_information_link.click();
			obj.viewdetails_btn.click();
			if (obj.insuranceinformationvalidationtxt().contains("Please select an Insurance.")) {
				tryPassScreenshot("insurance information validation text");
			}
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Insurance Information");
		}
		tryPassScreenshot("Insurance Information");
	}

	@Test(priority=15)
	public void pharmacyInformation() throws Exception {
		try {
			obj.patient_profile_link.click();
			obj.pharmacy_information_link.click();
			obj.add_nepharmacy_btn.click();
			obj.Search_LinkText.click();
			if (obj.pharmacyinformationvalidationtxt().contains("State is required.")) {
				tryPassScreenshot("pharmacy Information");
			}
			obj.back_LinkText.click();
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Pharmacy Information");
		}
		tryPassScreenshot("Pharmacy Information");
	}

	@Test(priority=18)
	public void patientBand() throws Exception {
		try {
			System.out.println(obj.patient_name.getText());
			obj.patient_name.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if (obj.patientNameinTable().contains(obj.patient_name.getText())) {
				tryPassScreenshot("Patient name verification in popup");
			}
			obj.Close_lnk.click();
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Patient Band");
		}
		tryPassScreenshot("PatientBand");
	}

	@Test(priority=19)
	public void doctorBand() throws Exception {
		try {
			System.out.println(obj.doctor_name.getText());
			obj.doctor_name.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if (obj.doctorNameinTable().contains(obj.doctor_name.getText())) {
				tryPassScreenshot("Doctor name verification in popup");
			}
			obj.Close_lnk.click();
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Doctor Band");
		}
		tryPassScreenshot("DoctorBand");
	}

	@Test(priority=20)
	public void changePassword() throws Exception {
		try {
			obj.myprofile_lnk.click();
			obj.myprofile_ChangePassword.click();
			obj.update_LinkText.click();
			if (obj.changePasswordTxt().contains("Old Password is required.")) {
				tryPassScreenshot("Change password validation");
			}

		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Change Password");
		}
		tryPassScreenshot("Change Password");
	}

	@Test(priority=21)
	public void staffAuthorization() throws Exception {
		try {
			obj.myprofile_lnk.click();
			obj.staffauthorization_link.click();
			if (obj.staffAuthorizationvalidationTxt().contains("Edit Patient Medication History")) {
				tryPassScreenshot("Staff Authorization validation text");
			}

		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Staff Authorization");
		}
		tryPassScreenshot("Staff Authorization");
	}

	@Test(priority=22)
	public void clinicInformation() throws Exception {
		try {
			obj.myprofile_lnk.click();
			obj.clinicinformation_link.click();
			obj.updateclinic_btn.click();
			if (obj.clinicInformationValidationTxt().contains("Please select a Clinic.")) {
				tryPassScreenshot("Clinic inforamtion validation message");
			}

		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("clinic Information");
		}
		tryPassScreenshot("Clinic Information");
	}

	@Test(priority=23)
	public void personalProfile() throws Exception {
		try {
			obj.myprofile_lnk.click();
			obj.personalprofile_link.click();
			if (obj.personalProfileValidationTxt().contains("Personal Information:")) {
				tryPassScreenshot("Personal Profile valdiation message");
			}

		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Personal Profile");
		}
		tryPassScreenshot("Personal Profile");
	}

	@Test(priority=24)
	public void favDrugsDoctor() throws Exception {
		try {
			obj.myprofile_lnk.click();
			obj.doctorfavoritedrug_link.click();
			obj.add_btn.click();
			obj.drugSearch_LinkText.click();
			if (obj.doctorFavoritedrugValidationTxt().contains("First three letters of Drug name are required")) {
				tryPassScreenshot("Doctor Favorite Drug validation");
			}
		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("fav Drugs Doctor");
		}

		tryPassScreenshot("FavDrugs Doctor");
	}

	@Test(priority=25)
	public void setDrugInteractions() throws Exception {
		try {
			obj.myprofile_lnk.click();
			obj.setdrugiteractionlevel_link.click();
			obj.save_lnkText.click();

		} catch (Exception e) {
			e.printStackTrace();
			catchMethod("Set Drug Interactions");
		}
		tryPassScreenshot("SetDrug Interactions");
	}

	@Test(enabled = false)
	private void catchMethod(String modulename) throws Exception {
		WriteExcel.writepassfail(modulename, "Output Data/SanitytestResult.xlsx", "Fail");
		CaptureScreenshot.Capture(modulename, "sanityTesting");
		driver.close();
		driver = Driver.browser("web");
		// driver.get(url);
		Thread.sleep(3000);
		obj = PageFactory.initElements(driver, WebLocators.class);
		obj.userid_txt.sendKeys(user);
		obj.password_txt.sendKeys(pass);

		obj.userlogin_btn.click();
		patientSearch();
	}

	@Test(enabled = false)
	private void tryPassScreenshot(String modulename) throws Exception {
		WriteExcel.writepassfail(modulename, "Output Data/SanitytestResult.xlsx", "Pass");
		CaptureScreenshot.Capture(modulename, "sanityTesting");
	}

	@BeforeTest
	public void browser() {
		driver = Driver.browser("web");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
