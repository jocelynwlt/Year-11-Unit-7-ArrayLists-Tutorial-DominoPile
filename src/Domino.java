public class Domino {
    public int top;
    public int bottom;
    public Domino(){
        this.top= 0;
        this.bottom=0;
    }
    public Domino(int a, int b){
        this.top = a;
        this.bottom= b;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }

    public void setTop(int a){
        this.top = a;
    }
    public void setBottom(int a){
        this.bottom = a;
    }
    public String toString(){
        return top+"/"+bottom;
    }
    public void flip(){
        int a = this.top;
        this.top = bottom;
        this.bottom = a;
    }
    public void settle(){
        if(this.top>this.bottom){
            flip();
        }
    }
    public int compareTo(Domino other){
        other.flip();
        this.flip();
        if(this.top<other.top){
            return -1;
        }
        else if(other.top<this.top){
            return 1;
        }
        else {
            if(this.bottom<other.bottom){
                return -1;
            }
            else if(this.bottom>other.bottom){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    public int compareToWeight(Domino other){
        if((this.top+this.bottom)<(other.bottom+other.top)){
            return -1;
        }
        else if((this.top+this.bottom)>(other.bottom+other.top)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public boolean canConnect(Domino other){
        return top==other.top||bottom==other.bottom||bottom == other.top||top == other.bottom;
    }
}
