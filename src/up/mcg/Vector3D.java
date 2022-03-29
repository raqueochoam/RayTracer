package up.mcg;

public class Vector3D {
    private float x, y, z;

    public Vector3D(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float calculateMagnitude(){
        float magnitude =0;
        return magnitude;
    }
}
