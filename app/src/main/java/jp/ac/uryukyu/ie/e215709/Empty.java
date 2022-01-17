package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
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
