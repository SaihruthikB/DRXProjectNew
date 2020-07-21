package test;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.WebLocators;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	WebLocators obj;
		test t = new test();
		WebDriver driver = Driver.browser("web");

		obj = PageFactory.initElements(driver, WebLocators.class);

		driver.close();
		driver = Driver.browser("web");
		t.searchContext.findElement(By.linkText("Login")).click();*/
		// obj.userlogin_btn.click();
	}

	public test() {
		// TODO Auto-generated constructor stub
	}

	private SearchContext searchContext;

	public test(SearchContext searchContext) {
		this.searchContext = searchContext;
		SearchContext driver = Driver.browser("web");

		driver = Driver.browser("web");
		searchContext.findElement(By.linkText("Login")).click();
	}
}
