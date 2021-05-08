import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Three {
    
    static void workWithStrings(){
        String names[] = {"Ana","Tom","Henry","Eric","Samantha","Ankith","Amali","Ali"};
        Arrays.stream(names)
            .filter(name -> name.startsWith("A"))
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);

        System.out.println();
    }

    static void workWithNumbers(){
        int numbers[] = new int[]{2,4,6,8,10};
        Arrays.stream(numbers)
            .map(number -> number * number)
            .average()
            .ifPresent(System.out::println);

        System.out.println();
    }

    static void workWithOjects(){
        Stream.of(new Human("Sarah",10),new Human("Jack",12),new Human("Tim",13))
            .map(human -> human.getAge() * human.getAge())
            .filter(x -> x > 100)
            .forEach(System.out::println);

        System.out.println();
    }

    public static void main(String args[]){
        Three.workWithStrings();
        Three.workWithNumbers();
        Three.workWithOjects();
    }
}
