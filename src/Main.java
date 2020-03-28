class Rectangle{
        double width;
        double length;
        double area;


    //constructor
        public Rectangle(double width, double length){
            if (width < 0) {
                this.width = 0;
            }
           else
            {
                this.width = width;
             }

            if (length < 0) {
                this.length = 0;
            }
            else
            {
                this.length = length;
            }
        }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
            this.area = width * length;
            return area;
    }

}



class Cuboid extends Rectangle {
    double height;
    double volume;

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        volume = area * height;
        return volume;
    }

    public Cuboid(double width, double length, double height){
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }


    }
}


public class Main {
        public static void main(String[] args) {

            Rectangle rectangle = new Rectangle(5,10);
            System.out.println("rectangle.width= " + rectangle.getWidth());
            System.out.println("rectangle.length= " + rectangle.getLength());
            System.out.println("rectangle.area= " + rectangle.getArea());
            Cuboid cuboid = new Cuboid(5,10,5);
            System.out.println("cuboid.width= " + cuboid.getWidth());
            System.out.println("cuboid.length= " + cuboid.getLength());
            System.out.println("cuboid.area= " + cuboid.getArea());
            System.out.println("cuboid.height= " + cuboid.getHeight());
            System.out.println("cuboid.volume= " + cuboid.getVolume());

        }
}



