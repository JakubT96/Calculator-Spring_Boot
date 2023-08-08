package JakubT96.spring;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://localhost:8080/calculator");

        // zkusit napsat JUnit testy a Selenium 
    }

}
