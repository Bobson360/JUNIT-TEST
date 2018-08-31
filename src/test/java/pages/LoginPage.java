package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	static WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public static void preencerCampos() {
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("admin@phptravels.com");     
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demoadmin");
		
		WebElement button = driver.findElement(By.xpath("/html/body/div/form[1]/button"));
		button.click();
		
		WebElement accounts = driver.findElement(By.xpath("/html/body/div[2]/aside/div/div[6]/div/ul/li[5]/a"));
		accounts.click();
		
		WebElement suppliers = driver.findElement(By.xpath("//*[@id=\"ACCOUNTS\"]/li[2]/a"));
		suppliers.click();
		
		WebElement add = driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/button"));
		add.click();
		
		WebElement fname = driver.findElement(By.name("fname"));
		fname.sendKeys("Robson");
		
		WebElement lname = driver.findElement(By.name("lname"));
		lname.sendKeys("Rodrigues");
		
		WebElement email_cad = driver.findElement(By.name("email"));
		email_cad.sendKeys("bobson278@gmail.com");
		
		WebElement password_cad = driver.findElement(By.name("password"));
		password_cad.sendKeys("123456");
		
		WebElement mobile = driver.findElement(By.name("mobile"));
		mobile.sendKeys("11986805708");
		
		WebElement select_country = driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a/span[1]"));
		select_country.click();
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[6]/div/select/option[20]"));
		country.click();
		
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("Rua sete de abril");
		
		WebElement select_status = driver.findElement(By.name("status"));
		select_status.click();
		
		WebElement status = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[11]/div/div/div/select/option[1]"));
		status.click();
		
		WebElement select_supplierfor = driver.findElement(By.name("applyfor"));
		select_supplierfor.click();
		
		WebElement supplierfor = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[13]/div/select/option[3]"));
		supplierfor.click();
		
		WebElement itemname = driver.findElement(By.name("itemname"));
		itemname.sendKeys("automatch");
		
		WebElement newssub = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[15]/div/div/label/div/ins"));
		newssub.click();
		
		WebElement assign_cars = driver.findElement(By.xpath("//*[@id=\"s2id_autogen7\"]/ul"));
		assign_cars.click();
		
		WebElement assign_cars_astra = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[20]/div/select/option[2]"));
		assign_cars_astra.click();
		
		WebElement assign_cars_corsa = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[20]/div/select/option[5]"));
		assign_cars_corsa.click();
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[3]/button"));
		submit.click();
		
		
		
		
		
	}
	
	public String validarMensagem() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[5]/a")).getText();
	}

}
