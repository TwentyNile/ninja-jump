package javaapplication7;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ninja extends JPanel{
    public ImageIcon[] im = new ImageIcon[2];
    public int x;
    public int count = 0;
    int size;
public    ninja(){
        for(int i=0;i<im.length;i++){
            String imageLocation = "y"+(i+1)+".png";
            im[i] =new ImageIcon(this.getClass().getResource(imageLocation));
	}
    }
    public Rectangle2D getbound(){
    	return (new Rectangle2D.Double(x,550,50,50));
    }
}


