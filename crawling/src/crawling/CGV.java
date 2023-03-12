package crawling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * �� �����Ͽ� ��� �� ���ǻ���
 * �������� url�� ������ ������, �̸� WebElement�� ��Ƴ��Ҵ� ��ü�� �ش� �ʵ带 ���� �� ����ϰ� ���� url�� ����Ǿ�� �Ѵ�.
 * �ش� �������� �۾��� ������ �� ������ URL�� ��������!
 */

public class CGV {
   private WebDriver webDriver;
   public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
   
   public static void main(String[] args) {
      CGV cgv = new CGV();
      String url = "http://www.cgv.co.kr/movies/?lt=1&ft=0";
      WebDriver driver = cgv.webDriver;
      Scanner sc = new Scanner(System.in);
      String countText = null;
      int i = 0, total = 0;
      
//      �ü���� ����̹� ����
      System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
      
//      WebDriver��ü�� ũ�� ����̹� ����
      driver = new ChromeDriver();
      
//      ���ϴ� ��θ� �������� ����
      driver.get(url);
      try {Thread.sleep(1000);} catch (InterruptedException e) {;}
      
//      �� ���� ��ư Ŭ��
//      driver.findElement(By.className("btn-more-fontbold")).click();
//      try {Thread.sleep(1000);} catch (InterruptedException e) {;}
      
//      ��ȭ ���� ��������
//      [�ǽ�] �������� ��������
//      [�ǽ�] �帣 ��������(�ڷΰ��� ��������)
      ArrayList<String> reservationRates = new ArrayList<String>();
      ArrayList<String> names = new ArrayList<String>();
      ArrayList<String> hrefs = new ArrayList<String>();
      ArrayList<String> genres = new ArrayList<String>();
      
      for (WebElement webElement : driver.findElements(By.cssSelector("strong.percent span"))) {
         reservationRates.add(webElement.getText());
      }
      
      for (WebElement webElement : driver.findElements(By.cssSelector("div.box-contents strong.title"))) {
         names.add(webElement.getText());
      }
      
      for(WebElement webElement : driver.findElements(By.cssSelector("div.box-image a"))) {
         hrefs.add(webElement.getAttribute("href"));
      }
//      
      for (String href : hrefs) {
         driver.get(href);
         for(WebElement webElement : driver.findElements(By.cssSelector("div.spec dl dt"))) {
            String genre = webElement.getText();
            if(genre.startsWith("�帣")) {
               genres.add(genre);
            }
         }
      }
      
      for(int j = 0; j < names.size(); j++) {
         System.out.println(++i + ". " + names.get(j) + ", " + reservationRates.get(j) + ", " + genres.get(j));
      }
      i = sc.nextInt();
      i--;
      
      driver.get(url);
      try {Thread.sleep(1000);} catch (InterruptedException e) {;}
      
//      �����ϱ� ��ư �� ��������
      List<WebElement> btns = driver.findElements(By.className("link-reservation"));
      
//      �����ϱ� ��ư�� Ŭ�� �ȵǱ� ������, �̵��� ��θ� ���� �����´�.
//      ������ ��θ� ���� ������ �ּ�â(URL)�� �־��ش�.
      
      driver.get(btns.get(i).getAttribute("href"));
      try {Thread.sleep(1000);} catch (InterruptedException e) {;}
      
//      ���� ������ ���ο� iframe�� ����ֱ� ������,
//      ���� �������� �ּ�â(URL)�� iframe src(���)�� �������ش�.
      driver.get(driver.findElement(By.id("ticket_iframe")).getAttribute("src"));
      try {Thread.sleep(2000);} catch (InterruptedException e) {;}
      
      for(WebElement webElement : driver.findElements(By.className("count"))) {
         countText = webElement.getText();
         if(countText.length() == 0) {continue;}
         total += Integer.valueOf(countText.substring(1, countText.length() - 1));
      }
      
      System.out.println("���� ������ ��ȭ�� �� : " + total);
      
//      ũ�� ����
//      driver.close(); //�������� �ڵ� ����
      driver.quit();
   }
}



