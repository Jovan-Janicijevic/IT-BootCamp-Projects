package MegaMarket;

import java.time.LocalDate;
import java.util.Date;

public class Prehrambeni extends Proizvod{
    private LocalDate datumIsteka;

    public Prehrambeni(String barKod, String naziv, double cena, int god, int mesec, int dan) {
        super(barKod, naziv, cena);
        this.datumIsteka=LocalDate.of(god, mesec, dan);
    }

    public LocalDate getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(LocalDate datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    @Override
    public void poruci(int kolicina) {
    if((this.datumIsteka.compareTo(LocalDate.now())<0)) {
        System.out.println("Datum istekao");
    }
    else {
        double racun= getCena()*kolicina;
        System.out.println("Vaš račun je " + racun);
    }

        }
    }

