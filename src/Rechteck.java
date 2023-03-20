public class Rechteck {
  private   double height;
  private   double width;

    Rechteck(double w, double h) {
        width=w;
        height=h;

    }

    private void setHeight(double height) {
        this.height = height;
    }

    private void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public double getArea() {
        return(height*width);
    }
    public double getPerimeter() {
        return (2*(height + width));
    }
}
