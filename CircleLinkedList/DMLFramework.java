package CircleLinkedList;

import CircleLinkedList.SetInfo.SetInformation;

interface DMLFramework{
	
	//�˻�
	void select(SetInformation sif, int btn);
	void selectAll(SetInformation sif);
	
	SetInfo insert(SetInformation sif);//���
	void updata(SetInformation sif);//����
	void delete(SetInformation sif);//����

	
	
}