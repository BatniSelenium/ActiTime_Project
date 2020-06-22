package QSpider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NotepadEnter {
	

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Runtime.getRuntime().exec("notepad");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_R); 
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("Calculator");
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_0);
		r.keyPress(KeyEvent.VK_MULTIPLY);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_0);
		
	}

}
