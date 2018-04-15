package pl.edu.ur.oopl6.zad3;

import java.util.*;

public class Complex {
    double re,im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(double a){
        this.re = a;
        this.im = 0.0;
    }


    public static Complex modul(Complex c) {
        return new Complex(Math.hypot(c.re,c.im));
    }

    public static Complex sprzezenie(Complex c1){
        return new Complex(c1.re,(c1.im)*(-1));
    }

    public static Complex sumaA(Complex c1,Complex c2){
        return new Complex(c1.re+c2.re,c1.im+c2.im);
    }

    public static Complex roznicaA(Complex c1,Complex c2){
        return new Complex(c1.re-c2.re,c1.im-c2.im);
    }

    public static Complex iloczynA(Complex c1,Complex c2){
        return new Complex((c1.re*c2.re)-(c1.im*c2.im),(c1.re*c2.im)+(c1.im*c2.re));
    }

    public static Complex ilorazA(Complex c1,Complex c2){
        return new Complex((c1.re*c2.re+c1.im*c2.im)/(c2.re*c2.re+c2.im*c2.im),(c1.im*c2.re-c1.re*c2.im)/(c2.re*c2.re+c2.im*c2.im));
    }



    public static Complex naWykladnicza(Complex c1){
        double modul = Math.hypot(c1.re, c1.im);
        double sinFi = c1.re/modul;
        double cosFi = c1.im/modul;

        return new Complex(sinFi, cosFi);
        //niedokonczone
    }

    @Override
    public String toString(){
        return "[" + " re:" + re + " im:" + im + "i ]";
    }


    public static void main(String [] argv){
        Complex c1 = new Complex(7,11);
        Complex c2 = new Complex(4,2);

        System.out.println("\nModuł z\t"+c1+"\t= "+modul(c1));
        System.out.println("Suma\t"+c1+"\toraz\t"+c2+"\t= "+sumaA(c1,c2));
        System.out.println("Różnica\t"+c1+"\toraz\t"+c2+"\t= "+roznicaA(c1,c2));
        System.out.println("Iloczyn\t"+c1+"\toraz\t"+c2+"\t= "+iloczynA(c1,c2));
        System.out.println("Iloraz\t"+c1+"\toraz\t"+c2+"\t= "+ilorazA(c1,c2));
        System.out.println("Sprzezenie\t"+c1+"\t= "+sprzezenie(c1));
        System.out.println("Wykladnicza\t"+c1+"\t= "+naWykladnicza(c1));
    }
}