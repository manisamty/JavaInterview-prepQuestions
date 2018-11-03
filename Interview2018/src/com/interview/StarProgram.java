package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarProgram {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size value : ");
		int size = Integer.parseInt(bf.readLine());

		for (int row = 1; row <= size; row++) {

			for (int column = 1; column <= size; column++) {

				if (column <= row) {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}

}
