package jihanki1;

import java.util.Scanner;

public class Jihanki 
{

	public static void main(String[] args) 
	{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
//		�h�����N���ꂼ��̃C���X�^���X��z��ɑ��
		Drink[] drinkList =  {new Mizu(),new Coke(),new Karupisu(),new Coffee(),new GingerAle()};
		
//		�h�����N���̔z��B�h�����N�̎�ސ��ɍ��킹�Ĕz��̏�����
		String[] drinkName = new String[drinkList.length];

//		�h�����N���i�̔z��B�h�����N�̎�ސ��ɍ��킹�Ĕz��̏�����
		int[] drinkKakaku = new int[drinkList.length];
		
//		�h�����N���Ɖ��i����
		for(int i = 0; i < drinkList.length;i++) 
		{
			drinkName[i] = drinkList[i].GetName();
			drinkKakaku[i] = drinkList[i].GetKakaku();
//			�h�����N�̌��ݒ�
			drinkList[i].setKosuu(20);
		}
		
		Jidouhannbaiki jihanki = new Jidouhannbaiki();

//		���̋@�N���X��syoukei�ϐ��̏������̂��߂Ƀh�����N�̎�ސ����Z�b�g
		jihanki.setSyoukei(drinkList.length);

		Scanner read = new Scanner(System.in);
		
		while(true)
		{
			//���j���[�o��
			System.out.println("Drinks Menu");
			
//			�I��ԍ��ƃh�����N���Ɖ��i��\������
			for(int i = 0; i < drinkList.length;i++) 
			{
				System.out.println(i+1+". "+drinkName[i]+drinkKakaku[i]);
			}
			
			System.out.println("Please choose drink. Press 0 to exit");

			try 
			{
//				�I�����ꂽ�ԍ�
				int x = read.nextInt();
				
//				�I�����ꂽ�ԍ���drinkList�z��������̔��@�N���X�֑���
				jihanki.jidouhanbaiki(x,drinkList);
				
//				0���I�����ꂽ��I��
				if(x == 0) 
				{
					System.out.println("�V�X�e���I��");
					break;
				}
				
			}
			catch (Exception e) 
			{
//				�G���[���b�Z�[�W
				System.out.println("���������͂��Ă�������");
				e.printStackTrace();
				break;
			}
		}
	}
}
