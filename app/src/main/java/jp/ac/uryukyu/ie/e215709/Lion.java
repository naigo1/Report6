package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
public class Lion extends Piece{
    private final String name = "ライオン";
    private  String initials = "ラ";
    private int number = 0;
    private ArrayList<Integer>actionPoint = new ArrayList<Integer>();

    public Lion(String initials){
        this.initials = initials;
    }

    public Lion(int number){
        
        this.number = number;
    }

    public Lion(int number, String initials){
        this.initials = initials;
        this.number = number;
    }

    public Lion(){}

    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public int getNumber(){
        return this.number;
    }

    @Override
    public String getInitials(){
        return this.initials;
    }
    @Override
    public  void setNumber(int number){
        this.number = number;
    }
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

    @Override
    public void classChange(){
        System.out.println("！");
    }

}
