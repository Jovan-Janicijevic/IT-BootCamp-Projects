

import java.util.Arrays;

public class GlavniprodavnicaKafe {
    public static void main(String[] args) {
        Kafa kafa1 = new Kafa("3 u 1", 20, new String[]{"instant kafa", "mleko", "šećer"}, 30);
        Kafa kafa2 = new Kafa("Domaća kafa", 200, new String[]{"voda, kafa, secer"}, 150);
        Kafa kafa3 = new Kafa("Filter kafa", 500, new String[]{"mleko", "kafa", "secer"}, 200);

        Kafa[] kafe1 = {kafa1, kafa2, kafa3};
        Kafa[] kafe2 = {kafa1, kafa2};



        Prodavnica prodavnica1 = new Prodavnica(kafe1, "Bulevar Oslobodjenja 5");
        Prodavnica prodavnica2 = new Prodavnica(kafe2, "Cara Dusana 60");


        prodavnica1.kupiKafu(kafa1, 3);
        prodavnica2.kupiKafu(kafa2, 2);
        prodavnica2.kupiKafu(kafa3, 5);
        System.out.println(prodavnica1.getBrojKupljenihProizvoda());
        System.out.println(prodavnica2.getBrojKupljenihProizvoda());

        System.out.println(prodavnica1.getKafe()[0].getCena());
        System.out.println(prodavnica1.getKafe()[1].getCena());
        System.out.println(prodavnica1.getKafe()[2].getCena());
        System.out.println(prodavnica2.getKafe()[0].getCena());
        System.out.println(prodavnica2.getKafe()[1].getCena());

        System.out.println((Prodavnica.najuspesnijaProdavnica( new Prodavnica[] {prodavnica1, prodavnica2})) );

        prodavnica2.popust(20);

        System.out.println(prodavnica1.getKafe()[0].getCena());
        System.out.println(prodavnica1.getKafe()[1].getCena());
        System.out.println(prodavnica1.getKafe()[2].getCena());
        System.out.println(prodavnica2.getKafe()[0].getCena());
        System.out.println(prodavnica2.getKafe()[1].getCena());



    }
}