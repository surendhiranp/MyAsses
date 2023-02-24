package com.theEnerjiGroup;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amnet {
	public static WebElement eisbn;
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void browserLaunch() {
		String url = "https://amesqa.amnet-systems.com/AmES_v2.3.1/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public static void Functional4() throws Exception {
		WebElement jt = driver.findElement(By.id("jobType"));
		Select sc1 = new Select(jt);
		sc1.selectByVisibleText("eBooks");
		WebElement customer = driver.findElement(By.name("dds_3"));
		Select sc2 = new Select(customer);
		sc2.selectByVisibleText("QA Customer Interview -US");
		WebElement project = driver.findElement(By.id("dds_6"));
		Select sc3 = new Select(project);
		sc3.selectByVisibleText("QA Interview Project");
		Thread.sleep(3000);
		WebElement category = driver.findElement(By.xpath("//select[@id='dds_21']"));
		Select sc5 = new Select(category);
		sc5.selectByVisibleText("eBook");
		Thread.sleep(3000);
		WebElement custname = driver.findElement(By.id("dds_10"));
		Select sc6 = new Select(custname);
		sc6.selectByVisibleText("Vignesh R");
		WebElement csr = driver.findElement(By.id("dds_11"));
		Select sc7 = new Select(csr);
		sc7.selectByVisibleText("QA Employee AM8942");
		WebElement datebox = driver.findElement(By.xpath("//input[@name='dtp_17']"));
		datebox.click();
		WebElement dateSelect = driver.findElement(By.xpath("//a[text()='22']"));
		dateSelect.click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		WebElement bookid = driver.findElement(By.xpath("// input[@name='ttb_15']"));
		bookid.sendKeys("14566");
		WebElement booktitle = driver.findElement(By.xpath("// input[@name='ttb_16']"));
		booktitle.sendKeys("jave");
		eisbn = driver.findElement(By.xpath("// input[@name='nrr_20']"));
		eisbn.sendKeys("97831614841");
		WebElement pisbn = driver.findElement(By.xpath("// input[@name='nrr_19']"));
		pisbn.sendKeys("9781566199094");
		WebElement submit1 = driver.findElement(By.xpath("// input[@type='submit']"));
		submit1.click();
		WebDriverWait w = new WebDriverWait(driver, null);
		WebElement reset = driver.findElement(By.xpath("//a[text()='Reset']"));
		reset.click();
	}

	public static void validEisbn() throws Exception {
		WebElement jt = driver.findElement(By.id("jobType"));
		Select sc1 = new Select(jt);
		sc1.selectByVisibleText("eBooks");
		WebElement customer = driver.findElement(By.name("dds_3"));
		Select sc2 = new Select(customer);
		sc2.selectByVisibleText("QA Customer Interview -US");
		WebElement project = driver.findElement(By.id("dds_6"));
		Select sc3 = new Select(project);
		sc3.selectByVisibleText("QA Interview Project");
		WebElement category = driver.findElement(By.xpath("//select[@id='dds_21']"));
		Select sc5 = new Select(category);
		sc5.selectByVisibleText("eBook");;
		WebElement custname = driver.findElement(By.id("dds_10"));
		Select sc6 = new Select(custname);
		sc6.selectByVisibleText("Vignesh R");
		WebElement csr = driver.findElement(By.id("dds_11"));
		Select sc7 = new Select(csr);
		sc7.selectByVisibleText("QA Employee AM8942");
		WebElement datebox = driver.findElement(By.xpath("//input[@name='dtp_17']"));
		datebox.click();
		WebElement dateSelect = driver.findElement(By.xpath("//a[text()='22']"));
		dateSelect.click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		WebElement bookid = driver.findElement(By.xpath("// input[@name='ttb_15']"));
		bookid.sendKeys("14566");
		WebElement booktitle = driver.findElement(By.xpath("// input[@name='ttb_16']"));
		booktitle.sendKeys("jave");
		eisbn = driver.findElement(By.xpath("// input[@name='nrr_20']"));
		eisbn.sendKeys("9783161484100");
		WebElement pisbn = driver.findElement(By.xpath("// input[@name='nrr_19']"));
		pisbn.sendKeys("9781566199094");
		WebElement submit1 = driver.findElement(By.xpath("// input[@type='submit']"));
		submit1.click();

	}

	public static void bookIdSec() throws InterruptedException {

		WebElement jt = driver.findElement(By.id("jobType"));
		Select sc1 = new Select(jt);
		sc1.selectByVisibleText("eBooks");
		WebElement customer = driver.findElement(By.name("dds_3"));
		Select sc2 = new Select(customer);
		sc2.selectByVisibleText("QA Customer Interview -US");
		WebElement project = driver.findElement(By.id("dds_6"));
		Select sc3 = new Select(project);
		sc3.selectByVisibleText("QA Interview Project");
		WebElement category = driver.findElement(By.xpath("//select[@id='dds_21']"));
		Select sc5 = new Select(category);
		sc5.selectByVisibleText("eBook");
		WebElement custname = driver.findElement(By.id("dds_10"));
		Select sc6 = new Select(custname);
		sc6.selectByVisibleText("Vignesh R");
		WebElement csr = driver.findElement(By.id("dds_11"));
		Select sc7 = new Select(csr);
		sc7.selectByVisibleText("QA Employee AM8942");
		WebElement datebox = driver.findElement(By.xpath("//input[@name='dtp_17']"));
		datebox.click();
		WebElement dateSelect = driver.findElement(By.xpath("//a[text()='22']"));
		dateSelect.click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		WebElement bookid = driver.findElement(By.xpath("//input[@name='ttb_15']"));
		bookid.sendKeys("          ");
		WebElement booktitle = driver.findElement(By.xpath("// input[@name='ttb_16']"));
		booktitle.sendKeys("jave");
		eisbn = driver.findElement(By.xpath("// input[@name='nrr_20']"));
		eisbn.sendKeys("9783161484100");
		WebElement pisbn = driver.findElement(By.xpath("// input[@name='nrr_19']"));
		pisbn.sendKeys("9781566199094");
		WebElement submit1 = driver.findElement(By.xpath("// input[@type='submit']"));
		submit1.click();
		WebDriverWait w = new WebDriverWait(driver, null);
		WebElement reset = driver.findElement(By.xpath("//a[text()='Reset']"));
		reset.click();

	}

	public static void main(String[] args) throws Exception {

		browserLaunch();
		WebElement username = driver.findElement(By.xpath("// input[@placeholder ='Username']"));
		username.sendKeys("AMQ1708");
		WebElement password = driver.findElement(By.xpath("// input[@placeholder ='Password']"));
		password.sendKeys("QA@123");
		WebElement login = driver.findElement(By.id("submit"));
		login.click();
		WebElement jc = driver.findElement(By.xpath("// a[@id='jobCardBannerLink_id']"));
		jc.click();
		Set<String> aw = new HashSet<>((driver.getWindowHandles()));
		for (String next : aw) {
			String title = driver.switchTo().window(next).getTitle();
			System.out.println(title);
		}
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement addnew = driver.findElement(By.xpath("// a[@id='cus_form']"));
		addnew.click();
		WebElement submit = driver.findElement(By.xpath("// input[@type='submit']"));
		submit.click();
		WebElement reset = driver.findElement(By.xpath("//a[@class='des_but1']"));
		reset.click();
		WebElement jt = driver.findElement(By.id("jobType"));
		Select sc1 = new Select(jt);
		sc1.selectByVisibleText("eBooks");
		WebElement customer = driver.findElement(By.name("dds_3"));
		Select sc2 = new Select(customer);
		sc2.selectByVisibleText("QA Customer Interview -US");
		Thread.sleep(3000);
		WebElement project = driver.findElement(By.xpath("//select[@id='dds_6']"));
		Select sc3 = new Select(project);
		sc3.selectByVisibleText("QA Interview Project");
		WebElement category = driver.findElement(By.xpath("//select[@id='dds_21']"));
		Select sc5 = new Select(category);
		sc5.selectByVisibleText("eBook");
		WebElement custname = driver.findElement(By.id("dds_10"));
		Select sc6 = new Select(custname);
		sc6.selectByVisibleText("Vignesh R");
		WebElement csr = driver.findElement(By.id("dds_11"));
		Select sc7 = new Select(csr);
		sc7.selectByVisibleText("QA Employee AM8942");
		WebElement datebox = driver.findElement(By.xpath("//input[@name='dtp_17']"));
		datebox.click();
		WebElement dateSelect = driver.findElement(By.xpath("//a[text()='22']"));
		dateSelect.click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		WebElement bookid = driver.findElement(By.xpath("// input[@name='ttb_15']"));
		bookid.sendKeys("14566");
		WebElement booktitle = driver.findElement(By.xpath("// input[@name='ttb_16']"));
		booktitle.sendKeys("jave");
		eisbn = driver.findElement(By.xpath("// input[@name='nrr_20']"));
		eisbn.sendKeys("97831614");
		WebElement pisbn = driver.findElement(By.xpath("// input[@name='nrr_19']"));
		pisbn.sendKeys("9781566199094");
		WebElement submit1 = driver.findElement(By.xpath("// input[@type='submit']"));
		submit1.click();
		WebElement resetbn = driver.findElement(By.xpath("//a[text()='Reset']"));
		resetbn.click();
		Functional4();
		bookIdSec();
		validEisbn();

	}

   
}