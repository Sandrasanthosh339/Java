
import java.awt.Graphics;
import java.applet.Applet;

public class P6ChoiceShape extends javax.swing.JFrame {

    public int a;
    public P6ChoiceShape() {
         initComponents();
        choice1.addItem("rectangle");
        choice1.addItem("circle");
        choice1.addItem("triangle");
        choice1.addItem("square");
       
        
    }

     public void paint(Graphics g){
           
         //System.out.println(a);
       
            if ( a==0 )
            {
              g.drawRect(120,80,40,70);  
            }
            else if ( a==1 )
            {
            g.drawOval(40,200,30,30);    
            }
            else if ( a==2 )
            {
                g.drawLine(180,150,180,370);
                g.drawLine(180,150,440,370);
                g.drawLine(180,370,440,370);
            }
            else if ( a==3 )
            {
                g.drawRect(100,200,50,50);
            }


     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice1ItemStateChanged
         a =choice1.getSelectedIndex();
       // System.out.println(a);
       /*if (evt.getSource() == choice1 )
            a = 1;*/
        repaint ();
    }//GEN-LAST:event_choice1ItemStateChanged

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P6ChoiceShape().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    // End of variables declaration//GEN-END:variables
}
