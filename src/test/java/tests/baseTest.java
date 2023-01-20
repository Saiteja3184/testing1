package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.logIn;

import java.util.concurrent.TimeUnit;

public class baseTest {
    private WebDriver driver;
    protected logIn login;


    @BeforeMethod
    public void driverSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void checkInformationInVmClassString() throws InterruptedException {
        driver.get("https://dev.technicalhub.io/codemind/");
        WebElement log = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div[2]/ul/li[2]/a"));
        log.click();
        WebElement uname = driver.findElement(By.name("Email"));
        uname.sendKeys("3967");
        WebElement pswd = driver.findElement(By.name("Password"));
        pswd.sendKeys("1234");
        WebElement loginbutton = driver.findElement(By.name("Login"));
        loginbutton.click();
        WebElement Codingbutton = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[2]/div/div/div/ul/li[2]"));
        Codingbutton.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement Logicalbutton = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[2]/div/div/div/ul/li[3]"));
        Logicalbutton.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement DriveCodebutton = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[2]/div/div/div/ul/li[4]"));
        DriveCodebutton.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement Technicalbutton = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[2]/div/div/div/ul/li[5]"));
        Technicalbutton.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement Satisticsbutton = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[2]/div/div/div/ul/li[1]"));
        Satisticsbutton.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement profile = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[1]/div/h4/a/i"));
        profile.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement Technical = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div/section/div/div/div[2]/div/div/div/ul/li[2]"));
        Technical.click();
        Thread.sleep(Long.parseLong("1000"));

        //Technical_Links
        WebElement githubprofile = driver.findElement(By.name("Github"));
        githubprofile.sendKeys("https://github.com/Saiteja3184");
        WebElement leetcode = driver.findElement(By.name("Leetcode"));
        leetcode.sendKeys("https://github.com/Saiteja3184");
        WebElement codechef = driver.findElement(By.name("Codechef"));
        codechef.sendKeys("https://github.com/Saiteja3184");
        WebElement Geeksforgeeks = driver.findElement(By.name("Geeksforgeeks"));
        Geeksforgeeks.sendKeys("githubcom/Saiteja3184");
        Thread.sleep(Long.parseLong("1000"));


        WebElement socailmedial = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div/section/div/div/div[2]/div/div/div/ul/li[3]"));
        socailmedial.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement facebook = driver.findElement(By.name("facebook"));
        facebook.sendKeys("github.com/Saiteja3184");
        WebElement Twitter = driver.findElement(By.name("twitter"));
        Twitter.sendKeys("github.com/Saiteja3184");
        WebElement Instagram = driver.findElement(By.name("instagram"));
        Instagram.sendKeys("github.com/Saiteja3184");
        WebElement LinkedIn = driver.findElement(By.name("linkedIn"));
        LinkedIn.sendKeys("github.com/Saiteja3184");
        WebElement Blog = driver.findElement(By.name("blog"));
        Blog.sendKeys("github.com/Saiteja3184");
        Thread.sleep(Long.parseLong("1000"));


        WebElement Resume = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div/section/div/div/div[2]/div/div/div/ul/li[4]"));
        Resume.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement Devicespecifications = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div/section/div/div/div[2]/div/div/div/ul/li[5]"));
        Devicespecifications.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement Personal = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div/section/div/div/div[2]/div/div/div/ul/li[1]"));
        Personal.click();
        Thread.sleep(Long.parseLong("1000"));
        //WebElement savebutton = driver.findElement(By.xpath("//*[@id=\"Personalform\"]/div/div[8]/button/span\n"));
        //savebutton.click();


        //Navigation_Bar_Portfolio
        WebElement portfolio = driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/a"));
        portfolio.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement Leaderboard = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/nav/div[2]/ul/li[1]/ul/li[2]/a"));
        Leaderboard.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement logical_p = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/ul/li[2]"));
        logical_p.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement portfolio1 = driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/a"));
        portfolio1.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement aptlogic_p = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/nav/div[2]/ul/li[1]/ul/li[3]/a"));
        aptlogic_p.click();
        WebElement n_ability = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div[1]/div[2]/div"));
        n_ability.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement l_ability = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div[1]/div[3]/div"));
        l_ability.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement v_ability = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div[1]/div[4]/div"));
        v_ability.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement t_ability = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div[1]/div[5]/div"));
        t_ability.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement attendance = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div[1]/div[6]/div"));
        attendance.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement portfolio2 = driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/a"));
        portfolio2.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement p_techskills = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/nav/div[2]/ul/li[1]/ul/li[4]/a"));
        p_techskills.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement p_t_training = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div[1]/div[1]/div"));
        p_t_training.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement p_t_workshop = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div[1]/div[2]/div"));
        p_t_workshop.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement p_t_certification = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div[1]/div[3]/div"));
        p_t_certification.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement p_t_hackathons = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div[1]/div[4]/div"));
        p_t_hackathons.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement p_t_db = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div[1]/div[5]/div"));
        p_t_db.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement p_t_internships = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div[1]/div[6]/div"));
        p_t_internships.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement p_t_projects = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div[1]/div[7]/div"));
        p_t_projects.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement p_t_hackerrank = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div[1]/div[8]/div"));
        p_t_hackerrank.click();
        Thread.sleep(Long.parseLong("1000"));

        //CODE_EXPLORER
        WebElement Code = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/nav/div[2]/ul/li[2]/a"));
        Code.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement c_explorer = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/nav/div[2]/ul/li[2]/ul/li[1]/a"));
        c_explorer.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement c_c = driver.findElement(By.xpath("//div[@class='lower-content']//h5//a[text()='C']"));
        c_c.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement controlstatement = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div[3]"));
        controlstatement.click();
        Thread.sleep(Long.parseLong("1000"));
        JavascriptExecutor Scroll = (JavascriptExecutor) driver;
        Scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(Long.parseLong("1000"));
        driver.navigate().back();
        Thread.sleep(Long.parseLong("500"));
        driver.navigate().back();
        Thread.sleep(Long.parseLong("500"));
        WebElement c_java = driver.findElement(By.xpath("//div[@class='lower-content']//h5//a[text()='Java']"));
        c_java.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement c_java_files = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div[6]/div/a"));
        c_java_files.click();
        Thread.sleep(Long.parseLong("1000"));
        driver.navigate().back();
        Thread.sleep(Long.parseLong("500"));
        driver.navigate().back();
        Thread.sleep(Long.parseLong("500"));
        WebElement c_python = driver.findElement(By.xpath("//div[@class='lower-content']//h5//a[text()='Python']"));
        c_python.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement c_python_oops = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div[7]/div/a"));
        c_python_oops.click();
        Thread.sleep(Long.parseLong("1000"));
        driver.navigate().back();
        Thread.sleep(Long.parseLong("500"));
        driver.navigate().back();
        Thread.sleep(Long.parseLong("500"));
        WebElement c_Algorithms = driver.findElement(By.xpath("//div[@class='lower-content']//h5//a[text()='Algorithms']"));
        c_Algorithms.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement c_Algorithms_Prefixsum = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div[2]/div/a"));
        c_Algorithms_Prefixsum.click();
        Thread.sleep(Long.parseLong("1000"));
        driver.navigate().back();
        Thread.sleep(Long.parseLong("500"));
        driver.navigate().back();
        Thread.sleep(Long.parseLong("500"));
        WebElement c_DataStructures = driver.findElement(By.xpath("//div[@class='lower-content']//h5//a[text()='Data Structures']"));
        c_DataStructures.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement c_DataStructures_queue = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div[4]/div/a"));
        c_DataStructures_queue.click();
        Thread.sleep(Long.parseLong("1000"));
        driver.navigate().back();
        Thread.sleep(Long.parseLong("500"));
        driver.navigate().back();
        Thread.sleep(Long.parseLong("500"));
 /*   }

    @Test(priority = 2)
    public void experimenter() throws InterruptedException{
        driver.get("https://dev.technicalhub.io/codemind/");
        WebElement log = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div[2]/ul/li[2]/a"));
        log.click();
        WebElement uname = driver.findElement(By.name("Email"));
        uname.sendKeys("3967");
        WebElement pswd = driver.findElement(By.name("Password"));
        pswd.sendKeys("1234");
        WebElement loginbutton = driver.findElement(By.name("Login"));
        loginbutton.click();*/

        //CODE_EXPERIMENTER
        WebElement Code1 = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/nav/div[2]/ul/li[2]/a"));
        Code1.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement c_experimenter = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/nav/div[2]/ul/li[2]/ul/li[2]/a"));
        c_experimenter.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement c_experimenter_galaxy = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div[3]/div/div[1]/a/img"));
        c_experimenter_galaxy.click();
        Thread.sleep(Long.parseLong("1000"));
        /*WebElement c_experimenter_galaxy_video = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div[2]/div/div/a"));
        c_experimenter_galaxy_video.click();
        Thread.sleep(Long.parseLong("3000"))*/;
        WebElement c_experimenter_galaxy_code_l = driver.findElement(By.id("lang"));
        c_experimenter_galaxy_code_l.click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement c_experimenter_galaxy_code_lp = driver.findElement(By.xpath("//*[@id='lang']/option[4]"));
        c_experimenter_galaxy_code_lp.click();
        Thread.sleep(Long.parseLong("1500"));
        WebElement c_experimenter_galaxy_code_editor = driver.findElement(By.xpath("//*[@id='editor']/div[2]"));
        c_experimenter_galaxy_code_editor.click();
        WebElement c_experimenter_galaxy_code_editor1 = driver.findElement(By.xpath("//*[@id=\"editor\"]/textarea"));
        c_experimenter_galaxy_code_editor1.sendKeys("n = int(input())\n" +
                "for i in range(0, n):\n" +
                "for j in range(0, i + 1):\n" +
                "print(\"*\", end=\"\")\n" +
                Keys.BACK_SPACE,"print()");
        Thread.sleep(Long.parseLong("1000"));
        JavascriptExecutor Scroll1 = (JavascriptExecutor) driver;
        Scroll1.executeScript("window.scrollBy(0,1000)", "");
        WebElement c_experimenter_galaxy_code_run = driver.findElement(By.id("runCode"));
        c_experimenter_galaxy_code_run.click();
        Thread.sleep(Long.parseLong("1000"));
        JavascriptExecutor Scroll2 = (JavascriptExecutor) driver;
        Scroll2.executeScript("window.scrollBy(0,1000)", "");
        WebElement text = driver.findElement(By.xpath("//*[@id='result']/div/table/tbody/tr[1]/td[2]"));
        String tt = text.getText();
        System.out.println(tt);


    }
}
