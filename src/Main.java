public class Main{

	public static void main (String args[]){

		Referee referee = new Referee();
		Technical technical = new Technical();

		Couple volosozhar = new Couple();
		Couple stolbova = new Couple();

		Judge judge[] = new Judge[9];
		int i, j;
		for (i=0; i<9; i++) judge[i] = new Judge();


		volosozhar.figures = new byte [10][9];
		volosozhar.averageFigures = new double [10];
		volosozhar.performance = new byte [5][9];
		volosozhar.averagePerformance = new double [5];

		stolbova.figures = new byte [10][9];
		stolbova.averageFigures = new double [10];
		stolbova.performance = new byte [5][9];
		stolbova.averagePerformance = new double [5];


		for (i=0; i<10; i++) {
			for (j=0; j<9; j++){
				volosozhar.figures[i][j] = judge[j].element(technical.complexity());
			}
			volosozhar.averageFigures[i] = referee.average(volosozhar.figures[i]);
		}
		for (i=0; i<5; i++) {
			for(j=0; j<9; j++){
				volosozhar.performance[i][j] = judge[j].presentation();
			}
			volosozhar.averagePerformance[i] = referee.average(volosozhar.performance[i]);
		}
		volosozhar.fees = technical.fees();


		for (i=0; i<10; i++) {
			for (j=0; j<9; j++){
				stolbova.figures[i][j] = judge[j].element(technical.complexity());
			}
			stolbova.averageFigures[i] = referee.average(stolbova.figures[i]);
		}
		for (i=0; i<5; i++) {
			for(j=0; j<9; j++){
				stolbova.performance[i][j] = judge[j].presentation();
			}
			stolbova.averagePerformance[i] = referee.average(stolbova.performance[i]);	
		}
		stolbova.fees = technical.fees();

		referee.result(referee.total(volosozhar.averageFigures, volosozhar.averagePerformance, volosozhar.fees), referee.total(stolbova.averageFigures, stolbova.averagePerformance, stolbova.fees));

	}
}
