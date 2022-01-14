package test.main;

import test.mypac.FriendDto;

/*
 * 	친구 한명의 정보를 객체를 생성해서 담을려고 한다.
 * 	친구 정보는 총 4개의 정보로 이루어져 있습니다.
 * 	번호, 이름, 전화번호, 성별
 * 	클래스명, 필드명은 마음대로 정하고 
 * 	Dto 작성 규약에 맞게 클래스를 작성하면 됩니다.
 *  (test.mypac 패키지에 클래스를 만드세요)
 *  
 *  그런다음 main 메소드 안에서
 */

public class MainClass07 {

	public static void main(String[] args) {
		/*
		 * 친구 세명의 정보를 담을수 있는 배열 객체를 생성하고
		 * 그 배열 객체에 친구 세명의 정보를 담아 보세요.
		 */
		FriendDto f1=new FriendDto();
		f1.setNum(1);
		f1.setName("김구라");
		f1.setPhone("010");
		f1.setGender("남");
		
		FriendDto f2= new FriendDto(2, "해골", "011", "여");
		FriendDto f3= new FriendDto(3, "원숭이", "017", "남");
	
		//FriendDto[] friends= {f1, f2, f3};
		
		FriendDto[] friends=new FriendDto[3];
		friends[0]=f1;
		friends[1]=f2;
		friends[2]=f3;
		
		//반복문돌기
		for(int i=0; i<friends.length; i++) {
			FriendDto tmp=friends[i];
			
			System.out.println(tmp.getName()+"|"+tmp.getNum()+"|"
					+tmp.getPhone()+"|"+tmp.getGender());
		}
		
		
		int num1=0b001; //0b로 시작하면 2진수
		int num2=011; // 0로 시작하면 8진수
		int num3=0xbb; // 0x로 시작하면 16진수
		
		
	}
}
