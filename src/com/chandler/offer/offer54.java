package com.chandler.offer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class offer54 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("please input:");
		
		Thread t = new Thread(new Runnable() {
			int b;
			public void run() {
				while(true) {
					try {
						while( (b = System.in.read()) != -1 ) {
							System.out.print((char)b);
						}
						Thread.currentThread().sleep(500);
					} catch (IOException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
		Scanner input = new Scanner(System.in);
		while(input.next() != null) {
			System.out.println(input.next());
		}
		input.close();
	}

}
