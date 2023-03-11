import java.awt.*;

public class PlayerName extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    String player1Name;
    String player2Name;

    PlayerName(int GAME_WIDTH, int GAME_HEIGHT) {
        PlayerName.GAME_WIDTH = GAME_WIDTH;
        PlayerName.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void setPlayerNames(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        
        
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);



        // dito nagcchange ang name
        //this code shows null instead of the names that was typed in EnterPlayerNames class
        g.drawString(this.player1Name + " ", (GAME_WIDTH / 2) - 330, 50);
        g.drawString(this.player2Name + " ", (GAME_WIDTH / 2) + 200, 50);

        //change this.player1name or this player2Name into "Name" to see changes
        //example
        //g.drawString("Sana" + " ", (GAME_WIDTH / 2) - 330, 50);
        //g.drawString("Dahyun" + " ", (GAME_WIDTH / 2) + 200, 50);
        
    }
    

}
