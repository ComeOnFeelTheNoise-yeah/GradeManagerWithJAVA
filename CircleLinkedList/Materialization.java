package CircleLinkedList;



//CircleLinkedList 패키지 내부에 있는 Materialization 클래스
//이 클래스는 CoustomFramework 클래스를 상속하고 DMLFramework 인터페이스를 구현
public class Materialization<T> extends CustomFramework implements DMLFramework {

	// SetInfo 객체를 참조하는 멤버 변수
	private SetInfo si;

	// 검색 결과를 저장하는 CustomCircleLinkedList<Object> 타입의 객체
	private CustomCircleLinkedList<Object> search;
	
	private String str;

	// 인덱스 값을 저장
	private int index;

	// 추가할 항목의 인덱스 값을 저장
	public int addIndex;
	
	

	// Materialization 클래스의 생성자
	public void Materialization() {
		// 'str' 변수를 빈 문자열로 초기화
		str = "";
		addIndex = 0;
	}

	// 'sif'와 'btn' 값을 인자로 받는 select 메서드
	// 'btn' 값에 따라 다른 동작을 수행
	public void select(SetInfo.SetInformation sif, int btn) {
		switch (btn) {
		case 1:
			// 'selectCase1' 메서드를 호출하여 학생 정보를 검색
			selectCase1(sif);
			break;
		case 2:
			// 'sif' 객체의 'selectMenu2' 메서드를 호출하여 메뉴를 표시하고 사용자 입력을 받아 'btn'에 할당
			btn = sif.selectMenu2();
			// 'selectScore' 메서드를 호출하여 성적 정보를 검색
			selectScore(sif, btn);
			break;
		}
	}

	// 'si'와 'btn' 값을 인자로 받는 selectUpDown 메서드
	// 'btn' 값에 따라 다른 동작을 수행
	public void selectUpDown(SetInfo si, int btn) {
		// 'standard'라는 정수형 변수를 선언
		int standard;
		switch (btn) {
		case 1:
			// 'si' 객체의 'selectMenu4' 메서드를 호출하여 메뉴를 표시하고 사용자 입력을 받아 'standard'에 할당
			standard = si.selectMenu4();
			// 'selectScoreAbove' 메서드를 호출하여 특정 성적 이상인 학생을 검색
			selectScoreAbove(si, standard);
			break;
		case 2:
			// 'si' 객체의 'selectMen5' 메서드를 호출하여 메뉴를 표시하고 사용자 입력을 받아 'standard'에 할당
			standard = si.selectMen5();
			// 'selectScoreBelow' 메서드를 호출하여 특정 성적 이하인 학생을 검색
			selectScoreBelow(si, standard);
			break;
		}
	}

	// 아래 코드 case에서 break 없애고 수정하기
	
	// 'si'와 'btn' 값을 인자로 받는 selectScore 메서드
	// 'btn' 값에 따라 다른 동작을 수행
	public void selectScore(SetInfo si, int btn) {
		switch (btn) {
		case 1:
			// 'si' 객체의 'selectMenu3' 메서드를 호출하여 메뉴를 표시하고 사용자 입력을 받아 'btn'에 할당
			btn = si.selectMenu3();
			// 'selectUpDown' 메서드를 호출하여 특정 성적 범위의 학생을 검색
			selectUpDown(si, btn);
			break;
		case 2:
			
			btn = si.selectMenu3();
			
			selectUpDown(si, btn);
			break;
		case 3:
			// 'si' 객체의 'selectMenu3' 메서드를 호출하여 메뉴를 표시하고 사용자 입력을 받아 'btn'에 할당
			btn = si.selectMenu3();
			// 'selectUpDown' 메서드를 호출하여 특정 성적 범위의 학생을 검색
			selectUpDown(si, btn);
			break;
		case 4:
			// 'si' 객체의 'selectMenu3' 메서드를 호출하여 메뉴를 표시하고 사용자 입력을 받아 'btn'에 할당
			btn = si.selectMenu3();
			// 'selectUpDown' 메서드를 호출하여 특정 성적 범위의 학생을 검색
			selectUpDown(si, btn);
			break;
		case 5:
			// 'si' 객체의 'selectMenu3' 메서드를 호출하여 메뉴를 표시하고 사용자 입력을 받아 'btn'에 할당
			btn = si.selectMenu3();
			// 'selectUpDown' 메서드를 호출하여 특정 성적 범위의 학생을 검색
			selectUpDown(si, btn);
			break;
		}
	}

