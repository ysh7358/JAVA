package crawling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Melon {
   private WebDriver webDriver;
   private String url;
   public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
   
   public Melon() {
      System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
      url = "https://www.melon.com/";
      ChromeOptions options = new ChromeOptions();
//      options.addArguments("headless");
      
      webDriver = new ChromeDriver(options);
      webDriver.get(url);
      
   }
   
   public WebDriver selectLyric() {
      Scanner sc = new Scanner(System.in);
      WebElement input = null, form = null;
      
      List<WebElement> songNumberElements = null;
      List<WebElement> songTitleElements = null;
      List<WebElement> songArtistElements = null;
      
      ArrayList<String> songNumbers = new ArrayList<String>();
      ArrayList<String> songTitles = new ArrayList<String>();
      ArrayList<String> songAdults = new ArrayList<String>();
      ArrayList<String> songArtists = new ArrayList<String>();
      
      String songNumber = null, songTitle = null, songArtist = null;
      int choice = 0;
      
      try {
         input = webDriver.findElement(By.className("ui-autocomplete-input"));
         
         System.out.print("�뷡 ���� > ");
         input.sendKeys(sc.nextLine());
         input.sendKeys(Keys.RETURN);
         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
         
         form = webDriver.findElement(By.id("frm_searchSong"));
         
         //��ȣ
         songNumberElements = form.findElements(By.cssSelector("td.no div"));
         //����
         songTitleElements = form.findElements(By.cssSelector("td.t_left a.fc_gray"));
         
   //      ��ȣ ó��
         for (int i = 0; i < songNumberElements.size(); i++) {
            songNumber = songNumberElements.get(i).getText();
            songNumbers.add(songNumber);
            
         }
         
   //      ���� ó��
         for (int i = 0; i < songTitleElements.size(); i++) {
            songTitle = songTitleElements.get(i).getText();
            songTitles.add(songTitle);
         }
         
   //      ��ũ �Ȱɸ� ���� ó��
         if(songTitleElements.size() != songNumberElements.size()) {
            songTitleElements = form.findElements(By.cssSelector("td.t_left span"));
            songTitles.addAll(songTitleElements.stream().filter(v -> !v.getAttribute("title").equals("")).map(v -> v.getText()).collect(Collectors.toList()));
         }
         
   //      ��Ƽ��Ʈ ó��
         for(WebElement webElement : form.findElements(By.cssSelector("div#artistName"))) {
            songArtistElements = webElement.findElements(By.cssSelector("span a.fc_mgray"));
            songArtist = songArtistElements.size() == 0 ? "����" : songArtistElements.stream().map(v -> v.getAttribute("title")).map(v -> v.split(" - ")[0]).collect(Collectors.joining(","));
            
            songArtists.add(songArtist);
         }
         
//         19�� ó��
         for(WebElement tr : form.findElements(By.cssSelector("tbody tr"))) {
            try {
               songAdults.add(tr.findElement(By.cssSelector("span.age_19")).getText());
            } catch (NoSuchElementException e) {
               songAdults.add("");
            }
         }
         
         for (int i = 0; i < songNumbers.size(); i++) {
            System.out.println(songNumbers.get(i) + " / " + songAdults.get(i) + (songAdults.get(i).equals("") ? "" : "�� ") + songTitles.get(i) + " / " + songArtists.get(i));
         }
         
         System.out.print("���縦 ���� ���� �� ��ȣ : ");
         choice = sc.nextInt() - 1;
         
         form.findElements(By.className("btn_icon_detail")).get(choice).click();
         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
         
         webDriver.findElement(By.className("adult_register"));
         System.out.println("���� ���� ����� �����Ͻ� �� �����ϴ�.");
         
      }catch(NoSuchElementException nsee) {
         try {
            WebElement webElement = webDriver.findElement(By.className("lyric"));
            System.out.println("=========== " + songTitles.get(choice) + " ���� ===========");
            System.out.println(webElement.getText());
         } catch (NoSuchElementException e) {
            System.out.println("���簡 ���� ���Դϴ�.");
         }
      }
      return webDriver;
   }
   
   public void operate() {
      selectLyric();
      webDriver.quit();
   }
   
   public static void main(String[] args) {
      new Melon().selectLyric().quit();
   }
}




