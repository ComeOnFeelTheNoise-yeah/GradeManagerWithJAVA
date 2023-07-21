package CircleLinkedList;

import CircleLinkedList.SetInfo.SetInformation;

interface DMLFramework{
	
	//검색
	void select(SetInformation sif, int btn);
	void selectAll(SetInformation sif);
	
	SetInfo insert(SetInformation sif);//등록
	void updata(SetInformation sif);//수정
	void delete(SetInformation sif);//삭제

	
	
}