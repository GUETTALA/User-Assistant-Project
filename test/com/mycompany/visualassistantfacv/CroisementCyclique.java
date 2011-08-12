/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.visualassistantfacv;

import java.util.ArrayList;
import java.util.List;
import sun.awt.image.PNGImageDecoder.Chromaticities;

/**
 *
 * @author Abdelheq
 */
public class CroisementCyclique {

    private boolean isVerified = false;

    public CroisementCyclique(int[] x1, int[] x2){

        /* Initialiser les deux fils */
        int[] y1 = new int[x1.length];
        int[] y2 = new int[x1.length];

        /* Initialiser les deux première valeurs des premières gènes des fils */
        y1[0] = x1[0];
        y2[0] = x2[0];
        
        /* Initialiser l'indice i qui permet de parcourir les parents */
        int i = 0;
        int j;

        while(!isVerified){
            isVerified = X2iIsVerified(y1, x2[i]);
            j = SelectPosition(x1, x2[i]);
            //System.out.println("isVerified = "+isVerified+", i ="+i+", x2,i ="+x2[i]+" j = "+j);
            y1[j] = x1[j];
            y2[j] = x2[j];
            i=j;
        }
        
        /* completer les zones non initialisées dans les deux fils */
        for(int k=0; k<y1.length; k++){
            if(y1[k]==0){
                y1[k]=x2[k];
                y2[k]=x1[k];
            }
        }

        System.out.print("Y1 :");
        for(int n = 0; n<y1.length; n++){
        System.out.print(y1[n]+", ");
        }

        System.out.println();

        System.out.print("Y2 :");
        for(int n = 0; n<y2.length; n++){
        System.out.print(y2[n]+", ");
        }


    }

    public boolean X2iIsVerified(int[] y1, int x2i){
        boolean verif = false;

        for(int i=0; i<y1.length; i++){
            if(x2i==y1[i]){
                verif=true;
            }
        }

        return verif;
    }

    public int SelectPosition(int[] x1, int x2i){
        int position = 0;

        for(int i=0; i<x1.length; i++){
            if(x2i==x1[i])
            position = i;
        }
        return position;
    }


    public static void main(String[] args){
        int[] x1 = new int[]{3, 5, 1, 4, 7, 6, 2, 8};
        int[] x2 = new int[]{4, 6, 5, 1, 8, 3, 2, 7};

        List<Integer> children, children1, children2, children3;
        children = new ArrayList<Integer>();
        children1 = new ArrayList<Integer>();
        children2 = new ArrayList<Integer>();
        children3 = new ArrayList<Integer>();

        for(int i=0; i<x1.length; i++){
           children.add(x1[i]);
           children1.add(x2[i]);
        }


        int pos = children.size()/2;
        children2.addAll(children.subList(0, pos));
        children2.addAll(children1.subList(pos, children1.size()));
        children3.addAll(children1.subList(0, pos));
        children3.addAll(children.subList(pos, children.size()));

        System.out.println(pos+1);


        for(int i = 0; i<children.size(); i++){
            System.out.print(children.get(i).toString()+", ");
        }

        System.out.println();

        for(int i = 0; i<children1.size(); i++){
            System.out.print(children1.get(i).toString()+", ");
        }

        System.out.println();

        for(int i = 0; i<children2.size(); i++){
            System.out.print(children2.get(i).toString()+", ");
        }

        System.out.println();

        for(int i = 0; i<children3.size(); i++){
            System.out.print(children3.get(i).toString()+", ");
        }

//        System.out.println(".");
//
//        System.out.print("X2 :");
//        for(int i = 0; i<x2.length; i++){
//        System.out.print(x2[i]+", ");
//        }
//
//        System.out.println(".");
        //new CroisementCyclique(x1, x2);
    }

}
