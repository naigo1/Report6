package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
public class Giraffe extends Piece{
    private final String name = "キリン";
    private  String initials = "キ";
    private int number = 0;
    private ArrayList<Integer>actionPoint = new ArrayList<Integer>();
    
    public Giraffe(String initials){
        this.initials = initials;
    }

    public Giraffe(int number){
        
        this.number = number;
    }

    public Giraffe(int number, String initials){
        this.initials = initials;
        this.number = number;
    }

    public Giraffe(){}

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
        this.actionPoint.add(right(position));
        this.actionPoint.add(left(position));
        this.actionPoint.add(lower(position));
        this.actionPoint.add(upper(position));
        
        return this.actionPoint;
    }

    @Override
    public void classChange(){
        System.out.println("！");
    }
}
