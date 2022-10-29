package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double tutar = 0;
    Scanner fiyat = new Scanner(System.in);

        System.out.println("Fiyati giriniz: ");
        tutar=fiyat.nextDouble();

         if(tutar<1000){
            double KDV=0.18;
            double kdvTutar = tutar * KDV ;
            double kdvTutarToplam = tutar + kdvTutar;

            System.out.println("KDV'siz fiyat: " +tutar);
            System.out.println("KDV'li fiyat: "+kdvTutarToplam);
            System.out.println("KDV tutari: " +kdvTutar);
        }
        else{
            double KDV=0.08;
            double kdvTutar = tutar * KDV ;
            double kdvTutarToplam = tutar + kdvTutar;

            System.out.println("KDV'siz fiyat: " +tutar);
            System.out.println("KDV'li fiyat: "+kdvTutarToplam);
            System.out.println("KDV tutari: " +kdvTutar);
        }

    }
}
