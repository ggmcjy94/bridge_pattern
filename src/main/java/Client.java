public class Client {

    public static void main(String[] args) {
        Brush redBrush = new HBPencil(new Red(), "HBPencil");
        Brush brush = new MonoLine(new Blue(), "MonoLine");

        String draw = redBrush.draw();
        String draw1 = brush.draw();

        System.out.println(draw);
        System.out.println(draw1);
    }
}
