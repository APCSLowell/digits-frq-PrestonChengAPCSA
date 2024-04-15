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
		int n = num;
		while(n > 0){
			digistList.add(0,n%10);
			n = n/10;
		}
		
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		int value = false;
		for(int i = 0; i < digitsList.length-1; i++){
			if(digitsList.get(i) < digits.get(i+1)){
				value = true;
			} else {
				value = false;
			}
		}	

		return value;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
