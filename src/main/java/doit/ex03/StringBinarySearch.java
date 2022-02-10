package com.kimst.doit.ex03;

import java.util.Arrays;
import java.util.Scanner;

// 문자열의 배열(JAVA의 키워드)에서 검색


public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 자바에서 사용하는 키워드입니다
		String[] x = {
				"abstract", "assert", "boolean", "break", 
				"byte", "case", "catch", "char", 
				"class", "const", "do", "double", 
				"else", "for", "if", "import",
		};

		System.out.println("원하는 키워드를 입력하세요 : " );	// 키 값을 입력

		String ky = stdIn.next();

		int idx = Arrays.binarySearch(x, ky);	// 배열 x에서 값이 ky인 요소를 검색


		if (idx < 0)
			System.out.println("해당 키워드가 없습니다.");
		else
			System.out.println("해당 키워드는 x[" + idx + "]에 있습니다." );
	}
}


