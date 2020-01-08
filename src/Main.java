import java.util.HashMap;
public class Main
{

    public static void main(String[] args)
    {
        HashMap<String, Integer> mountains = new HashMap<String, Integer>();
        mountains.put("Everest", 2909);
        mountains.put("K2", 28251);
        mountains.put("kangchenjunga", 28169);
        mountains.put("Denali",20335);
        printMap(mountains);
        System.out.println("Denali in the map: "+ mountains.containsKey("Denali"));
        System.out.println();
        System.out.println("Changing height of Denali");
        mountains.put("Denali", 20320);
        printMap(mountains);
        System.out.println("Removing: Kangchenjunga" );
        mountains.remove("kangchenjunga");
        printMap(mountains);


    }
    public static void printMap(HashMap<String , Integer> map)
    {
        System.out.println("Map contains");
        for(String KeyMountainName : map.keySet())
        {
            Integer height = map.get(KeyMountainName);
            System.out.println(KeyMountainName + "--> " + height.intValue() + " feet");
        }
        System.out.println();
    }
}
