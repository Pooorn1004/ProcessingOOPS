class Circle {
    private final Processing processing;
    private final int _diameter;

    public Circle(Processing processing, int diameter) {
        this.processing = processing;
        _diameter = diameter;
    }

    public void drawCircleAt(Position position) {
        processing.ellipse(position.X, position.Y, _diameter, _diameter);
    }
}
