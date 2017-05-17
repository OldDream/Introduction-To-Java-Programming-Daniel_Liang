public class CorssPoint {
  private double a, b, c, d, e, f, x1, y1, x2, y2, x3, y3, x4, y4;
  private double detA;
  
  public CorssPoint(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4) {
    this.a = y1 - y2;
    this.b = x2 - x1;
    this.c = y3 - y4;
    this.d = x4 - x3;
    this.e = (y1 - y2) * x1 - (x1 - x2) * y1;
    this.f = (y3 - y4) * x3 - (x3 - x4) * y3;
  }

  public CorssPoint(MyPoint a1, MyPoint b2, MyPoint c3, MyPoint d4) {
    this.a = a1.getY() - b2.getY();
    this.b = b2.getX() - a1.getX();
    this.c = c3.getY() - d4.getY();
    this.d = d4.getX() - c3.getX();
    this.e = (a1.getY() - b2.getY()) * a1.getX() - (a1.getX() - b2.getX()) * a1.getY();
    this.f = (c3.getY() - d4.getY()) * c3.getX() - (c3.getX() - d4.getX()) * c3.getY();
    this.x1 = a1.getX();
    this.x2 = b2.getX();
    this.x3 = c3.getX();
    this.x4 = d4.getX();
    this.y1 = a1.getX();
    this.y2 = b2.getX();
    this.y3 = c3.getX();
    this.y4 = d4.getX();
  }

  public double getCrossPointX() {
    detA = a * d - b * c;
    if (Math.abs(detA - 0) < 0.001) {
      System.out.println("The equation has no solution");
      System.exit(1);
    }
    double x = (e * d - b * f) / detA;
    return x;
  }

  public double getCrossPointY() {
    detA = a * d - b * c;
    if (Math.abs(detA - 0) < 0.001) {
      System.out.println("The equation has no solution");
      System.exit(1);
    }
    double y = (a * f - e * c) / detA;
    return y;
  }

  public boolean checkCross() {
    detA = a * d - b * c;
    if (Math.abs(detA - 0) < 0.001)
      return false;
    //加入端点限制，下面的，线段不包含端点。。。。
    else if (this.getCrossPointX() >= Math.max(Math.max(x1,x2),Math.max(x3,x4)) ||
             this.getCrossPointX() <= Math.min(Math.min(x1,x2),Math.min(x3,x4)))
      return false;
    else if (this.getCrossPointY() >= Math.max(Math.max(y1,y2),Math.max(y3,y4)) ||
             this.getCrossPointY() <= Math.min(Math.min(y1,y2),Math.min(y3,y4)))
      return false;
    else
      return true;
  }

}
//    if ((int)detA == 0)