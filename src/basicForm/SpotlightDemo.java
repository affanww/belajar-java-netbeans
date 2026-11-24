/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicForm;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class SpotlightDemo extends JFrame {
    public SpotlightDemo(){
        initComponents();
    }
    private void initComponents(){
        add(new Spotlight());
        setTitle("Spotlight Demo");
        setSize(700,600);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                SpotlightDemo sd = new SpotlightDemo();
                sd.setVisible(true);
            }
        });
    }
}
