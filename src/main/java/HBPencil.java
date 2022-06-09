public class HBPencil extends Brush{

    private String name;

    public HBPencil(Color color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    public String draw() {
        return this.name + " " + super.color.fill();
    }
}
