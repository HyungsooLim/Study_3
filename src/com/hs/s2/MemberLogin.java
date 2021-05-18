package com.hs.s2;

public class MemberLogin {

	public void login() {
		Member member = new Member();
		MemberWork memberWork = new MemberWork();
		if(member.getId()==1234&&member.getPw()==5678) {
			MemberSession.member = member;
			System.out.println(member.getName());
			memberWork.work();
		}else {
			System.out.println("로그인 실패");
		}
	}
	
}
