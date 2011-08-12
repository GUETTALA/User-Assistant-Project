/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.visualassistantfacv;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import org.jdom.Document;

import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import VisualAssistantFDM.io.FiltreExtensible;

/**
 *
 * @author Abdelheq
 */
public class LoadXMLFile {

    public LoadXMLFile() throws Exception{

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        FiltreExtensible Filtre = new FiltreExtensible("Fichier xml");
        Filtre.addExtension(".xml");
        chooser.addChoosableFileFilter(Filtre);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        String xml = chooser.getSelectedFile().getAbsolutePath().toString();
        try{
        SAXBuilder sxb = new SAXBuilder();
        Document document = sxb.build(new File(xml));
        Element racine = document.getRootElement();
        List listAttributes = racine.getChild("structure").getChildren("attribute");
        System.out.println("racine : "+listAttributes.toString());
        Iterator i = listAttributes.iterator();
        while(i.hasNext()) {
            Element courant = (Element)i.next();
            System.out.println(courant.getChild("name").getText().toString());
            System.out.println(courant.getChild("type").getText().toString());
            System.out.println(courant.getChild("importance").getText().toString());
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }

        
    }
    
    public static void main(String[] args) throws Exception {
        new LoadXMLFile();
    }

}
