package org.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class select extends HelperClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		WebElement ty = findXpath("//a[text()='Careers']");
	sleep(3000);
	scrolDown(ty);
	System.out.println("done");
	
}

}
