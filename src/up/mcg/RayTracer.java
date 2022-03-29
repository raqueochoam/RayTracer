package up.mcg;

import up.mcg.object3D.Object3D;
import up.mcg.object3D.Sphere;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class RayTracer {

    public static void main(String[] args) {
        //create a new scene
        Scene scene = new Scene(new Camera(new Vector3D(0,5,0),new Vector3D(0,0,1),45f));
        scene.getObjects().add(new Sphere(new Vector3D(3,3,0),new Color(0,100,0), 1.5f));

        BufferedImage finalImage = new BufferedImage(400,400,BufferedImage.TYPE_INT_RGB);

        for(int y=0;y<finalImage.getHeight();y++){
            for(int x=0; x<finalImage.getWidth();x++){
                //create ray
                Ray ray = new Ray(new Vector3D(((float) x), ((float) y),scene.getCamera().getPosition().getZ()), scene.getCamera().getDirection());
            }
        }
    }
}