	// 'si'와 'score' 값을 인자로 받는 selectScoreAbove 메서드
	// 특정 성적 이상인 학생을 검색하고 출력
	private void selectScoreAbove(SetInfo si, int score) {
		// 'selectedSubject'라는 정수형 변수를 선언
		int selectedSubject = si.selectMenu6();
		// CustomCircleLinkedList<SetInfo.SetInformation> 타입의 객체인 'selectedList'를 생성
		// 이 객체는 검색된 학생 정보를 저장하는 용도로 사용
		CustomCircleLinkedList<SetInfo.SetInformation> selectedList = new CustomCircleLinkedList<>();

		Object obj = null;
		// getLinkedList()의 크기가 0이 아닐 때까지 반복
		while (getLinkedList().size() != 0) {
			// 'sif'라는 SetInfo.SetInformation 타입의 객체를 obj에 할당
			SetInfo.SetInformation sif = (SetInfo.SetInformation) obj;
			// 만약 해당 학생이 삭제되지 않았다면 아래 조건문을 실행
			if (!sif.isDeleted()) {
				switch (selectedSubject) {
				case 1:
					// 선택된 과목이 국어인 경우, 국어 성적이 기준 점수 이상인 학생을 'selectedList'에 추가
					if (sif.getKor() >= score) {
						selectedList.append(sif);
					}
					break;
				case 2:
					// 선택된 과목이 영어인 경우, 영어 성적이 기준 점수 이상인 학생을 'selectedList'에 추가
					if (sif.getEng() >= score) {
						selectedList.append(sif);
					}
					break;
				case 3:
					// 선택된 과목이 수학인 경우, 수학 성적이 기준 점수 이상인 학생을 'selectedList'에 추가
					if (sif.getMat() >= score) {
						selectedList.append(sif);
					}
					break;
				case 4:
					// 선택된 과목이 총점인 경우, 총점이 기준 점수 이상인 학생을 'selectedList'에 추가
					if (sif.getTotal() >= score) {
						selectedList.append(sif);
					}
					break;
				case 5:
					// 선택된 과목이 평균인 경우, 평균이 기준 점수 이상인 학생을 'selectedList'에 추가
					if (sif.getAvg() >= score) {
						selectedList.append(sif);
					}
					break;
				}
			}
		}

		// 만약 'selectedList'가 비어있지 않다면, 성적 기준 이상인 학생들을 출력
		if (!selectedList.isEmpty()) {
			System.out.println("성적 기준 이상 학생 목록:");
			printStudentList(selectedList, si);
		} else {
			System.out.println("성적 기준 이상인 학생이 없습니다.");
		}
	}

