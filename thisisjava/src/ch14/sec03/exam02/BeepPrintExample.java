package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		//작업 1
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch(Exception e) {}
				}
			}
		});
		
		thread.start();
		
		//작업 2	
		Thread thread1 = new Thread(new Task());
		thread1.start();
		
//		for(int i=0; i<5; i++) {
//			System.out.println("띵");
//			try {
//				Thread.sleep(1000);;
//			}catch(Exception e){
//				
//			}
//		}
	}

}
