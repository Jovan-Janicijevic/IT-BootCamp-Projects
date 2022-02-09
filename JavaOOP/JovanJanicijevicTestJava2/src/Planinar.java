public abstract class Planinar {

    private int identBroj;
    private String imeIPrezime;
    private int brojPoena;

    public Planinar(int identBroj, String imeIPrezime, int brojPoena) {
        this.identBroj = identBroj;
        this.imeIPrezime = imeIPrezime;
        this.brojPoena = brojPoena;
    }

    public int getIdentBroj() {
        return identBroj;
    }

    public void setIdentBroj(int identBroj) {
        this.identBroj = identBroj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public abstract double dajClanarinuPlaninara();

    public abstract boolean uspesanUspon(Planina p);

    @Override
    public String toString() {
        return "Planinar{" +
                "identBroj=" + identBroj +
                ", imeIPrezime='" + imeIPrezime + '\'' +
                ", brojPoena=" + brojPoena +
                '}';
    }


}
