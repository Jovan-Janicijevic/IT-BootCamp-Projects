import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Planinar> planinari = new ArrayList<>();
        Alpinista a1 = new Alpinista(1,"Pera Peric",0);
        Alpinista a2 = new Alpinista(2,"Pera Matic",0);
        Alpinista a3 = new Alpinista(3,"Pera Mikic",0);

        RekreativniPlaninar r1 = new RekreativniPlaninar(10,"Sima Simic",0,10,"Novi Sad",2000);
        RekreativniPlaninar r2 = new RekreativniPlaninar(11,"Sima Peric",0,15,"Novi Sad",2500);
        RekreativniPlaninar r3 = new RekreativniPlaninar(12,"Sima Zikic",0,20,"Novi Sad",3000);

        Planina planina = new Planina("Tara","Srbija",3300);

        PlaninarskiDom planinarskiDom = new PlaninarskiDom("Fruska Gora",1978,planinari);

        planinarskiDom.uclaniPlaninara(a1);
        planinarskiDom.uclaniPlaninara(a2);
        planinarskiDom.uclaniPlaninara(a3);
        planinarskiDom.uclaniPlaninara(r1);
        planinarskiDom.uclaniPlaninara(r2);
        planinarskiDom.uclaniPlaninara(r3);


        System.out.println("Pre penjanja na planinu = "+planinari);

        a1.uspesanUspon(planina);
        a2.uspesanUspon(planina);
        a3.uspesanUspon(planina);
        r1.uspesanUspon(planina);
        r2.uspesanUspon(planina);
        r3.uspesanUspon(planina);

        System.out.println("Posle penjanja na planianu = "+planinarskiDom.getPlaninari());

        System.out.println("Broj uspesnih = "+planinarskiDom.dajUspesneBrojPlaninara(planina));

        System.out.println("Lista planinara pre izbacivanja = "+planinarskiDom.getPlaninari());

        System.out.println("Lista planinara = "+planinarskiDom.getPlaninari());

        planinarskiDom.izbaciPlaninara(10);

        System.out.println("Lista planinara posle izbacivanja= "+planinarskiDom.getPlaninari());

        System.out.println("Meecni prihod svih clanova doma "+planinarskiDom.dajMesecniPrihodOdSvih());

        System.out.println("Podaci o domu i svi clanovi doma "+planinarskiDom.toString());




    }

}

