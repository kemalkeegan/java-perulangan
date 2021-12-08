package com.unittest.main;

import com.unittest.main.ui.InputUIKotak;
import com.unittest.main.ui.InputUISegitiga;

public class MainApp {

	public static void main(String[] args) {
		InputUIKotak inputkotak = new InputUIKotak();
		inputkotak.showHitungLuasKotak();

		InputUISegitiga inputsegitiga = new InputUISegitiga();
		inputsegitiga.showHitungLuasSegitiga();
	}

}
