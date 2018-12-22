package exerciceslambdas1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//(Hint: remember that the body of a lambda is allowed to have curly braces and a return statement. See the first two lambda examples in the notes.)
public class OneBasicLambdas {
	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("o", "aour", "ew", "tre", "eivee");
		sortByShortestLenght(stringList);
		sortByLongestLenght(stringList);
		sortByFirstCharacter(stringList);
		sortByECharacterFirst(stringList);
		sortByERedoCharacterFirst(stringList);

	}

	private static void sortByERedoCharacterFirst(List<String> stringList) {
		// • Redo the previous problem, but use a static helper method so that your
		// lambda looks like this:
		// Arrays.sort(words, (s1,s2) -> Utils.yourMethod(s1,s2))

		System.out.println("REDO - Strings that contain “e” first, everything else second.");
		stringList.sort((s1, s2) -> sortByE(s1, s2));
		stringList.forEach(System.out::println);
	}

	private static Integer sortByE(String s1, String s2) {

		if (s1.charAt(0) == 'e') {
			return -1;
		} else if (s2.charAt(0) == 'e') {
			return 1;
		}
		return 0;
	}

	private static void sortByECharacterFirst(List<String> stringList) {
		// • Strings that contain “e” first, everything else second. For now, put the
		// code directly in the lambda.
		System.out.println("Strings that contain “e” first, everything else second.");
		stringList.sort((s1, s2) -> {
			if (s1.charAt(0) == 'e') {
				return -1;
			} else if (s2.charAt(0) == 'e') {
				return 1;
			}
			return 0;
		});
		stringList.forEach(System.out::println);
	}

	private static void sortByFirstCharacter(List<String> stringList) {
		// alphabetically by the first character only
		System.out.println("alphabetically by the first character only");
		stringList.sort((s1, s2) -> {
			return Integer.compare(s1.charAt(0), s2.charAt(0));
		});
		stringList.forEach(System.out::println);
	}

	// reverse length (i.e., longest to shortest)
	private static void sortByLongestLenght(List<String> stringList) {
		System.out.println("reverse length (i.e., longest to shortest)");
		stringList.sort((s1, s2) -> {
			return Integer.compare(s2.length(), s1.length());
		});
		stringList.forEach(System.out::println);

	}

	// Sort it by length (i.e., shortest to longest)
	private static void sortByShortestLenght(List<String> stringList) {
		System.out.println("Sort it by length (i.e., shortest to longest)");
		stringList.sort(Comparator.comparing(String::length));
		stringList.forEach(System.out::println);
	}
}
