/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IHM_USerObj.java
 *
 * Created on 24 juin 2011, 14:41:12
 */

package com.mycompany.visualassistantfacv;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import VisualAssistantFDM.io.LoadVisualizations;
import VisualAssistantFDM.userObjectives.UserPreferences;

/**
 *
 * @author Abdelheq
 */
public class IHM_USerObj extends javax.swing.JFrame {

    List<UserPreferences> UserObjectives, UserObjectivesVector;


    /** Creates new form IHM_USerObj */
    public IHM_USerObj() throws Exception {
        UserObjectives = new LoadVisualizations().LoadUserObjectives();
        UserObjectivesVector =  new LoadVisualizations().getUserObjectives(5);
        initComponents();
        JPanel UserObjectivePanel = new ObjectivesLoad();
        this.add(UserObjectivePanel, BorderLayout.CENTER);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(6, 5));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class ObjectivesLoad extends JPanel{

    public ObjectivesLoad()  throws Exception{

        

        

        for(int j = 0; j<UserObjectives.size(); j++){
        System.out.println(UserObjectives.get(j).getIdObjectif());
        //System.out.println(UserObjectives.get(j).getImportance());
        }
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "User Objectives List "));
        for(int i=0; i<UserObjectives.size(); i++){
        //setLayout(new GridLayout(UserObjectives.size(), 5));
        add(new JLabel(UserObjectives.get(i).getDescription()));
        //add(new JLabel("     "));
        JRadioButton aucune_ImpotButton   = new JRadioButton("Aucune Importance"  , true);
        JRadioButton faible_ImpotButton    = new JRadioButton("Faible Importance"   , false);
        JRadioButton moyenne_ImpotButton = new JRadioButton("Moyenne Importance", false);
        JRadioButton forte_ImpotButton = new JRadioButton("Forte Importance", false);
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(aucune_ImpotButton);
        bgroup.add(faible_ImpotButton);
        bgroup.add(moyenne_ImpotButton);
        bgroup.add(forte_ImpotButton);
        add(aucune_ImpotButton);
        add(faible_ImpotButton);
        add(moyenne_ImpotButton);
        add(forte_ImpotButton);
        
        }
        add(new JButton("Ok ! "));
        pack();
        

    }
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new IHM_USerObj().setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
