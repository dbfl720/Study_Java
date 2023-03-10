package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz07")
public class GetMethodQuiz07 extends HttpServlet {
	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		// response
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		// request parameter 꺼내기
		String address = request.getParameter("address");
		String payCard = request.getParameter("payCard");
		int price = Integer.parseInt(request.getParameter("price"));
		
		// 출력
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>주문 결과</title></head><body>");

		if(!address.contains("서울시")) {
			out.println("배달 불가 지역입니다.");
		} else if(payCard.equals("신한카드")){ 
			out.println("결제 불가 카드 입니다.");
		} else {
			out.println("서울시 강남구 강남대로 94길 13 삼경빌딩 <b>배달 준비중</b><br>");
			out.println("결제금액:1300원");
		}
		
		out.print("</body></html>");
	}
}
