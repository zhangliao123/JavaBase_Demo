package JavaBase_Serializable;

import java.util.Scanner;

import javax.sound.midi.MidiDevice.Info;

public class TestScannerString {

	public static void main(String[] args) {

		Scanner in =new Scanner("aa:bb:cc");
		in.useDelimiter(":");
		String info =null;
		while (in.hasNext()) {
			info =in.next();
			System.out.println(info);
		}
		in.close();
	}
}
