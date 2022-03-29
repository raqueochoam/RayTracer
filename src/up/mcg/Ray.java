package up.mcg;

public class Ray {
    private Vector3D position;
    private Vector3D direction;

    public Vector3D getPosition() {
        return position;
    }

    public void setPosition(Vector3D position) {
        this.position = position;
    }

    public Vector3D getDirection() {
        return direction;
    }

    public void setDirection(Vector3D direction) {
        this.direction = direction;
    }

    public Ray(Vector3D position, Vector3D direction) {
        setDirection(direction);
        setPosition(position);
    }
}
