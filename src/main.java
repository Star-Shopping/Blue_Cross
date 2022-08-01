
public class main {

	public static void main(String[] args) {
		
		
		CeilingFan fan1 = new CeilingFan();
		
		for(int i=0; i < 3; i++) {
			fan1.pullSpeedCord();
			System.out.println("Pulled SpeedCord, fan speed is at : " + fan1.currentSpeed);
		}
		
		
		fan1.pullSpeedCord();
		System.out.println("Pulled SpeedCord, fan speed is at : " + fan1.currentSpeed);
		
		fan1.pullReverseCord();
		System.out.println("Pulled ReverseCord, are the fan speed settings reversed?  : " + fan1.isCordReversed());
		System.out.println("Fan current speed is : " + fan1.currentSpeed);
		
		for(int i=0; i < 3; i++) {
			fan1.pullSpeedCord();
			System.out.println("Pulled SpeedCord, fan speed is at : " + fan1.currentSpeed);
		}

	}

}
