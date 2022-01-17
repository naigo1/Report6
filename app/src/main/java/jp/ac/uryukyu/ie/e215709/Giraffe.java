package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
/**
 * キリンクラス
 * String name; //キリンの名前
 * String initials; キリンの頭文字
 * int number; //キリンの番号
 * ArrayList<Integer> actionPoint; //キリンの行動可能領域
 */
public class Giraffe extends Piece{
    private final String name = "キリン";
    private  String initials = "キ";
    private int number = 0;
    private ArrayList<Integer>actionPoint = new ArrayList<Integer>();
    /**
     * コンストラクタ
     * @param initials キリンの頭文字
     */
    public Giraffe(String initials){
        this.initials = initials;
    }
    /**
     * コンストラクタ
     * @param number　キリンの番号
     */
    public Giraffe(int number){
        
        this.number = number;
    }
    /**
     * コンストラクタ
     * @param number　キリンの番号
     * @param initials　キリンの頭文字
     */
    public Giraffe(int number, String initials){
        this.initials = initials;
        this.number = number;
    }
    /**
     * コンストラクタ
     */
    public Giraffe(){}
    /**
     * キリンの名前を返すメソッド
     * @return name キリンの名前
     */
    @Override
    public String getName(){
        return this.name;
    }
    /**
     * キリンの番号を返すメソッド
     * @return　number キリンの番号
     */
    @Override
    public int getNumber(){
        return this.number;
    }
    /**
     * キリンの頭文字を返すメソッド
     * @return　initials キリンの頭文字
     */
    @Override
    public String getInitials(){
        return this.initials;
    }
    /**
     * キリンの番号を設定するメソッド
     * @param number キリンの番号
     */
    @Override
    public  void setNumber(int number){
        this.number = number;
    }
    /**
     * キリンの行動可能域を示すメソッド
     * @param position 駒の位置
     * @return actionPoint 駒の位置から移動可能な位置
     */
    @Override
    public ArrayList<Integer> moveNumber(int position){
        this.actionPoint = new ArrayList<Integer>();
        this.actionPoint.add(right(position));
        this.actionPoint.add(left(position));
        this.actionPoint.add(lower(position));
        this.actionPoint.add(upper(position));
        
        return this.actionPoint;
    }

    
}
