package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		if(str1 == str2) {
			System.out.println("str1, str2는 참조가 같음");
		}else {
			System.out.println("str1, str2는 참조가 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1, str2 는 문자열 같음");
		}else {
			System.out.println("str1, str2는 문자열 다름");
		}
		
		if(str1 == str3) {
			System.out.println("str1, str3는 참조가 같음");
		}else {
			System.out.println("str1, str3는 참조가 다름");
		}
		
		if(str3 == str4) {
			System.out.println("str3, str4는 참조가 같음");
		}else {
			System.out.println("str3, str4는 참조가 다름");
		}
		
		
		
	}

}
