package Tools;

public class MyTools {

	public static boolean checkNum3(int num){
		try
		{
			String item = String.valueOf(num);		
			if(item.contains("3")){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean checkNum5(int num){
		try
		{
			String item = String.valueOf(num);		
			if(item.contains("5")){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
