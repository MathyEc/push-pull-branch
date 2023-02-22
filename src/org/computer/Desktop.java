package org.computer;

public class Desktop extends Computer{
	private void desktopSize() {
		System.out.println("The size of desktop is 13 inch");

	}

	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		d.desktopSize();
		d.computerModel();
	}
}
