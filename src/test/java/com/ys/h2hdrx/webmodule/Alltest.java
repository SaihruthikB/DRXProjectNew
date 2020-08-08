package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Alltest {
	WebDriver driver;
	/*@BeforeMethod
	public void reports(){
ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
    
    // create ExtentReports and attach reporter(s)
    com.aventstack.extentreports.ExtentReports extent = new com.aventstack.extentreports.ExtentReports();
    extent.attachReporter(htmlReporter);

    // creates a toggle for the given test, adds all log events under it    
    com.aventstack.extentreports.ExtentTest test = extent.createTest("uselogin,Patientsearch", "pass");

    // log(Status, details)
    test.log(Status.INFO, "This step shows usage of log(status, details)");

    // info(details)
    test.info("This step shows usage of info(details)");
     extent.flush();
	}*/
	
	 
	
  @Test(priority=1)
  public void uselogin() throws Exception {
	  
	  System.out.println("user enter into user login screen");
	MyScreenRecorder.startRecording("UserLogin");
	  UserLogin us = new UserLogin();
	 
      // System.out.println("getDriver"+Driver.getDriver());
      us.driver = driver;
      us.doctorLogin("MIDANAR001", "Pass@123");
      
     
	  
  }
  @Test(priority=2)
  public void Patientsearch() throws Exception {
	  System.out.println("user enter into patient search screen");
	  PatientSearch ps = new PatientSearch();
      ps.driver = driver;
      ps.patientSearch();
  }
 @Test(priority=3)
	  public void Rxpad() throws Exception {
	  System.out.println("user enter into rxpad screen");
		      Rxpad rx = new Rxpad();
		      rx.driver=driver;
			  rx.Confirmprescription();
			  rx.sendtopharmacy();
	  }
 @Test(priority=4)
  public void ssmedication() throws Exception {
	  System.out.println("user enter into ss medication screen");
	  SSMedicationhistory ss = new SSMedicationhistory();
	  ss.driver =driver;
	 	 ss.pbm();
	 	 ss.fills();
  }
  @Test(priority=5)
  public void allergies() throws Exception {
	  System.out.println("user enter into allergies screen");
	Allergies al = new Allergies();
	 al.driver =driver;
	 al.allergies_add();
	 al.allergies_addreaction();
	 //al.allergies_delete();
	 al.allergies_inactive();
	 al.allergies_edit();
	 
	 
  }
  @Test(priority=6)
  public void PatientSavedPrescription() throws Exception {
	  System.out.println("user enter into patient savedprescription screen");
	  PatientSavedPrescription ps = new PatientSavedPrescription();
		 ps.driver=driver;			
		 ps.save();
		 ps.savedprescription();
  }
	
	 
	
	
	
	  
  
  @Test(priority=7)
  public void PatientFavouriteDrug() throws Exception {
	  System.out.println("user enter into patient favouritedrug screen");
	  PatientFavouriteDrug pf = new PatientFavouriteDrug();
		 pf.driver=driver;
		 pf.FavouriteDrug();
  }
  @Test(priority=8)
  public void SendandPrint() throws Exception {
	  System.out.println("user enter into sendandprint screen");
	  SendandPrint sp = new SendandPrint();
		 sp.driver = driver;
		 sp.Sendandprintbutton();
  }
  @Test(priority=9)
  public void Print() throws Exception {
	  System.out.println("user enter into print screen");
	  Print p = new Print();
		 p.driver = driver;
		 p.Printbutton();
  }
  @Test(priority=10)
  public void Addtomedication() throws Exception {
	  System.out.println("user enter into add to medication history screen");
	  AddToMedication am = new AddToMedication();
		 am.driver = driver;
		 am.Addtomedicationhistory();
  }
@Test(priority=11)
  public void Defaultphysician() throws Exception {
	  DefaultPhysician sp = new DefaultPhysician();
		 sp.driver = driver;
		 sp.DefaultPhysician_save();
  }
  @Test(priority=12)
  public void Doctorsaveprescrition() throws Exception {
	  DoctorSavedPrescription dsp = new DoctorSavedPrescription();
		 dsp.driver = driver;
		 dsp.savedprescription();
  }
  @Test(priority=13)
  public void Patientprofile() throws Exception {
	  Patientprofile pp = new Patientprofile();
		 pp.driver = driver;
		 pp.Patientprofile_patientinforamtion();
  }
 /* @Test(priority=14)
  public void Insurance() throws Exception {
	  Insurance in = new Insurance();
		 in.driver = driver;
		 in.InsuranceInfo();
  }*/
/*  @Test(priority=14)
  public void patientregistration() throws Exception {
	  PatientRegistration in = new Insurance();
		 in.driver = driver;
		 in.InsuranceInfo();
  }*/
  @Test(priority=14)
  public void Medicationhistory() throws Exception {
	  MedicationHistory mh = new MedicationHistory();
		 mh.driver = driver;
		 mh.drugcheckbox();
		 mh.Confirmprescription();
		 mh.Updatedrug();
		
  }
  @Test(priority=15)
  public void Medication_cancellation() throws Exception {
	  Medicationhistory_confirmcancellation mc = new Medicationhistory_confirmcancellation();
	 mc.driver=driver;
	  mc.Confirmcanellation();
		 mc.Confirmcanellation_back();
		// mc.Confirmcanellation_remove();
  }
  @Test(priority=16,enabled=false)
  public void Report_patienthistory() throws Exception {
	  Reports r = new Reports();
	  r.driver=driver;
	  r.PrescriptionReport();
	  r.PrescriptionReport_remove();
  }
  @Test(priority=17,enabled=false)
  public void repoer_prescriberhistory() throws Exception {
	  PrescriberHistory ph = new PrescriberHistory();
	  ph.driver=driver;
	  ph.Report_PrescriberHistory();
	  	
	 
  }
  @Test(priority=17)
  public void Freetext() throws Exception {
	  FreeText ft = new FreeText();
	  ft.driver=driver;
	  ft.FreeText_Addtomedication();
	  	
	 
  }
  @Test(priority=18)
  public void Rxpad_prescriptionreport() throws Exception {
	  Rxpad_Prescription rpr = new Rxpad_Prescription();
	  rpr.driver=driver;
	  rpr.Rxpad_Prescriptionreport();	  	
	 
  }
  @Test(priority=19)
  public void Myprofile() throws Exception {
	  Myprofile mp = new Myprofile();
	  mp.driver=driver;
	  mp.addclinic();
	  mp.Myprofile_clinicinformation();
	 
  }

  @Test(priority=20)
  public void Myprofile_personal() throws Exception {
	  Myprofile_Personal mpp = new Myprofile_Personal();
	  mpp.driver=driver;
	  mpp.PersonalProfile();
  }
  @Test(priority=21)
  public void Myprofile_setdruginteraction() throws Exception {
	  Myprofile_Setdruginteraction ms = new Myprofile_Setdruginteraction();
	  ms.driver=driver;
	  ms.SetDrugInteraction();
  }
  @Test(priority=22,enabled=false)
  public void Myprofile_changepassword() throws Exception {
	 Myprofile_Changepassword mc =new Myprofile_Changepassword();
	 mc.driver = driver;
	 mc.ChangePassword();
  }
  @Test(priority=22)
  public void Myprofile_staffauthorization() throws Exception {
	 Myprofile_staffautorization ms =new Myprofile_staffautorization();
	 ms.driver = driver;
	 ms.staffupadte();
  }
  @Test(priority=23)
  public void Myprofile_favouritedrug() throws Exception {
	 Myprofile_favouritedrug mf =new Myprofile_favouritedrug();
	 mf.driver = driver;
	 mf.favouritedrug();
	 mf.addpracticelist();
	 mf.practicefavoritedrug();
	 MyScreenRecorder.stopRecording();
  }

  @BeforeSuite
  public void beforeSuite() {
	  driver = Driver.browser("web");
  }

  @AfterSuite
  public void afterSuite() throws Exception {
	 
  }

}
