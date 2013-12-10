package alexpad.jbrick.robot.util;

import java.util.concurrent.TimeUnit;

public class Delay {
	
	public static void delaySecs(int seconds){
		try {
	        TimeUnit.SECONDS.sleep(seconds);
        }
        catch (InterruptedException ex) {}
	}

	public static void delayMillis(int milliseconds){
		try {
	        TimeUnit.MILLISECONDS.sleep(milliseconds);
        }
        catch (InterruptedException ex) {}
	}
	
	public static void delayNanos(int nanoseconds){
		try {
	        TimeUnit.NANOSECONDS.sleep(nanoseconds);
        }
        catch (InterruptedException ex) {}
	}

}
