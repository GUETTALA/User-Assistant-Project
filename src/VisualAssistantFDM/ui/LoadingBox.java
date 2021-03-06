/*
 * LoadingBox.java
 *
 * Created on 3 avril 2007, 20:11
 */

package VisualAssistantFDM.ui;

/**
 *
 * @author  Barth
 */
public class LoadingBox extends javax.swing.JFrame{
    
    private boolean done = false;
    private String eltNameLbl;
    /**
     * Creates new form LoadingBox
     */
    public LoadingBox(String title) {
        initComponents();
        setTitle(title);
        cancel.setEnabled(false);
        progressBar.setBorderPainted(true);
        progressBar.setValue(0);
        progressBar.setMaximum(100);
        progressBar.setMinimum(0);
        action.setText("Traitement de l'element : "+eltNameLbl +" en cours.");
        setVisible(true);
        repaint();
        jPanel1.repaint();
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

    LoadingBox(String string, int i, int i0) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        ratio = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        action = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Chargement du fichier ...");
        jLabel4.setText("Ceci peut prendre du temps, veuillez patienter SVP ...");

        progressBar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progressBarStateChanged(evt);
            }
        });

        progressBar.getAccessibleContext().setAccessibleParent(this);

        ratio.setText("0 %");

        cancel.setText("Annuler");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        action.setText("[action en cours]");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(130, 130, 130)
                        .add(cancel))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(action, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(progressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 305, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(ratio, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(action)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, ratio, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, progressBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cancel)
                .add(24, 24, 24))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progressBarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progressBarStateChanged
// TODO add your handling code here:
        if(progressBar.getValue()==100){
             cancel.setText("Annuler");
             this.dispose();
        }
        else{
            ratio.setText(""+progressBar.getValue()+" %");
        }
    }//GEN-LAST:event_progressBarStateChanged

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
// TODO add your handling code here:
        
        
        onQuit();
    }//GEN-LAST:event_cancelActionPerformed
   

    public javax.swing.JButton getCancel() {
        return cancel;
    }

    public void setCancel(javax.swing.JButton cancel) {
        this.cancel = cancel;
    }

     public void setAction(String action) {
        this.action.setText(action +" en cours.");
    }

    public javax.swing.JProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(javax.swing.JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public javax.swing.JLabel getRatio() {
        return ratio;
    }

    public void setRatio(javax.swing.JLabel ratio) {
        this.ratio = ratio;
    }
   
    private void onQuit(){
        
        this.dispose();
    }

    public boolean isDone()
    {
        return done;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel action;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel ratio;
    // End of variables declaration//GEN-END:variables
    
}
