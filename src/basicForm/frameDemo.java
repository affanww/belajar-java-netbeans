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
public class frameDemo extends JFrame{
    public frameDemo() {
        // mengatur judul form
        setTitle("Demo Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run() {
                new frameDemo().setVisible(true);
            }
        });
    }
}
