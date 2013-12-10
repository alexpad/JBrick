package alexpad.jbrick.pi.robot.out;

import alexpad.jbrick.robot.out.LCDDisplay;

import com.pi4j.wiringpi.Lcd;

public class HitachiLCDDisplayImpl implements LCDDisplay {
	
	private static final int ROWS = 4;
	private static final int COLS = 20;
	private static final int RW_PIN = 11;
	private static final int EN_PIN = 10;
	
	private static final int D0_PIN = 0;
	private static final int D1_PIN = 1;
	private static final int D2_PIN = 2;
	private static final int D3_PIN = 3;
	
	private int lcdHandle;
	private String spaces;
	
	public HitachiLCDDisplayImpl() {
		lcdHandle = Lcd.lcdInit(ROWS, COLS, 4, RW_PIN, EN_PIN, D0_PIN, D1_PIN, D2_PIN, D3_PIN, 0, 0, 0, 0);
		if(lcdHandle<0){
			throw new RuntimeException("lcdInit() failed");
		}
		
		char[] spaces = new char[COLS];
		for(int n=0;n<COLS;n++) spaces[n] = ' '; 
		this.spaces = new String(spaces);
    }

	@Override
	public void clear() {
		Lcd.lcdClear(lcdHandle);
		Lcd.lcdHome(lcdHandle);
	}

	@Override
	public void clear(int row) {
		Lcd.lcdPosition(lcdHandle, row, 0);
		Lcd.lcdPuts(lcdHandle, spaces);
		Lcd.lcdPosition(lcdHandle, row, 0);
	}
	
	@Override
    public void home() {
		Lcd.lcdHome(lcdHandle);
    }
	
	@Override
    public void home(int row) {
		Lcd.lcdPosition(lcdHandle, row, 0);
    }

	@Override
	public void setLocation(int row, int col) {
		Lcd.lcdPosition(lcdHandle, row, col);
	}

	@Override
	public void print(int row, int col, String str, Object... args) {
		Lcd.lcdPosition(lcdHandle, row, col);
		Lcd.lcdPuts(lcdHandle, String.format(str, args));
	}

	@Override
	public void print(String str, Object... args) {
		Lcd.lcdPuts(lcdHandle, String.format(str, args));
	}

}
