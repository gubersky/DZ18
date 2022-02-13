import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestCart {

    @BeforeMethod
    public void before() {

        Configuration.startMaximized = true;
        open("https://rozetka.com.ua/");
    }

    @Test
    public void testProductCart(){
        new MainPageLogic().clickOnCategory()
                .clickOnLaptopCategory()
                .addProduct();
        Assert.assertEquals(new SearchPageLogic().cartCounterBtn(),"1" );

        new SearchPageLogic().openCart();
        
        Assert.assertEquals(new SearchPageLogic().titleOfFirstProduct(), new CartPageLogic().titleOfProductInCart());
    }

    @AfterMethod
    public void after() {
        closeWebDriver();
    }
}
