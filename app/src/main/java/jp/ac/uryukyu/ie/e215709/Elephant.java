package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
/**
 * ゾウクラス
 * String name; //ゾウの名前
 * String initials; ゾウの頭文字
 * int number; //ゾウの番号
 * ArrayList<Integer> actionPoint; //ゾウの行動可能領域
 */
public class Elephant extends Piece{
    private final String name = "ゾウ";
    private  String initials = "ゾ";
    private int number = 0;
    private ArrayList<Integer>actionPoint = new ArrayList<Integer>();
    /**
     * コンストラクタ
     * @param initials ゾウの頭文字
     */
    public Elephant(String initials){
        this.initials = initials;
    }
    /**
     * コンストラクタ
     * @param number　ゾウの番号
     */
    public Elephant(int number){
        
        this.number = number;
    }
    /**
     * コンストラクタ
     * @param number　ゾウの番号
     * @param initials　ゾウの頭文字
     */
    public Elephant(int number, String initials){
        this.initials = initials;
        this.number = number;
    }
    /**
     * コンストラクタ
     */
    public Elephant(){}
    /**
     * ゾウの名前を返すメソッド
     * @return name ゾウの名前
     */
    @Override
    public String getName(){
        return this.name;
    }
    /**
     * ゾウの番号を返すメソッド
     * @return number ゾウの番号
     */
    @Override
    public int getNumber(){
        return this.number;
    }
    /**
     * ゾウの頭文字を返すメソッド
     * @return initials ゾウの頭文字
     */
    @Override
    public String getInitials(){
        return this.initials;
    }
    /**
     * ゾウの番号を設定するメソッド
     * @param number ゾウの番号
     */
    @Override
    public  void setNumber(int number){
        this.number = number;
    }

    /**
     * ゾウの行動可能域を示すメソッド
     * @param position 駒の位置
     * @return actionPoint 駒の位置から移動可能な位置
     */
    @Override
    public ArrayList<Integer> moveNumber(int position){
        this.actionPoint = new ArrayList<Integer>();
        this.actionPoint.add(rightUpper(position));
        this.actionPoint.add(leftUpper(position));
        this.actionPoint.add(rightLower(position));
        this.actionPoint.add(leftLower(position));
        
        return this.actionPoint;
    }

    
}
