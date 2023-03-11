import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {

    // Game colorBG
    static Color gameBGColor;
    GamePanel panel;

    GameFrame() {

        // Create label with player names
       // JLabel playerNamesLabel = new JLabel(player1Name + " vs. " + player2Name);
       // playerNamesLabel.setFont(new Font("Arial", Font.BOLD, 20));
       // playerNamesLabel.setForeground(Color.black);
        //playerNamesLabel.setHorizontalAlignment(JLabel.CENTER);
        
        // Add panel and label to frame
       // this.add(panel, BorderLayout.CENTER);
        //this.add(playerNamesLabel, BorderLayout.NORTH);

        
            panel = new GamePanel();
            this.add(panel);
            this.setTitle("Pong!");
            this.setResizable(false);
            this.setBackground(gameBGColor);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.pack();
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }
    }


