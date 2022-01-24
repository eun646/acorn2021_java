package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import test.util.DBConnect;

/*
 *   Scanner 객체를 이용해서 검색할 회원의 번호를 입력 받아서
 *   DB 에서 SELECT 하고 
 *   결과 값이 있으면 해당 회원의 정보를 콘솔창에 출력하고
 *   결과 값이 없으면 해당 회원은 존재 하지 않습니다. 라고 출력되는 프로그래밍을 해 보세요
 *   hint : String sql="SELECT num,name,addr FROM member WHERE num=?";
 *   예)
 *   검색할 회원번호 입력:
 *   801
 *   801 번 회원은 존재 하지 않습니다.
 *   
 *   예)
 *   검색할 회원번호 입력:
 *   850
 *   번호 : 850, 이름 : 톰캣, 주소 : 건물 옥상
 *   
 */
public class MainClass06 {
   public static void main(String[] args) {
      //콘솔창으로 부터 입력 받을 객체 생성
      Scanner scan=new Scanner(System.in);
      System.out.println("검색할 회원 번호:");
      int num=scan.nextInt();
      
      //필요한 객체를 담을 지역변수 미리 만들기 
      Connection conn=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      try {
         //Connection 객체의 참조값 얻어오기 
         conn=new DBConnect().getConn();
         //실행할 sql 문의 뼈대 준비하기
         String sql="SELECT name, addr"
               + " FROM member"
               + " WHERE num=?";
         //실행할 sql문을 전달하면서 PreparedStatement 객체의 참조값 얻어오기 
         pstmt=conn.prepareStatement(sql);
         //미완성인 sql 문을 완성 시키기
         pstmt.setInt(1, num);
         //SELECT 문 수행하고 결과 값을 ResultSet 으로 받아오기 
         rs=pstmt.executeQuery();
         /*
			 *  member table 에서 num 은 PRIMARY KEY 값이다
			 *  따라서 SELECT 된 결과 row 의 갯수는
			 *  0 이거나 1 이된다. 
			 */
         if(rs.next()) {
            //커서가 위치한 곳의 데이터 추출하기
            String name=rs.getString("name");
            String addr=rs.getString("addr");
            System.out.println("번호 : "+num+", 이름 : "+name+", 주소 : "+addr);
         }else {
            System.out.println(num+" 번 회원은 존재하지 않습니다.");
         }
      }catch (Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(rs!=null)rs.close();
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e) {}
      }
   }
}






