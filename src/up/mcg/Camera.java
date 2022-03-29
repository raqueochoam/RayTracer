package up.mcg;

public class Camera {
    private Vector3D position = new Vector3D(0,0,1);
    private Vector3D direction = new Vector3D(0,0,1);
    private float fov;

    public Camera(Vector3D position, Vector3D direction, float fov) {
        setDirection(direction);
        setFov(fov);
        setPosition(position);
    }

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

    public float getFov() {
        return fov;
    }

    public void setFov(float fov) {
        this.fov = fov;
    }
}
