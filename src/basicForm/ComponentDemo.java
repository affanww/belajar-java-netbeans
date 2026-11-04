/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicForm;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author User
 */
public class ComponentDemo extends JFrame {
    public ComponentDemo() {
        setTitle("Component Demo"); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        initComponents();
    }

    private void initComponents() {
        JLabel labelPesan = new JLabel();
        String pesan = "RAJA KODING INDONESIA DEDE";
        labelPesan.setText(pesan);

        JButton btnKeluar = new JButton("Keluar");
        btnKeluar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);
        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(labelPesan)
                .addComponent(btnKeluar));
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(labelPesan)
                .addComponent(btnKeluar));
        
    }
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new ComponentDemo().setVisible(true);
            }
        });
    }
}
