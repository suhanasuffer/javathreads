/*
Suhani Thakur
22070126115
AIML B2
 */
package assignment_9;

public class CallMe {

	synchronized public void call(String msg) {

		System.out.print(msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.print(" ");
	}

}
