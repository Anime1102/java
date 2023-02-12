public class Main {
    static int height;
    static int width;
    static int length;
    static int area(int height, int width)
    {

        return height* width;

    }

    static int area(int height, int width,int length)
    {

        return height* width*length;


    }
    static int display(){
        System.out.println(height);
        System.out.println(width);
        System.out.println(length);
        return 0;
    }
    public static void main(String[] args) {
        Main box1 = new Main();
        box1.height=4;
        box1.width=12;
        box1.length=3;
        display();

    }
}
