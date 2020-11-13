package javaapplication7;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class meleonr extends JPanel{
    public ImageIcon[] imm = new ImageIcon[2];
    public int x;
    public int count = 0;
    int size;
    meleonr(){
        for(int i=0;i<imm.length;i++){
            String imageLocation = "x"+(i+1)+".png";
            imm[i] =new ImageIcon(this.getClass().getResource(imageLocation));
	}
    }
    public Rectangle2D getbound(){
    	return (new Rectangle2D.Double(x,550,50,50));
    }
}


