package javaapplication7;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class gameover extends JPanel{
	
	private ImageIcon feildover = new ImageIcon("gameo.jpg");
	private ImageIcon exitover = new ImageIcon("exit.jpg");
	private ImageIcon restart = new ImageIcon("Start.jpg");
	public JButton BStartover = new JButton(restart);
	public JButton BExitover  = new JButton(exitover);
	
	gameover(){
		
		this.setLayout(null);
		BExitover.setBounds(170, 750, 150,90);
		add(BExitover);
		add(BStartover);
		BStartover.setBounds(390,750,150,90);
                add(BStartover);
		
	}
	public void paintComponent(Graphics g){
		  super.paintComponent(g);
		  g.drawImage(feildover.getImage(),0,0,700,900,this);
		  
		  
	      
	  }
}
