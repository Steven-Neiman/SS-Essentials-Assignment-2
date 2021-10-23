public class Circle implements Shape {
    public void calculateArea(float radius){
        System.out.println("the area of this circle is "+(Math.PI*Math.pow(radius, 2)));
    }
    public void display(){
        // Graphics.drawRect(0,0,10,10);
        System.out.println("This is a placeholder while I try to figure out how to use graphics");
    }
}
