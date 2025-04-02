import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda {


    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter( x -> x % 2 == 0).collect(Collectors.toList());
    }

    public static double findAverage(List<Double> numbers) {
        double sum = numbers.stream().reduce(0.0, (a, b) -> a + b);
        return numbers.isEmpty() ? 0 : sum / numbers.size();
    }

    public static List<String> sortAlphabetically(List<String> strings) {
        return strings.stream().sorted(String::compareTo).collect(Collectors.toList());
    }
    public static int sumOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);
    }
    public static long factorail (int number) {
        return IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
    }
    public static int sumOfTheList (List<Integer> numbers) {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }
    public static int multipleOfTheList (List<Integer> numbers) {
        return numbers.stream().reduce(1, (a, b) -> a * b);
    }
    public static List<Integer> squareOfNumbers (List<Integer> numbers) //erufhtuehu
    {
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
    }
    public static List<String> sortByLength(List<String> strings) {
        return strings.stream().sorted((a,b) -> b.length() - a.length()).collect(Collectors.toList());
    }
    public static long countWords(String str) {
        return Arrays.stream(str.split("\\s+")).filter(word -> !word.isEmpty()).count();
    }
    public static Optional<String> findFirstNonEmptyString(List<String> strings) {
        return strings.stream().filter(s -> !s.isEmpty()).findFirst();
    }

    public static boolean allStartWithUpperCase(List<String> strings) {
        return strings.stream().allMatch(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)));
    }

    public static Optional<Integer> secondLargestNumber(List<Integer> numbers) {
        return numbers.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();
    }

    public static Optional<Integer> largestEvenNumber(List<Integer> numbers) {
        return numbers.stream().filter(n -> (n % 2) == 0).max((a, b) -> a - b);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> decimalNumbers = Arrays.asList(1.5, 2.3, 3.7, 4.1);
        List<String> strings = Arrays.asList("whatever", "sleep", "enough", "", "edge", "okay");
        String sentence = "I dont know what to write here I just want to go to sleep";
System.out.println("Enter your choice: ");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Odd Numbers: " + filterOddNumbers(numbers));
            case 2 -> System.out.println("Average: " + findAverage(decimalNumbers));
            case 3 -> System.out.println("Sorted strings: " + sortAlphabetically(strings));
            case 4 -> System.out.println("Sum of even numbers: " + sumOfEvenNumbers(numbers));
            case 5 -> System.out.println("Factorial of 5: " + factorail(5));
            case 6 -> System.out.println("Multiple of list: " + multipleOfTheList(numbers));
            case 7 -> System.out.println("Sum of list: " + sumOfTheList(numbers));
            case 8 -> System.out.println("Squares: " + squareOfNumbers(numbers));
            case 9 -> System.out.println("Sorted by length: " + sortByLength(strings));
            case 10 -> System.out.println("Word count: " + countWords(sentence));
            case 11 -> System.out.println("First no empty string: " + findFirstNonEmptyString(strings).orElse("None"));
            case 12 -> System.out.println("Start with uppercase: " + allStartWithUpperCase(strings));
            case 13 -> System.out.println("Second largest number: " + secondLargestNumber(numbers).orElse(null));
            case 14 -> System.out.println("Largest even number: " + largestEvenNumber(numbers).orElse(null));
            default -> System.out.println("Invalid choice");
        }
    }
}