package alexpad.jbrick.pi.micro;

import java.io.IOException;
import alexpad.jbrick.micro.MicroController;
import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;

public class MicroControllerImpl implements MicroController {
	
	private static final int PIC_ADDRESS = 0;
	private I2CDevice picDevice;
	
	public MicroControllerImpl() {
		try {
			picDevice = I2CFactory.getInstance(I2CBus.BUS_1).getDevice(PIC_ADDRESS);
        }
        catch (Throwable t) {
        	throw new RuntimeException(t);
        }
    }
	
	@Override
	public void writePic(byte[] bytes) {
		try {
	        picDevice.write(bytes, 0, bytes.length);
        }
        catch (IOException e) {
	        
        }
	}
	
	@Override
	public int readPic(byte[] bytes) {
		try {
	        return picDevice.read(bytes, 0, bytes.length);
        }
        catch (IOException ex) {
	       return 0;
        }
	}
	
}
