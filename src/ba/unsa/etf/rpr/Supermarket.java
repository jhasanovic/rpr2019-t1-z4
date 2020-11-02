package ba.unsa.etf.rpr;
public class Supermarket {
    Artikl[] supermarket = new Artikl[1000];
    int trenutniBrojArtikala;

    public void dodajArtikl(Artikl a) {
        //ovdje dodati nesto ako se premasi broj artikala od 1000
        supermarket[trenutniBrojArtikala] = a;
        trenutniBrojArtikala = trenutniBrojArtikala + 1;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < trenutniBrojArtikala; i++) {
            if (supermarket[i].getKod().equals(kod)) {
                Artikl vrati = supermarket[i];
                supermarket[i] = null;
                trenutniBrojArtikala = trenutniBrojArtikala - 1;
                return vrati;
            }
        }
        return null;
    }

    public Artikl[] getArtikli() {
        return supermarket;
    }
}