package sk.kosickaakademia.unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {
   private TestClass tc;

    @BeforeEach
    void setUp() {
        System.out.println("Test started");
        tc =new TestClass();
    }

    @AfterEach
    void tearDown() {
        tc=null;
        System.out.println("Test finished");
    }

    @Test
    void terminovanyVklad() {
        assertEquals(1100, tc.terminovanyVklad(1000,10,1,false));
        assertEquals(1080, tc.terminovanyVklad(1000,10,1,true));

        assertEquals(1331, tc.terminovanyVklad(1000,10,3,false));
        assertEquals(1259.71, tc.terminovanyVklad(1000,10,3,true));

        assertEquals(0, tc.terminovanyVklad(0,80,30,false));
        assertEquals(123, tc.terminovanyVklad(123,0,15,true));

        assertEquals(10000, tc.terminovanyVklad(10000,0,30,false));
        assertEquals(101.2, tc.terminovanyVklad(100,1.50,1,true));

        assertEquals(0, tc.terminovanyVklad(-15478,14,30,false));
        assertEquals(0, tc.terminovanyVklad(12365,1.50,-2,true));

        assertEquals(1500, tc.terminovanyVklad(500,250,1,true));

    }

    public double priceForTransport(int distance, double consumption, double petrolPrice){
        // metoda prijme vzdialenost ktoru chceme autom prejst,
        // potrebu auta v litroch/100 km a cenu za 1 l paliva
        // metoda vrati cenu , kolko nas bude dana cena za palivo stat
        // nezabudnite osetrit nulove a zaporne vstupy
        // priklad: 450 km, 5.5 l/100km, cena 1.25 l benzinu
        // vysledok: 30,94

        return 0;
    }

}