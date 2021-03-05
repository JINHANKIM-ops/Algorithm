package Sort;
import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	    public static void main(String[] args) {
	        //����Ʈ�� 16, 31, 3, 55, 1�� ����ϴ�.
	        List<Integer> list = new ArrayList<>();
	        list.add(16);
	        list.add(31);
	        list.add(3);
	        list.add(55);
	        list.add(1);
	        System.out.println(quickSort(list));

	    }

	    public static List<Integer> quickSort(List<Integer> list) {
	        
	    	//�ǹ����� ���� ���ڵ��� ���� ����Ʈ�� ����
	        List<Integer> less = new ArrayList();
	        
	        //�ǹ����� ū ���ڵ��� ���� ����Ʈ�� ����
	        List<Integer> greater = new ArrayList();
	        
	        //���� ����, �ǹ�, ū ���ڵ��� ������� ���� ����Ʈ�� ����
	        List<Integer> finalList = new ArrayList();
	        
	        // ����Ʈ�� ���Ұ� 1���� �� �׳� ��ȯ�Ѵ�.
	        if (list.size() < 2) {
	            return list;
	        } else {

	            int pivot = list.get(0);
	            for (int i : list) {
	                if (i < pivot) {
	                    less.add(i);
	                }
	                if (i > pivot) {
	                    greater.add(i);
	                }
	            }
	            
	            //���� ���Һ��� ���� ���ڵ��� �������� ����� ����Ʈ�� �߰��Ѵ�.
	            finalList.addAll(quickSort(less));
	            
	            //�ǹ��� �� ���Ҹ� ����Ʈ�� �߰��Ѵ�.
	            finalList.add(pivot);
	            
	            //���� ���Һ��� ū ���ڵ��� �������� ����� ����Ʈ�� �߰��Ѵ�.
	            finalList.addAll(quickSort(greater));
	           
	            return finalList;
	        }

	    }
	}
