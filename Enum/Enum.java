enum Season {
    WINTER("Winter"),SPRING("Spring"),SUMMER("Summer"),FALL("Fall");

    private String seasonStr;

    private Season(String seasonStr){
        this.seasonStr = seasonStr;
    }

    public String getSeasonStr(){
        return seasonStr;
    }
}

public class Enum {

    static void printEnum(){
        for(Season s: Season.values()){
            System.out.println("Season Type : "+ s);
            System.out.println("Season Str : "+ s.getSeasonStr());
        }
    }

    static void printSingleEnum(){
        Season s = Season.SPRING;
        System.out.println("Season Type : "+ s);
        System.out.println("Season value : "+ Season.valueOf("WINTER"));
        System.out.println("Season Ordinal : "+ Season.valueOf("WINTER").ordinal());

    }

    public static void main(String args[]){
        printEnum();
        printSingleEnum();
    }
    
}
