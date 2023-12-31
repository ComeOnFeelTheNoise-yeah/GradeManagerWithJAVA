/*
클래스(Class): 10개

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
인터페이스(Interface): 1개

DMLFramework
메인 클래스(Main Class):

Main
*/
package CircleLinkedList;

import CircleLinkedList.SetInfo.SetInformation;

public class Main extends Materialization{
	
	public static void main(String[] args) {
		Materialization mt = new Materialization();
		SetInfo si0 = new SetInfo();
		SetInfo.SetInformation sif = si0.new SetInformation("0", 0, 0, 0, 0, 0); //sif 초기화
		Object obj;
		int btn;
		
		
		while(true) {
			si0.firstMent();
			btn = si0.inOutBtn();
			
			if(btn == 1) {
				SetInfo si = new SetInfo();
				//값이 다같이 변하는 이유를 알아내야함
				sif.inputName();
				sif.inputScore();
				
				SetInformation sif0 = si.new SetInformation(sif.getName(), sif.getKor(), sif.getEng(), sif.getMat(), sif.getTotal(), sif.getAvg());
				mt.insert(sif);//추가
				
			}else if(btn == 2){
				
				mt.updata(sif);//수정
				
				
			}else if(btn == 3) {
				
				mt.delete(sif); //삭제
				
			} else if(btn == 4) {
				
				si0.selectMenu(); //이름 성적순
				btn = si0.inOutBtn();
				mt.select(sif,btn);//조회
				

				
			} else if(btn == 5) { //전체 출력
				
				mt.selectAll(sif);
				
			} else if(btn == 6) { //전체 삭제
				
				mt.deleteAll();
				
			}
			else {
				System.exit(-1);
			}
		}
	}
}
