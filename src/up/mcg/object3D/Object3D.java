package up.mcg.object3D;

import up.mcg.Vector3D;
import java.awt.*;

public abstract class Object3D {

    private Vector3D position;
    private Color color;

    public Vector3D getPosition() {
        return position;
    }

    public void setPosition(Vector3D position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Object3D(Vector3D position, Color color) {
        setColor(color);
        setPosition(position);
    }

}
