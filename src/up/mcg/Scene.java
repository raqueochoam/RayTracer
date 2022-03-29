package up.mcg;

import up.mcg.object3D.Object3D;

import java.util.ArrayList;

public class Scene {
    private Camera camera;
    private ArrayList<Object3D> objects;

    public Scene(Camera camera) {
        setCamera(camera);
        objects = new ArrayList();
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public ArrayList<Object3D> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Object3D> objects) {
        this.objects = objects;
    }
}
