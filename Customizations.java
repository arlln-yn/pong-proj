import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class Customizations extends JFrame{

    // Color name array
    private String[] colorNameArray = {"GRAY", "LIGHT GRAY", "GREEN", "BLACK"};
    // Color list array
    private Color[] colorListArray = {Color.GRAY, Color.LIGHT_GRAY, Color.GREEN, Color.BLACK};

    // JLIst
    JList colorList;
    
    Customizations(){
        // JLabel
        JLabel label = new JLabel();
        label.setText("Choose the color: ");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        // JList
        colorList = new JList(colorNameArray);
        colorList.setFont(new Font("Arial", Font.BOLD, 25));

        // Allows only once selection in the list
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Add Event Handler
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        // Add list to frame 
        this.add(colorList);

                //Frame title
                this.setLayout(new FlowLayout());
                // Frame title
               this.setTitle("Pong!");
               // Terminates java program on close
               this.setDefaultCloseOperation(EXIT_ON_CLOSE);
               // Frame size
               this.setSize(300,400);
               // Puts frame in the middle 
               this.setLocationRelativeTo(null);
               // Make frame appear
               this.setVisible(true);
               // Disable resize
               this.setResizable(false);
               // set Background color
               this.getContentPane().setBackground(Color.WHITE);

    }
    private class EventHandler implements ListSelectionListener{
        
        public void valueChanged(ListSelectionEvent event){
            GameFrame gp = new GameFrame();
            gp.gameBGColor = colorListArray[colorList.getSelectedIndex()];

            // open Game Frame
            new GameFrame();
            // close game frame
            dispose();
        }
    }
    
}
    // Character color can be changed
    // Ingame texts can be changed
