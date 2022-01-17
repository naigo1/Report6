package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
/**
 * ライオンクラス
 * String name; //ライオンの名前
 * String initials; ライオンの頭文字
 * int number; //ライオンの番号
 * ArrayList<Integer> actionPoint; //ライオンの行動可能領域
 */
public class Lion extends Piece{
    private final String name = "ライオン";
    private  String initials = "ラ";
    private int number = 0;
    private ArrayList<Integer>actionPoint = new ArrayList<Integer>();
    /**
     * コンストラクタ
     * @param initials ライオンの頭文字
     */
    public Lion(String initials){
        this.initials = initials;
    }
    /**
     * コンストラクタ
     * @param number　ライオンの番号
     */
    public Lion(int number){
        
        this.number = number;
    }
    /**
     * コンストラクタ
     * @param number　ライオンの番号
     * @param initials　ライオンの頭文字
     */
    public Lion(int number, String initials){
        this.initials = initials;
        this.number = number;
    }
    /**
     * コンストラクタ
     */
    public Lion(){}

    /** 
     * ライオンの名前を返すメソッド
     * @return name ライオンの名前
     */
    @Override
    public String getName(){
        return this.name;
    }
    /**
     * ライオンの番号を返すメソッド
     * @return number ライオンの番号
     */
    @Override
    public int getNumber(){
        return this.number;
    }
    /**
     * ライオンの頭文字を返すメソッド
     * @return initials ライオンの頭文字
     */
    @Override
    public String getInitials(){
        return this.initials;
    }
    /**
     * ライオンの番号を設定するメソッド
     * @param number ライオンの番号
     */
    @Override
    public  void setNumber(int number){
        this.number = number;
    }
    /**
     * ライオンの行動可能域を示すメソッド
     * @param position 駒の位置
     * @return actionPoint 駒の位置から移動可能な位置
     */
    @Override
    public ArrayList<Integer> moveNumber(int position){
        this.actionPoint = new ArrayList<Integer>();
        this.actionPoint.add(upper(position));
        this.actionPoint.add(lower(position));
        this.actionPoint.add(right(position));
        this.actionPoint.add(left(position));
        this.actionPoint.add(rightUpper(position));
        this.actionPoint.add(leftUpper(position));
        this.actionPoint.add(rightLower(position));
        this.actionPoint.add(leftLower(position));
        return  this.actionPoint;
    }

    
}
