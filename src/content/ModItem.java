package content;
import mindustry.*;
import mindustry.type.Item;
public class ModItem {
    public static Item old_world_Launch_pad;
    public static void load(){
        old_world_Launch_pad = new Item("Old world launch pad"){
            {
                hardness = 1;
                cost = 1;
            }
        };
    };
}
