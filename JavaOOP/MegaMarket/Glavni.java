package MegaMarket;

public class Glavni {
    public static void main(String[] args) {
        Proizvod p1 = new Prehrambeni("475sdi7","mleko",100, 2021,12,30);
        Proizvod p2 = new Tehnika("345kh3","sporet",35000,5,40);
        Proizvod p3 = new AlkoholnaPica("654k33","pivo",120,"staklena",10);
        Proizvod p4 = new Pice("774gg","sok breskva",200,"kartonska");

        Proizvod [] nizProizvoda = {p1, p2, p3, p4};

        for (Proizvod pr: nizProizvoda) {
            if (pr instanceof AlkoholnaPica){
                pr.setCena(pr.getCena()- (pr.getCena()*0.5));
            }
            if (pr.getCena()>200){
                pr.setCena(pr.getCena()-(pr.getCena()*0.15));
            }
            System.out.println(pr.toString());
        }
    p1.poruci(5);
    p2.poruci(2);
    p3.poruci(1);
    p4.poruci(10);
    }

}