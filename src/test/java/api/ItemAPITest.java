package api;

import api.dto.Item;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.BaseTest;

public class ItemAPITest extends BaseTest {
    ItemAPI itemAPI = new ItemAPI(TOKEN);

    @Test
    @Tag("api")
    @DisplayName("Can get all items")
    void canGetAllItems() {
        Response getAllResp = itemAPI.getAllItems();
        Assertions.assertEquals(200, getAllResp.statusCode());
    }

    @Test
    @Tag("api")
    @DisplayName("Can create item")
    void canCreateItemCoffee() {
        Item beer = Item.builder()
                .name("Coffee")
                .currency("BGN")
                .price(20.50)
                .quantity_unit("kg.")
                .build();
        Response createResp = itemAPI.createItem(beer);
        Assertions.assertEquals(201, createResp.statusCode());
    }

    @Test
    @Tag("api")
    @DisplayName("Can create item")
    void canCreateItemSugar() {
        Item beer = Item.builder()
                .name("Sugar")
                .currency("BGN")
                .price(8.20)
                .quantity_unit("kg.")
                .build();
        Response createResp = itemAPI.createItem(beer);
        Assertions.assertEquals(201, createResp.statusCode());
    }

    @Test
    @Tag("api")
    @DisplayName("Can create item")
    void canCreateItemPotatoes() {
        Item beer = Item.builder()
                .name("Potatoes")
                .currency("BGN")
                .price(3.60)
                .quantity_unit("kg.")
                .build();
        Response createResp = itemAPI.createItem(beer);
        Assertions.assertEquals(201, createResp.statusCode());
    }

    @Test
    @Tag("api")
    @DisplayName("Can create item")
    void canCreateItemFeta() {
        Item beer = Item.builder()
                .name("Feta")
                .currency("BGN")
                .price(18.90)
                .quantity_unit("kg.")
                .build();
        Response createResp = itemAPI.createItem(beer);
        Assertions.assertEquals(201, createResp.statusCode());
    }

    @Test
    @DisplayName("Can delete item")
    @Tag("api")
    void canDeleteItem(){
        Response deleteResp = itemAPI.deleteItem(12);
        itemAPI.getAllItems();
    }

    @Test
    void canDeleteAllItems(){
        itemAPI.deleteAllItems();
    }
}