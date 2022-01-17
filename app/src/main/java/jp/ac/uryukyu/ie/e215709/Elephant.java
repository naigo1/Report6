package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
public class Elephant extends Piece{
    private final String name = "ゾウ";
    private  String initials = "ゾ";
    private int number = 0;
    private ArrayList<Integer>actionPoint = new ArrayList<Integer>();
    
    public Elephant(String initials){
        this.initials = initials;
    }

    public Elephant(int number){
        
        this.number = number;
    }

    public Elephant(int number, String initials){
        this.initials = initials;
        this.number = number;
    }

    public Elephant(){}

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
        this.actionPoint.add(rightUpper(position));
        this.actionPoint.add(leftUpper(position));
        this.actionPoint.add(rightLower(position));
        this.actionPoint.add(leftLower(position));
        
        return this.actionPoint;
    }

    @Override
    public void classChange(){
        System.out.println("！");
    }
}
