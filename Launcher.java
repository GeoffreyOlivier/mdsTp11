package fr.geoffrey.classeobjettp11;

import fr.geoffrey.classeobjettp11.utils.Conjugateur;


import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Taper un mot");
        String verbeChoisi = sc.nextLine();

        Conjugateur conjugeList = new Conjugateur();

        // conjuge le mot choisi
        conjugeList.checkVerbe(verbeChoisi);
        //conjuge ma liste
        conjugeList.conjugeVerbeList();
    }




}
