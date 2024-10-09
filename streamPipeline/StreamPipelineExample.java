package streamPipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A class that demonstrates the use of Java Streams to process a list of names.
 * It shows how to filter, transform, and collect the results using a stream pipeline.
 */
public class StreamPipelineExample {
	 /**
     * The main method serves as the entry point of the program.
     * It demonstrates how to use a stream pipeline to filter and transform a list of names.
     *
     * @param args Command-line arguments (not used).
     */
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Swaraj", "Ram", "Santosh", "Djsai");

        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("R")) // Intermediate operation( The 'filter' method is used to retain only those names that start with the letter 'A'.)
            .map(String::toUpperCase)              // Intermediate operation(The 'map' method transforms the filtered names to uppercase.)
            .collect(Collectors.toList());         // Terminal operation(The 'collect' method gathers the results into a new list.)

        // Output the filtered and transformed names
        System.out.println(filteredNames); // Output: [RAM]
    }
}
