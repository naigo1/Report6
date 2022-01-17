package jp.ac.uryukyu.ie.e215709;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PieceActionTest {
    /**
     * 進めた駒が正常に行動できたかを検証
     * 検証手順
     * 1.二つの盤を用意する
     * 2.一つ目の盤の4マス目にあるひよこを前進させる。
     * 3.一つ目の盤の7マス目と二つ目の盤の4マス目が同じことをテストする。
     */
    @Test
    void pieceActionTest(){
        Bord bord1 = new Bord();
        Bord bord2 = new Bord();
        Player player1 = new Player("たかし",0);
        bord1.setBord();
        bord2.setBord();
        bord1.pieceAction(4,7,player1);
        assertEquals(bord1.getBordList().get(7), bord2.getBordList().get(4));  
    }
}
