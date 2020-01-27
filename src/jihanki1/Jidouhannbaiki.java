package jihanki1;

public class Jidouhannbaiki 
{
//	ドリンク個別の小計の配列
	int[] syoukei;
	
//	自販機クラスで貰ったドリンクの種類数をセットして初期化
	public void setSyoukei(int variousTypes) 
	{
		this.syoukei = new int[variousTypes];
	}
	
	
//	すべてのドリンクの合計金額
	int goukeikingaku = 0;

	public int getGoukeikingaku() 
	{
		return goukeikingaku;
	}

//	メニューで選択された番号とdrinkList配列を自販機クラスから貰う
	public void jidouhanbaiki(int sentaku,Drink[] drinkList) 
	{
		String urikire = "は売り切れです";
		String kei = "　小計：";
		String goukei = "飲み物　合計：";

//		0が選択された場合
		if(sentaku == 0) 
		{
		  for(int i = 0; i < drinkList.length;i++) 
		  {
//			　　ドリンク名と小計を個別に表示する
			  System.out.println(drinkList[i].GetName()+kei+syoukei[i]);
//			　　ドリンク個別の小計を足していく
			  goukeikingaku = goukeikingaku + syoukei[i];
		  }
//		 　 すべてのドリンクの合計金額を表示
		  System.out.println(goukei+goukeikingaku);
		}
//		0より大きく最大数以下の場合
//		※配列のナンバーは0から始まるため-1している
		else if(sentaku > 0 && sentaku <= drinkList.length)
		{
//			ドリンクが在庫切れの場合
			if(drinkList[sentaku-1].getKosuu()==0) 
			{
//				　　売り切れましたと表示
				  System.out.println(drinkList[sentaku-1].GetName()+urikire);
			}
			else 
			  	{
//				　　選択されたドリンクの個数から１を引く
				  int kosuu = drinkList[sentaku-1].getKosuu() -1;
//				  　引いた結果をセット
				  drinkList[sentaku-1].setKosuu(kosuu);
//				  　ドリンクの小計とドリンク単価を足している
				  syoukei[sentaku-1]= syoukei[sentaku-1]+drinkList[sentaku-1].GetKakaku();
			  	}
		}
		else
		{
//			エラーメッセージ
			System.out.println("正しく入力してください。");
		}
	}	
}
