/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.visualassistantfacv;

/**
 *
 * @author Abdelheq
 */
public class GarbageCollector {

    public static void main(String args[]){

        Runtime r = Runtime.getRuntime(); // Créer un objet de type Runtime
        String m = "Maman" ;
        String p = "Papa" ;
        System.out.println ( "Max : " + r.maxMemory());
        System.out.println ( "Free : " + r.freeMemory());
        m = null;
        p = null;
        r.gc(); // Appel implicite au garbage collector
        System.out.println ("Free : " + r.freeMemory());
    }


}
