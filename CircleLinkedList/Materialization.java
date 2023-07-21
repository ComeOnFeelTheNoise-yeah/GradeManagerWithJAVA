package CircleLinkedList;



//CircleLinkedList ��Ű�� ���ο� �ִ� Materialization Ŭ����
//�� Ŭ������ CoustomFramework Ŭ������ ����ϰ� DMLFramework �������̽��� ����
public class Materialization<T> extends CustomFramework implements DMLFramework {

	// SetInfo ��ü�� �����ϴ� ��� ����
	private SetInfo si;

	// �˻� ����� �����ϴ� CustomCircleLinkedList<Object> Ÿ���� ��ü
	private CustomCircleLinkedList<Object> search;
	
	private String str;

	// �ε��� ���� ����
	private int index;

	// �߰��� �׸��� �ε��� ���� ����
	public int addIndex;
	
	

	// Materialization Ŭ������ ������
	public void Materialization() {
		// 'str' ������ �� ���ڿ��� �ʱ�ȭ
		str = "";
		addIndex = 0;
	}

	// 'sif'�� 'btn' ���� ���ڷ� �޴� select �޼���
	// 'btn' ���� ���� �ٸ� ������ ����
	public void select(SetInfo.SetInformation sif, int btn) {
		switch (btn) {
		case 1:
			// 'selectCase1' �޼��带 ȣ���Ͽ� �л� ������ �˻�
			selectCase1(sif);
			break;
		case 2:
			// 'sif' ��ü�� 'selectMenu2' �޼��带 ȣ���Ͽ� �޴��� ǥ���ϰ� ����� �Է��� �޾� 'btn'�� �Ҵ�
			btn = sif.selectMenu2();
			// 'selectScore' �޼��带 ȣ���Ͽ� ���� ������ �˻�
			selectScore(sif, btn);
			break;
		}
	}

	// 'si'�� 'btn' ���� ���ڷ� �޴� selectUpDown �޼���
	// 'btn' ���� ���� �ٸ� ������ ����
	public void selectUpDown(SetInfo si, int btn) {
		// 'standard'��� ������ ������ ����
		int standard;
		switch (btn) {
		case 1:
			// 'si' ��ü�� 'selectMenu4' �޼��带 ȣ���Ͽ� �޴��� ǥ���ϰ� ����� �Է��� �޾� 'standard'�� �Ҵ�
			standard = si.selectMenu4();
			// 'selectScoreAbove' �޼��带 ȣ���Ͽ� Ư�� ���� �̻��� �л��� �˻�
			selectScoreAbove(si, standard);
			break;
		case 2:
			// 'si' ��ü�� 'selectMen5' �޼��带 ȣ���Ͽ� �޴��� ǥ���ϰ� ����� �Է��� �޾� 'standard'�� �Ҵ�
			standard = si.selectMen5();
			// 'selectScoreBelow' �޼��带 ȣ���Ͽ� Ư�� ���� ������ �л��� �˻�
			selectScoreBelow(si, standard);
			break;
		}
	}

	// �Ʒ� �ڵ� case���� break ���ְ� �����ϱ�
	
	// 'si'�� 'btn' ���� ���ڷ� �޴� selectScore �޼���
	// 'btn' ���� ���� �ٸ� ������ ����
	public void selectScore(SetInfo si, int btn) {
		switch (btn) {
		case 1:
			// 'si' ��ü�� 'selectMenu3' �޼��带 ȣ���Ͽ� �޴��� ǥ���ϰ� ����� �Է��� �޾� 'btn'�� �Ҵ�
			btn = si.selectMenu3();
			// 'selectUpDown' �޼��带 ȣ���Ͽ� Ư�� ���� ������ �л��� �˻�
			selectUpDown(si, btn);
			break;
		case 2:
			
			btn = si.selectMenu3();
			
			selectUpDown(si, btn);
			break;
		case 3:
			// 'si' ��ü�� 'selectMenu3' �޼��带 ȣ���Ͽ� �޴��� ǥ���ϰ� ����� �Է��� �޾� 'btn'�� �Ҵ�
			btn = si.selectMenu3();
			// 'selectUpDown' �޼��带 ȣ���Ͽ� Ư�� ���� ������ �л��� �˻�
			selectUpDown(si, btn);
			break;
		case 4:
			// 'si' ��ü�� 'selectMenu3' �޼��带 ȣ���Ͽ� �޴��� ǥ���ϰ� ����� �Է��� �޾� 'btn'�� �Ҵ�
			btn = si.selectMenu3();
			// 'selectUpDown' �޼��带 ȣ���Ͽ� Ư�� ���� ������ �л��� �˻�
			selectUpDown(si, btn);
			break;
		case 5:
			// 'si' ��ü�� 'selectMenu3' �޼��带 ȣ���Ͽ� �޴��� ǥ���ϰ� ����� �Է��� �޾� 'btn'�� �Ҵ�
			btn = si.selectMenu3();
			// 'selectUpDown' �޼��带 ȣ���Ͽ� Ư�� ���� ������ �л��� �˻�
			selectUpDown(si, btn);
			break;
		}
	}

