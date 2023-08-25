package content;

import arc.struct.Seq;
import mindustry.content.Planets;
import mindustry.game.Objectives;
import mindustry.type.Planet;

public class ModPlanet {
    public static Planet OldWorld;
    public static void load(){
        OldWorld = new Planet("OldWorld",Planets.sun,10,10){
            {
                accessible = true;
                allowLaunchToNumbered = true;
                visible = true;
            }
        };
    }
}