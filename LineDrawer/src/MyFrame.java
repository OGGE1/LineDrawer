import javax.swing.*;
import java.awt.*;

/**
 * Created by Oscar Norman <br>
 * Date: 2020-12-01   <br>
 * Time: 17:01   <br>
 * Project: LineDrawer <br>
 */
public class MyFrame extends JFrame {
    MyPanel panel;

    public MyFrame() {
        panel = new MyPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
