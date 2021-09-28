package org.twt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Twitterr {
 public static void main(String[] args) {
	System.setProperty("WebDriver.ie.driver","C:\\Users\\aruna\\eclipse-workspace\\Twitter\\drive3\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.facebook.com/");
}
	
}
