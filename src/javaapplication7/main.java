
package javaapplication7;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;


/**
 *
 * @author ssp
 */
public class main {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JFrame jf = new PlayGames();
            jf.setSize(700,900);
            jf.setTitle("NINJA JUMP");
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setVisible(true);
            jf.setLocationRelativeTo(null);          
            String filepath="bgg.wav";
            NewClass musicObject =new NewClass();
            musicObject.playMusic(filepath);
    }
    
}
