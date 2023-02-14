package corejavafeatures.streamapi;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
/* Processing Data in Memory Using the Stream API */
record Sale{
	private String product;
    private LocalDate date;
    private int amount;
}
public class StreamAPIDemo {
	public static void main(String[] args) {
		demo1();	
	}
	/* Introducing the Stream API */
	public static void demo1() {
		List<String> strings = List.of("one", "two", "three", "four");
		// 3 : 2, 4 : 1 , 5 : 1
		Map<Integer, Long> countMap = strings.stream().collect(groupingBy(String::length, counting()));
		System.out.println(countMap);
	}
}
