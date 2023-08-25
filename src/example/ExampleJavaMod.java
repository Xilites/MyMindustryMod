package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.type.Item;
import mindustry.type.Planet;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }
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
        old_world_launch_pad_techtree = new TechTree(){
            {

            }
        };
        OldWorld = new Planet("OldWorld", Planets.sun,10,10){
            {
                accessible = true;
                allowLaunchToNumbered = true;
                visible = true;
            }
        };
    };
    @Override
    public void loadContent(){
        Log.info("Loading some example example.content.");
    }

}
