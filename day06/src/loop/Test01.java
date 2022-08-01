package loop;
public class Test01 {
	public static void main(String[] args) {
		//중첩 반복문
		/*for(int i = 0; i < 60; i++) { //1분간 시간을 출력
			System.out.println(i+"초");
		}*/
		/*for(int i = 0; i < 60; i++) { //1시간동안의 메세지를 출력
			for(int j = 0; j < 60; j++) {
				System.out.println(i+"분 "+j+"초");
			}
		}*/
		for(int i = 0; i < 24; i++) { //하루 동안의 메세지를 출력
			for(int j = 0; j < 60; j++) { 
				for(int z = 0; z < 60; z++) {
					System.out.println(i+"시간 "+j+"분 "+z+"초");
				}
			}
		}
	}
}