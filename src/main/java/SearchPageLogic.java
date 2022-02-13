import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchPageLogic {


    SelenideElement clickAddProduct = $(By.xpath("//button[contains(@class, 'buy-button')]"));
    SelenideElement firstTitleProduct = $(By.xpath("//span[contains(@class, 'goods-tile__title')]"));
    SelenideElement checkCounterBtn = $(By.xpath("//span[contains(@class,'counter counter--green')]"));
    SelenideElement clickCartBtn = $(By.xpath("//span[contains(@class,'counter counter--green')]"));


    public SearchPageLogic addProduct() {
        clickAddProduct.click();
        return this;
    }

    public String titleOfFirstProduct() {
        return firstTitleProduct.text().trim();
    }

    public String cartCounterBtn() {
        return checkCounterBtn.attr("innerText").trim();
    }

    public CartPageLogic openCart(){
        clickCartBtn.click();
        return page(CartPageLogic.class);
    }
}
