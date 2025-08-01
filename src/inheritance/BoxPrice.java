package inheritance;

public class BoxPrice extends BoxWeight {
    int price;


    BoxPrice(int price) {
        //super(); // with 'Super' we are invoking default constructor of BoxWeight which is also invoking via super the box properties
        this.price = price;
    }

    BoxPrice() {
        super(); // automatically done even if you don't make a call
    }
    BoxPrice(BoxWeight other){
        super();

    }

    @Override
    public String toString() {
        return super.toString() +" "+ this.price;
    }
}
