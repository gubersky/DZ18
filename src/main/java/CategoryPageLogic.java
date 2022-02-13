import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CategoryPageLogic {

    SelenideElement clickCategory = $(By.xpath("//a[@title='Ноутбуки']"));

    public SearchPageLogic clickOnLaptopCategory() {
        clickCategory.click();
        return page(SearchPageLogic.class);
    }
}
