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

public class playstate1 extends JPanel implements ActionListener{
    
	private final ImageIcon imgstate1 = new ImageIcon(this.getClass().getResource("BG33.png"));
	private final ImageIcon imgstate2 = new ImageIcon(this.getClass().getResource("BG34.png"));
	private final ImageIcon imgmeleon = new ImageIcon(this.getClass().getResource("gameo.png"));
        private final ImageIcon imgmeleon2 = new ImageIcon(this.getClass().getResource("win.png"));
	private final ImageIcon pause = new ImageIcon(this.getClass().getResource("puse.png"));
	private final ImageIcon resum = new ImageIcon(this.getClass().getResource("resum.png"));
	private final ImageIcon back = new ImageIcon(this.getClass().getResource("back.png"));
        private ImageIcon start = new ImageIcon(this.getClass().getResource("Play.png"));
        private final ImageIcon state1 = new ImageIcon(this.getClass().getResource("state1.png"));
        private final ImageIcon state2 = new ImageIcon(this.getClass().getResource("state2.png"));
        private final ImageIcon hp = new ImageIcon(this.getClass().getResource("heart1.png"));
        private final ImageIcon sc = new ImageIcon(this.getClass().getResource("score1.png"));
        private final ImageIcon ck = new ImageIcon(this.getClass().getResource("clock.png"));
	ninja m = new ninja();
        
	homegames hg = new homegames();
	ImageIcon feildover = new ImageIcon(this.getClass().getResource("win.png"));
        ImageIcon feildover2 = new ImageIcon(this.getClass().getResource("gameo.png"));
//	ImageIcon img_paralyze = new ImageIcon(this.getClass().getResource("7.1.png"));
	ImageIcon exitover = new ImageIcon(this.getClass().getResource("exit.jpg"));
	ImageIcon restart = new ImageIcon(this.getClass().getResource("start.jpg"));
        JButton BStartover = new JButton(restart);
	JButton BExitover  = new JButton(exitover);
	
	private JLabel score = new JLabel(); 
        public JButton BPause  = new JButton(pause);
	public JButton BExithome  = new JButton(back); 
	public JButton Bresum  = new JButton(resum);
        public JButton Bstart  = new JButton(start);
	//public ArrayList<Fireball> fireball = new ArrayList<Fireball>();
	public ArrayList<ball1> ba1 = new ArrayList<ball1>();
	public ArrayList<ball2> ba2 = new ArrayList<ball2>();
        public ArrayList<ball3> ba3 = new ArrayList<ball3>();
	public ArrayList<ball5> ba5 = new ArrayList<ball5>();
        public ArrayList<ball6> ba6 = new ArrayList<ball6>();
        public ArrayList<ball>  ba = new ArrayList<ball>();
        
	public int times ;
	public int HP = 3;
	public int rs1 = 1;
	public int rs2 = 2;
	boolean timestart = true;
	boolean startball = false;
	
	private gameover gover = new gameover();
	public int scor = 0;
	boolean paralyze1 = false;
	int time_paralyze=5;
	
	Thread time = new Thread(new Runnable(){
            public void run(){
		while(true){
                    try{
			Thread.sleep(10);
                    }catch(Exception e){ }
                    
                    if(timestart == false){
			repaint();
                    }
		}
            }
	});
	
