package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] korpa=new Artikl[50];
    int trenutniBrojArtikalaUKorpi;

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0;i<trenutniBrojArtikalaUKorpi;i++){
            suma=suma+korpa[i].getCijena();
        }
        return suma;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0;i<trenutniBrojArtikalaUKorpi;i++){
            if(korpa[i].getKod().equals(kod)){
                Artikl vrati=korpa[i];
                korpa[i]=null;
                trenutniBrojArtikalaUKorpi = trenutniBrojArtikalaUKorpi-1;
                return vrati;
            }
        }
        return null;
    }

    public Artikl[] getArtikli() {
        return korpa;
    }

    public boolean dodajArtikl(Artikl a) {
        if(trenutniBrojArtikalaUKorpi==50) return false;
        korpa[trenutniBrojArtikalaUKorpi]=a;
        trenutniBrojArtikalaUKorpi = trenutniBrojArtikalaUKorpi+1;
        return true;
    }
}
