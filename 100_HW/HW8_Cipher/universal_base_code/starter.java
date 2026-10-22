/*
 *	Author: Justin Pyo
 *  Date: 10/18/26
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		String message1 = Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r");
		System.out.println("Message 1 : " + message1);

		String message2 = Cipher.encode("sv8vq17r 1r q25 85rq");
		System.out.println("Message 2 : " + message2);

		String message3 = Cipher.encode("q25 z5l qv wpx85s f 1r gg");
		System.out.println("Message 3 : " + message3);

		String message4 = Cipher.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33);
		System.out.println("Message 4 : "+ message4);

		String message5 = Cipher.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d");
		System.out.println("Message 5 : " + message5);

		String message6 = Cipher.keyedEncode("a8 1oy 92 1kx rxdj in 4", 8);
		System.out.println("Message 6 : " + message6);

		String message7 = Cipher.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8",13);
		message7 = Cipher.keyedEncode(message7, 29);
		System.out.println("Message 7 : " + message7);		

		String message8 = Cipher.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw");
		System.out.println("Message 8 : " + message8);

		System.out.println("----------------------------------------");
		
		String hard1 = Cipher.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", 27);
		System.out.println("Hard message 1 : " + hard1);


		String hard2 = Cipher.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", 16);
		System.out.println("Hard message 2 : " + hard2);

		
		
	}
}
