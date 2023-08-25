package example.content;

import mindustry.content.Planets;
import mindustry.content.TechTree;
import mindustry.graphics.g3d.HexMesh;
import mindustry.type.Planet;
import mindustry.content.TechTree.*;

public class ModPlanet {
    public static Planet OldWorld;
    public static void load(){
        OldWorld = new Planet("OldWorld",Planets.sun,0.5f,2){
            {
                accessible = true;
                allowLaunchToNumbered = true;
                visible = true;
                parent = Planets.sun;
                radius = 0.5F;
                alwaysUnlocked = true;
                icon = "old_world_LaunchPad.png";
                meshLoader = () -> new HexMesh(this,5);
            }
        };
    }
}