	// 'si'와 'score' 값을 인자로 받는 selectScoreBelow 메서드
	// 특정 성적 이하인 학생을 검색하고 출력
	private void selectScoreBelow(SetInfo si, int score) {
		// 'selectedSubject'라는 정수형 변수를 선언
		int selectedSubject = si.selectMenu2();
		// CustomCircleLinkedList<SetInfo.SetInformation> 타입의 객체인 'selectedList'를 생성
		// 이 객체는 검색된 학생 정보를 저장하는 용도로 사용
		CustomCircleLinkedList<SetInfo.SetInformation> selectedList = new CustomCircleLinkedList<>();

		Object object = null;
		// getLinkedList()의 크기가 0이 아닐 때까지 반복
		while (getLinkedList().size() != 0) {
			// 'sif'라는 SetInfo.SetInformation 타입의 객체를 object에 할당
			SetInfo.SetInformation sif = (SetInfo.SetInformation) object;
			// 만약 해당 학생이 삭제되지 않았다면 아래 조건문을 실행
			if (!sif.isDeleted()) {
				switch (selectedSubject) {
				case 1:
					// 선택된 과목이 국어인 경우, 국어 성적이 기준 점수 이하인 학생을 'selectedList'에 추가
					if (sif.getKor() <= score) {
						selectedList.append(sif);
					}
					break;
				case 2:
					// 선택된 과목이 영어인 경우, 영어 성적이 기준 점수 이하인 학생을 'selectedList'에 추가
					if (sif.getEng() <= score) {
						selectedList.append(sif);
					}
					break;
				case 3:
					// 선택된 과목이 수학인 경우, 수학 성적이 기준 점수 이하인 학생을 'selectedList'에 추가
					if (sif.getMat() <= score) {
						selectedList.append(sif);
					}
					break;
				case 4:
					// 선택된 과목이 총점인 경우, 총점이 기준 점수 이하인 학생을 'selectedList'에 추가
					if (sif.getTotal() <= score) {
						selectedList.append(sif);
					}
					break;
				case 5:
					// 선택된 과목이 평균인 경우, 평균이 기준 점수 이하인 학생을 'selectedList'에 추가
					if (sif.getAvg() <= score) {
						selectedList.append(sif);
					}
					break;
				}
			}
		}

		// 만약 'selectedList'가 비어있지 않다면, 성적 기준 이하인 학생들을 출력
		if (!selectedList.isEmpty()) {
			System.out.println("성적 기준 이하 학생 목록:");
			printStudentList(selectedList, si);
		} else {
			System.out.println("성적 기준 이하인 학생이 없습니다.");
		}
	}

	// CustomCircleLinkedList<SetInfo.SetInformation> 타입의 리스트와 SetInfo 객체를 인자로 받는
	// printStudentList 메서드 학생 정보 리스트를 출력
	private void printStudentList(CustomCircleLinkedList<SetInfo.SetInformation> list, SetInfo si) {
        int sortOption = si.selectMenu7();
        boolean ascending = sortOption == 1; // 1이면 오름차순, 2이면 내림차순
        // 버튼이 두개만 있을떄는 이런 코드도 가능함

        // merge sort를 이용하여 리스트를 정렬
        mergeSort(list, ascending);

        // 정렬된 리스트를 출력
        for (int i = 0; i < list.size(); i++) {
            SetInfo.SetInformation sif = (SetInfo.SetInformation) list.get(i);
            System.out.println(sif);
        }
    }

    // Merge sort 구현부분
    private void mergeSort(CustomCircleLinkedList<SetInfo.SetInformation> list, boolean ascending) {
        int size = list.size();
        if (size <= 1) {
            return;
        }

        int mid = size / 2;
        CustomCircleLinkedList<SetInfo.SetInformation> leftList = new CustomCircleLinkedList<>();
        CustomCircleLinkedList<SetInfo.SetInformation> rightList = new CustomCircleLinkedList<>();

        // 리스트를 왼쪽과 오른쪽으로 분할
        for (int i = 0; i < mid; i++) {
            leftList.append(list.get(i));
        }
        for (int i = mid; i < size; i++) {
            rightList.append(list.get(i));
        }

        // 왼쪽과 오른쪽 리스트를 재귀적으로 정렬
        mergeSort(leftList, ascending);
        mergeSort(rightList, ascending);

        // 정렬된 두 리스트를 병합
        merge(list, leftList, rightList, ascending);
    }

