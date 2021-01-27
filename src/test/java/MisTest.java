import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class MisTest {
    @Test
    void MisLogin(){
        // Открыть сайт Мис
        open("http://192.168.233.102/mis2005_master/");

        // Ввести логин и пароль
        sleep(500);
        $(byXpath("/html/body/div[6]/table/tbody/tr[3]/td[2]/div/div[1]/table/tbody/tr/td/table/tbody/tr[1]/td[3]/table/tbody/tr/td/input")).sendKeys("dev");
        $(byXpath("/html/body/div[6]/table/tbody/tr[3]/td[2]/div/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[3]/table/tbody/tr/td/input")).sendKeys("def");
        $(byName("btnLogin")).click();

        // Выбрать ЛПУ
        $(byXpath("/html/body/div[6]/table/tbody/tr[3]/td[2]/div/div[1]/table/tbody/tr/td/table/tbody[1]/tr[2]/td/table/tbody/tr[1]/td[1]/input")).setValue("6202 - ").sendKeys(DOWN,ENTER);
        sleep(4000);

        $(byName("Btn")).click();

        sleep(10000);



        // Перейти в видеотрансляции
        // Создать видеотрансляцию
        // Выйти из мис
        $(byClassName("Exit")).click();
        sleep(8000);
        //$("[]").click();
    }
}
