package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
/**
 * 空クラス
 * String name; //空の名前
 * String initials; 空の頭文字
 * int number; //空の番号
 * ArrayList<Integer> actionPoint; //空の行動可能領域
 */
public class Empty extends Piece{
    private final String name = "空";
    private  final String initials = "　";
    private  final int number = 10;
    private ArrayList<Integer>actionPoint = new ArrayList<Integer>();
    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }
    public String getInitials(){
        return this.initials;
    }
    
    @Override
    public  void setNumber(int number){
        System.out.println("変更できません");
    }
    public ArrayList<Integer> moveNumber(int position){
        this.actionPoint = new ArrayList<Integer>();
        this.actionPoint.add(position);
        return actionPoint;
    }
    public void classChange(){

    }

}