    private void merge(CustomCircleLinkedList<SetInfo.SetInformation> result, CustomCircleLinkedList<SetInfo.SetInformation> leftList,
                       CustomCircleLinkedList<SetInfo.SetInformation> rightList, boolean ascending) {
        int leftSize = leftList.size();
        int rightSize = rightList.size();
        int leftIndex = 0;
        int rightIndex = 0;

        // 왼쪽과 오른쪽 리스트를 비교하여 정렬된 결과 리스트에 추가
        while (leftIndex < leftSize && rightIndex < rightSize) {
            SetInfo.SetInformation leftElement = (SetInfo.SetInformation) leftList.get(leftIndex);
            SetInfo.SetInformation rightElement = (SetInfo.SetInformation) rightList.get(rightIndex);

            int compareResult;
            if (ascending) {
                compareResult = leftElement.getName().compareTo(rightElement.getName());
            } else {
                compareResult = rightElement.getName().compareTo(leftElement.getName());
            }

            if (compareResult <= 0) {
                result.set(result.size(), leftElement);
                leftIndex++;
            } else {
                result.set(result.size(), rightElement);
                rightIndex++;
            }
        }

        // 남은 요소들을 결과 리스트에 추가
        while (leftIndex < leftSize) {
            SetInfo.SetInformation leftElement = (SetInfo.SetInformation) leftList.get(leftIndex);
            result.set(result.size(), leftElement);
            leftIndex++;
        }
        while (rightIndex < rightSize) {
            SetInfo.SetInformation rightElement = (SetInfo.SetInformation) rightList.get(rightIndex);
            result.set(result.size(), rightElement);
            rightIndex++;
        }
    }

	public void upDown(SetInfo si, int btn) {
		int standard;
		switch (btn) {
		case 1:
			standard = si.selectMenu4();
			break;
		case 2:
			standard = si.selectMen5();
			break;
		}
	}

	public void selectCase1(SetInfo.SetInformation sif) {
		int cnt = 0;
		search = new CustomCircleLinkedList<>();
		search.clear();
		String name = sif.simpleInputName();

		for (int i = 0; i < getLinkedList().size(); i++) {
			sif = (SetInfo.SetInformation) getLinkedList().get(i);

			if (sif.getName().equals(name)) {
				sif = (SetInfo.SetInformation) getLinkedList().get(i);
				search.append(sif);
				cnt++;
			}
		}

		for (int j = 0; j < search.size(); j++) {
			sif = (SetInfo.SetInformation) search.get(j);

			System.out.println(sif);
		}
	}

	public CustomCircleLinkedList<Object> selectDel(SetInfo.SetInformation sif) {
		int cnt = 0;
		search = new CustomCircleLinkedList<>();
		// search.clear(); 계속비워져있음
		String name = sif.simpleInputName();

		for (int i = 0; i < getLinkedList().size(); i++) {
			// sif가 null이되지않고 모든 객체를 저장
			sif = (SetInfo.SetInformation) getLinkedList().get(i); 
			
			// sif 의 이름을 받아와서 비교를 함
			if (sif.getName().equals(name)) {
				// sif를 재사용하고, sif에 같은 이름만 저장함
				sif = (SetInfo.SetInformation) getLinkedList().get(i); //위 코드와 같은 코드같지만 지우면 안됌
				search.append(sif);
				cnt++;
			}
		}

		return search;
	}

	@Override
	public void selectAll(SetInfo.SetInformation sif) {
		for (int j = 0; j < getLinkedList().size(); j++) {
			sif = (SetInfo.SetInformation) getLinkedList().get(j);
			System.out.println(sif);
		}
	}

	@Override
	public SetInfo insert(SetInfo.SetInformation sif) {
		
		SetInfo si = new SetInfo();
		
		String name = getNameString(sif);
		int kor = getKorInt(sif);
		int eng = getEngInt(sif);
		int mat = getMatInt(sif);

		SetInfo.SetInformation sif0 = si.new SetInformation(sif.getName(), sif.getKor(), sif.getEng(), sif.getMat(),
				si.getTotal(), si.getAvg());
		addLinkedList(sif0, getLinkedList(), addIndex);

		addIndex++;
		return si;
	}

