import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

class Human {
    String name;
    int age ;

    Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return name+" -> "+age;
    }
}

class Two {

    static void nullValuesAtBegining() {
        List<Human> list = Stream.of(null,new Human("Jack",12),null,new Human("Tim",13))
            .sorted(Comparator.nullsFirst(Comparator.comparing(Human::getName)))
            .collect(Collectors.toList());

        System.out.println(list);
        System.out.println();
    }

    static void nullValuesAtLast() {
        List<Human> list = Stream.of(null,new Human("Jack",12),new Human("Tim",13))
            .sorted(Comparator.nullsLast(Comparator.comparing(Human::getName)))
            .collect(Collectors.toList());

        System.out.println(list);
        System.out.println();
    }

    static void reverOrder(){
        Comparator <Human> reverseComparator = (h1,h2) -> h2.getName().compareTo(h1.getName());

        List<Human> list = Stream.of(new Human("Sarah",10),new Human("Jack",12),new Human("Tim",13))
            .sorted(reverseComparator)
            .collect(Collectors.toList());

        System.out.println(list);
        System.out.println();

    }

    static void useComparatorForReverse(){
        List<Human> list = Stream.of(new Human("Sarah",10),new Human("Jack",12),new Human("Tim",13))
            .sorted(Comparator.comparing(Human::getName,Comparator.reverseOrder()))
            .collect(Collectors.toList());

        System.out.println(list);
        System.out.println();
    }

    static void useComparatoComparing(){
        List<Human> list = Stream.of(new Human("Sarah",10),new Human("Jack",12),new Human("Tim",13))
            .sorted(Comparator.comparing(Human::getName))
            .collect(Collectors.toList());

        System.out.println(list);
        System.out.println();
    }

    static void useWithStrings(){
        //Can use with Strings, ints, longs, objects
        Stream.of("Ava","Aneri","Alberto")
            .sorted() //San pass own Comparator function
            .findFirst()
            .ifPresent(System.out::println);

        System.out.println();
    }

    static void customCoparatorWithSorted(){
       List<Human> sortedList =  Stream.of(new Human("Sarah",10),new Human("Jack",12),new Human("Tim",13))
            .sorted((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()))
            .collect(Collectors.toList());

            System.out.println(sortedList);
            System.out.println();
    }

    public static void main(String args[]){
        Two.useWithStrings();
        Two.customCoparatorWithSorted();
        Two.useComparatoComparing();
        Two.useComparatorForReverse();
        Two.reverOrder();
        Two.nullValuesAtLast();
        Two.nullValuesAtBegining();
    }
}
