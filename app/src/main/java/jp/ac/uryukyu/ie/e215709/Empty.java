package jp.ac.uryukyu.ie.e215709;

public class Empty implements Piece{
    private  String initials = "　";
    private  int number = 10;
    public int getNumber(){
        return this.number;
    }
    public String getInitials(){
        return this.initials;
    }
    public int[] moveNumber(int position){
        int[]result = new int[]{position};
        return result;
    }
    public void classChange(){

    }

}
