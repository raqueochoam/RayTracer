package up.mcg.object3D;

import up.mcg.Vector3D;
import java.awt.*;

public class Sphere extends Object3D{
    private float ratio;

    public float getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }

    public Sphere(Vector3D position, Color color, float ratio) {
        super(position, color);
        setRatio(ratio);
    }
}
