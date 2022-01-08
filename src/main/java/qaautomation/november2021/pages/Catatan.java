//package qaautomation.november2021.pages;
//
//public class Catatan {
//
//	public Catatan() {
//		// TODO Auto-generated constructor stub
//		
//		public void test1() {
//			String username = "fullstackdemo";
//			String password = "fullstackdemo";
//
//			driver.get().findElement(By.xpath("//a[normalize-space()='Log In/Register As Student']")).click();
//			driver.get().findElement(By.id("username")).sendKeys(username);
//			driver.get().findElement(By.name("password")).sendKeys(password);
//			driver.get().findElement(By.xpath("//button[normalize-space()='Login']")).click();
//			String actualText = driver.get().findElement(By.xpath("//strong[normalize-space()='fullstackdemo']")).getText();
//			System.out.println(actualText);
//			System.out.println(username);
//			assertEquals(actualText, username);
//		}
//	  
//	  
//	  
//	  ClickElement(loginLink)
//	  SetText(username, user)
//	  SetText(password, pass)
//	  ClickElement(loginBtn)
//	  GetText(profileText)
//	  
//	  
//	  loginPage
//	  
//	  public void login(){
//	  	ClickElement(loginLink)
//	  	SetText(username, user)
//	  	SetText(password, pass)
//	  	ClickElement(loginBtn)
//	  }
//	  
//	  profilePage
//	  
//	  public void getProfileText(){
//	  	GetText(profileText)
//	  }
//	  
//	  BasePage
//	  
//	  
//	  TestCase
//	  
//	  loginPage.login()
//	  actualText = profilePage.getText()
//	  
//	  assertEquals(actualText,expectedText)
//	  
//	  
//	  TestCase
//	  
//	  ClickElement(loginLink)
//	  SetText(username, user)
//	  SetText(password, pass)
//	  ClickElement(loginBtn)
//	  GetText(profileText)
//	  
//	  
//	  
//	}
//
//}
