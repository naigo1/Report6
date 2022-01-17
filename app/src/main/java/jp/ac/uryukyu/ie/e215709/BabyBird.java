package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
/**
 * ひよこクラス
 * String name; //ひよこの名前
 * String initials; ひよこの頭文字
 * int number; //ひよこの番号
 * ArrayList<Integer> actionPoint; //ひよこの行動可能領域
 */
public class BabyBird extends Piece {
    private final String name = "ひよこ";
    private  String initials = "ひ";
    private int number = 0;
    private ArrayList<Integer>actionPoint = new ArrayList<Integer>();
    /** 
     * BabyBirdのコンンストラクタ
     * @param initials BabyBirdの頭文字
    */
    public BabyBird(String initials){
        this.initials = initials;
    }
    /**
     * BabyBirdのコンストラクタ
     * @param number　BabyBirdの番号
     */
    public BabyBird(int number){
        
        this.number = number;
    }
    /**
     * BabyBirdのコンストラクタ
     * @param number　BabyBirdの番号
     * @param initials　BabyBirdの頭文字
     */
    public BabyBird(int number, String initials){
        this.initials = initials;
        this.number = number;
    }
    /**
     * BabyBirdのコンストラクタ
     */
    public BabyBird(){}
    /**
     * BabyBirdの名前を返すメソッド
     * @return name BabyBirdの名前
     */
    @Override
    public String getName(){
        return this.name;
    }
    /**
     * BabyBirdの番号を返すメソッド
     * @return number BabyBirdの番号
     */
    @Override
    public int getNumber(){
        return this.number;
    }
    /**
     * BabyBirdの頭文字を返すメソッド
     * @return initials BabyBirdの頭文字
     */
    @Override
    public String getInitials(){
        return this.initials;
    }
    /**
     * BabyBirdの番号を変更するメソッド
     * @param number BabyBirdの番号
     */
    @Override
    public  void setNumber(int number){
        this.number = number;
    }
    /**
     * @param position BabyBirdの位置(数字)
     * @return actionPoint BabyBirdの行動可能領域(数字)
     */
    @Override
    public ArrayList<Integer> moveNumber(int position){
        this.actionPoint = new ArrayList<Integer>();
        this.actionPoint.add(upper(position));
        
        return this.actionPoint;
    }

    

    
}