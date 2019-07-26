package 十三章_2;

public class Student {
	int javascore;
	int cscore;
	int sqlscore;

	public double getAvg() {
		return (javascore + cscore + sqlscore) / 3.0;
	}
}
