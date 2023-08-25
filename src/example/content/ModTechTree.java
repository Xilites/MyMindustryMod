package example.content;

import arc.struct.Seq;
import mindustry.content.Planets;
import mindustry.game.Objectives;

import static mindustry.content.TechTree.*;

public class ModTechTree {
    public static void load(){
        ModPlanet.OldWorld.techTree = nodeRoot("OldWorld",ModBlocks.Old_World_Core,() -> {
            node(ModBlocks.Old_World_Launch_Pad,() -> {

            });
        });
    }
}
