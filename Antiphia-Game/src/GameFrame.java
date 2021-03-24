import java.awt.*;
import javax.swing.*;

import MainMenu.*;

public class GameFrame extends JFrame{

    MainMenu mm;

    public GameFrame(){
        mm = new MainMenu();
        this.add(mm);
        this.setTitle("Antifia");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void setPanel(JPanel panel){

    }
}
