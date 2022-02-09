import java.util.ArrayList;

public class PlaninarskiDom {

    private String nazivDoma;
    private int godinaOsnivanja;
    ArrayList<Planinar> planinari;

    public PlaninarskiDom() {
    }

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja, ArrayList<Planinar> planinari) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.planinari = planinari;
    }

    public void uclaniPlaninara(Planinar p) {
         planinari.add(p);
    }

    public int dajUspesneBrojPlaninara(Planina p) {

        int brojUspesnih = 0;

        for (Planinar planinar: planinari
             ) {

            if (planinar instanceof Alpinista) {
                if (p.getVisina() < 4000) {
                    brojUspesnih++;
                }
                continue;
            }
            if (planinar instanceof RekreativniPlaninar) {

                RekreativniPlaninar
                        r = (RekreativniPlaninar) planinar;

                if (r.uspesanUspon(p)) {
                    brojUspesnih++;
                }
                continue;
            }

        }



        return brojUspesnih;
    }

    public void izbaciPlaninara(int identBroj) {

        for (Planinar planinar : planinari
        ) {

            if (planinar.getIdentBroj() == identBroj) {
                planinari.remove(planinar);
                break;
            }

        }

    }

    public Double dajMesecniPrihodOdSvih() {

        Double mesecniPrihod = 0.0;

        for (Planinar planinar : planinari
        ) {

            mesecniPrihod = mesecniPrihod + planinar.dajClanarinuPlaninara();

        }

        return mesecniPrihod;
    }

    public void sortirajPlaninare(Planina p) {

    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setPlaninari(ArrayList<Planinar> planinari) {
        this.planinari = planinari;
    }


    @Override
    public String toString() {
        return "PlaninarskiDom{" +
                "nazivDoma='" + nazivDoma + '\'' +
                ", godinaOsnivanja=" + godinaOsnivanja +
                ", planinari=" + planinari +
                '}';
    }

}
