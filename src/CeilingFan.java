
public class CeilingFan {
	
	public final int OFF = 0,  MAX = 3;
	public boolean cordReversed;
	public int currentSpeed;
	
	
	public CeilingFan() {
		currentSpeed = OFF;
		cordReversed = false;
	}
	
	/**
	 * Pulling the speed cord will increase or decerease the speed depending on the state of cordReversed.
	 */
	public void pullSpeedCord() {
		if(cordReversed) {
			this.decreaseSpeed();
		}
		else {
			this.increaseSpeed();
		}
	}
	
	public void pullReverseCord() {
		this.cordReversed = !cordReversed;
	}
	
	
	public void increaseSpeed() {
		this.currentSpeed += 1;
		
		if (currentSpeed > MAX) {
			this.currentSpeed = OFF;	
		}
	}
	

	public void decreaseSpeed() {
		this.currentSpeed -= 1;
		
		if (this.currentSpeed < OFF) {
			this.currentSpeed = MAX;
		}
	}
	
	
	/**
	 * @return cordReversed  returns true if fan is in reverse, if not, returns false.
	 */
	public boolean isCordReversed() {
		return cordReversed;
	}

	
	
	
}
