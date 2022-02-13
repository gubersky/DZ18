import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic {

    SelenideElement menuPicker = $(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));

    public CategoryPageLogic clickOnCategory(){
        menuPicker.click();
        return page(CategoryPageLogic.class);
    }
}
