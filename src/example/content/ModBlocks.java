package example.content;

import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.blocks.storage.CoreBlock;

public class ModBlocks {
    public static CoreBlock Old_World_Core;
    public static LaunchPad Old_World_Launch_Pad;
    public static void load(){
        Old_World_Launch_Pad = new LaunchPad("OldWorldLaunchPad"){
            {

            }
        };
        Old_World_Core = new CoreBlock("OldWorldCore"){
            {
                alwaysUnlocked = true;
                isFirstTier = true;
                health = 10000;
                itemCapacity = 40000;
                size = 2;
            }
        };
    };
}
