package jihanki1;

//継承元クラス
abstract class Drink
{
	int kosuu;
	
	public int getKosuu() 
	{
		return kosuu;
	}
	
	public void setKosuu(int kosuu) 
	{
		this.kosuu = kosuu;
	}
	
	abstract int GetKakaku();
	
	abstract String GetName();

}

//ここから下はDrinkクラスを実装した飲み物クラス

class Mizu extends Drink
{
	public int GetKakaku()
	{
		return 160;
	}
	
	public String GetName()
	{
		return "Mizu";		
	}
}

class GingerAle extends Drink
{
	public int GetKakaku()
	{
		return 160;
	}

	public String GetName()
	{
		return "GingerAle";
	}     

}

class Coke extends Drink
{
	public int GetKakaku()
	{
		return 160;
	}

	public String GetName()
	{
		return "Coke";
	}     
}

class Karupisu extends Drink
{
	
	public int GetKakaku()
	{
		return 160;
	}

	public String GetName()
	{
		return "Karupisu";
	}

}

class Coffee extends Drink
{
	
	public int GetKakaku()
	{
		return 160;
	}

	public String GetName()
	{
		return "Coffee";
	}

}

