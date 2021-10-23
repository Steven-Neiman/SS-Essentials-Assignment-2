// import java.awt.Graphics;

public class Square implements Shape {
    public void calculateArea(float sidelength){
        System.out.println("the area of this square is "+(Math.pow(sidelength, 2)));
    }
    public void display(){
        // Graphics.drawRect(0,0,10,10);
        System.out.println("This is a placeholder while I try to figure out how to use graphics");
    }
}