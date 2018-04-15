package pl.edu.ur.oopl6.zad2;

import java.util.Random;

public class ObjectCounter {
    public static void main(String[] args){
        /*
          Program tworzy 10 punktów (obiektów punkt) nadajac wspolrzednym x, y oraz z wartosci
          z przedziału do 1000. Nastepnie wypisuje wspolrzedne obiektu i numer obiektu klasy Punkt.

         */
        Punkt[] p = new Punkt[10];
        Random r = new Random();
        for (int i = 0; i<10; i++){
            p[i] = new Punkt(r.nextInt(1000), r.nextInt(1000), r.nextInt(1000));
            System.out.println(p[i].toString());
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(Punkt.last_point.toString());
        System.out.println("-------------------------------------------------");
        Punkt.PokazOstatniObiekt();
    }
}
