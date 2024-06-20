package GraphOptimizer.Main;

import java.lang.Math;

public class Points {
    public int X;
    public int Y;

    public Points(){
        this.X =  (int)(Math.random() * 10) + 1;
        this.Y =  (int)(Math.random() * 10) + 1;
    }

    public Points(int x, int y){
        this.X = x;
        this.Y = y;
    }

    @Override
    public String toString() {
        return "X: "+ this.X + "Y: " + this.Y;
    }
}
