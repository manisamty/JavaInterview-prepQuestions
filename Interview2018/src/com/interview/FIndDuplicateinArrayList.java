package com.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FIndDuplicateinArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("My List : " + list);
		System.out.println("\nHere are the duplicate elements from list : " + findDuplicates(list));
	}

	public static Set<String> findDuplicates(List<String> listDuplicate) {

		Set<String> setToReturn = new HashSet<String>();
		Set<String> set1 = new HashSet<String>();

		for (String str : listDuplicate) {
			if (!set1.add(str)) {
				setToReturn.add(str);
			}
		}
		return setToReturn;
	}
}