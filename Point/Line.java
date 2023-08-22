package Point;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    // Getters for Points (X,Y)
    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Setters for point
    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        this.begin.setXY(beginX, beginY);
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
