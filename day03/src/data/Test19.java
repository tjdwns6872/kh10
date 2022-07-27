package data;
import java.lang.*;
public class Test19 {
	public static void main(String[] args) {
		/*KH 찜질방에서는 장시간 머무르는 손님들을 없애기 위해
		 * 최초 입장 후 5시간이 지나면 10분당 천원의 추가요금을 부과합니다
		 * 어떤 손님이 9시 50분에 들어와서 16시 22분에 나가려고 할 때
		 * 이 손님이 추가요금 대상인지 판정하여 출력하고 추가요금을 출력*/
		
		int inHour = 9, inMin = 50;
		int outHour = 16, outMin = 22;
		int basic = 5 * 60;
		
		int inTime = (inHour*60)+inMin;
		int outTime = (outHour*60)+outMin;
		int time = outTime - inTime;
		boolean add = time > basic;
		int fee = ((time - basic)/10)*1000;
		int moneyAdd = (time > basic) ? fee : 0;
		
		//System.out.println(time-basic);
		System.out.println("추가요금을 내야한다 >"+add);
		System.out.println("추가요금: " +moneyAdd);
		//System.out.println("추가요금 : "+fee);
	}
}
