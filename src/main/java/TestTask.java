import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestTask {
    public static Set<Integer> intToSortedSet(Integer number) {
        return Stream.of(number.toString().split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static String convertToString(List<Integer> seq) {
        StringBuilder result = new StringBuilder();
        IntStream.range(0, seq.size() - 1)
                .forEach(i -> {
                    Integer firstNumber = seq.get(i);
                    Integer secondNumber = seq.get(i + 1);
                    if (i == 0) result.append(firstNumber);
                    if (secondNumber - firstNumber != 1) {
                        if (i == seq.size() - 1) {
                            result.append(",").append(secondNumber);
                        } else if (i != 0 && firstNumber - seq.get(i - 1) == 1) {
                            result.append("-")
                                    .append(firstNumber)
                                    .append(",")
                                    .append(secondNumber);
                        } else result.append(",").append(secondNumber);
                    } else if (i + 1 == seq.size() - 1) {
                        result.append("-").append(secondNumber);
                    }
                });
        return result.toString();
    }
    public static String resolveIssue(Integer number) {
        if (number / 10 == 0) {
            return number.toString();
        }
        List<Integer> result = new ArrayList<>(intToSortedSet(number));
        return convertToString(result);
    }
}
