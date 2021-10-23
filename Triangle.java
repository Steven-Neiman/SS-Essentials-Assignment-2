public class Triangle implements Shape {
    public void calculateArea(float sidelength){
        System.out.println("the area of this triangle is "+((Math.sqrt(3)/4)*(Math.pow(sidelength, 2))));
    }
    public void display(){
        System.out.println("This is a placeholder while I try to figure out how to use graphics");
    }
}
