package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * The FunctionalInterfacesExample class demonstrates the use of built-in
 * functional interfaces in Java such as Consumer, Predicate, Function, and Supplier.
 */
public class FunctionalInterfacesExample {

    /**
     * The main method serves as the entry point for the program. It demonstrates
     * how to use various functional interfaces to manipulate a list of names.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Consumer: Print each name
        // A Consumer takes a single argument and performs an operation without returning a result.
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        System.out.println("Using Consumer:");
        names.forEach(printName); // Applying Consumer to print each name

        // Predicate: Filter names that start with the letter 'A'
        // A Predicate takes a single argument and returns a boolean result.
        Predicate<String> startsWithA = name -> name.startsWith("A");
        System.out.println("\nNames starting with 'A':");
        names.stream()
             .filter(startsWithA)  // Filtering names based on the Predicate
             .forEach(printName);   // Applying Consumer to print filtered names

        // Function: Convert names to their lengths
        // A Function takes one argument and returns a result.
        Function<String, Integer> nameLength = name -> name.length();
        System.out.println("\nLengths of names:");
        names.stream()
             .map(nameLength)       // Mapping names to their lengths using the Function
             .forEach(length -> System.out.println("Length: " + length));

        // Supplier: Generate a default name
        // A Supplier takes no arguments and returns a result.
        Supplier<String> defaultNameSupplier = () -> "swaraj";
        System.out.println("\nGenerated name from Supplier: " + defaultNameSupplier.get()); // Calling Supplier to get a default value
    }
}


