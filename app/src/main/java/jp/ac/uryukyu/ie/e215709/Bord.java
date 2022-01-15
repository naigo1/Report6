package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
public class Bord {
    private ArrayList<Piece> bordList = new ArrayList<Piece>(12);
    

    public ArrayList<Piece> getBordList(){
        return this.bordList;
    }

    public void pieceAction(int position,int wantPosition){
        
        int[] storePosition = bordList.get(position).moveNumber(position);
        
        for(int i:storePosition){
            if(i == wantPosition){
                
                if (bordList.get(wantPosition).getNumber() == bordList.get(position).getNumber()){
                    System.out.println("行動できません");
                }else{
                    bordList.set(wantPosition,bordList.get(position));
                    bordList.set(position,new Empty());
                    System.out.println("行動できた");
                }
            }
            
        }
    }
    public void setBord(){
        for(int i=0; i<12; i++){
        this.bordList.add(new Empty());
        }
        this.bordList.set(4,new BabyBird());
        this.bordList.set(7,new BabyBird(1,"雛"));
        
    }

    public void printBord(){
        int number = 0;
        for(var i:bordList){
            System.out.print("｜");
            System.out.print(i.getInitials());
            number += 1;
            if(number%3 == 0){
                System.out.println();
                for(int i1 = 0;i1<6; i1++){
                    System.out.print("ー");  
                }
                System.out.println();
            }
           
        }    
        
        System.out.println();
        
    }
}
