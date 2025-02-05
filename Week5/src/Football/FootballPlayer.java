/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Football;

/**
 *
 * @author User
 */
public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;
    
    public void setPlayerNumber(int n) {
        playerNumber = n;
    }
    
    public void setPosition(String p) {
        position = p;
    }
    
    public int getPlayerNumber() {
        return playerNumber;
    }
    
    public String getPosition() {
        return position;
    }
    
    public boolean isSamePosition(FootballPlayer p) {
        if ((this.getTeam().equals(p.getTeam())) && (this.getPosition().equals(p.getPosition()))) {
            return true;
        } else {
            return false;
        }
    }
}
