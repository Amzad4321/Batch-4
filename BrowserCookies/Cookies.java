package MyFirstSeleniumProject.BrowserCookies;

import MyFirstSeleniumProject.BaseClass;

public class Cookies extends BaseClass {

public void manageCookies(){

   int cookies = driver.manage().getCookies().size();
    System.out.println(cookies);
}


    public static void main(String[] args) throws InterruptedException {
        Cookies obj = new Cookies();
        obj.launchBrowser("chrome","https://google.com");
        obj.manageCookies();
    }


}