	// 'si'�� 'score' ���� ���ڷ� �޴� selectScoreAbove �޼���
	// Ư�� ���� �̻��� �л��� �˻��ϰ� ���
	private void selectScoreAbove(SetInfo si, int score) {
		// 'selectedSubject'��� ������ ������ ����
		int selectedSubject = si.selectMenu6();
		// CustomCircleLinkedList<SetInfo.SetInformation> Ÿ���� ��ü�� 'selectedList'�� ����
		// �� ��ü�� �˻��� �л� ������ �����ϴ� �뵵�� ���
		CustomCircleLinkedList<SetInfo.SetInformation> selectedList = new CustomCircleLinkedList<>();

		Object obj = null;
		// getLinkedList()�� ũ�Ⱑ 0�� �ƴ� ������ �ݺ�
		while (getLinkedList().size() != 0) {
			// 'sif'��� SetInfo.SetInformation Ÿ���� ��ü�� obj�� �Ҵ�
			SetInfo.SetInformation sif = (SetInfo.SetInformation) obj;
			// ���� �ش� �л��� �������� �ʾҴٸ� �Ʒ� ���ǹ��� ����
			if (!sif.isDeleted()) {
				switch (selectedSubject) {
				case 1:
					// ���õ� ������ ������ ���, ���� ������ ���� ���� �̻��� �л��� 'selectedList'�� �߰�
					if (sif.getKor() >= score) {
						selectedList.append(sif);
					}
					break;
				case 2:
					// ���õ� ������ ������ ���, ���� ������ ���� ���� �̻��� �л��� 'selectedList'�� �߰�
					if (sif.getEng() >= score) {
						selectedList.append(sif);
					}
					break;
				case 3:
					// ���õ� ������ ������ ���, ���� ������ ���� ���� �̻��� �л��� 'selectedList'�� �߰�
					if (sif.getMat() >= score) {
						selectedList.append(sif);
					}
					break;
				case 4:
					// ���õ� ������ ������ ���, ������ ���� ���� �̻��� �л��� 'selectedList'�� �߰�
					if (sif.getTotal() >= score) {
						selectedList.append(sif);
					}
					break;
				case 5:
					// ���õ� ������ ����� ���, ����� ���� ���� �̻��� �л��� 'selectedList'�� �߰�
					if (sif.getAvg() >= score) {
						selectedList.append(sif);
					}
					break;
				}
			}
		}

		// ���� 'selectedList'�� ������� �ʴٸ�, ���� ���� �̻��� �л����� ���
		if (!selectedList.isEmpty()) {
			System.out.println("���� ���� �̻� �л� ���:");
			printStudentList(selectedList, si);
		} else {
			System.out.println("���� ���� �̻��� �л��� �����ϴ�.");
		}
	}