	public void updata(SetInfo.SetInformation sif) {
		search = selectDel(sif);
		sif = (SetInfo.SetInformation) search.get(0);
		String name = sif.getName();

		if (search.size() == 1) {
			// 이름이 일치하는 항목을 찾았을 때 수정 작업 진행
			SetInfo.SetInformation selectedSif = (SetInfo.SetInformation) search.get(0);
			// 선택된 항목의 정보를 출력
			System.out.println(selectedSif);

			// 수정할 작업 선택
			System.out.println("수정할 작업을 선택하세요:");
			System.out.println("1. 개명");
			System.out.println("2. 국어 성적 변경");
			System.out.println("3. 영어 성적 변경");
			System.out.println("4. 수학 성적 변경");
			int choice = sif.inOutBtn();

			switch (choice) {
			case 1:
				// 개명 작업
				String newName = selectedSif.newName();
				selectedSif.setName(newName);
				System.out.println("개명이 완료되었습니다.");
				break;
			case 2:
				// 국어 성적 변경
				int newKor = selectedSif.updataKor();
				selectedSif.setKor(newKor);
				System.out.println("국어 성적이 변경되었습니다.");
				break;
			case 3:
				// 영어 성적 변경
				int newEng = selectedSif.updataEng();
				selectedSif.setEng(newEng);
				System.out.println("영어 성적이 변경되었습니다.");
				break;
			case 4:
				// 수학 성적 변경
				int newMat = selectedSif.updataMat();
				selectedSif.setMat(newMat);
				System.out.println("수학 성적이 변경되었습니다.");
				break;
			default:
				System.out.println("유효하지 않은 선택입니다. 수정을 취소합니다.");
				break;
			}

			// 수정된 총점과 평균을 계산하여 설정
			int total = selectedSif.getKor() + selectedSif.getEng() + selectedSif.getMat();
			float avg = total / 3.0f;
			selectedSif.setTotal(total);
			selectedSif.setAvg(avg);

			System.out.println("수정이 완료되었습니다.");
		} else if (search.size() > 1) {
			for (int i = 0; i < search.size(); i++) {
				SetInfo.SetInformation matchedSif = (SetInfo.SetInformation) search.get(i);
				System.out.println(i + ". " + matchedSif.getName());
			}
		
			int selectedIndex = sif.delNum();

			if (selectedIndex >= 0 && selectedIndex < search.size()) {
				SetInfo.SetInformation selectedSif = (SetInfo.SetInformation) search.get(selectedIndex);
				
				updateSelectedSif( sif, selectedIndex, search );
			}
			
			

			
		} else {
			System.out.println("일치하는 이름이 없습니다. 수정을 취소합니다.");
		}
	}
	//파라미터를 변경하기위해...// 다음엔 그대로 쓰지말고 밑에 항목도 따로 파라미터만 처리해서 사용할것!
	public void updateSelectedSif(SetInfo.SetInformation sif, int selectedIndex,CustomCircleLinkedList<Object> search) {
		
					// 이름이 일치하는 항목을 찾았을 때 수정 작업 진행
					SetInfo.SetInformation selectedSif = (SetInfo.SetInformation) search.get(selectedIndex);
					// 선택된 항목의 정보를 출력
					System.out.println(selectedSif);

					// 수정할 작업 선택
					System.out.println("수정할 작업을 선택하세요:");
					System.out.println("1. 개명");
					System.out.println("2. 국어 성적 변경");
					System.out.println("3. 영어 성적 변경");
					System.out.println("4. 수학 성적 변경");
					int choice = sif.inOutBtn();

					switch (choice) {
					case 1:
						// 개명 작업
						String newName = selectedSif.newName();
						selectedSif.setName(newName);
						System.out.println("개명이 완료되었습니다.");
						break;
					case 2:
						// 국어 성적 변경
						int newKor = selectedSif.updataKor();
						selectedSif.setKor(newKor);
						System.out.println("국어 성적이 변경되었습니다.");
						break;
					case 3:
						// 영어 성적 변경
						int newEng = selectedSif.updataEng();
						selectedSif.setEng(newEng);
						System.out.println("영어 성적이 변경되었습니다.");
						break;
					case 4:
						// 수학 성적 변경
						int newMat = selectedSif.updataMat();
						selectedSif.setMat(newMat);
						System.out.println("수학 성적이 변경되었습니다.");
						break;
					default:
						System.out.println("유효하지 않은 선택입니다. 수정을 취소합니다.");
						break;
					}

					// 수정된 총점과 평균을 계산하여 설정
					int total = selectedSif.getKor() + selectedSif.getEng() + selectedSif.getMat();
					float avg = total / 3.0f;
					selectedSif.setTotal(total);
					selectedSif.setAvg(avg);

					System.out.println("수정이 완료되었습니다.");
	}
	
