package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a=new Artikl("nesto",100,"123");
        assertEquals("nesto",a.getNaziv());
    }

    @Test
    void getKod() {
        Artikl a=new Artikl("nesto",100,"123");
        assertEquals("123",a.getKod());
    }

    @Test
    void getCijena() {
        Artikl a=new Artikl("nesto",100,"123");
        assertEquals(100,a.getCijena());
    }

    @Test
    void setNaziv() {
        Artikl a=new Artikl("nesto",100,"123");
        a.setNaziv("promjena");
        assertEquals("promjena",a.getNaziv());
    }

    @Test
    void setKod() {
        Artikl a=new Artikl("nesto",100,"123");
        a.setKod("111");
        assertEquals("111",a.getKod());
    }

    @Test
    void setCijena() {
        Artikl a=new Artikl("nesto",100,"123");
        a.setCijena(12345);
        assertEquals(12345,a.getCijena());
    }
}