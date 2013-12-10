package alexpad.jbrick.micro;

public interface MicroController {
	
	public void writePic(byte[] bytes);
	
	public int readPic(byte[] bytes);
	
}
