package test006;


public class test006_1 {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		System.out.println(sum(a));
	}
	static long sum(int[] a) {
		long sum = 0;
        for (int num : a) {  //for earch 문 : 배열의 항목 수만큼 실행부분을 반복
        					// 배열의 항목을 자동으로 num에 저장
        					// 즉 array[i]의 값을 int에 저장하는것과 같은 의미
            sum += num;
        }
        return sum;
	}
}
