package com.kimst.doit.ex03;
// 제네릭 클래스의 예


public class GenericClassTester {
	// 제네릭 클래스의 파라미터를 T라고 작성합니다.
	static class GenericClass<T> {
		private T xyz;
		GenericClass(T t) {	// 생성자
			this.xyz = t;
		}

		T getXyz() {		// xyz를 반환합니다
			return xyz;
		}
	}

	public static void main(String[] args) {
		// 다음과 같이 파라미터에 Stringㅇ르 넘길 수도 있고 Integer를 넘길 수도 있습니다.
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);

		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}

}

// 형변환에 와일드 카드 지정
// <? extends T> : 클래스 T의 서브 클래스를 전달받습니다.
// <? super T>   : 클래스 T의 슈퍼 클래스를 전달받습니다.
