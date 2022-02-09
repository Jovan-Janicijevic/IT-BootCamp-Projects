public class Alpinista extends Planinar {


    public Alpinista(int identBroj, String imeIPrezime, int brojPoena) {
        super(identBroj, imeIPrezime, brojPoena);
    }

    @Override
    public double dajClanarinuPlaninara() {

        double popust = this.getBrojPoena()*0.05;

        return 1500.0-1500.0*popust;

    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if (p.getVisina()>4000) {
            return false;
        }
        this.setBrojPoena(this.getBrojPoena()+1);
        return true;
    }

    @Override
    public String toString() {
        return "Alpinista { " + super.toString() + "}";
    }
}
