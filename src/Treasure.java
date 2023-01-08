public class Treasure {
    public static String chest = "Chest";
    public static String diamond = "Diamond";
    public static String gold = "Gold";
    public static String nothing = "nothing";

    private String type;

    public Treasure(){
        int rand = (int)(Math.random()*3)+1;
        if (rand == 1){
            type = chest;
        } else if (rand == 2) {
            type = diamond;
        } else if (rand == 3) {
            type = gold;
        }else{
            type = nothing;
        }
    }
    public static boolean allTreasures(String treasures){
        boolean hasChest = (treasures.indexOf(chest) != -1);
        boolean hasDiamond = (treasures.indexOf(diamond) != -1);
        boolean hasGold = (treasures.indexOf(gold) != -1);

        return(hasChest && hasDiamond && hasGold);
    }

    public String getType(){
        return type;
    }
}
