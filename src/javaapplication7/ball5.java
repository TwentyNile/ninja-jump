package javaapplication7;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;
public class ball5 extends ball1{
    Image img;
    public int count = 0;
    ball5(){
        String imageLocation = "newbd.png";
        URL imageURL1 = this.getClass().getResource(imageLocation);
	img = Toolkit.getDefaultToolkit().getImage(imageURL1);
	runner.start();
    }
    Thread runner = new Thread(new Runnable() {
	public void run() {
            while(true){
		y += 5;
		if(y >= 1100){
                    img = null;
                    runner = null;
                    x = -500;
                    y = -500;
		}
		try{
                    runner.sleep(80);
		}catch(InterruptedException e){}
            }
	}
    });
    public Image getImage(){
	return img;
    }

}
