/*
Ŭ����(Class): 10��

CoustomFramework
CoustomGradCal
Info
Main
Materialization
Name
SetInfo
SetInfo.SetInformation
Subject
SubjectInfo
�������̽�(Interface): 1��

DMLFramework
���� Ŭ����(Main Class):

Main
*/
package CircleLinkedList;

import CircleLinkedList.SetInfo.SetInformation;

public class Main extends Materialization{
	
	public static void main(String[] args) {
		Materialization mt = new Materialization();
		SetInfo si0 = new SetInfo();
		SetInfo.SetInformation sif = si0.new SetInformation("0", 0, 0, 0, 0, 0); //sif �ʱ�ȭ
		Object obj;
		int btn;
		
		
		while(true) {
			si0.firstMent();
			btn = si0.inOutBtn();
			
			if(btn == 1) {
				SetInfo si = new SetInfo();
				//���� �ٰ��� ���ϴ� ������ �˾Ƴ�����
				sif.inputName();
				sif.inputScore();
				
				SetInformation sif0 = si.new SetInformation(sif.getName(), sif.getKor(), sif.getEng(), sif.getMat(), sif.getTotal(), sif.getAvg());
				mt.insert(sif);//�߰�
				
			}else if(btn == 2){
				
				mt.updata(sif);//����
				
				
			}else if(btn == 3) {
				
				mt.delete(sif); //����
				
			} else if(btn == 4) {
				
				si0.selectMenu(); //�̸� ������
				btn = si0.inOutBtn();
				mt.select(sif,btn);//��ȸ
				

				
			} else if(btn == 5) { //��ü ���
				
				mt.selectAll(sif);
				
			} else if(btn == 6) { //��ü ����
				
				mt.deleteAll();
				
			}
			else {
				System.exit(-1);
			}
		}
	}
}