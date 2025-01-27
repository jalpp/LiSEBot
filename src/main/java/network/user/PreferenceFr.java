package network.user;

import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

/**
 * PreferenceFr enum to handle the friend preferences
 */
public enum PreferenceFr {


    MAGNUS,

    HIKARU,

    GUKESH,

    FABI,

    DING,

    BISHOP,

    PAWN,

    KNIGHT,

    ROOK,

    KING,

    QUEEN,

    POSITIONAL,

    TACTICAL,

    DEFENSIVE,

    AGGRESSIVE,

    QUEENS_GAMBIT,

    KINGS_GAMBIT,

    SICILIAN,

    KID;


    /**
     * Get the player preference
     *
     * @param discord the discord option
     * @return the player preference MongoDB field
     */
    public String toMongoPlayer() {
        switch (this) {
            case MAGNUS -> {
                return "mag";
            }
            case HIKARU -> {
                return "hik";
            }
            case FABI -> {
                return "fab";
            }
            case DING -> {
                return "din";
            }
            case GUKESH -> {
                return "guk";
            }
        }
        return null;
    }

    /**
     * Get the piece preference
     *
     * @param discord the discord option
     * @return the piece preference MongoDB field
     */
    public String toMongoPiece() {
        switch (this) {
            case PAWN -> {
                return "paw";
            }

            case KING -> {
                return "kin";
            }

            case QUEEN -> {
                return "que";
            }

            case BISHOP -> {
                return "bis";
            }

            case KNIGHT -> {
                return "kni";
            }

            case ROOK -> {
                return "roo";
            }
        }
        return null;
    }

    /**
     * Get the opening preference
     *
     * @param discord the discord option
     * @return the opening preference MongoDB field
     */
    public String toMongoOpening() {
        switch (this) {
            case QUEENS_GAMBIT -> {
                return "qge";
            }

            case KINGS_GAMBIT -> {
                return "kgi";
            }

            case SICILIAN -> {
                return "sic";
            }

            case KID -> {
                return "kid";
            }
        }
        return null;
    }

    /**
     * Get the style preference
     *
     * @param discord the discord option
     * @return the style preference MongoDB field
     */
    public String toMongoStyle() {
        switch (this) {
            case POSITIONAL -> {
                return "pos";
            }

            case TACTICAL -> {
                return "tac";
            }

            case DEFENSIVE -> {
                return "def";
            }

            case AGGRESSIVE -> {
                return "agg";
            }
        }
        return null;
    }


    /**
     * Get the player preference
     *
     * @return the player preference Discord OptionData
     */
    public static OptionData getPlayerOptionData() {
        return new OptionData(OptionType.STRING, "player", "choose your fav player", true).addChoice("Magnus Carlsen", "mag").addChoice("Hikaru Nakamura", "hik")
                .addChoice("Fabiano Caruana", "fab").addChoice("Ding Liren", "din").addChoice("Gukesh D", "guk");
    }


    /**
     * Get the piece preference
     *
     * @return the piece preference Discord OptionData
     */
    public static OptionData getPieceOptionData() {
        return new OptionData(OptionType.STRING, "piece", "choose your fav piece", true).addChoice("Pawn", "paw").addChoice("King", "kin")
                .addChoice("Queen", "que").addChoice("Bishop", "bis").addChoice("Knight", "kni").addChoice("Rook", "roo");
    }

    /**
     * Get the opening preference
     *
     * @return the opening preference Discord OptionData
     */
    public static OptionData getOpeningOptionData() {
        return new OptionData(OptionType.STRING, "opening", "choose your fav opening", true).addChoice("Queens Gambit", "qge").addChoice("Kings Gambit", "kgi")
                .addChoice("Sicilian", "sic").addChoice("Kings Indian Defense", "kid");
    }

    /**
     * Get the style preference
     *
     * @return the style preference Discord OptionData
     */
    public static OptionData getStyleOptionData() {
        return new OptionData(OptionType.STRING, "style", "choose your chess style", true).addChoice("Positional", "pos").addChoice("Tactical", "tac")
                .addChoice("Defensive", "def").addChoice("Aggressive", "agg");
    }


}
