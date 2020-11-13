/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class help extends JPanel implements ActionListener{
    ImageIcon help1 = new ImageIcon(this.getClass().getResource("help_1.png"));
    ImageIcon restart = new ImageIcon(this.getClass().getResource("start.jpg"));
    ImageIcon exitover = new ImageIcon(this.getClass().getResource("exit.jpg"));
    private final ImageIcon bac = new ImageIcon(this.getClass().getResource("backk.png"));
    JButton BStartover = new JButton(restart);
    JButton BExitover  = new JButton(exitover);
    JButton back  = new JButton(bac);//
    homegames hg = new homegames();
    help(){this.setFocusable(true);
		this.setLayout(null);
                back.setBounds(500,800,120,40);
                back.addActionListener(this);
                this.add(back);
    }
    

public void paintComponent(Graphics g){
    super.paintComponent(g);
    this.setLayout(null);
    g.drawImage(help1.getImage(),0,0,700,900,this);
}
public void actionPerformed(ActionEvent e) {
		if(e.getSource()== BStartover){		
                    this.setSize(700,900);
                    this.add(hg);
                    this.setLocation(null);
		}else if(e.getSource() == BExitover){
                    System.exit(0);
		}		
}
}