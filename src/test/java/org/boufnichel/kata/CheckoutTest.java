
package org.boufnichel.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutTest {

    @Test
    @DisplayName("Init bag")
    void test_simple_item() {
        Bag bag = new Bag("Cornflex::50#Milka::10");
        assertEquals(60, bag.calculate());
    }

    @Test
    @DisplayName("Quantity")
    void test_simple_item_quantity() {
        Bag bag = new Bag("Cornflex:2:50#Milka:1:10");
        assertEquals(110, bag.calculate());
    }

    @Test
    @DisplayName("Tva")
    void test_tva() {
        Bag bag = new Bag("Cornflex:2:50#Milka:1:10#TVA:20");
        assertEquals(132, bag.calculate());
    }

    @Test
    @DisplayName("Add to bag")
    void test_add() {
        Bag bag = new Bag("Cornflex:2:50#Milka:1:10#TVA:20");
        assertEquals(132, bag.calculate());
        bag.add("Lait:3:3.5");
        assertEquals(144.6, bag.calculate());
        bag.add("Cornflex:1:50");
        assertEquals(204.6, bag.calculate());
    }

    @Test
    @DisplayName("clear bag")
    void test_clear_bag() {
        Bag bag = new Bag("Cornflex:2:50#Milka:1:10#TVA:20");
        assertEquals(2, bag.count());
        bag.clear();
        assertEquals(0, bag.count());
    }

    @Test
    @DisplayName("By unit items")
    void test_byunit_sellable_item() {
        Bag bag = new Bag("Cornflex:2:50#Milka:1:10#TVA:20");
        assertEquals(2, bag.count());
        assertEquals(132, bag.calculate());
        bag.add("Chebakiya:200g:100"); // Chebakiya 100 dh / Kg
        assertEquals(156, bag.calculate());
    }

}
