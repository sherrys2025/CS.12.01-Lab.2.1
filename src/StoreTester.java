import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class StoreTester {
    @Test
    void addBookTest(){
        Store store = new Store();
        Book book1 = new Book();
        store.addBook(book1);
        assertTrue(true);
    }

    @Test
    void addBookAndPhone(){
        Store store = new Store();
        Book book1 = new Book();
        Phone phone1 = new Phone();
        store.addBook(book1);
        store.addPhone(phone1);
        assertTrue(true);
    }

    @Test
    void addAllTypesOfItems(){
        Store store = new Store();
        Book book1 = new Book();
        Phone phone1 = new Phone();
        Magazine magazine1 = new Magazine();
        Arduino arduino1 = new Arduino();
        store.addBook(book1);
        store.addPhone(phone1);
        store.addMagazine(magazine1);
        store.addArduino(arduino1);
        assertTrue(true);
    }

    @Test
    void updatePhonesLocationAndGetAllPhones(){
        Store store = new Store();
        for (int i = 0; i < 100; i++) {
            store.addPhone(new Phone());
        }
        store.updatePhonesLocation("Room 514");
        ArrayList<Phone> phones = store.getAllPhones();
        for(Phone p: phones){
            assertEquals(p.getLocation(), "Room 514");
        }
    }

    @Test
    void getItems(){
        Store store = new Store();
        for (int i = 0; i < 100; i++) {
            store.addPhone(new Phone());
            store.addBook(new Book());
            store.addMagazine(new Magazine());
            store.addArduino(new Arduino());
        }

        //phone
        ArrayList<CISItem> phones1 = store.getItems("phone");
        ArrayList<CISItem> phones2 = store.getItems("Phone");
        ArrayList<CISItem> phones3 = store.getItems("pHonE");
        assertEquals(phones1.size(), 100);
        assertEquals(phones2.size(), 100);
        assertEquals(phones3.size(), 100);
        assertEquals(phones1, phones2);
        assertEquals(phones2, phones3);
        for (CISItem item: phones1) {
            assertTrue(item instanceof Phone);
        }

        //Magazine
        ArrayList<CISItem> magazine1 = store.getItems("magazine");
        ArrayList<CISItem> magazine2 = store.getItems("Magazine");
        ArrayList<CISItem> magazine3 = store.getItems("mAgaZinE");
        assertEquals(magazine1.size(), 100);
        assertEquals(magazine2.size(), 100);
        assertEquals(magazine3.size(), 100);
        assertEquals(magazine1, magazine2);
        assertEquals(magazine2, magazine3);
        for (CISItem item: magazine1) {
            assertTrue(item instanceof Magazine);
        }

        //Arduino
        ArrayList<CISItem> arduino1 = store.getItems("arduino");
        ArrayList<CISItem> arduino2 = store.getItems("ARDUINO");
        ArrayList<CISItem> arduino3 = store.getItems("arDuiNo");
        assertEquals(arduino1.size(), 100);
        assertEquals(arduino2.size(), 100);
        assertEquals(arduino3.size(), 100);
        assertEquals(arduino1, arduino2);
        assertEquals(arduino2, arduino3);
        for (CISItem item: arduino1) {
            assertTrue(item instanceof Arduino);
        }

        //Book
        ArrayList<CISItem> book1 = store.getItems("book");
        ArrayList<CISItem> book2 = store.getItems("BOOK");
        ArrayList<CISItem> book3 = store.getItems("bOoK");
        assertEquals(book1.size(), 100);
        assertEquals(book2.size(), 100);
        assertEquals(book3.size(), 100);
        assertEquals(book1, book2);
        assertEquals(book2, book3);
        for (CISItem item: book1) {
            assertTrue(item instanceof Book);
        }
    }

    @Test
    void updateItems(){
        Store store = new Store();
        for (int i = 0; i < 100; i++) {
            store.addPhone(new Phone());
            store.addBook(new Book());
            store.addMagazine(new Magazine());
            store.addArduino(new Arduino());
        }

        //phone + location (superclass field)
        store.updateItems("phone", "location", "Room 513");
        ArrayList<CISItem> phones = store.getItems("phone");
        for (CISItem item: phones) {
            assertEquals(item.getLocation(), "Room 513");
        }

        //magazine + wordCount
        store.updateItems("magazine", "wordCount", "5");
        ArrayList<CISItem> magazine = store.getItems("magazine");
        for (CISItem item: magazine) {
            assertEquals(((Magazine) item).getWordCount(), 5);
        }

        //Arduino + version (subclass field)
        store.updateItems("ARDUINO", "version", "8.2");
        ArrayList<CISItem> arduinos = store.getItems("arduino");
        for (CISItem item: arduinos) {
            assertEquals(((Arduino) item).getVersion(), "8.2");
        }

        //overriding magazine wordCount with 1000
        store.updateItems("magazine", "wordCount", "1000");
        magazine = store.getItems("magazine");
        for (CISItem item: magazine) {
            assertEquals(((Magazine) item).getWordCount(), 1000);
        }

        //invalid property
        store.updateItems("magazine", "wordCounts", "10");
        assertTrue(true);

        //invalid item type
        store.updateItems("magazines", "wordCount", "10");
        assertTrue(true);

        //nothing else impacted
        for (CISItem item: magazine) {
            assertEquals(((Magazine) item).getAuthor(), null);
        }
        ArrayList<CISItem> books = store.getItems("book");
        for (CISItem item: books) {
            assertEquals(((Book) item).getWordCount(), 0);
        }
    }

    @Test
    void showAllInfo(){
        Store store = new Store();
        for (int i = 0; i < 10; i++) {
            store.addPhone(new Phone());
            store.addBook(new Book());
            store.addMagazine(new Magazine());
            store.addArduino(new Arduino());
        }
        store.showAllInfo();

        System.out.println("\n\n\n\n");

        store.updateItems("magazine", "wordCount", "5");
        store.updateItems("phone", "location", "Room 513");
        store.showAllInfo();
    }


}
