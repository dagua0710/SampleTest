
public class MyTest {

	public static void main(String[] args) {
		game(1, 100);
	}

	public static void game(int begin, int end){
		if(end == 0){
			System.out.println("Input error, please re-enter");
			return;
		}
		
		if(begin > end){
			System.out.println("Input error, begin data cannot be greater than or equal to end data. Please re-enter.");
			return;
		}
		
		for(int i=begin;i<=end;i++){
			if(i%3 == 0 && i%5 == 0){
				System.out.println("FizzBuzz");
			}
			else if(i%3 == 0){
				System.out.println("Fizz");
			}
			else if(i%5 == 0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
}
