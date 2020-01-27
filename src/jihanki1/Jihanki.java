package jihanki1;

import java.util.Scanner;

public class Jihanki 
{

	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
//		ドリンクそれぞれのインスタンスを配列に代入
		Drink[] drinkList =  {new Mizu(),new Coke(),new Karupisu(),new Coffee(),new GingerAle()};
		
//		ドリンク名の配列。ドリンクの種類数に合わせて配列の初期化
		String[] drinkName = new String[drinkList.length];

//		ドリンク価格の配列。ドリンクの種類数に合わせて配列の初期化
		int[] drinkKakaku = new int[drinkList.length];
		
//		ドリンク名と価格を代入
		for(int i = 0; i < drinkList.length;i++) 
		{
			drinkName[i] = drinkList[i].GetName();
			drinkKakaku[i] = drinkList[i].GetKakaku();
//			ドリンクの個数設定
			drinkList[i].setKosuu(20);
		}
		
		Jidouhannbaiki jihanki = new Jidouhannbaiki();

//		自販機クラスのsyoukei変数の初期化のためにドリンクの種類数をセット
		jihanki.setSyoukei(drinkList.length);

		Scanner read = new Scanner(System.in);
		
		while(true)
		{
			//メニュー出力
			System.out.println("Drinks Menu");
			
//			選択番号とドリンク名と価格を表示する
			for(int i = 0; i < drinkList.length;i++) 
			{
				System.out.println(i+1+". "+drinkName[i]+drinkKakaku[i]);
			}
			
			System.out.println("Please choose drink. Press 0 to exit");

			try 
			{
//				選択された番号
				int x = read.nextInt();
				
//				選択された番号とdrinkList配列を自動販売機クラスへ送る
				jihanki.jidouhanbaiki(x,drinkList);
				
//				0が選択されたら終了
				if(x == 0) 
				{
					System.out.println("システム終了");
					break;
				}
				
			}
			catch (Exception e) 
			{
//				エラーメッセージ
				System.out.println("正しく入力してください");
				e.printStackTrace();
				break;
			}
		}
	}
}
