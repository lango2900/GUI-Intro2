import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("JFRAME title goes here"); // sets title of window
        this.setSize(420,420); // sets the x & y dimension of frame
        this.setVisible(true); // makes frame visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits application on close (doesnt do this normally)
        this.setResizable(false); // user cannot resize window

        ImageIcon image = new ImageIcon("foams.jpg"); // creates image icon based on filename
        this.setIconImage(image.getImage()); // changes icon of frame

        // frame.getContentPane().setBackground(Color.magenta); // changes color of JFrame background
        this.getContentPane().setBackground(new Color(255,255,255)); // based on rgb values, makes custom color


    }


}

