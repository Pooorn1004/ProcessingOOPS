import processing.core.PApplet;

class Ball {
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
        pApplet.ellipse(position.X,position.Y,10,10);
    }
}
