package jihanki1;

public class Jidouhannbaiki 
{
//	�h�����N�ʂ̏��v�̔z��
	int[] syoukei;
	
//	���̋@�N���X�Ŗ�����h�����N�̎�ސ����Z�b�g���ď�����
	public void setSyoukei(int variousTypes) 
	{
		this.syoukei = new int[variousTypes];
	}
	
	
//	���ׂẴh�����N�̍��v���z
	int goukeikingaku = 0;

	public int getGoukeikingaku() 
	{
		return goukeikingaku;
	}

//	���j���[�őI�����ꂽ�ԍ���drinkList�z������̋@�N���X����Ⴄ
	public void jidouhanbaiki(int sentaku,Drink[] drinkList) 
	{
		String urikire = "�͔���؂�ł�";
		String kei = "�@���v�F";
		String goukei = "���ݕ��@���v�F";

//		0���I�����ꂽ�ꍇ
		if(sentaku == 0) 
		{
		  for(int i = 0; i < drinkList.length;i++) 
		  {
//			�@�@�h�����N���Ə��v���ʂɕ\������
			  System.out.println(drinkList[i].GetName()+kei+syoukei[i]);
//			�@�@�h�����N�ʂ̏��v�𑫂��Ă���
			  goukeikingaku = goukeikingaku + syoukei[i];
		  }
//		 �@ ���ׂẴh�����N�̍��v���z��\��
		  System.out.println(goukei+goukeikingaku);
		}
//		0���傫���ő吔�ȉ��̏ꍇ
//		���z��̃i���o�[��0����n�܂邽��-1���Ă���
		else if(sentaku > 0 && sentaku <= drinkList.length)
		{
//			�h�����N���݌ɐ؂�̏ꍇ
			if(drinkList[sentaku-1].getKosuu()==0) 
			{
//				�@�@����؂�܂����ƕ\��
				  System.out.println(drinkList[sentaku-1].GetName()+urikire);
			}
			else 
			  	{
//				�@�@�I�����ꂽ�h�����N�̌�����P������
				  int kosuu = drinkList[sentaku-1].getKosuu() -1;
//				  �@���������ʂ��Z�b�g
				  drinkList[sentaku-1].setKosuu(kosuu);
//				  �@�h�����N�̏��v�ƃh�����N�P���𑫂��Ă���
				  syoukei[sentaku-1]= syoukei[sentaku-1]+drinkList[sentaku-1].GetKakaku();
			  	}
		}
		else
		{
//			�G���[���b�Z�[�W
			System.out.println("���������͂��Ă��������B");
		}
	}	
}
