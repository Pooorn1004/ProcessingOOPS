import processing.core.PApplet;

public class Processing extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int NUMBER_OF_BALLS = 4;
    private static final int DIAMETER = 10;

    private int XPosition;

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }
    
    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void draw() {
        for (int i = 1; i <= NUMBER_OF_BALLS; i++) {
            Circle circle = new Circle(this, DIAMETER);
            circle.drawCircleAt(position(i));
        }
        XPosition++;
    }

    private Position position(int i) {
        int y_Offset = getYOffset(i);
        int x_Interval = getSpeed(i);
        return new Position(x_Interval, y_Offset);
    }

    private int getYOffset(int space) {
        int initialPosition = HEIGHT / (NUMBER_OF_BALLS + 1);
        return initialPosition * space;
    }

    private int getSpeed(int factor) {
        return XPosition * factor;
    }

}


