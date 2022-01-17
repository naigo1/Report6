package jp.ac.uryukyu.ie.e215709;
import java.util.ArrayList;
public  abstract class Piece {
    public abstract String getName();
    public abstract int getNumber();
    public abstract String getInitials();
    public abstract ArrayList<Integer> moveNumber(int position);
    public abstract void classChange();
    public abstract void setNumber(int number);
    public int upper(int position){
        int result = position;
        if(getNumber()==0){
            if(position>=0  && position<9){
                result = position+3;
            }
        }else{
            if(position>2 && position<12){
                result = position-3;
            }
        }
        return result;
    }

    public int lower(int position){
        int result = position;
        if(getNumber()==0){
            if(position>2 && position<12){
                result = position-3 ;
            }
        }else{
            if(position<9 && position>=0){
                result = position+3 ;
            }
        }
        return result;
    }

    public int right(int position){
        int result = position;
        if(getNumber()==0){
            if(position%3!=0 && position>=0 && position<12){
                result = position-1;
            }
        }else{
            if(position%3!=2 && position>=0 && position<12){
                result = position+1;
            }
        }
        return result;
    }

    public int left(int position){
        int result = position;
        if(getNumber()==0){
            if(position%3!=2 && position>=0 && position<12){
                result = position+1;
            }
        }else{
            if(position%3!=0 && position>=0 && position<12){
                result = position-1;
            }
        }
        return result;
    }
    public int rightUpper(int position){
        int result = position;
        if(getNumber()==0){
            if(position%3!=0 && position<9 && position>=0){
                result = position+2;
            }
        }else{
            if(position%3!=2 && position<12 && position>2){
                result = position-2;
            }
        }
        return result;
    }

    public int leftUpper(int position){
        int result = position;
        if(getNumber()==0){
            if(position%3!=2 && position<9 && position>=0){
                result = position+4;
            }
        }else{
            if(position%3!=0 && position<12 && position>2){
                result = position-4;
            }
        }
        return result;
    }

    public int rightLower(int position){
        int result = position;
        if(getNumber()==0){
            if(position%3!=0 && position<12 && position>2){
                result = position-4;
            }
        }else{
            if(position%3!=2 && position<9 && position>=0){
                result = position+4;
            }
        }
        return result;
    }

    public int leftLower(int position){
        int result = position;
        if(getNumber()==0){
            if(position%3!=2 && position<12 && position>2){
                result = position-2;
            }
        }else{
            if(position%3!=0 && position<9 && position>=0){
                result = position+2;
            }
        }
        return result;
    }
    
}
