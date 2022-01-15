package jp.ac.uryukyu.ie.e215709;

public interface Piece {
    int getNumber();
    String getInitials();
    int[] moveNumber(int position);
    void classChange();
}
