package example.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.meta.BuildVisibility;

import static mindustry.type.ItemStack.with;

public class ModBlocks {
    public static Block Old_World_Core;
    public static Block Old_World_Launch_Pad;
    public static void load(){
        Old_World_Launch_Pad = new LaunchPad("OldWorldLaunchPad"){
            {
                requirements(Category.effect, BuildVisibility.editorOnly, with(Items.beryllium, 5));

                alwaysUnlocked = false;
                health = 10000;
                itemCapacity = 40000;
                size = 2;
            }
        };
        Old_World_Core = new CoreBlock("OldWorldCore"){
            {
                requirements(Category.effect, BuildVisibility.editorOnly, with(Items.beryllium, 5));

                alwaysUnlocked = true;
                isFirstTier = true;
                health = 10000;
                itemCapacity = 40000;
                size = 2;
            }
        };
    };
}
