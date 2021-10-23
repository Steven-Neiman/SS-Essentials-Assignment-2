public class ShapeController {
    public static void main(String[] args){
        Triangle triangle=new Triangle();
        Square square=new Square();
        Circle circle=new Circle();
        triangle.calculateArea(10);
        triangle.display();
        circle.calculateArea(10);
        circle.display();
        square.calculateArea(10);
        square.display();
    }
}
