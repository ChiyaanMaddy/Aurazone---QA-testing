package TEST_SCRIPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUTOMATION_SCRIPT {
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.aurazone.shop/");
		
		driver.findElement(By.xpath("//button[@class='bg-white text-black w-fit px-8 py-4 rounded-full font-bold hover:bg-[#FF6B6B] hover:text-white transition-all transform hover:scale-105 active:scale-95 shadow-lg']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Retro");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='px-6 py-3 bg-slate-900 text-white rounded-xl font-semibold hover:bg-slate-800 transition-colors']")).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//button[@class='-shrink-0 w-10 h-10 sm:w-11 sm:h-11 flex items-center justify-center rounded-lg transition-all shadow-md disabled:opacity-50 disabled:cursor-not-allowed touch-manipulation bg-slate-900 hover:bg-slate-800 active:scale-95 shadow-slate-900/20 text-white']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@class='p-2.5 hover:bg-gray-100 rounded-xl transition-all duration-200 text-slate-900 relative active:scale-95 touch-manipulation min-w-[44px] min-h-[44px] flex items-center justify-center']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='w-full bg-orange-500 text-white py-3 rounded-xl font-bold hover:bg-orange-600 transition-colors mt-6']")).click();
	    Thread.sleep(5000);
	    
	    driver.quit();
	 
	   
	    
	    
	}

}
