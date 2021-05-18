package com.hs.s2;

public class S2Main {

	public static void main(String[] args) {
		
		MemberLogin memberLogin = new MemberLogin();
		memberLogin.login();
		
		
		Card card = new Card();
		card.num=1;
		card.color="Red";
		card.kind="Heart";
		System.out.println(card.w);
		System.out.println(card.h);
		Card card2 = new Card();
		card2.num=2;
		card2.color="Red";
		card2.kind="Heart";
		System.out.println(card.w);
		System.out.println(card.h);
	
	
	}
}
