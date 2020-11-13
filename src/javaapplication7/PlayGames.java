package javaapplication7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class PlayGames extends JFrame implements ActionListener{  
	homegames homegames1 = new homegames();
	playstate1 state1 = new playstate1();
        help state2 = new help();
	gameover gover = new gameover();
	public PlayGames(){
		this.setSize(700,900);
		this.add(homegames1);
		homegames1.BExit1.addActionListener(this);
                homegames1.BStart.addActionListener(this);
                state1.BExithome.addActionListener(this);
                state1.BPause.addActionListener(this);
                state1.Bstart.addActionListener(this);
                state1.Bresum.addActionListener(this);
                state2.back.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
            if(e.getSource()== homegames1.BStart){
		this.setLocationRelativeTo(null);
		this.remove(homegames1);
                this.setSize(700,900);
                this.add(state1);
                this.remove(state1.Bstart);
                state1.requestFocusInWindow();
		state1.timestart = false;
		state1.scor=0;
		state1.HP =2;
		state1.times = 50;
		state1.startball=false;
		state1.timestart=false;
            }else if(e.getSource() == state1.BExithome){
		System.exit(0);
            }if(e.getSource() == homegames1.BExit1){
		this.setLocationRelativeTo(null);
		this.remove(homegames1);
                this.setSize(700,900);
                this.add(state2);
                state2.requestFocusInWindow();
            }if(e.getSource() == state2.back){
		this.setLocationRelativeTo(null);
		this.setSize(700,900);
                this.remove(state2);
		this.add(homegames1);}
               else if(e.getSource()== state1.Bstart){
		this.setLocationRelativeTo(null);
		this.remove(homegames1);
                this.setSize(700,900);
                this.add(state1);
                this.remove(state1.Bstart);
                state1.requestFocusInWindow();
		state1.timestart = false;
		state1.scor=0;
		state1.HP =2;
		state1.times = 50;
		state1.startball=false;
		state1.timestart=false;
            
	
                
                
                
                
            }else if(e.getSource() == state1.BPause){
		this.setLocationRelativeTo(null);
		this.setSize(700,900);
		this.add(state1);
		state1.requestFocusInWindow();
		state1.t.suspend();
		state1.time.suspend();
		state1.actor.suspend();                               
		state1.tballs1.suspend();
		state1.tballs2.suspend();
		state1.tballs5.suspend();
                state1.tballs3.suspend();
		state1.tballs6.suspend();
                
			
            }else if(e.getSource() == state1.Bresum){
		this.setLocationRelativeTo(null);
		this.setSize(700,900);
		this.add(state1);
		state1.requestFocusInWindow();
		state1.t.resume();
		state1.time.resume();
		state1.actor.resume();
		state1.tballs1.resume();
		state1.tballs2.resume();
		state1.tballs5.resume();
                state1.tballs3.resume();
		state1.tballs6.resume();
            }
            this.validate();
            this.repaint();
	}
        
     public static void main(String[] args) {
            JFrame jf = new PlayGames();
            jf.setSize(700,900);
            jf.setTitle("NINJA JUMP");
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setVisible(true);
            jf.setLocationRelativeTo(null);
    }    
        
        
	
}