	Thread actor = new Thread(new Runnable(){
            public void run(){
		while(true){
                	try{
                            Thread.sleep(1);
			}catch(Exception e){}
                            repaint();
		}
            }
	});
	Thread tballs1 = new Thread(new Runnable(){
            public void run() {
                while(true){
                	try{
                            if(startball == false){
				Thread.sleep((long)(Math.random()*1000)+2000);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            ba1.add(new ball1());
			}
		}
            }
	});
	Thread tballs2 = new Thread(new Runnable(){
            public void run() {
		while(true){
			try{
                            if(startball==false){
				Thread.sleep((long)(Math.random()*1000)+2000);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            ba2.add(new ball2());
			}
		}
            }
	});
        Thread tballs3 = new Thread(new Runnable(){
            public void run() {
		while(true){
			try{
                            if(startball==false){
				Thread.sleep((long)(Math.random()*1000)+2000);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            ba3.add(new ball3());
			}
		}
            }
	});
	
	Thread tballs5 = new Thread(new Runnable(){
            public void run() {
            	while(true){
			try{
                            if(startball==false){
                                Thread.sleep((long)(Math.random()*1000)+2000);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            ba5.add(new ball5());
			}
		}
            }
	});
        Thread tballs6 = new Thread(new Runnable(){
            public void run() {
            	while(true){
			try{
                            if(startball==false){
                                Thread.sleep((long)(Math.random()*1000)+2000);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            ba6.add(new ball6());
			}
		}
            }
	});
        Thread tball = new Thread(new Runnable(){
            public void run() {
            	while(true){
			try{
                            if(startball==false){
                                Thread.sleep((long)(Math.random()*1000)+2000);
                            }
			}catch(InterruptedException e){
                            e.printStackTrace();
			}
			if(startball == false){
                            ba.add(new ball());
			}
		}
            }
	});

        Thread t = new Thread(new Runnable(){
            public void run() {
		while(true){
                	if(timestart == false){
                            times = (times-1) ;
                            if(paralyze1){
				time_paralyze--;
                            }
			}
			try{
                            Thread.sleep(1000);
			}catch(InterruptedException e)
			{
                            e.printStackTrace();
			}
		}
            }
	});
	
	playstate1(){
		this.setFocusable(true);
		this.setLayout(null);
                Bstart.setBounds(200,700,100,40);
    		BPause.setBounds(600,100,40,40);
		BExithome.setBounds(600,30,40,40);
		Bresum.setBounds(600, 170, 40,40);
                Bstart.addActionListener(this);
		BPause.addActionListener(this);
		BExithome.addActionListener(this);
		Bresum.addActionListener(this);
		BExithome.addActionListener(this);
		this.add(BPause);
		this.add(BExithome);
		this.add(score);
		this.add(Bresum);
		
		this.addKeyListener(new KeyAdapter(){
                    public void keyPressed(KeyEvent e){
                        int a = e.getKeyCode();
			if(!paralyze1){
			    if(a==KeyEvent.VK_A){
                                if(m.x == 60){
                                   m.x = 60;
                               }
                                else{
                                    m.x-=470;
                                    m.count++;
                                }
                            }
                            else if(a == KeyEvent.VK_D){
                               if(m.x == 530){
                                   m.x = 530;
                               } 
                               else{
                                    m.x+=470;
                                    m.count++;
                               }
			   }
                            if(m.count>=1){
                                m.count=0;
                                m.count+=1;
                            }      
			}
                    }
                    public void keyReleased(KeyEvent e){
			m.count=0;
		    }
		});
		
		m.x = 60;
		time.start();
		actor.start();
		t.start();
		tballs1.start();
		tballs2.start();
                tballs3.start();
		tballs5.start();
                tballs6.start();
                tball.start();
		
                
	}
	
	
	
	public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(HP<=0){
                this.remove(BPause);
                this.remove(Bresum);
                this.remove(BExithome);
                this.add(Bstart);
                this.setLayout(null);
                g.drawImage(feildover2.getImage(),0,0,700,900,this);
		g.setColor(Color.BLACK);
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,40));		
                g.drawString("SCORE   "+scor,280,350);	     
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,70));
     
            }
            else if(times <= 0){
                this.remove(BPause);
                this.remove(Bresum);
                this.remove(BExithome);
                this.add(Bstart);
                this.setLayout(null);
                g.drawImage(feildover.getImage(),0,0,700,900,this);
		g.setColor(Color.BLACK);
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,40));		
                g.drawString("SCORE   "+scor,280,350);	     
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,70));

            }    
            //========================state 1=========================      
            else if(times <= 25){
               
                this.remove(Bstart);
                g.drawImage(imgstate2.getImage(),0,0,700,900,this);
                if(paralyze1){
                    g.drawString("AHHHH !!!", m.x+100, 560);
                }else{
                    g.drawImage(m.im[m.count].getImage(), m.x, 550,110,160, this);
                }
   		if(m.x<0){
                    m.x=this.getWidth()-10;
   		}
   		if(m.x>this.getWidth()){
                    m.x=20;
   		}
                for(int i=0 ; i<ba.size();i++){
                    g.drawImage(ba.get(i).getImage(),ba.get(i).getX(),ba.get(i).getY(),100,100,this);
 		}
                //========================ball1=========================
                /*for(int i=0 ; i<ba1.size();i++){
                    g.drawImage(ba1.get(i).getImage(),ba1.get(i).getX(),ba1.get(i).getY(),100,100,this);
 		}*/

		//========================ball3=========================
		for(int i=0 ; i<ba3.size();i++){
		    g.drawImage(ba3.get(i).getImage(),ba3.get(i).getX(),ba3.get(i).getY(),100,100,this);
		 }

		//=================================ball6=============
		for(int i=0 ; i<ba6.size();i++){
		    g.drawImage(ba6.get(i).getImage(),ba6.get(i).getX(),ba6.get(i).getY(),100,100,this);
		}

		 for(int j=0 ; j<ba.size();j++){
		    if(Intersect(m.getbound(),ba.get(j).getbound())){
			ba.remove(j);
                        HP=HP +1;
                    }     
		}
                for(int j=0 ; j<ba3.size();j++){
		    if(Intersect(m.getbound(),ba3.get(j).getbound())){
			ba3.remove(j);
                        scor +=5;
                    }     
		}
                /*for(int j=0 ; j<ba1.size();j++){
		    if(Intersect(m.getbound(),ba1.get(j).getbound())){
			ba1.remove(j);
			HP=HP+1;
                    }     
		}*/
                for(int j=0 ; j<ba6.size();j++){
		    if(Intersect(m.getbound(),ba6.get(j).getbound())){
			ba6.remove(j);
			HP=HP-2;
                    }     
		}

                //========================interface 2=========================
		g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,30));
		g.setColor(Color.WHITE);
                g.drawImage(sc.getImage(),80,30,100,100,this);
		g.drawString("  "+scor,180, 100);	     
		g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,50));
                g.drawImage(state2.getImage(),270,-5,200,120,this);   
		g.drawImage(ck.getImage(),270,150,60,60,this);
		g.drawString(" "+times,320,200);
                g.drawImage(hp.getImage(),100,150,60,60,this);
		g.drawString("  "+HP,160,200);
		//========================state 1=========================      
            }else if(times <= 0 || HP<=0){
                this.remove(Bstart);
		this.remove(BPause);
		this.remove(Bresum);
		this.remove(BExithome);
                this.setLayout(null);
                g.drawImage(feildover.getImage(),0,0,700,900,this);
                g.setColor(Color.BLACK);
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,40));		
		g.drawString("SCORE   "+scor,380,200);	     
		g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,70));
		g.drawString("GAME OVER",290,150);
		g.drawImage(imgmeleon.getImage(), 100, 360, 400, 400, this);
            }else{
                this.remove(Bstart);
                g.drawImage(imgstate1.getImage(),0,0,700,900,this);
                if(paralyze1){
                    g.setColor(Color.RED);
                    g.setFont(new Font("Hobo Std",Font.BOLD,50));
                    //g.drawImage(img_paralyze.getImage(), m.x, 550,100,150, this);
                    g.drawString("-10",m.x+200,650);
                    g.drawString("AHHHH !!!", m.x+100, 560);
                }else{
                    g.drawImage(m.im[m.count].getImage(), m.x, 600,110,160, this);
                }
		if(m.x<0){
                    m.x=this.getWidth()-10;
		}
		if(m.x>this.getWidth()){
                    m.x=20;
                }
		  for(int i=0 ; i<ba.size();i++){
                    g.drawImage(ba.get(i).getImage(),ba.get(i).getX(),ba.get(i).getY(),100,100,this);}
		//========================================ball1================= 
        
                /*for(int i=0 ; i<ba1.size();i++){
                    g.drawImage(ba1.get(i).getImage(),ba1.get(i).getX(),ba1.get(i).getY(),100,100,this);
 		}*/

		//========================ball2=========================
		for(int i=0 ; i<ba2.size();i++){
		    g.drawImage(ba2.get(i).getImage(),ba2.get(i).getX(),ba2.get(i).getY(),100,100,this);
		 }

		//=================================ball5=============
		for(int i=0 ; i<ba5.size();i++){
		    g.drawImage(ba5.get(i).getImage(),ba5.get(i).getX(),ba5.get(i).getY(),100,100,this);
		}
                for(int j=0 ; j<ba.size();j++){
		    if(Intersect(m.getbound(),ba.get(j).getbound())){
			ba.remove(j);
                        HP=HP +1;
                    }     
		}
		for(int j=0 ; j<ba5.size();j++){
		    if(Intersect(m.getbound(),ba5.get(j).getbound())){
			ba5.remove(j);
			HP=HP-1;
                    }     
		}
                //for(int j=0 ; j<ba1.size();j++){
		//    if(Intersect(m.getbound(),ba1.get(j).getbound())){
		//	ba1.remove(j);
		//	HP=HP+1;
                //    }     
		//}
                for(int j=0 ; j<ba2.size();j++){
		    if(Intersect(m.getbound(),ba2.get(j).getbound())){
			ba2.remove(j);
			scor += 20;
                    }     
		}
                //========================interface 1=========================
		g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,30));
		g.setColor(Color.BLACK);
                g.drawImage(sc.getImage(),80,30,100,100,this);
		g.drawString("  "+scor,180, 100);	     
		g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,50));
                g.drawImage(state1.getImage(),260,-5,200,120,this);
		//g.drawString("STATE "+rs1,250,80);
                g.drawImage(ck.getImage(),270,150,60,60,this);
		g.drawString(" "+times,320,200);
		g.setColor(Color.RED);
                g.drawImage(hp.getImage(),100,150,60,60,this);
		g.drawString(" "+HP,170,200);
		      
	    }

	}

	public boolean Intersect(Rectangle2D a, Rectangle2D b){
		return (a.intersects(b));
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== BStartover){		
                    this.setSize(1000,800);
                    this.add(hg);
                    this.setLocation(null);
                    timestart = true;
                    startball = true;
		}else if(e.getSource() == BExitover){
                    System.exit(0);
		}		
	}
}
