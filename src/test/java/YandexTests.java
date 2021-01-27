import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class YandexTests {

    @Test
    void selenideSearchYandex(){
        // Открыть Yandex
        open("https://yandex.ru/");

        // Ввести в поиск Selenide
        $("[id='text']").sendKeys("selenide");
        sleep(2000);

        $("[class='search2__button']").click();

        sleep(2000);

        // Проверить что в результатах есть Selenide
        $("#search-result").shouldHave(text("Selenide.org"));
        sleep(2000);

    }
}
