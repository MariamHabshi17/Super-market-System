package StoreProj;
public class Storage extends javax.swing.JFrame {

    public Storage() {
        initComponents();
        Menu mn=new Menu();
        jTextArea1.setText(jTextArea1.getText()+"Bread  "+ "  Qunatity = "+ mn.Nido +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Butter "+ "  Qunatity = "+ mn.Orange +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Chips  "+ "  Qunatity = "+ mn.Chips +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Milk  "+ "  Qunatity = "+ mn.Milk +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Chrimp "+ "  Qunatity = "+ mn.Snacks +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Eggs  "+ "  Qunatity = "+ mn.Egg +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Cola  "+ "  Qunatity = "+ mn.Peproni +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Chicken  "+ "  Qunatity = "+ mn.Chickenbreast +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Duck  "+ "  Qunatity = "+ mn.Pasta +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Rice  "+ "  Qunatity = "+ mn.Rice +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Cucumber  "+ "  Qunatity = "+ mn.Noodels +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Toamto "+ "  Qunatity = "+ mn.Tomato +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Onion  "+ "  Qunatity = "+ mn.Onion +"\n");
        jTextArea1.setText(jTextArea1.getText()+"EggPlant  "+ "  Qunatity = "+ mn.Salt +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Mango "+ "  Qunatity = "+ mn.Onion +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Oranges  "+ "  Qunatity = "+ mn.Cake +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Graps  "+ "  Qunatity = "+ mn.CupCake +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Appels  "+ "  Qunatity = "+ mn.Biscuit +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Pepproni  "+ "  Qunatity = "+ mn.Cheese +"\n");
        jTextArea1.setText(jTextArea1.getText()+"Carrots  "+ "  Qunatity = "+ mn.Yogurt +"\n");
        jTextArea1.setText(jTextArea1.getText()+"peach"+ "  Qunatity = "+ mn.Cheeder+"\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Back");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
    new Prodsystem().setVisible(true);
    this.setVisible(false);
    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Storage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Storage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Storage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Storage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Storage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