	// 'si'�� 'score' ���� ���ڷ� �޴� selectScoreBelow �޼���
	// Ư�� ���� ������ �л��� �˻��ϰ� ���
	private void selectScoreBelow(SetInfo si, int score) {
		// 'selectedSubject'��� ������ ������ ����
		int selectedSubject = si.selectMenu2();
		// CustomCircleLinkedList<SetInfo.SetInformation> Ÿ���� ��ü�� 'selectedList'�� ����
		// �� ��ü�� �˻��� �л� ������ �����ϴ� �뵵�� ���
		CustomCircleLinkedList<SetInfo.SetInformation> selectedList = new CustomCircleLinkedList<>();

		Object object = null;
		// getLinkedList()�� ũ�Ⱑ 0�� �ƴ� ������ �ݺ�
		while (getLinkedList().size() != 0) {
			// 'sif'��� SetInfo.SetInformation Ÿ���� ��ü�� object�� �Ҵ�
			SetInfo.SetInformation sif = (SetInfo.SetInformation) object;
			// ���� �ش� �л��� �������� �ʾҴٸ� �Ʒ� ���ǹ��� ����
			if (!sif.isDeleted()) {
				switch (selectedSubject) {
				case 1:
					// ���õ� ������ ������ ���, ���� ������ ���� ���� ������ �л��� 'selectedList'�� �߰�
					if (sif.getKor() <= score) {
						selectedList.append(sif);
					}
					break;
				case 2:
					// ���õ� ������ ������ ���, ���� ������ ���� ���� ������ �л��� 'selectedList'�� �߰�
					if (sif.getEng() <= score) {
						selectedList.append(sif);
					}
					break;
				case 3:
					// ���õ� ������ ������ ���, ���� ������ ���� ���� ������ �л��� 'selectedList'�� �߰�
					if (sif.getMat() <= score) {
						selectedList.append(sif);
					}
					break;
				case 4:
					// ���õ� ������ ������ ���, ������ ���� ���� ������ �л��� 'selectedList'�� �߰�
					if (sif.getTotal() <= score) {
						selectedList.append(sif);
					}
					break;
				case 5:
					// ���õ� ������ ����� ���, ����� ���� ���� ������ �л��� 'selectedList'�� �߰�
					if (sif.getAvg() <= score) {
						selectedList.append(sif);
					}
					break;
				}
			}
		}

		// ���� 'selectedList'�� ������� �ʴٸ�, ���� ���� ������ �л����� ���
		if (!selectedList.isEmpty()) {
			System.out.println("���� ���� ���� �л� ���:");
			printStudentList(selectedList, si);
		} else {
			System.out.println("���� ���� ������ �л��� �����ϴ�.");
		}
	}

	// CustomCircleLinkedList<SetInfo.SetInformation> Ÿ���� ����Ʈ�� SetInfo ��ü�� ���ڷ� �޴�
	// printStudentList �޼��� �л� ���� ����Ʈ�� ���
	private void printStudentList(CustomCircleLinkedList<SetInfo.SetInformation> list, SetInfo si) {
        int sortOption = si.selectMenu7();
        boolean ascending = sortOption == 1; // 1�̸� ��������, 2�̸� ��������
        // ��ư�� �ΰ��� �������� �̷� �ڵ嵵 ������

        // merge sort�� �̿��Ͽ� ����Ʈ�� ����
        mergeSort(list, ascending);

        // ���ĵ� ����Ʈ�� ���
        for (int i = 0; i < list.size(); i++) {
            SetInfo.SetInformation sif = (SetInfo.SetInformation) list.get(i);
            System.out.println(sif);
        }
    }

    // Merge sort �����κ�
    private void mergeSort(CustomCircleLinkedList<SetInfo.SetInformation> list, boolean ascending) {
        int size = list.size();
        if (size <= 1) {
            return;
        }

        int mid = size / 2;
        CustomCircleLinkedList<SetInfo.SetInformation> leftList = new CustomCircleLinkedList<>();
        CustomCircleLinkedList<SetInfo.SetInformation> rightList = new CustomCircleLinkedList<>();

        // ����Ʈ�� ���ʰ� ���������� ����
        for (int i = 0; i < mid; i++) {
            leftList.append(list.get(i));
        }
        for (int i = mid; i < size; i++) {
            rightList.append(list.get(i));
        }

        // ���ʰ� ������ ����Ʈ�� ��������� ����
        mergeSort(leftList, ascending);
        mergeSort(rightList, ascending);

        // ���ĵ� �� ����Ʈ�� ����
        merge(list, leftList, rightList, ascending);
    }

