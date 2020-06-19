package com.selenium.test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;






public class App 
{

		public static void main(String[] args)   {
	    {
	        // declaration and instantiation of objects/variables
	    	
    	
             try {
//            	 Chrome
//    	     	 String chromeDriverPath = "/Users/solimano/Downloads/chromedriver" ;
//               System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//               WebDriver driver = new ChromeDriver();
//            	 Firefox
            	 String FirefoxDriverPath = "/Users/solimano/Downloads/geckodriver" ;
                 System.setProperty("webdriver.gecko.driver",FirefoxDriverPath);
     			 WebDriver driver = new FirefoxDriver();

                 driver.get("http://localhost:3000/");
                 JavascriptExecutor executor = (JavascriptExecutor) driver;
                 WebElement  c_filtro = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/button[3]"));
                 executor.executeScript("arguments[0].click();", c_filtro);
 				 Thread.sleep(2000);
 				 
 				 WebElement  buscar_desde = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[1]/div/input"));
 				 buscar_desde.click();
 				 buscar_desde.sendKeys(Keys.COMMAND,"a");
 				 Thread.sleep(2000);
 				 buscar_desde.sendKeys(Keys.DELETE);
                 buscar_desde.sendKeys("01/01/2020");
                 buscar_desde.sendKeys(Keys.ESCAPE);
				 Thread.sleep(2000);
 				 WebElement  buscar_hasta = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div/input"));
 				 buscar_hasta.click();
 				 buscar_hasta.sendKeys(Keys.COMMAND,"a");
 				 Thread.sleep(2000);
 				 buscar_hasta.sendKeys(Keys.DELETE);
 				 buscar_hasta.sendKeys("01/10/2020");
 				 buscar_desde.sendKeys(Keys.ESCAPE);
				 Thread.sleep(2000);
				 WebElement  c_filtro_fechas = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/button[2]"));
				 executor.executeScript("arguments[0].click();", c_filtro_fechas);
				 Thread.sleep(4000);
				 WebElement  c_register = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/button[1]"));
				 executor.executeScript("arguments[0].click();", c_register);
				 Thread.sleep(2000);
				 WebElement  c_saver = driver.findElement(By.xpath("//*[@id=\"modal1\"]/button"));
				 executor.executeScript("arguments[0].click();", c_saver);
				 Thread.sleep(4000);
				 driver.findElement(By.xpath("//*[@id=\"validationNombres\"]")).sendKeys("PEDRO");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"validatioApellidos\"]")).sendKeys("LOPEZ");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"validationCorreo\"]")).sendKeys("PLOPERZ@GMAIL.COM");
				 Thread.sleep(2000);
				 WebElement c_puntuacion = driver.findElement(By.xpath("//*[@id=\"formHorizontalRadios\"]"));
				 executor.executeScript("arguments[0].click();", c_puntuacion);
				 Thread.sleep(2000);
				 executor.executeScript("arguments[0].click();", c_saver);
				 Thread.sleep(5000);
				 WebElement c_comentario = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/table/tbody/tr[3]/td[5]/button"));
				 executor.executeScript("arguments[0].click();", c_comentario);
				 Thread.sleep(3000);
				 WebElement set_comentario = driver.findElement(By.xpath(" /html/body/div[3]/div/div/div[2]/form/div[2]/div/input"));
				 set_comentario.sendKeys("comentario de prueba");
				 Thread.sleep(2000);
				 WebElement c_save_comentario = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button"));
				 executor.executeScript("arguments[0].click();", c_save_comentario);
				 set_comentario.sendKeys(Keys.COMMAND,"a");
				 Thread.sleep(3000);
				 set_comentario.sendKeys(Keys.DELETE);
 				 Thread.sleep(3000);
 				 set_comentario.sendKeys("nuevo comentario de prueba");
 				 executor.executeScript("arguments[0].click();", c_save_comentario);
				 Thread.sleep(3000);
				 set_comentario.sendKeys(Keys.ESCAPE);
				 WebElement c_close_comentario = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
				 executor.executeScript("arguments[0].click();", c_close_comentario);
				 Thread.sleep(3000);
				 executor.executeScript("arguments[0].click();", c_filtro);
				
				 Thread.sleep(5000);
				 
				
				
			 	 driver.quit();
	       		 System.exit(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      
	       	
	       	
         


     }
    }
	    
  
	    
}
