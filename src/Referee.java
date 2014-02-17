import java.math.BigDecimal;
import java.math.RoundingMode;

public class Referee{

	double average (byte opinions[]){

		byte max = 0;
		byte min = 10;
		double sum = 0;
		byte i;

		for (i=0; i<9; i++){
			if(opinions[i] < min) min = opinions[i];
			if(opinions[i] > max) max = opinions[i];
			sum += opinions[i];
		}
		
		sum -= min;
		sum -= max;
		sum /= 7;

		double rounded = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP).doubleValue();

		return (rounded);
	}

	double total (double elements[], double presentation[], byte fees){
		byte i;
		double sum = 0;
		for(i=0; i<10; i++) sum += elements[i];
		for(i=0; i<5; i++) sum += presentation[i];
		sum -= fees;
		return sum;
	}

	void result (double score1, double score2){

		if(score1 == score2) {	
			double rounded1 = new BigDecimal(score1).setScale(2, RoundingMode.HALF_UP).doubleValue();
			System.out.println("It is a draw with the score of " + rounded1);
		}else{
			if(score1 > score2) {
				double rounded1 = new BigDecimal(score1).setScale(2, RoundingMode.HALF_UP).doubleValue();
				double rounded2 = new BigDecimal(score2).setScale(2, RoundingMode.HALF_UP).doubleValue();
				System.out.println("The couple Volosozhar/Trankov wins with the score of " + rounded1);
				System.out.println("Couple Stolbova/Klimov follows with the score of " + rounded2);
			}else{
				double rounded1 = new BigDecimal(score1).setScale(2, RoundingMode.HALF_UP).doubleValue();
				double rounded2 = new BigDecimal(score2).setScale(2, RoundingMode.HALF_UP).doubleValue();
				System.out.println("The couple Stolbova/Klimov wins with the score of " + rounded2);
				System.out.println("Couple Volosozhar/Trankov follows with the score of " + rounded1);
			}
		}
	}

}
