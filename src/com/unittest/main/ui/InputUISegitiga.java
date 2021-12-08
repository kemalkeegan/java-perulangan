package com.unittest.main.ui;

import java.util.Scanner;

import com.unittest.bangunruang.Segitiga;

public class InputUISegitiga {
	Segitiga segitiga;
	double alas, tinggi;
	
	public InputUISegitiga() {
		if(segitiga == null) {
			segitiga = new Segitiga();
		}
	}
	
	public void showHitungLuasSegitiga() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukan Alas untuk menghitung luas segitiga ");
		double alas = scan.nextFloat();
		System.out.print("Masukan Tinggi untuk menghitung luas segitiga ");
		double tinggi = scan.nextFloat();
		
		System.out.println("Nilai luas adalah :" + segitiga.LuasSegitiga(alas, tinggi));
	}
}
