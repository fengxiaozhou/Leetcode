import java.util.Arrays;

public class RemoveElement {
	 public static int removeElement(int[] A, int elem) {
	        int exchange = 0; // ��¼�����Ĵ�����Ҳ����ͳ����������elemԪ��ֵ��ȵĸ���

	        // �㷨˼�룺i�������ֵΪelem��Ԫ�ص�λ�ã�j���ұ���ֵ��Ϊelem��Ԫ�ص�λ�ã�
	        // ȡ�Ⱥ����ó���Ϊ1��������Խ���
	        for (int i = 0, j = A.length -1; i <= j; i++) {
	            if (A[i] == elem) { // �ҵ�Ҫ������Ԫ��
	                exchange++;

	                while (j > i && A[j] == elem) { // ��������濪ʼ��ǰ�ҵ�һ��������elem��Ԫ��
	                    exchange++; // ��ֵΪelem��Ԫ��˵��Ҫ���������ǽ������̿���ʡȥ
	                    j--;
	                }

	                // ���1��������Ϊelem��Ԫ�ص�λ�ã���jλ�õ�Ԫ�طŵ�iλ��
	                // ���2��û���ҵ���elem��Ԫ�ص�λ�ã���i�������Ԫ��ֵ����e����ʱ��j=i
	                // �������������j�е�ֵ����i��û�й�ϵ
	                A[i] = A[j];
	                j--; // j�Ѿ�������ʹ�������Ի�Ҫ��ǰ�ƶ���һ���µ�λ��
	            }
	        }

	        return A.length - exchange;
	    }
	 
	 public static void main(String[] args) {
		int a[]=new int[]{3,1,2,4,5,8,3};
		System.out.println(removeElement(a,3));
		System.out.println(Arrays.toString(a));
	 }
	
}
