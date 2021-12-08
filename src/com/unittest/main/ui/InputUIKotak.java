package com.unittest.main.ui;

import java.util.Scanner;


import com.unittest.bangunruang.Kotak;

public class InputUIKotak {
	Kotak kotak;
	double sisi;
	
	public InputUIKotak() {
		if(kotak == null) {
			kotak = new Kotak();
		}
	}
	
	public void showHitungLuasKotak() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukan Nilai untuk menghitung luas kotak ");
		
		double sisi = scan.nextFloat();
		
		System.out.println("Nilai luas adalah :" + kotak.LuasKotak(sisi));
	}
}
