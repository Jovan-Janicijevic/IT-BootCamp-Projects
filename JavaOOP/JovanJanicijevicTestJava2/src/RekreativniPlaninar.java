public class RekreativniPlaninar extends Planinar {

    private int tezinaOpreme;
    private String nazivOkruga;
    private int maxUspon;

    public RekreativniPlaninar(int identBroj, String imeIPrezime, int brojPoena,
                               int tezinaOpreme, String nazivOkruga, int maxUspon  ) {
        super(identBroj, imeIPrezime, brojPoena);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;

    }

    @Override
    public double dajClanarinuPlaninara() {
        return 1000.0;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        int maxMoze = maxUspon - this.tezinaOpreme*50;
        if (p.getVisina()>maxMoze) {
            return false;
        }
        this.setBrojPoena(this.getBrojPoena()+1);
        return true;
    }

    @Override
    public String toString() {
        return "RekreativniPlaninar{" +
                "tezinaOpreme=" + tezinaOpreme +
                ", nazivOkruga='" + nazivOkruga + '\'' +
                ", maxUspon=" + maxUspon +
                "} " + super.toString();
    }
}
