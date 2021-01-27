import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTests {

    @Test
    void selenideSearchTest(){
        // Открыть google
        open("https://www.google.com/");

        // Ввести Selenide в поиск
        //$("[name='q']").setValue("Selenide");
        $(byName("q")).setValue("Selenide").pressEnter();


        sleep(1000);
        // Проверить, что Selenide появился в результатах поиска
        // # упрощенная замена id
        $("#search").shouldHave(text("Selenide vs Selenium"));

    }
    }
