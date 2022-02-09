package MegaMarket;

public class Pice extends Proizvod {
    private String ambalaza; //{"kartonska", "plasticna", "staklena", "limenka"};

    public Pice(String barKod, String naziv, double cena, String ambalaza) {
        super(barKod, naziv, cena);
        this.ambalaza = ambalaza;

    }

    public String getAmbalaza() {
        return ambalaza;
    }

    public void setAmbalaza(String ambalaza) {
        this.ambalaza = ambalaza;
    }

    @Override
    public void poruci(int kolicina) {

  double cenaAmbalaze=0;


        if(this.ambalaza.equals("kartonska"))

    {
        cenaAmbalaze = getCena() * 0.1;
    }
        else if(this.ambalaza.equals("plasticna"))

    {
         cenaAmbalaze = getCena() * 0.2;
    }
         else if(this.ambalaza.equals("staklena")||(this.ambalaza.equals("limena")))

    {
         cenaAmbalaze = getCena() * 0.3;
    }
        else

    {
        System.out.println("Neevalidan unos");

    }

        System.out.println((getCena()+cenaAmbalaze));

}
    }

