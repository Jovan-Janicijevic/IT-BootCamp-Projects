
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class JovanJanicijevic {



    /**
     * Napisati funkciju koja za zadati dan u nedelji ispisuje da li je vikend ili radni dan.
     *
     * ponedeljak : radni dan
     * utorak : radni dan
     * subota : vikend
     *
     * @param dan dan u nedelji
     * @return radni dan ili vikend
     */
    public static String daniUNedelji(String dan)
    {
        dan = dan.toLowerCase(Locale.ROOT);
        if(dan.equals("subota"))
        {
            return "vikend";
        }
        if(dan.equals("nedelja"))
        {
            return "vikend";
        }
        return "radni dan";
    }

    /**
     * Napisi funckiju koja nalazi index najmanjeg broja u nizu
     *
     * Funckija se ponasa na sledeci nacin:
     * {1 ,2 ,3 ,4, 5} -> 0
     * {-100, 0, 100, 5, -12345} -> 4
     * {10, 1, -1} -> 2
     * {2, 1} -> 1
     *
     * @param array niz
     * @return index najmanjeg broja
     */
    public static int nadjiIndexNajmanjegBroja(int[] array) {
        int index = 0;
        int najmanji = array[0];

        for (int i = 1; i < array.length; i++)
        {
            if(array[i]<najmanji){
                index = i;
                najmanji = array[i];
            }
        }

        return index;
    }

    /**
     * Napisi funckiju koja nalazi presek 2 niza.
     *
     * Funckija se ponasa na sledeci nacin:
     * {1 ,2 ,3}, {2, 3} -> {2, 3}
     * {2, 7, 9, 10}, {-1, 20, -234, 7} -> {7}
     * {0, 2, 3}, {1, 4, 5} -> {}
     *
     * @param nizA niz A
     * @param nizB niz B
     * @return presek nizova A i B
     */
    public static int[] nadjiPresekNizova(int[] nizA, int[] nizB) {
        ArrayList<Integer> presek = new ArrayList<>();
        for (int i = 0; i < nizA.length; i++) {
            for (int j = 0; j < nizB.length; j++) {
                if(nizA[i]==nizB[j])
                {
                    presek.add(nizA[i]);
                }
            }
        }
        int[] presekNiz = new int[presek.size()];
        for (int i = 0; i < presekNiz.length; i++) {
            presekNiz[i] = presek.get(i);
        }
        return presekNiz;
    }

    /**
     * Ovde mozete testirati svoj kod pozivajuci funkcije.
     * Kod koji budete pisali u main() metodi sluzi da potvrdi da vasa metoda radi kao sto je predvidjeno.
     * @param args args
     */
    public static void main(String[] args) {
        System.out.println(daniUNedelji("nedelja"));
        System.out.println(daniUNedelji("ponedeljak"));
        System.out.println(daniUNedelji("subota"));

        System.out.println(nadjiIndexNajmanjegBroja(new int[]{5,10,15,-5}));
        System.out.println(nadjiIndexNajmanjegBroja(new int[]{5,10,15,5}));
        System.out.println(nadjiIndexNajmanjegBroja(new int[]{5,-10,15}));

        System.out.println(Arrays.toString(nadjiPresekNizova(new int[]{1,2,3,4,5}, new int[]{1,2})));
        System.out.println(Arrays.toString(nadjiPresekNizova(new int[]{1,2,3,4,5}, new int[]{1,2,5,6,7})));
        System.out.println(Arrays.toString(nadjiPresekNizova(new int[]{1}, new int[]{1,2})));
    }
}