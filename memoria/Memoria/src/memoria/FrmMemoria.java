
package memoria;

public class FrmMemoria extends javax.swing.JFrame 
{

    int []numeros=new int[16];
    int aleatorio;
    int condicion;
    int posicion;
    int posicion2;
    int x;
    int abiertas=0;
    int valor=9;
    int valor1=9;
    int posbtn;
    int posbtn1;
    int contador;
    int cartas;

    public FrmMemoria()
    {
        initComponents();
//        while(posicionvec<16)
//        {
//            aleatorio=(int) (Math.random()*8);
//            for  (posicion=0;posicion<16;posicion++)
//            {
//                if(aleatorio==numeros[posicion])
//                {
//                    con++;
//                }
//               
//            }
//            if(con<2)
//            {
//                numeros[posicionvec]=aleatorio;
//                posicionvec++;
//            }
//            con=0;
//            for(posicionvec=0;posicionvec<16;posicionvec++)
//            {
//                System.out.print(numeros[posicionvec]);
//            }
//        }codigo ari que no sirvio

          while (posicion <= 15)
        {
            System.out.print("las posisicones 1: \n");
            System.out.print(posicion + "\n");
            condicion = 0;
            posicion2 = 0;
            aleatorio = (int)(Math.random()*8);  
            System.out.print("aleatorio antes: "+ aleatorio + "\n");
            System.out.print("las posisicones 2: \n");
            while(posicion > posicion2)
            {
                if(aleatorio == numeros[posicion2])
                {
                    condicion++;
                }  
                System.out.print(posicion2 + "\n");
                posicion2++;
            }
            
            if(condicion < 2)
            {
                System.out.print("aleatorio: "+ aleatorio + "\n");
                numeros[posicion2] = aleatorio;
                posicion++;
            }
        }
        for (x=0;x<=15;x++)
        {
            System.out.print(numeros[x]);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btnrestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btnrestart.setText("RESTART");
        btnrestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(btn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(btn14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnrestart)
                        .addGap(71, 71, 71)))
                .addGap(10, 10, 10)
                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btnrestart))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
        abiertas+=1;
        
        if (abiertas<=2)
        {
            btn1.setEnabled(false);
            btn1.setText(String.valueOf(numeros[0]));
            if (valor==9)
            {
                valor=numeros[0];
                posbtn=1;
            }
            else
            { 
                valor1=numeros[0];
                posbtn1=1;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        
        abiertas+=1;
        
        if (abiertas<=2)
        {
            btn2.setEnabled(false);
            btn2.setText(String.valueOf(numeros[1]));
            if (valor==9)
            {
                valor=numeros[1];
                posbtn=2;
            }
            else
            { 
                valor1=numeros[1];
                posbtn1=2;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn) 
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(" huevas faltan espacios "));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
            
        abiertas+=1;
        
        if (abiertas<=2)
        {
            btn3.setEnabled(false);
            btn3.setText(String.valueOf(numeros[2]));
            if (valor==9)
            {
                valor=numeros[2];
                posbtn=3;
            }
            else
            { 
                valor1=numeros[2];
                posbtn1=3;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }  
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
     abiertas+=1;
        
        if (abiertas<=2)
        {
            btn4.setEnabled(false);
            btn4.setText(String.valueOf(numeros[3]));
            if (valor==9)
            {
                valor=numeros[3];
                posbtn=4;
            }
            else
            { 
                valor1=numeros[3];
                posbtn1=4;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
         abiertas+=1;
        
        if (abiertas<=2)
        {
            btn5.setEnabled(false);
            btn5.setText(String.valueOf(numeros[4]));
            if (valor==9)
            {
                valor=numeros[4];
                posbtn=5;
            }
            else
            { 
                valor1=numeros[4];
                posbtn1=5;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        abiertas+=1;
        
        if (abiertas<=2)
        {
            btn6.setEnabled(false);
            btn6.setText(String.valueOf(numeros[5]));
            if (valor==9)
            {
                valor=numeros[5];
                posbtn=6;
            }
            else
            { 
                valor1=numeros[5];
                posbtn1=6;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
         abiertas+=1;
        
        if (abiertas<=2)
        {
            btn7.setEnabled(false);
            btn7.setText(String.valueOf(numeros[6]));
            if (valor==9)
            {
                valor=numeros[6];
                posbtn=7;
            }
            else
            { 
                valor1=numeros[6];
                posbtn1=7;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         abiertas+=1;
        
        if (abiertas<=2)
        {
            btn8.setEnabled(false);
            btn8.setText(String.valueOf(numeros[7]));
            if (valor==9)
            {
                valor=numeros[7];
                posbtn=8;
            }
            else
            { 
                valor1=numeros[7];
                posbtn1=8;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
      abiertas+=1;
        
        if (abiertas<=2)
        {
            btn9.setEnabled(false);
            btn9.setText(String.valueOf(numeros[8]));
            if (valor==9)
            {
                valor=numeros[8];
                posbtn=9;
            }
            else
            { 
                valor1=numeros[8];
                posbtn1=9;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
         abiertas+=1;
        
        if (abiertas<=2)
        {
            btn10.setEnabled(false);
            btn10.setText(String.valueOf(numeros[9]));
            if (valor==9)
            {
                valor=numeros[9];
                posbtn=10;
            }
            else
            { 
                valor1=numeros[9];
                posbtn1=10;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
         abiertas+=1;
        
        if (abiertas<=2)
        {
            btn11.setEnabled(false);
            btn11.setText(String.valueOf(numeros[10]));
            if (valor==9)
            {
                valor=numeros[10];
                posbtn=11;
            }
            else
            { 
                valor1=numeros[10];
                posbtn1=11;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        abiertas+=1;
        
        if (abiertas<=2)
        {
            btn12.setEnabled(false);
            btn12.setText(String.valueOf(numeros[11]));
            if (valor==9)
            {
                valor=numeros[11];
                posbtn=12;
            }
            else
            { 
                valor1=numeros[11];
                posbtn1=12;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
       abiertas+=1;
        
        if (abiertas<=2)
        {
            btn13.setEnabled(false);
            btn13.setText(String.valueOf(numeros[12]));
            if (valor==9)
            {
                valor=numeros[12];
                posbtn=13;
            }
            else
            { 
                valor1=numeros[12];
                posbtn1=13;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
         abiertas+=1;
        
        if (abiertas<=2)
        {
            btn14.setEnabled(false);
            btn14.setText(String.valueOf(numeros[13]));
            if (valor==9)
            {
                valor=numeros[13];
                posbtn=14;
            }
            else
            { 
                valor1=numeros[13];
                posbtn1=14;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
         abiertas+=1;
        
        if (abiertas<=2)
        {
            btn15.setEnabled(false);
            btn15.setText(String.valueOf(numeros[14]));
            if (valor==9)
            {
                valor=numeros[14];
                posbtn=15;
            }
            else
            { 
                valor1=numeros[14];
                posbtn1=15;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
         abiertas+=1;
        
        if (abiertas<=2)
        {
            btn16.setEnabled(false);
            btn16.setText(String.valueOf(numeros[15]));
            if (valor==9)
            {
                valor=numeros[15];
                posbtn=16;
            }
            else
            { 
                valor1=numeros[15];
                posbtn1=16;
            }
        }
        else
        {
            if (valor==valor1)
            {
                valor=9;
                valor1=9;
                abiertas=0;
            }
            else if(valor!=valor1)
            {
                switch(posbtn)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                switch(posbtn1)
                {
                    case 1: btn1.setText(String.valueOf(""));
                            btn1.setEnabled(true);
                            break;
                    case 2: btn2.setText(String.valueOf(""));
                            btn2.setEnabled(true);
                            break;
                    case 3: btn3.setText(String.valueOf(""));
                            btn3.setEnabled(true);
                            break;
                    case 4: btn4.setText(String.valueOf(""));
                            btn4.setEnabled(true);
                            break;
                    case 5: btn5.setText(String.valueOf(""));
                            btn5.setEnabled(true);
                            break;
                    case 6: btn6.setText(String.valueOf(""));
                            btn6.setEnabled(true);
                            break;
                    case 7: btn7.setText(String.valueOf(""));
                            btn7.setEnabled(true);
                            break;
                    case 8: btn8.setText(String.valueOf(""));
                            btn8.setEnabled(true);
                            break;
                    case 9: btn9.setText(String.valueOf(""));
                            btn9.setEnabled(true);
                            break;
                    case 10: btn10.setText(String.valueOf(""));
                             btn10.setEnabled(true);
                             break;
                    case 11: btn11.setText(String.valueOf(""));
                             btn11.setEnabled(true);
                             break;
                    case 12: btn12.setText(String.valueOf(""));
                             btn12.setEnabled(true);
                             break;
                    case 13: btn13.setText(String.valueOf(""));
                             btn13.setEnabled(true);
                             break;
                    case 14: btn14.setText(String.valueOf(""));
                             btn14.setEnabled(true);
                             break;
                    case 15: btn15.setText(String.valueOf(""));
                             btn15.setEnabled(true);
                             break;
                    case 16: btn16.setText(String.valueOf(""));
                             btn16.setEnabled(true);
                             break;
                }
                valor=9;
                valor1=9;
                abiertas=0;
            }  
        }
    }//GEN-LAST:event_btn16ActionPerformed

    private void btnrestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestartActionPerformed

   posicion=0;
   aleatorio=0;   
   abiertas=0;
   valor=10;
   valor1=10;
   posbtn=0;
   posbtn1=0;

   


   btn1.setText(String.valueOf(" "));
   btn2.setText(String.valueOf(" "));
   btn3.setText(String.valueOf(" "));
   btn4.setText(String.valueOf(" "));
   btn5.setText(String.valueOf(" "));
   btn6.setText(String.valueOf(" "));
   btn7.setText(String.valueOf(" "));
   btn8.setText(String.valueOf(" "));
   btn9.setText(String.valueOf(" "));
   btn10.setText(String.valueOf(" "));
   btn11.setText(String.valueOf(" "));
   btn12.setText(String.valueOf(" "));
   btn13.setText(String.valueOf(" "));
   btn14.setText(String.valueOf(" "));
   btn15.setText(String.valueOf(" "));
   btn16.setText(String.valueOf(" "));
   btn1.setEnabled(true);
   btn2.setEnabled(true);
   btn3.setEnabled(true);
   btn4.setEnabled(true);
   btn5.setEnabled(true);
   btn6.setEnabled(true);
   btn7.setEnabled(true);
   btn8.setEnabled(true);
   btn9.setEnabled(true);
   btn10.setEnabled(true);
   btn11.setEnabled(true);
   btn12.setEnabled(true);
   btn13.setEnabled(true);
   btn14.setEnabled(true);
   btn15.setEnabled(true);
   btn16.setEnabled(true);
   while (contador <=16)
   {
       numeros[contador]=0;
       contador+=1;
   }
   contador=0;
   

        while (contador<=14)
        {
            aleatorio=(int)(Math.random()*15 );
            if (numeros[aleatorio]==0)
            {
                numeros[aleatorio]=cartas;
                contador+=1;
                cartas+=1;
                if (cartas>7)
                {
                    cartas=0;
                }
            }
            
        }
      

        
    }//GEN-LAST:event_btnrestartActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnrestart;
    // End of variables declaration//GEN-END:variables
}
