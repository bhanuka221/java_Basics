import java.util.stream.IntStream;
import java.util.stream.Stream;

class Five {
    
    static void sumOfDoubles(){
        double total = Stream.of(12.5,48.36,16.25)
            .reduce(0.0, (Double one,Double two) -> one + two);
        System.out.println(total);
        System.out.println();
    }

    static void getSummaryStat(){
        System.out.println(
            IntStream.of(10,45,16,13,89,46,75,52)
                .summaryStatistics()
        );
        System.out.println();
    }


    public static void main(String args[]){
        Five.sumOfDoubles();
        Five.getSummaryStat();
    }
}
