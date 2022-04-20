class CShape // 父類別 CShape
{
    public double area() {
        return 0.0;
    }

    // void前面必須加static
    public static void largest(CShape aa[]) {
        double max = 0.0;
        for (int i = 0; i < aa.length; i++) {
            if (aa[i].area() > max) {
                max = aa[i].area();
            }
        }
        System.out.println("面積最大=" + max);
    }
}

class CCircle extends CShape {// 園形面積
    private double pi;
    private double radius;

    public CCircle(double b) {
        pi = 3.14;
        radius = b;
    }

    public double area() {
        return pi * radius * radius;
    }
}

class CSquare extends CShape {// 正方形面積
    private double length;
    private double width;

    public CSquare(double a) {
        length = a;
        width = a;
    }

    public double area() {
        return length * width;
    }
}

class CTriangle extends CShape {// 三角形面積
    private double height;
    private double baseside;

    public CTriangle(double a, double b) {
        height = a;
        baseside = b;
    }

    public double area() {
        return height * baseside / 2;
    }
}

public class hw10_11 {
    public static void main(String[] args) {
        CShape aa[] = new CShape[3];
        aa[0] = new CCircle(3.0);
        System.out.println("園面積=" + aa[0].area());
        aa[1] = new CSquare(5.0);
        System.out.println("正方形面積=" + aa[1].area());
        aa[2] = new CTriangle(3.0, 3.0);
        System.out.println("三角形面積=" + aa[2].area());
        CShape.largest(aa);
    }
}