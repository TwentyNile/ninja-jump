package javaapplication7;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;
import java.util.Random;
public class ball1 {
int[] items = new int[]{60,540};
Random rand = new Random();
int ra(){
        return items[rand.nextInt(items.length)*300];
    }


Image img;
public int y = 0;
public int x= (int) (items[rand.nextInt(items.length)]);
public int count = 0;
ball1(){
String imageLocation ="ball1.png";
URL imageURL = this.getClass().getResource(imageLocation);
img = Toolkit.getDefaultToolkit().getImage(imageURL);
runner.start();
}
Thread runner = new Thread(new Runnable() {
@Override
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

runner.sleep(10);

}catch(InterruptedException e){}
}
}
});
public Image getImage(){
return img;
}
public int getX(){
return x;
}
public int getY(){
return y;
}
public Rectangle2D getbound(){
return (new Rectangle2D.Double(x,y,25,25));
}
}