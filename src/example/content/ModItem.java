package example.content;
import mindustry.content.Planets;
import mindustry.content.TechTree;
import mindustry.type.Item;
import mindustry.type.Planet;

public class ModItem {
    public static Item old_world_Launch_pad;
    public static TechTree old_world_launch_pad_techtree;
    public static Planet OldWorld;
    public static void load(){
        old_world_Launch_pad = new Item("Old world launch pad"){
            {
                hardness = 1;
                cost = 1;

            }
        };
    };

}
