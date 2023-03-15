import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlayAgain extends JFrame{
    PlayAgain(String winner){

        // JButtons
        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        // JLabel for image
        JLabel imageLabel = new JLabel();

        // Image shown at PlayAgain
        ImageIcon imagePA = new ImageIcon("gold.gif");
        
        // Set image to label
        imageLabel.setIcon(imagePA);
        
        //JLabel for texts
        JLabel textLabel = new JLabel(winner + " wins!");
        textLabel.setFont(new Font("Impact", Font.BOLD, 30));
        textLabel.setForeground(Color.BLACK);

        JLabel textLabel1 = new JLabel("Congratulations!");
        textLabel.setFont(new Font("Impact", Font.BOLD, 30));
        textLabel.setForeground(Color.BLACK);

        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 30));

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 30));

        // Event Handlers 
        tryAgainEventHandler handler = new tryAgainEventHandler();
        tryAgainButton.addActionListener(handler);
        
        ExitHandler Exithandler = new ExitHandler();
        exitButton.addActionListener(Exithandler);

        
        this.add(textLabel);
        this.add(imageLabel);
        this.add(textLabel1);
        this.add(tryAgainButton);
        this.add(exitButton);

    
        //Frame title
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("Pong!");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(350,400);
        // Puts frame in the middle 
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // set Background color
        this.getContentPane().setBackground(Color.WHITE);
    }

    // Event Handler
    private class tryAgainEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // Goes to game frame
            new Customizations();

            // Closes frame
            dispose();

        }
    }
        private class ExitHandler implements ActionListener{
            public void actionPerformed(ActionEvent event){

            dispose();
        }

    }
}