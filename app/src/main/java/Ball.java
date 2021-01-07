import processing.core.PApplet;

class Ball {
    public static final int DIAMETER = 10;
    private Position position;
    private final int speed;

    public Ball(Position position, int speed) {
        this.position = position;
        this.speed = speed;
    }

    public void move(){
        position.X += speed;
    }
    public void draw(PApplet pApplet) {
        pApplet.ellipse(position.X,position.Y, DIAMETER, DIAMETER);
    }
}
