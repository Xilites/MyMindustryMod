package example.content;

import mindustry.content.Planets;

import static mindustry.content.TechTree.nodeRoot;

public class ModTechTree {
    public static void load(){
        ModPlanet.OldWorld.techTree = nodeRoot("OldWorld",ModBlocks.Old_World_Launch_Pad,() -> {

        });
    }
}
