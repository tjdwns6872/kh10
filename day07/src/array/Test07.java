package array;
public class Test07 {
	public static void main(String[] args) {
		/*반 학생 5명의 신장을 측정한 결과는 다음과 같습니다.
		 * [150.5, 185.2, 177.9, 175.4, 163.6]
		 * 1. 전체 학생들의 신장을 배열에 저장하고 출력하세요.
		 * 2. 반 평균 신장을 출력하세요.
		 * 3. 가장 작은 학생의 위치와 신장을 출력하세요.
		 * 4. 평균에 가장 가까운 학생의 신장을 출력하세요.*/
		double[] cm = new double[] {150.5, 185.2, 177.9, 175.4, 163.6};
		double total = 0; 
		//double min = cm[0];
		int index = 0;
		for(int i = 0; i < cm.length; i++) {
			System.out.println(cm[i]+"cm");
			total += cm[i];
			/*if(min > cm[i]) {
				min = cm[i];
				index = i;
			}*/
			if(cm[index] > cm[i]) {
				index = i;
			}
		}
		//평균에 가장 가까운 데이터
		//1. 새로운 배열을 같은 크기로 준비한다.
		//2. 모든 데이터를 평균에서 뺀 다음 저장한다.
		//3. 비교를 통해 가장 작은 값을 찾는다.
		double avg = total/cm.length;
		double[] gap = new double[cm.length];
		//절대값 : 음수가 발생하지 않도록 차이 계산 (--+), (+--), Math.abs(? ?)
		for(int i = 0; i < cm.length; i++) {
			if(cm[i] > avg) {
			gap[i] = cm[i] - avg;
			}else {
				gap[i] = avg - cm[i];
			}
		}
		int x = 0;
		for(int i = 0; i < gap.length; i++) {
			if(gap[x] > gap[i]) {
				x = i;
			}
		}
		/*double avgNear = cm[0];
		double avgMin = cm[0];
		for(int i = 0; i < cm.length; i++) {
			double near = cm[i] - avg;
			if(near < 0) {
				near *= -1;
			}
			if(avgMin > near) {
				avgMin = near;
				avgNear = cm[i];
			}
	}*/
		System.out.println("반 평균 신장 : "+avg);
		//System.out.println("가장 작은 학생의 위치 : "+index+"이며, 신장은 : "+min+"cm 입니다.");
		System.out.println("가장 작은 학생의 위치 : "+index+"이며, 신장은 : "+cm[index]+"cm 입니다.");
		//System.out.println("평균에서 가장 가까운 학생의 신장은 "+avgNear+"cm 입니다.");
		System.out.println("평균에서 가장 가까운 학생의 신장은 "+cm[x]+"cm 입니다.");
	}
}
