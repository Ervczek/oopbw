


public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 3;
        p.y = 5;

        System.out.println(p.toSvg);



    }

    public String toSvg(){
        return "<svg height=\"100\" width=\"100\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "  <circle r=\"25\" cx="" +
                "" +
                x +
                "" +
                cy=" +
                "" +
                        y +
                "" +
                " fill=\"green\" />\n" +
                "</svg>\n";
    }
}