	@Override
	public void delete(SetInfo.SetInformation sif) {
	    search = selectDel(sif);

	    if (search.size() == 1) {
	        linkedListRemover(sif.getName());
	    } else if (search.size() > 1) {
	        System.out.println("일치하는 이름이 여러 개 있습니다. 삭제할 항목의 인덱스 번호를 선택해주세요:");
	        for (int i = 0; i < search.size(); i++) {
	            SetInfo.SetInformation matchedSif = (SetInfo.SetInformation) search.get(i);
	            System.out.println(i + ". " + matchedSif.getName());
	        }

	        int selectedIndex = sif.delNum();
	        if (selectedIndex >= 0 && selectedIndex < search.size()) {
	            SetInfo.SetInformation selectedSif = (SetInfo.SetInformation) search.get(selectedIndex);
	            selectedSif.setDeleted(true);

	            // 원본 리스트에서 삭제할 인덱스를 구해서 remove() 메서드 호출
	            int delIndex = getLinkedList().indexOf(selectedSif);
	            if (delIndex != -1) {
	                getLinkedList().remove(delIndex);
	                System.out.println("선택된 항목을 삭제하였습니다.");
	            } else {
	                System.out.println("해당 객체를 찾을 수 없습니다. 삭제를 취소합니다.");
	            }
	        } else {
	            System.out.println("유효하지 않은 인덱스 번호입니다. 삭제를 취소합니다.");
	        }
	    } else {
	        System.out.println("일치하는 이름이 없습니다. 삭제를 취소합니다.");
	    }
	}



	public void deleteAll() {
		int i;
		for(i =getLinkedList().size(); i >1; i--) {
			remove(i);
		}
		clear();
		getLinkedList().clear();
		System.out.println("전체 삭제를 완료하였습니다.");
		
		//비어있을 경우 반환값이 있음. // 전체 삭제를 완료 한거임
		System.out.println("" + getLinkedList().isEmpty());
		
	}

	public String getNameString(SetInfo.SetInformation si) {// 입력값
		return si.getName();
	}

	public String getNameString(int i, SetInfo si) {// 저장된값
		si = (SetInfo) getLinkedList().get(i);
		return si.getName();
	}

	public String setGetNameString(String s, SetInfo si) {// 저장하고 반환
		si.setName(s);
		return si.getName();
	}

	public int getKorInt(SetInfo.SetInformation sif) {// 입력값
		return sif.getKor();
	}

	public int getKorInt(int i, SetInfo si) {
		si = (SetInfo) getLinkedList().get(i);
		return si.getKor();
	}

	public int setGetKorInt(int i, SetInfo si) {// 저장하고 반환
		si.setKor(i);
		return si.getKor();
	}

	public int getEngInt(SetInfo.SetInformation sif) {// 입력값
		return sif.getEng();
	}

	public int getEngInt(SetInfo si) {// 입력값
		return si.getEng();
	}

	public int getEngInt(int i, SetInfo si) {
		si = (SetInfo) getLinkedList().get(i);
		return si.getEng();
	}

	public int setGetEngInt(int i, SetInfo si) {// 저장하고 반환
		si.setEng(i);
		return si.getEng();
	}

	public int getMatInt(SetInfo.SetInformation sif) {// 입력값
		return sif.getMat();
	}

	public int getMatInt(SetInfo si) {// 입력값
		return si.getMat();
	}

	public int getMatInt(int i, SetInfo si) {
		si = (SetInfo) getLinkedList().get(i);
		return si.getMat();
	}

	public int setGetMatInt(int i, SetInfo si) {// 저장하고 반환
		si.setMat(i);
		return si.getMat();
	}

	public int getTotalInt(int i, SetInfo si) {
		si = (SetInfo) getLinkedList().get(i);
		return si.getTotal();
	}

	public float getAvgFloat(int i, SetInfo si) {
		si = (SetInfo) getLinkedList().get(i);
		return si.getAvg();
	}

	public void outputStr(int i) {
		str += getNameString(i, si);
	}

}
