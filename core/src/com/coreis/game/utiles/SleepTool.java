package com.coreis.game.utiles;

public class SleepTool {
	
	public void sleepForMil(int mil) {
		try {
			Thread.sleep(mil);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void sleepForSeconds(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void sleepForMinutes(int minute) {
		try {
			Thread.sleep(minute * 1000 * 60);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
