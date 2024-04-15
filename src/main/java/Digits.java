import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		digitList = new ArrayList<Integer>();
		int n = num;
		if(num == 0){
			digistList.add(0);
		}
		while(n > 0){
			digistList.add(0,n%10);
			n = n/10;
		}
		
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < digitsList.size()-1; i++){
			if(digitsList.get(i) >= digitsList.get(i+1)){
				return false;
			}
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
