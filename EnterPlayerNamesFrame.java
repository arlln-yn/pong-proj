import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EnterPlayerNamesFrame extends JFrame {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    PlayerName playerName;

    JLabel player1Label;
    JTextField player1TextField;
    JLabel player2Label;
    JTextField player2TextField;
    JButton startButton;
    EnterPlayerNamesFrame(){


        // Title
        JLabel textLabel = new JLabel("Enter Player Names");
        textLabel.setFont(new Font("Impact", Font.BOLD, 30));
        textLabel.setForeground(Color.BLACK);

        // Image 
        JLabel imageLabel0 = new JLabel();
        ImageIcon imageMM0 = new ImageIcon("pingpong.gif");

        // Set image to label 
        imageLabel0.setIcon(imageMM0);

        // Player names
        player1Label = new JLabel("Player 1:                                                 ");
        player1TextField = new JTextField();
        player2Label = new JLabel("Player 2:");
        player2TextField = new JTextField();


        // JButton
        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("Impact", Font.BOLD, 28));
        
        //Frame title
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("Pong!");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(300,380);
        // Puts frame in the middle 
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // set Background color
        this.getContentPane().setBackground(Color.WHITE);


        // add event to start button
        EventHandler sHandler = new EventHandler();
        startButton.addActionListener(sHandler);

        // Create panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        
        // Add label to frame 
        this.add(textLabel);
        this.add(imageLabel0);
        
        // Add panel to frame
        this.add(panel);

        // Add components to panel
        panel.add(player1Label);
        panel.add(player1TextField);
        panel.add(player2Label);
        panel.add(player2TextField);
        this.add(startButton);


    }

    // Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
        
            // Retrieve player names from text fields
            String player1Name = player1TextField.getText().trim();
            String player2Name = player2TextField.getText().trim();

            playerName = new PlayerName(GAME_WIDTH, GAME_HEIGHT);
            playerName.setPlayerNames(player1Name, player2Name);
        
            // Create new GameFrame object with player names as parameters
            new Customizations();

            
            
            // Close current frame
            dispose();
        }
    }
}    
    

