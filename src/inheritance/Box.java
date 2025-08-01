package inheritance;

public class Box {
    private double length;
    double width;
    double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // cube (same sides)
    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    ///  passing Box constructor inside a new Box constructor
    /// copy constructor (old constructor value will be passed)
    Box(Box box){
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }

    public void information(){
        System.out.println("Running box");
    }

    @Override
    public String toString() {
        return this.length + " " + this.width + " " + this.height;
    }
}
