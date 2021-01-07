import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class Processing extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int SPEED_1 = 1;
    private static final int SPEED_2 = 2;
    private static final int SPEED_3 = 3;
    private static final int SPEED_4 = 4;
    List<Ball> balls;

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    @Override
    public void setup() {
        super.setup();

        Ball ball1 = new Ball(new Position(0,HEIGHT/5 *1), SPEED_1);
        Ball ball2 = new Ball(new Position(0,HEIGHT/5 *2), SPEED_2);
        Ball ball3 = new Ball(new Position(0,HEIGHT/5 *3), SPEED_3);
        Ball ball4 = new Ball(new Position(0,HEIGHT/5 *4), SPEED_4);

        balls = Arrays.asList(ball1, ball2, ball3, ball4);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.move();
            ball.draw(this);
        }
    }
}


