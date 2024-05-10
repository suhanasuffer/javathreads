/*
Suhani Thakur
22070126115
AIML B2
 */
package assignment_9;

public class Caller implements Runnable {
	Thread t;
	String msg;
	CallMe target;

	public Caller(CallMe targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
	}

	@Override
	public void run() {
		
		synchronized (target)
		{
			target.call(msg);
		}
		

	}

}
