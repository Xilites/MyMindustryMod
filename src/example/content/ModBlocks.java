package example.content;

import mindustry.world.blocks.campaign.LaunchPad;

public class ModBlocks {
    public static LaunchPad Old_World_Launch_Pad;
    public static void load(){
        Old_World_Launch_Pad = new LaunchPad("OldWorldLaunchPad"){
            {

            }
        };
    };
}
