public class Segment {
    private Point start;
    private  Point end;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Segment(Point start, Point end) {
        this.start = new Point(start.getX(), start.getY());
        this.end = new Point(end.getX(), end.getY());
    }

    public Segment() {
    }

    public Segment(double x_start, double y_start,
                   double x_end, double y_end){
        this.start = new Point(x_start, y_start);
        this.end = new Point(y_start, y_end);
    }

    @Override
    public String toString() {
        return "Segment{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
//
