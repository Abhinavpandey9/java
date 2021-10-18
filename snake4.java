public class Snake4
 {
 public static void main(String[] args)
 {
 int startPosition = 0;

System.out.println("start position: " + startPosition);

int diceValue=(int) Math.floor((Math.random()*6) + 1); 

System.out.println("Number on dice: " +diceValue);


while( startPosition < 100) {


	int checkOption = (int)(Math.random() * 10) % 3 + 1;
		switch(checkOption) {

		case 1:
			startPosition = startPosition + diceValue;
		break;

		case 2:
			startPosition = startPosition - diceValue;
				if(startPosition < 0) {
					startPosition = 0;
			}
		break;

		default:
			System.out.println("Player is not playing " + startPosition);

	}

	System.out.println("position after  player choose a option : "+startPosition);

       }
}
}