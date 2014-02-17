public class Judge{

	byte element(byte complexity){
		byte grade = (byte) (Math.random()*8-4);
		return ((byte)(complexity*2 + grade));
	}

	byte presentation(){
		byte present = (byte) (Math.random()*11);
		return present;
	}

}
