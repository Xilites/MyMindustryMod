package content;

import arc.struct.Seq;
import mindustry.content.Planets;
import mindustry.game.Objectives;
import mindustry.type.Planet;

public class ModPlanet {
    public static Planet OldWorldSector;
    public static void load(){
        OldWorldSector = new Planet("OldWorld",Planets.sun,10){
            {

            }
        };
//        Seq<Objectives> OldWorldSector = Seq.with(new Objectives.OnPlanet(Planets.));
    }
}
