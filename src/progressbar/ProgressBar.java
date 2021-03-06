/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ProgressBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JProgressBar ho=new JProgressBar();
        ho.setVisible(true);
        
        for(int x=0;x<=100;x++)
        {
            try {
                Thread.sleep(50);
                
                JProgressBar.lblload.setText(Integer.toString(x)+"%");
                JProgressBar.loadbar.setValue(x);
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
