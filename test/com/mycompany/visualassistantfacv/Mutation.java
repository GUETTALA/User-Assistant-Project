/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.visualassistantfacv;

/**
 *
 * @author Abdelheq
 */
public class Mutation {

    public static void main(String[] args){

        /* La formule de génération de Pmutation (i) est la suivante : Pmutation (i) = Beta(i) * Pmin + (1-B(i)) * Pmax
         * Pmuation : c'est la probabilité de mutation
         * Beta (i) : c'est le coefiicient de modification de Pmutation (i) avec : Beta (i) = 1 - [(i-1)/(n'-1)]
         * i c'est le ième individu à générer
         * n' c'est le nombre d'individu à générer
         * Pmin = 1/nombre de gene de l'individu
         * Pmax = 0.4
         */
        int ChromosomeSize = 5, nbIndivSelect = 3, PopulationSize = 8;

        double Pmutation, Beta, Pmin = 1/(double) ChromosomeSize, Pmax = 0.4;
        for(int i=1; i<=5; i++ ){
        Beta = (double) (1-((i-1)/((double) (PopulationSize-nbIndivSelect)-1)));
        System.out.println("Pmax : "+Pmax);
        System.out.println("Pmin : "+Pmin);
        System.out.println("Rate : "+(double) ((i-1)/(((double) PopulationSize-nbIndivSelect)-1)));
        System.out.println("Beta value : "+Beta);
        Pmutation = (Beta * Pmin) + ((1-Beta)*Pmax);
        System.out.println("For the "+i+" individual the mutation is : "+Pmutation);
        }

    }
    

}
