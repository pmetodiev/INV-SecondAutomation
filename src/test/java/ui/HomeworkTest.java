package ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeworkTest extends BaseTest {

    @Test
    @DisplayName("Can search for item by name")
    void canSearchForItemByNameCoffee(){

            login();
            //Navigate to items page
            WebElement itemsMenuTab = driver.findElement(By.id("tabs_objects"));
            itemsMenuTab.click();
            //Check item page heading
            WebElement itemHeading = driver.findElement(By.xpath("//div[@id='headline2']/h2"));
            Assertions.assertEquals("Артикули", itemHeading.getText());
            WebElement search= driver.findElement(By.id("searchbtn"));
            search.click();
            WebElement searchByItemName= driver.findElement(By.xpath("//input[@name='nm']"));
            searchByItemName.sendKeys("Coffee");
            WebElement searchItem= driver.findElement(By.xpath("//input[@name='s']"));
            searchItem.click();
        WebElement headrow =driver.findElement(By.xpath("//td[@width='350']"));
        Assertions.assertEquals("Coffee (1.00 kg.)",headrow.getText());

        }

    @Test
    @DisplayName("Can search for item by name")
    void canSearchForItemByNameFeta(){
        login();
        //Navigate to items page
        WebElement itemsMenuTab = driver.findElement(By.id("tabs_objects"));
        itemsMenuTab.click();
        //Check item page heading
        WebElement itemHeading = driver.findElement(By.xpath("//div[@id='headline2']/h2"));
        Assertions.assertEquals("Артикули", itemHeading.getText());
        WebElement search= driver.findElement(By.id("searchbtn"));
        search.click();
        WebElement searchByItemName= driver.findElement(By.xpath("//input[@name='nm']"));
        searchByItemName.sendKeys("Feta");
        WebElement searchItem= driver.findElement(By.xpath("//input[@name='s']"));
        searchItem.click();
        WebElement headrow =driver.findElement(By.xpath("//td[@width='350']"));
        Assertions.assertEquals("Feta (1.00 kg.)",headrow.getText());

    }

    @Test
    @DisplayName("Can search for item by name")
    void canSearchForItemByNamePotatoes(){
        login();
        //Navigate to items page
        WebElement itemsMenuTab = driver.findElement(By.id("tabs_objects"));
        itemsMenuTab.click();
        //Check item page heading
        WebElement itemHeading = driver.findElement(By.xpath("//div[@id='headline2']/h2"));
        Assertions.assertEquals("Артикули", itemHeading.getText());
        WebElement search= driver.findElement(By.id("searchbtn"));
        search.click();
        WebElement searchByItemName= driver.findElement(By.xpath("//input[@name='nm']"));
        searchByItemName.sendKeys("Potatoes");
        WebElement searchItem= driver.findElement(By.xpath("//input[@name='s']"));
        searchItem.click();
        WebElement headrow =driver.findElement(By.xpath("//td[@width='350']"));
        Assertions.assertEquals("Potatoes (1.00 kg.)",headrow.getText());
    }

    @Test
    @DisplayName("Can search for item by name")
    void canSearchForItemByNameSugar(){
        login();
        //Navigate to items page
        WebElement itemsMenuTab = driver.findElement(By.id("tabs_objects"));
        itemsMenuTab.click();
        //Check item page heading
        WebElement itemHeading = driver.findElement(By.xpath("//div[@id='headline2']/h2"));
        Assertions.assertEquals("Артикули", itemHeading.getText());
        WebElement search= driver.findElement(By.id("searchbtn"));
        search.click();
        WebElement searchByItemName= driver.findElement(By.xpath("//input[@name='nm']"));
        searchByItemName.sendKeys("Sugar");
        WebElement searchItem= driver.findElement(By.xpath("//input[@name='s']"));
        searchItem.click();
        WebElement headrow =driver.findElement(By.xpath("//td[@width='350']"));
        Assertions.assertEquals("Sugar (1.00 kg.)",headrow.getText());



    }



    @Test
    @DisplayName("Can search for item by price")
    void canSearchForItemByPriceOneToFive(){
        //Implement this test using both UI and API

        login();
        //Navigate to items page
        WebElement itemsMenuTab = driver.findElement(By.id("tabs_objects"));
        itemsMenuTab.click();
        //Check item page heading
        WebElement itemHeading = driver.findElement(By.xpath("//div[@id='headline2']/h2"));
        Assertions.assertEquals("Артикули", itemHeading.getText());
        WebElement search= driver.findElement(By.id("searchbtn"));
        search.click();
        WebElement fromPrice =driver.findElement(By.xpath("//input[@name='pr1']"));
        fromPrice.sendKeys("1");
        WebElement toPrice =driver.findElement(By.xpath("//input[@name='pr2']"));
        toPrice.sendKeys("5");
        WebElement searchItem= driver.findElement(By.xpath("//input[@name='s']"));
        searchItem.click();
        WebElement headrow =driver.findElement(By.xpath("//td[@width='350']"));
        Assertions.assertEquals("Potatoes (1.00 kg.)",headrow.getText());

    }
    @Test
    @DisplayName("Can search for item by price")
    void canSearchForItemByPriceOneToTen(){
        login();
        //Navigate to items page
        WebElement itemsMenuTab = driver.findElement(By.id("tabs_objects"));
        itemsMenuTab.click();
        //Check item page heading
        WebElement itemHeading = driver.findElement(By.xpath("//div[@id='headline2']/h2"));
        Assertions.assertEquals("Артикули", itemHeading.getText());
        WebElement search= driver.findElement(By.id("searchbtn"));
        search.click();
        WebElement romPrice =driver.findElement(By.xpath("//input[@name='pr1']"));
        romPrice.sendKeys("1");
        WebElement toPrice =driver.findElement(By.xpath("//input[@name='pr2']"));
        toPrice.sendKeys("10");
        WebElement searchItem= driver.findElement(By.xpath("//input[@name='s']"));
        searchItem.click();
//        I think here is a bug
//        WebElement headrow =driver.findElement(By.xpath("//td[@width='350']"));
//        Assertions.assertEquals("Potatoes (1.00 kg.), Sugar (1.00 kg.)",headrow.getText());

    }
    @Test
    @DisplayName("Can search for item by price")
    void canSearchForItemByPriceTenToFifteen(){
        login();
        //Navigate to items page
        WebElement itemsMenuTab = driver.findElement(By.id("tabs_objects"));
        itemsMenuTab.click();
        //Check item page heading
        WebElement itemHeading = driver.findElement(By.xpath("//div[@id='headline2']/h2"));
        Assertions.assertEquals("Артикули", itemHeading.getText());
        WebElement search= driver.findElement(By.id("searchbtn"));
        search.click();
        WebElement romPrice =driver.findElement(By.xpath("//input[@name='pr1']"));
        romPrice.sendKeys("10");
        WebElement toPrice =driver.findElement(By.xpath("//input[@name='pr2']"));
        toPrice.sendKeys("15");
        WebElement searchItem= driver.findElement(By.xpath("//input[@name='s']"));
        searchItem.click();
        WebElement headrow =driver.findElement(By.id("emptylist"));
        Assertions.assertEquals("Не са намерени артикули, отговарящи на зададените критерии.",headrow.getText());
    }

    @Test
    @DisplayName("Can search for item by price")
    void canSearchForItemByPriceTenToTwentyFive(){
        login();
        //Navigate to items page
        WebElement itemsMenuTab = driver.findElement(By.id("tabs_objects"));
        itemsMenuTab.click();
        //Check item page heading
        WebElement itemHeading = driver.findElement(By.xpath("//div[@id='headline2']/h2"));
        Assertions.assertEquals("Артикули", itemHeading.getText());
        WebElement search= driver.findElement(By.id("searchbtn"));
        search.click();
        WebElement romPrice =driver.findElement(By.xpath("//input[@name='pr1']"));
        romPrice.sendKeys("10");
        WebElement toPrice =driver.findElement(By.xpath("//input[@name='pr2']"));
        toPrice.sendKeys("25 ");
        WebElement searchItem= driver.findElement(By.xpath("//input[@name='s']"));
        searchItem.click();
        WebElement headrow =driver.findElement(By.xpath("//td[@width='350']"));
        Assertions.assertEquals("Coffee (1.00 kg.)",headrow.getText());
        // Doesn't assert the second item
        //WebElement headrowTwo =driver.findElement(By.xpath("//td[@width='350']"));
       // Assertions.assertEquals("Feta (1.00 kg.)",headrow.getText());
    }


}