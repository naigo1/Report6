package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
public class Bord {
    private ArrayList<Piece> bordList = new ArrayList<Piece>(12);
    

    public ArrayList<Piece> getBordList(){
        return this.bordList;
    }

    public void pieceAction(int position,int wantPosition,Player player){
        
        ArrayList<Integer> storePosition = bordList.get(position).moveNumber(position);
        if(position!=wantPosition){
            for(var i:storePosition){
                if(i == wantPosition){
                    
                    if (bordList.get(wantPosition).getNumber() == bordList.get(position).getNumber()){
                        System.out.println("行動できません");
                    }else if(bordList.get(wantPosition).getNumber() == 10) {
                        bordList.set(wantPosition,bordList.get(position));
                        bordList.set(position,new Empty());
                        System.out.println("行動できた");
                    }else{
                        player.getPiece(bordList.get(wantPosition));
                        bordList.set(wantPosition,bordList.get(position));
                        bordList.set(position,new Empty());
                        System.out.println("行動できた");
                    }
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
        this.bordList.set(1,new Lion());
        this.bordList.set(10,new Lion(1,"王"));
        this.bordList.set(0,new Elephant());
        this.bordList.set(11,new Elephant(1,"象"));
        this.bordList.set(2,new Giraffe());
        this.bordList.set(9,new Giraffe(1,"麒"));
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
