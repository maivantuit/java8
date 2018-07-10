package Dviethoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D {
	public static void main(String[] args) {
		List<String> alphaList = Arrays.asList("a", "b", "c", "d");

        //Before Java8
        List<String> alphaListUpper = new ArrayList<>();
        for (String s : alphaList) {
        	alphaListUpper.add(s.toUpperCase());
        }

        System.out.println(alphaList); //[a, b, c, d]
        System.out.println(alphaListUpper); //[A, B, C, D]

	}
}
