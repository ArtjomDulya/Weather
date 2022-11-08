import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YourNickOnGitHubTest {

//TC_11_1

//    1.  Открыть базовую ссылку
//    2.  Нажать на пункт меню Guide
//    3.  Подтвердить, что вы перешли на страницу со ссылкой https://openweathermap.org/guide и
//    что title этой страницы OpenWeatherMap API guide - OpenWeatherMap

    @Test
    public void testGuide() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\lenovo\\Desktop\\Chromdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://openweathermap.org/";
        String expectedResultUrl = "https://openweathermap.org/guide";
        String expectedResultTitle = "OpenWeatherMap API guide - OpenWeatherMap";



        driver.get(url);

        Thread.sleep(5000);

        WebElement SearchGuide = driver.findElement(
                By.xpath("//div[@id='desktop-menu']//a[text()='Guide']")) ;


        SearchGuide.click();

        Thread.sleep(5000);

        WebElement Title = driver.findElement(By.xpath("//title"));

        String actualResultUrl = driver.getCurrentUrl();
        String actualResultTitle = driver.getTitle();



        Assert.assertEquals(actualResultUrl, expectedResultUrl);
        Assert.assertEquals(actualResultTitle, expectedResultTitle);


        driver.quit();

    }

//    TC_11_02
//    1.  Открыть базовую ссылку
//    2.  Нажать на единицы измерения Imperial: °F, mph
//    3.  Подтвердить, что температура для города показана в Фарингейтах

    @Test
    public void testTemperature() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\lenovo\\Desktop\\Chromdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://openweathermap.org/";
//        String expectedResult = "Imperial: °F, mph";

        driver.get(url);

        WebElement temperatureFarengeyt = driver.findElement(
                By.xpath("//div[text()='Imperial: °F, mph']"));

        Thread.sleep(5000);
        temperatureFarengeyt.click();

//        WebElement temperatureFarengey = driver.findElement(By.xpath());




        Thread.sleep(5000);



        driver.quit();
    }


}
