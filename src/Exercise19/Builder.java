package Exercise19;


public class Builder {
    private Integer x;
    private Integer y;

    private Float width;
    private Float height;
    private Float radius;


    public Builder at(int x, int y) {
        if(this.x == null && this.y == null) {
            this.x = x;
            this.y = y;
        }
        return this;
    }

    public Builder withRadius(float r) {
        this.radius = r;
        return this;
    }

    public Builder withDimentions(float w, float h) {
        this.width = w;
        this.height = h;
        return this;
    }

    public Figure execute() {
        if((x != null && radius != null) ||
                (x == null && radius == null))
            throw new IllegalStateException();

        if(radius != null)
            return new Circle(x, y, radius);

        return new Rectangle(x, y, width, height);
    }


}