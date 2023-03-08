package HW1.units;

public class Point2D {
    int x, y;

    public Point2D (int valueX, int valueY){
        this.x = valueX;
        this.y = valueY;
    }

    public Double distance(Point2D j){
        return Math.sqrt(Math.pow(((double) (this.x - j.x)), 2) + Math.pow(((double)this.y - j.y), 2));
    }

    public Point2D choiceWay (Point2D opponent){
        return new Point2D(this.x - opponent.x, this.y - opponent.y);
    }
}
