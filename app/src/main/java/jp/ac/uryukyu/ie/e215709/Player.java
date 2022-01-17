package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
/**
 * playerクラス
 * String name; //playerの名前
 * int playerNumber; //playerの番号
 * ArrayList<Piece> havePiece //playerが持つ駒
 */
public class Player {
    private String name;
    private int playerNumber ;
    private ArrayList<Piece> havePiece = new ArrayList<Piece>(4);
    /**
     * コンストラクタ
     * @param name　playerの名前
     * @param number　playerの番号
     */
    public Player(String name,int number){
        this.name = name;
        this.playerNumber = number;
        
    }
    /**
     * playerの名前を返すメソッド
     * @return name playerの名前
     */
    public String getName(){
        return this.name;
    }
    /**
     * playerの番号を返すメソッド。
     * @return playerNumber playerの番号
     */
    public int playerNumber(){
        return this.playerNumber;
    }
    /**
     * 駒を獲得するメソッド。
     * @param piece　playerが獲得する駒。
     */
    public void getPiece(Piece piece){
        
        piece.setNumber(this.playerNumber);
        this.havePiece.add(piece);
        System.out.println( getName()+ "は" +piece.getName() +"を獲得した。" );
    }
    
}
