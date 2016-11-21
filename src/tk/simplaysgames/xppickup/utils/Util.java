package tk.simplaysgames.xppickup.utils;

import org.bukkit.Bukkit;

/**
 * Created by SimPlaysGames on 20-Nov-16.
 *
 * Thanks to OscarWOHA for contributing
 * https://github.com/OscarWoHA
 *
 */
public class Util {
    public static String PREFIX = "";

    static{
        PREFIX = "&3[XP-Pickup]&7 ";
    }
    public enum PrintType {
        CONSOLE,
        INGAME,
        BOTH;
    }

    public static void DEBUG (String message, PrintType type){
        if(!ConfigValues.DEBUGENABLE){
            return;
        }

        message = PREFIX + "&4 [DEBUG] &7" + message;

        switch (type){
            case CONSOLE:
                System.out.println(message);
            break;
            case INGAME:
                Bukkit.broadcastMessage(message);
                break;
            case BOTH:
                System.out.println(message);
                Bukkit.broadcastMessage(message);
                break;
        }
    }

}