package Point;

//Begin Point is inherited from its superclass Point
public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), end.getY());
        this.end = end;
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public Point getEnd() {
        return end;
    }

    public int getBeginX() {
        return this.getX();
    }

    public int getBeginY() {
        return this.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Setters for point
    public void setBegin(Point begin) {
        begin = new Point(super.getX(), super.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        this.end.setXY(endX, endY);
    }

    // Other getters
    public int getLength() {
        return (int) Math.sqrt(Math.pow(getBeginX() - getEndX(), 2) + Math.pow(getBeginY() - getEndY(), 2));
    }

    public double getGradient() {
        return Math.atan2(getEndY() - getBeginY(), getEndX() - getBeginX());
    }

    public String toString() {
        return "Line begins on point: (" + getBeginX() + ", " + getBeginY() + ") and ends at: (" + getEndX() + ", "
                + getEndY() + ")";
    }
}
