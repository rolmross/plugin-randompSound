package fr.rolm.pack.command;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class bruit implements CommandExecutor {
    private ArrayList<Sound> v = new ArrayList<>(Arrays.asList(Sound.AMBIENCE_CAVE,Sound.AMBIENCE_RAIN,Sound.AMBIENCE_THUNDER,Sound.ANVIL_BREAK,Sound.ANVIL_LAND,Sound.ANVIL_USE,Sound.ARROW_HIT,Sound.BAT_DEATH,Sound.BAT_HURT,Sound.BAT_IDLE,Sound.BAT_LOOP,Sound.BAT_TAKEOFF,Sound.BLAZE_BREATH,Sound.BLAZE_DEATH,Sound.BLAZE_HIT,Sound.BURP,Sound.CAT_HISS,Sound.CAT_HIT,Sound.CAT_MEOW,Sound.CAT_PURR,Sound.CAT_PURREOW,Sound.CHEST_CLOSE,Sound.CHEST_OPEN,Sound.CHICKEN_EGG_POP,Sound.CHICKEN_HURT,Sound.CHICKEN_IDLE,Sound.CHICKEN_WALK,Sound.CLICK,Sound.COW_HURT,Sound.COW_IDLE,Sound.COW_WALK,Sound.CREEPER_DEATH,Sound.CREEPER_HISS,Sound.DIG_GRASS,Sound.DIG_GRAVEL,Sound.DIG_SAND,Sound.DIG_SNOW,Sound.DIG_STONE,Sound.DIG_WOOD,Sound.DIG_WOOL,Sound.DONKEY_ANGRY,Sound.DONKEY_DEATH,Sound.DONKEY_HIT,Sound.DONKEY_IDLE,Sound.DOOR_CLOSE,Sound.DOOR_OPEN,Sound.DRINK,Sound.EAT,Sound.ENDERDRAGON_DEATH,Sound.ENDERDRAGON_GROWL,Sound.ENDERDRAGON_HIT,Sound.ENDERDRAGON_WINGS,Sound.ENDERMAN_DEATH,Sound.ENDERMAN_HIT,Sound.ENDERMAN_IDLE,Sound.ENDERMAN_SCREAM,Sound.ENDERMAN_STARE,Sound.ENDERMAN_TELEPORT,Sound.EXPLODE,Sound.FALL_BIG,Sound.FALL_SMALL,Sound.FIRE,Sound.FIRE_IGNITE,Sound.FIREWORK_BLAST,Sound.FIREWORK_BLAST2,Sound.FIREWORK_LARGE_BLAST,Sound.FIREWORK_LARGE_BLAST2,Sound.FIREWORK_LAUNCH,Sound.FIREWORK_TWINKLE,Sound.FIREWORK_TWINKLE2,Sound.FIZZ,Sound.FUSE,Sound.GHAST_CHARGE,Sound.GHAST_DEATH,Sound.GHAST_FIREBALL,Sound.GHAST_MOAN,Sound.GHAST_SCREAM,Sound.GHAST_SCREAM2,Sound.GLASS,Sound.HORSE_ANGRY,Sound.HORSE_ARMOR,Sound.HORSE_BREATHE,Sound.HORSE_DEATH,Sound.HORSE_GALLOP,Sound.HORSE_HIT,Sound.HORSE_IDLE,Sound.HORSE_JUMP,Sound.HORSE_LAND,Sound.HORSE_SADDLE,Sound.HORSE_SKELETON_DEATH,Sound.HORSE_SKELETON_HIT,Sound.HORSE_SKELETON_IDLE,Sound.HORSE_SOFT,Sound.HORSE_WOOD,Sound.HORSE_ZOMBIE_DEATH,Sound.HORSE_ZOMBIE_HIT,Sound.HORSE_ZOMBIE_IDLE,Sound.HURT_FLESH,Sound.IRONGOLEM_DEATH,Sound.IRONGOLEM_HIT,Sound.IRONGOLEM_THROW,Sound.IRONGOLEM_WALK,Sound.ITEM_BREAK,Sound.ITEM_PICKUP,Sound.LAVA,Sound.LAVA_POP,Sound.LEVEL_UP,Sound.MAGMACUBE_JUMP,Sound.MAGMACUBE_WALK,Sound.MAGMACUBE_WALK2,Sound.MINECART_BASE,Sound.MINECART_INSIDE,Sound.NOTE_BASS,Sound.NOTE_BASS_DRUM,Sound.NOTE_BASS_GUITAR,Sound.NOTE_PIANO,Sound.NOTE_PLING,Sound.NOTE_SNARE_DRUM,Sound.NOTE_STICKS,Sound.ORB_PICKUP,Sound.PIG_DEATH,Sound.PIG_IDLE,Sound.PIG_WALK,Sound.PISTON_EXTEND,Sound.PISTON_RETRACT,Sound.PORTAL,Sound.PORTAL_TRAVEL,Sound.PORTAL_TRIGGER,Sound.SHEEP_IDLE,Sound.SHEEP_SHEAR,Sound.SHEEP_WALK,Sound.SHOOT_ARROW,Sound.SILVERFISH_HIT,Sound.SILVERFISH_IDLE,Sound.SILVERFISH_KILL,Sound.SILVERFISH_WALK,Sound.SKELETON_DEATH,Sound.SKELETON_HURT,Sound.SKELETON_IDLE,Sound.SKELETON_WALK,Sound.SLIME_ATTACK,Sound.SLIME_WALK,Sound.SLIME_WALK2,Sound.SPIDER_DEATH,Sound.SPIDER_IDLE,Sound.SPIDER_WALK,Sound.SPLASH,Sound.SPLASH2,Sound.STEP_GRASS,Sound.STEP_GRAVEL,Sound.STEP_LADDER,Sound.STEP_SAND,Sound.STEP_SNOW,Sound.STEP_STONE,Sound.STEP_WOOD,Sound.STEP_WOOL,Sound.SUCCESSFUL_HIT,Sound.SWIM,Sound.VILLAGER_DEATH,Sound.VILLAGER_HAGGLE,Sound.VILLAGER_HIT,Sound.VILLAGER_IDLE,Sound.VILLAGER_NO,Sound.VILLAGER_YES,Sound.WATER,Sound.WITHER_DEATH,Sound.WITHER_HURT,Sound.WITHER_IDLE,Sound.WITHER_SHOOT,Sound.WITHER_SPAWN,Sound.WOLF_BARK,Sound.WOLF_DEATH,Sound.WOLF_GROWL,Sound.WOLF_HOWL,Sound.WOLF_HURT,Sound.WOLF_PANT,Sound.WOLF_SHAKE,Sound.WOLF_WALK,Sound.WOLF_WHINE,Sound.WOOD_CLICK,Sound.ZOMBIE_DEATH,Sound.ZOMBIE_HURT,Sound.ZOMBIE_IDLE,Sound.ZOMBIE_INFECT,Sound.ZOMBIE_METAL,Sound.ZOMBIE_PIG_ANGRY,Sound.ZOMBIE_PIG_DEATH,Sound.ZOMBIE_PIG_HURT,Sound.ZOMBIE_PIG_IDLE,Sound.ZOMBIE_REMEDY,Sound.ZOMBIE_UNFECT,Sound.ZOMBIE_WALK,Sound.ZOMBIE_WOOD,Sound.ZOMBIE_WOODBREAK));
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("rdmbruit")){
            if (args.length == 0){
                if (commandSender instanceof Player){
                    final Player player = (Player)commandSender;
                    final World world = player.getWorld();
                    int n = (int)(Math.random() * 195);
                    world.playSound(player.getLocation(), v.get(n) ,1000.0F,1.0F);
                }
            }else {
                commandSender.sendMessage(ChatColor.GREEN + "Trop d'arguments !");
            }
            return true;
        }

        return false;
    }
}
