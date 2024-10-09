package streamPipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A")) // Intermediate operation
            .map(String::toUpperCase)              // Intermediate operation
            .collect(Collectors.toList());         // Terminal operation

        System.out.println(filteredNames); // Output: [ALICE]
    }
}
