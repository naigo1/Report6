package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
public class Player {
    private String name;
    private int playerNumber ;
    private ArrayList<Piece> havePiece = new ArrayList<Piece>(4);
    
    public Player(String name,int number){
        this.name = name;
        this.playerNumber = number;
        
    }
        
    public String getName(){
        return this.name;
    }

    public int playerNumber(){
        return this.playerNumber;
    }

    public void getPiece(Piece piece){
        
        piece.setNumber(this.playerNumber);
        this.havePiece.add(piece);
        System.out.println( getName()+ "は" +piece.getName() +"を獲得した。" );
    }
    
}
