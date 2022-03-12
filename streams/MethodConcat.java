package streams;

/*
concat() - производит конкатенацию streams.
Это статический метод и возвращает stream, но при этом не может быть использован в цепочке chaining.
Это intermediate метод.
 */

import java.util.stream.Stream;

public class MethodConcat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);

        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out :: println );
    }


    
}
