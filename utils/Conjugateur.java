package fr.geoffrey.classeobjettp11.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conjugateur {

    private static final String SUFFIXE_ER = "er";
    private static final String[] PRONOMS = {"je", "tu", "il", "nous", "vous", "elles"};
    private static final String[] SUFFIXES = {"e", "es", "e", "ons", "ez", "ent"};


    public void conjugeVerbe(String verbe) {


        verbe = verbe.substring(0, verbe.length() - 2);
        for (int i = 0; i < 6; i++) {
            String verbes = (verbe + SUFFIXES[i]);
            System.out.println(PRONOMS[i] + " " + verbes);
        }
        System.out.println();
    }

    public void checkVerbe(String VerbeUtilisateur) {

        if (!VerbeUtilisateur.endsWith(SUFFIXE_ER)) {
            System.out.println("Veuillez choisir un verbe du premier groupe");
        } else {
            conjugeVerbe(VerbeUtilisateur);
        }
    }

    public void conjugeVerbeList(){
        List<String> listVerbe = new ArrayList<>();
        listVerbe = Arrays.asList("manger", "aider","aimer","ajouter","exister");
        System.out.println(listVerbe);

        for(String item:listVerbe){
            conjugeVerbe(item);
            System.out.println();
        }
    }
}


