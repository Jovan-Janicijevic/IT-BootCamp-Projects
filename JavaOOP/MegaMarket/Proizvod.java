package MegaMarket;
//Zahtevi:
//        - Za SVAKI PROIZVOD se moze promeniti cena na cenu sa odredjenim popustom.
//        (setPopust)
//        - Svaki proizvod mora da ima metodu poruci kojoj se prosledjuje parameter kolicina.
//        Metoda poruci radi razlicito u zavisnosti koji je proizvod u pitanju.- Za Tehniku metoda poruci ,ako je tezina veca od 30, ispisuje poruku “Dostava do
//        vrata” a zatim ispisuje “Vas racun je : ...racuna racun kao cena * kolicina
//        - Za Prehrambeni metoda poruci proverava da li je prosao datum isteka , ako jeste
//        ispisuje Datum istekao!!! U suprotnom ispisuje Vas racun je: racuna ... cena *
//        kolicina
//        - Za pice metoda poruci ispisuje racun Vas racun je : (osnovna cena + cena ambalaze
//        )* kolicina. Cena ambalaze se racuna na sledeci nacin :
//        o "kartonska" 10 % osnovne cene proizvoda ,
//        o "plasticna" 20% osnovne cene proizvoda,
//        o "staklena" 30% osnovne cene proizvoda,
//        o "limenka" 30% osnovne cene proizvoda.
//        - Dodati toString metodu za Proizvod koja ispisuje naziv I cenu.
public abstract class Proizvod {
    private String barKod;
    private String naziv;
    private double cena;

    public Proizvod(String barKod, String naziv, double cena) {//konstruktor
        this.barKod = barKod;
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getBarKod() {//geter
        return barKod;
    }

    public String getNaziv() {//geter
        return naziv;
    }

    public double getCena() {//geter
        return cena;
    }

    public void setBarKod(String barKod) {//seter
        this.barKod = barKod;
    }

    public void setNaziv(String naziv) {//seter
        this.naziv = naziv;
    }

    public void setCena(double cena) {//seter
        this.cena = cena;
    }
    public double setPopust(int procenat ){
     double novacena= getCena()-(getCena()*procenat/100);
     return novacena;
    }
    public abstract void poruci(int kolicina);

    @Override
    public String toString() {
        return "Proizvod{" +
                ", naziv='" + naziv + '\'' +
                ", cena=" + cena +
                '}';
    }
}
