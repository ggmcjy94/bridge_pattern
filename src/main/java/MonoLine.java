public class MonoLine extends Brush{

    private String name;

    public MonoLine(Color color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    public String draw() {
        return this.name + " " + super.color.fill();
    }
}
