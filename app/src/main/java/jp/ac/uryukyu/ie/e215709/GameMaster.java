package jp.ac.uryukyu.ie.e215709;
import java.util.Scanner;
import java.util.InputMismatchException;
public class GameMaster {
    Bord bord1;
    Player player1;
    Player player2;

    public void setGame(){
        bord1 = new Bord();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("名前を入力してください > ");
        String input1 = scanner1.nextLine();
        player1 = new Player(input1,0);
        System.out.print("名前を入力してください > ");
        input1 = scanner1.nextLine();
         player2 = new Player(input1,1);
        bord1.setBord();
        bord1.printBord();
    }
    public void startGame(){
        
        int i = 0;
        while( i<3){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(player1.getName()+"の番。1:パス 2:行動する 3:投降 > ");
                i = scanner.nextInt();
                if(i==2){
                    System.out.print("どの駒をどこに動かしますか？>");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    bord1.pieceAction(x,y,player1);
                    bord1.printBord();
                }
                
              } catch (InputMismatchException e) { 
                System.out.println("整数を入力してください。");
              }
            
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(player2.getName()+"の番。1:パス 2:行動する 3:投降 > ");
                i = scanner.nextInt();
                if(i==2){
                    System.out.print("どの駒をどこに動かしますか？>");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    bord1.pieceAction(x,y,player2);
                    bord1.printBord();
                }
                
              } catch (InputMismatchException e) { 
                System.out.println("整数を入力してください。");
              }
              
        }
        
    }
}
