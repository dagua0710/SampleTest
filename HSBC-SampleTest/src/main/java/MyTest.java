import Services.Game;
import Services.Impl.GameFirst;
import Services.Impl.GameSecond;

public class MyTest {

	public static void main(String[] args) {
		Game gameFirst = new GameFirst();
		gameFirst.MyGame(1, 100);
		
		Game gameSecond = new GameSecond();
		gameSecond.MyGame(1, 100);
	}
}
