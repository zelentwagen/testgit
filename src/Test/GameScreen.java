package Test;

import javax.swing.*;
import java.awt.*;

public class GameScreen {

    BorderLayout border;
    JFrame frame;
    GridLayout grid;
    JPanel panel;

    public GameScreen() {

        frame = new JFrame("SeaBattle");
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(border);


        grid = new GridLayout(10, 10, 0 ,0);
        panel = new JPanel();
        panel.setLayout(grid);
        panel.setSize(600, 600);

        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
                panel.add(new JButton("" + i + j));
            }

        }
        frame.add(panel, BorderLayout.CENTER);

    }
}
