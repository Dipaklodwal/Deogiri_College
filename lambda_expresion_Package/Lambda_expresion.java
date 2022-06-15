package lambda_expresion_Package;

interface Drawable {

    public void draw();
}

public class Lambda_expresion {

    public static void main(String[] args) {
        Drawable d2 = () -> {
            int w = 10;
            System.out.println("Drawing :-" + w);
        };
        d2.draw();
    }
}