    private void merge(CustomCircleLinkedList<SetInfo.SetInformation> result, CustomCircleLinkedList<SetInfo.SetInformation> leftList,
                       CustomCircleLinkedList<SetInfo.SetInformation> rightList, boolean ascending) {
        int leftSize = leftList.size();
        int rightSize = rightList.size();
        int leftIndex = 0;
        int rightIndex = 0;

        // ���ʰ� ������ ����Ʈ�� ���Ͽ� ���ĵ� ��� ����Ʈ�� �߰�
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

        // ���� ��ҵ��� ��� ����Ʈ�� �߰�
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
		// search.clear(); ��Ӻ��������
		String name = sif.simpleInputName();

		for (int i = 0; i < getLinkedList().size(); i++) {
			// sif�� null�̵����ʰ� ��� ��ü�� ����
			sif = (SetInfo.SetInformation) getLinkedList().get(i); 
			
			// sif �� �̸��� �޾ƿͼ� �񱳸� ��
			if (sif.getName().equals(name)) {
				// sif�� �����ϰ�, sif�� ���� �̸��� ������
				sif = (SetInfo.SetInformation) getLinkedList().get(i); //�� �ڵ�� ���� �ڵ尰���� ����� �ȉ�
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
			// �̸��� ��ġ�ϴ� �׸��� ã���� �� ���� �۾� ����
			SetInfo.SetInformation selectedSif = (SetInfo.SetInformation) search.get(0);
			// ���õ� �׸��� ������ ���
			System.out.println(selectedSif);

			// ������ �۾� ����
			System.out.println("������ �۾��� �����ϼ���:");
			System.out.println("1. ����");
			System.out.println("2. ���� ���� ����");
			System.out.println("3. ���� ���� ����");
			System.out.println("4. ���� ���� ����");
			int choice = sif.inOutBtn();

			switch (choice) {
			case 1:
				// ���� �۾�
				String newName = selectedSif.newName();
				selectedSif.setName(newName);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;
			case 2:
				// ���� ���� ����
				int newKor = selectedSif.updataKor();
				selectedSif.setKor(newKor);
				System.out.println("���� ������ ����Ǿ����ϴ�.");
				break;
			case 3:
				// ���� ���� ����
				int newEng = selectedSif.updataEng();
				selectedSif.setEng(newEng);
				System.out.println("���� ������ ����Ǿ����ϴ�.");
				break;
			case 4:
				// ���� ���� ����
				int newMat = selectedSif.updataMat();
				selectedSif.setMat(newMat);
				System.out.println("���� ������ ����Ǿ����ϴ�.");
				break;
			default:
				System.out.println("��ȿ���� ���� �����Դϴ�. ������ ����մϴ�.");
				break;
			}

			// ������ ������ ����� ����Ͽ� ����
			int total = selectedSif.getKor() + selectedSif.getEng() + selectedSif.getMat();
			float avg = total / 3.0f;
			selectedSif.setTotal(total);
			selectedSif.setAvg(avg);

			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
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
			System.out.println("��ġ�ϴ� �̸��� �����ϴ�. ������ ����մϴ�.");
		}
	}
	//�Ķ���͸� �����ϱ�����...// ������ �״�� �������� �ؿ� �׸� ���� �Ķ���͸� ó���ؼ� ����Ұ�!
	public void updateSelectedSif(SetInfo.SetInformation sif, int selectedIndex,CustomCircleLinkedList<Object> search) {
		
					// �̸��� ��ġ�ϴ� �׸��� ã���� �� ���� �۾� ����
					SetInfo.SetInformation selectedSif = (SetInfo.SetInformation) search.get(selectedIndex);
					// ���õ� �׸��� ������ ���
					System.out.println(selectedSif);

					// ������ �۾� ����
					System.out.println("������ �۾��� �����ϼ���:");
					System.out.println("1. ����");
					System.out.println("2. ���� ���� ����");
					System.out.println("3. ���� ���� ����");
					System.out.println("4. ���� ���� ����");
					int choice = sif.inOutBtn();

					switch (choice) {
					case 1:
						// ���� �۾�
						String newName = selectedSif.newName();
						selectedSif.setName(newName);
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						break;
					case 2:
						// ���� ���� ����
						int newKor = selectedSif.updataKor();
						selectedSif.setKor(newKor);
						System.out.println("���� ������ ����Ǿ����ϴ�.");
						break;
					case 3:
						// ���� ���� ����
						int newEng = selectedSif.updataEng();
						selectedSif.setEng(newEng);
						System.out.println("���� ������ ����Ǿ����ϴ�.");
						break;
					case 4:
						// ���� ���� ����
						int newMat = selectedSif.updataMat();
						selectedSif.setMat(newMat);
						System.out.println("���� ������ ����Ǿ����ϴ�.");
						break;
					default:
						System.out.println("��ȿ���� ���� �����Դϴ�. ������ ����մϴ�.");
						break;
					}

					// ������ ������ ����� ����Ͽ� ����
					int total = selectedSif.getKor() + selectedSif.getEng() + selectedSif.getMat();
					float avg = total / 3.0f;
					selectedSif.setTotal(total);
					selectedSif.setAvg(avg);

					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}
	
	@Override
	public void delete(SetInfo.SetInformation sif) {
	    search = selectDel(sif);

	    if (search.size() == 1) {
	        linkedListRemover(sif.getName());
	    } else if (search.size() > 1) {
	        System.out.println("��ġ�ϴ� �̸��� ���� �� �ֽ��ϴ�. ������ �׸��� �ε��� ��ȣ�� �������ּ���:");
	        for (int i = 0; i < search.size(); i++) {
	            SetInfo.SetInformation matchedSif = (SetInfo.SetInformation) search.get(i);
	            System.out.println(i + ". " + matchedSif.getName());
	        }

	        int selectedIndex = sif.delNum();
	        if (selectedIndex >= 0 && selectedIndex < search.size()) {
	            SetInfo.SetInformation selectedSif = (SetInfo.SetInformation) search.get(selectedIndex);
	            selectedSif.setDeleted(true);

	            // ���� ����Ʈ���� ������ �ε����� ���ؼ� remove() �޼��� ȣ��
	            int delIndex = getLinkedList().indexOf(selectedSif);
	            if (delIndex != -1) {
	                getLinkedList().remove(delIndex);
	                System.out.println("���õ� �׸��� �����Ͽ����ϴ�.");
	            } else {
	                System.out.println("�ش� ��ü�� ã�� �� �����ϴ�. ������ ����մϴ�.");
	            }
	        } else {
	            System.out.println("��ȿ���� ���� �ε��� ��ȣ�Դϴ�. ������ ����մϴ�.");
	        }
	    } else {
	        System.out.println("��ġ�ϴ� �̸��� �����ϴ�. ������ ����մϴ�.");
	    }
	}



	public void deleteAll() {
		int i;
		for(i =getLinkedList().size(); i >1; i--) {
			remove(i);
		}
		clear();
		getLinkedList().clear();
		System.out.println("��ü ������ �Ϸ��Ͽ����ϴ�.");
		
		//������� ��� ��ȯ���� ����. // ��ü ������ �Ϸ� �Ѱ���
		System.out.println("" + getLinkedList().isEmpty());
		
	}

	public String getNameString(SetInfo.SetInformation si) {// �Է°�
		return si.getName();
	}

	public String getNameString(int i, SetInfo si) {// ����Ȱ�
		si = (SetInfo) getLinkedList().get(i);
		return si.getName();
	}

	public String setGetNameString(String s, SetInfo si) {// �����ϰ� ��ȯ
		si.setName(s);
		return si.getName();
	}

	public int getKorInt(SetInfo.SetInformation sif) {// �Է°�
		return sif.getKor();
	}

	public int getKorInt(int i, SetInfo si) {
		si = (SetInfo) getLinkedList().get(i);
		return si.getKor();
	}

	public int setGetKorInt(int i, SetInfo si) {// �����ϰ� ��ȯ
		si.setKor(i);
		return si.getKor();
	}

	public int getEngInt(SetInfo.SetInformation sif) {// �Է°�
		return sif.getEng();
	}

	public int getEngInt(SetInfo si) {// �Է°�
		return si.getEng();
	}

	public int getEngInt(int i, SetInfo si) {
		si = (SetInfo) getLinkedList().get(i);
		return si.getEng();
	}

	public int setGetEngInt(int i, SetInfo si) {// �����ϰ� ��ȯ
		si.setEng(i);
		return si.getEng();
	}

	public int getMatInt(SetInfo.SetInformation sif) {// �Է°�
		return sif.getMat();
	}

	public int getMatInt(SetInfo si) {// �Է°�
		return si.getMat();
	}

	public int getMatInt(int i, SetInfo si) {
		si = (SetInfo) getLinkedList().get(i);
		return si.getMat();
	}

	public int setGetMatInt(int i, SetInfo si) {// �����ϰ� ��ȯ
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