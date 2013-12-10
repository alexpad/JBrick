package alexpad.jbrick.pi.micro.cmd;

public abstract class MicroCommand {
	
	private byte[] bytes;

	protected MicroCommand() {}

	public byte[] getBytes() {
		return bytes;
	}

	protected void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	
}
