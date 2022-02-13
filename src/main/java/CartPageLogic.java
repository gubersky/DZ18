import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPageLogic {

    SelenideElement checkTitleOfProductInCart = $(By.xpath("//a[contains(@class, 'cart-product__title')]"));

    public String titleOfProductInCart() {
        return checkTitleOfProductInCart.text().trim();
    }
}
