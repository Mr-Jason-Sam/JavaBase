package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class IteratorTest {
	
	public static void stramTest() {
		List<String> s = Arrays.asList("AA", "BB", "CC");
		 s = s.stream()
		.map(String::toLowerCase)
		.collect(Collectors.toList());
		
		System.out.println(s);
		
	}
	
	public static void stramTest2() {
		Stream<List<Integer>> inputStream = Stream.of(
				 Arrays.asList(1),
				 Arrays.asList(2, 3),
				 Arrays.asList(4, 5, 6)
				 );
		
		inputStream
		.flatMap((childList) -> childList.stream())
		.peek(a -> System.out.println(a));
		
	}
	
	public static void streamTest3() {
		// 使用一个容器装载 100 个数字，通过 Stream 并行处理的方式将容器中为单数的数字转移到容器 parallelList
		List<Integer> integerList= new ArrayList<Integer>();

		for (int i = 0; i <100; i++) {
		      integerList.add(i);
		}

		List<Integer> parallelList = new CopyOnWriteArrayList<Integer>() ;
		
		integerList.stream()
		           .parallel()
		           .filter(i->i%2==1)
		           .forEach(i->parallelList.add(i));
		parallelList.stream().forEach(n -> System.out.print(n+", "));
		System.out.println();
		System.out.println(parallelList.size());

	}
	
	public static void main(String[] args) {
//		IteratorTest.stramTest();
//		IteratorTest.stramTest2();
//		IteratorTest.streamTest3();
		
		System.out.println(15>>>2);
	}
}
