package jp.ac.uryukyu.ie.e215709;

public class BabyBird implements Piece {
    private final String name = "ひよこ";
    private  String initials = "ひ";
    private int number = 0;
    
    BabyBird(String initials){
        this.initials = initials;
    }

    BabyBird(int number){
        
        this.number = number;
    }

    BabyBird(int number, String initials){
        this.initials = initials;
        this.number = number;
    }

    BabyBird(){}

    public String getName(){
        return this.name;
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public String getInitials(){
        return this.initials;
    }

    @Override
    public int[] moveNumber(int position){
        int[]result;
        if(this.number == 0){
            result = new int[]{position+3};
            return  result;
        }
        else{
            result = new int[]{position-3};
            return result ;
        }
    }

    @Override
    public void classChange(){
        System.out.println("鶏に進化します！");
    }

    
}