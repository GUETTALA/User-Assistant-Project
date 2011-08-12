/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.visualassistantfacv;

import java.util.ArrayList;
import java.util.List;
import VisualAssistantFDM.visualisation.ui.Visualisation;

public class CroisementCX_List {

    private boolean isVerified = false;
    /* Initialiser les deux fils */
    List<Visualisation> y1 = new ArrayList<Visualisation>();
    List<Visualisation> y2 = new ArrayList<Visualisation>();

    public CroisementCX_List(List<Visualisation> x1, List<Visualisation> x2){

        
        String[] x1bis = new String[x1.size()];
        List<List<Visualisation>> list = new ArrayList<List<Visualisation>>();

        /* Initialiser les deux première valeurs des premières gènes des fils */
        for(int i=0; i<x1.size(); i++){
        if(i==0){
        y1.add(0, x1.get(i).clone());
        y2.add(0, x2.get(i).clone());
        x1bis[i] = x1.get(i).getName();
        } else {
            y1.add(x1.get(i).cloneVide());
            y2.add(x2.get(i).cloneVide());
            x1bis[i] = "0";
        }
        }

        System.out.print("X1 :");
        for(int i = 0; i<x1.size(); i++){
        System.out.print(x1.get(i).getName()+" ");
        }

        System.out.println();

        System.out.print("X2 :");
        for(int i = 0; i<x2.size(); i++){
        System.out.print(x2.get(i).getName()+" ");
        }

        System.out.println();

        System.out.print("X 1 Bis :");
        for(int n = 0; n<x1bis.length; n++){
        System.out.print(x1bis[n]+", ");
        }
        

        System.out.println();

        /* Initialiser l'indice i qui permet de parcourir les parents */
        int i = 0;
        int j;

        while(!isVerified){
            System.out.print(i);
            System.out.print("  :  "+x2.get(i).getName());
            isVerified = X2iIsVerified(x1bis, x2.get(i).getName().toString());
            System.out.print("  :  "+isVerified);
            j = SelectPosition(x1, x2.get(i).getName());
            System.out.print("  :  "+j);
            x1bis[j] = x1.get(j).getName();
            y1.add(j, x1.get(j).clone());
            y1.remove(j+1);
            y2.add(j, x2.get(j).clone());
            y2.remove(j+1);
            System.out.println();
            System.out.print("X 1 Bis :");
            for(int n = 0; n<x1bis.length; n++){
            System.out.print(x1bis[n]+", ");
            }
            System.out.println();
            i=j;
        }

        /* completer les zones non initialisées dans les deux fils */
        for(int k=0; k<x1bis.length; k++){
            if(x1bis[k].equals("0")){
                y1.add(k, x2.get(k).clone());
                y1.remove(k+1);
                y2.add(k, x1.get(k).clone());
                y2.remove(k+1);
            }
        }

        System.out.print("Y1 :");
        for(int n = 0; n<y1.size(); n++){
        System.out.print(y1.get(n).getName()+", ");
        }

        System.out.println();

        System.out.print("Y2 :");
        for(int n = 0; n<y2.size(); n++){
        System.out.print(y2.get(n).getName()+", ");
        }


        


    }

    public boolean X2iIsVerified(String[] tab, String obj){
        boolean verif = false;
        
        for(int i=0; i<tab.length; i++){
            if(tab[i].equals(obj)){
                verif=true;
            }

        }

        return verif;
    }

    public int SelectPosition(List<Visualisation> x1, String x2i){
        int position = 0;

        for(int i=0; i<x1.size(); i++){
            if(x1.get(i).getName().equals(x2i))
            position = i;

        }
        return position;
    }

    public static void main(String[] args){

        List<Visualisation> x1 = new ArrayList<Visualisation>();
        List<Visualisation> x2 = new ArrayList<Visualisation>();

        String[] x11 = new String[]{"PARAM1", "PARAM6", "PARAM10", "PARAM13", "PARAM4", "PARAM3", "PARAM5", "PARAM7", "PARAM8", "PARAM2", "PARAM11", "PARAM9", "PARAM12", "Classe", "Classe2", "Texture"};
        String[] x22 = new String[]{"PARAM3", "PARAM10", "PARAM11", "PARAM13", "PARAM6", "PARAM1", "PARAM5", "PARAM7", "PARAM4", "PARAM2", "PARAM12", "PARAM9", "PARAM8", "Classe", "Classe2", "Texture"};

        for(int i=0; i<x11.length; i++){
          Visualisation visu = new Visualisation();
          Visualisation visu1 = new Visualisation();
          visu.setName(x11[i]);
          visu1.setName(x22[i]);
          visu.setType(x11[i]);
          visu1.setType(x22[i]);
          visu.setImportance(1);
          visu1.setImportance(1);
          x1.add(visu);
          x2.add(visu1);
        }


        

        System.out.println(".");
        new CroisementCX_List(x1, x2);

    }

    }

