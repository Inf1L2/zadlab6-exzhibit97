package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }
    /**
     * Metoda statyczna obliczająca pole kwadratu
     */
    public static double PoleKwadratu(double a) { return Math.pow(a, 2);}
    /**
     * Metoda statyczna obliczająca pole prostokata
     */
    public static double PoleProstokata(double a, double b) { return a*b; }
    /**
     * Metoda statyczna obliczająca pole powierzchni stozka
     */
    public static double PoleStozka(double r, double l) { return Math.PI*r*(r+l);}
    /**
     * Metoda statyczna obliczająca pole powierzchni walca
     */
    public static double PoleWalca(double r, double h){ return 2*Math.PI*r*(r+h);}
}
