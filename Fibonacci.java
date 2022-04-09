import java.util.stream.Stream;
public class Fibonacci {
	public static void main(String[] args) {
		/*Fibonacci Series: 0,1,1,2,3,5,8,...*/
		Stream.iterate(new int[] {0,1}, t-> new int[]{
			t[1],t[0]+t[1]
		}).limit(10)
		.map(x->x[0])
		.forEach(System.out::println);
	}
}
