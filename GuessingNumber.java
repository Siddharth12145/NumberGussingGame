import java.util.Random;
import javax.swing.JOptionPane;
import static java.lang.System.out;

class GuessNumber
{
	
	static public void main(String...args)throws Exception
	{
		int userGuess=0;
		int totalGuess=0;
		Random random=new Random();
		int randomNumber=random.nextInt(100);  //nextInt(bound)
		
		//System.out.println(randomNumber);
		//JOptionPane.showMessageDialog(null,"The Random Number is:" + randomNumber);
		JOptionPane.showMessageDialog(null,"The Guessing Number Game");

		while(userGuess!=randomNumber)
		{
			userGuess=Integer.parseInt(JOptionPane.showInputDialog("Enter Your Guess"));
			totalGuess++;
			if(userGuess==randomNumber)
			{
				JOptionPane.showMessageDialog(null,"Your guess is correct!!");
			}
			else
			{
				if(userGuess>randomNumber)
					JOptionPane.showMessageDialog(null,"Your guess is Worng!! Please Guess Smaller Number");
				else
					JOptionPane.showMessageDialog(null,"Your guess is Worng!! Please Guess Larger Number");
			}
		}
		JOptionPane.showMessageDialog(null,"The Total Number of Guesses Taken:" + totalGuess);

		//FileReader fr=null;
		//try
		//{
		//	new FileReader("highScore.txt");
		//}
		//catch(FileNotFoundException fe)
		//{
		//	JOptionPane.showMessageDialog(null,"File Not Found");
		//}
		
	}
}