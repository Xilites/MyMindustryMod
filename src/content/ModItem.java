package content;
import mindustry.*;
import mindustry.content.ErekirTechTree;
import mindustry.content.TechTree;
import mindustry.type.Item;
public class ModItem {
    public static Item old_world_Launch_pad;
    public static TechTree old_world_launch_pad_techtree;
    public static void load(){
        old_world_Launch_pad = new Item("Old world launch pad"){
            {
                hardness = 1;
                cost = 1;

            }
        };
        old_world_launch_pad_techtree = new TechTree(){
            {

            }
        };
    };
}
