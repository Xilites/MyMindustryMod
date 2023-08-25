package example.content;

import arc.struct.Seq;
import mindustry.content.Planets;
import mindustry.game.Objectives;
import static example.content.ModBlocks.*;
import static mindustry.content.SectorPresets.craters;
import static mindustry.content.SectorPresets.*;
import static mindustry.content.TechTree.*;
import static mindustry.content.UnitTypes.*;

import static mindustry.content.TechTree.*;

public class ModTechTree {
    public static void load(){
        Planets.erekir.techTree = nodeRoot("OldWorld",Old_World_Core,() -> {
            node(Old_World_Launch_Pad);
        });
    }
}
