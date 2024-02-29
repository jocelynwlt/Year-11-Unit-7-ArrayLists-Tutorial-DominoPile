import java.lang.reflect.Array;
import java.util.ArrayList;

public class DominoPile {
    ArrayList<Domino>pile;
    public DominoPile(){
        pile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void newStack6(){
        pile.clear();
        for(int i =0; i<=6;i++){
            for(int a=i; a<=6; a++){
                pile.add(new Domino(i,a));
            }
        }
    }

    public void shuffle(){
        int size = pile.size();
        for(int i =0; i<size; i++){
            int random = (int) (Math.random() * size);
            Domino temp = pile.get(i);
            pile.set(i,temp);
            pile.set(random,temp);
        }
    }
}
