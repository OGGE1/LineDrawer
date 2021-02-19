import javax.management.remote.JMXPrincipal;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Oscar Norman <br>
 * Date: 2020-12-01   <br>
 * Time: 17:02   <br>
 * Project: LineDrawer <br>
 */
public class MyPanel extends JPanel {
    Random rand = new Random();
    private int x;

    public MyPanel() {
        this.setPreferredSize(new Dimension(1280, 720));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        int itr = 0;

        while (itr < 100000) {
            setX(randomX());
            g2D.drawLine(randomX(), randomX(), randomX(), randomX());
            g2D.setColor(randomColor());
            g2D.setStroke(new BasicStroke(randomWidth()));
            itr += 1;
        }
    }

    public int randomWidth() {
        return rand.nextInt(10) + 1;
    }

    public Color randomColor() {
        int colorNum = rand.nextInt(10) +1;

        if (colorNum == 1)
            return Color.BLACK;
         else if (colorNum == 2)
             return Color.RED;
         else if (colorNum == 3)
             return Color.YELLOW;
         else if (colorNum == 4)
             return Color.BLUE;
         else if(colorNum == 5)
             return Color.CYAN;
         else if (colorNum == 6)
             return Color.DARK_GRAY;
         else if (colorNum == 7)
             return Color.GREEN;
         else if (colorNum == 8)
             return Color.PINK;
         else if (colorNum == 9)
             return Color.MAGENTA;
         else if (colorNum == 10)
             return Color.WHITE;
         else
             return null;
    }
    public int randomY() {
        return rand.nextInt(720) + 1;
    }

    public int randomX() {
        return rand.nextInt(1280) + 1;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getX() {
        return x;
    }
}
