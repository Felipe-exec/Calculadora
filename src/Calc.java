import java.util.ArrayList;
import java.util.List;

public class Calc 
{
	//atributos
	private List<String> lastOps = new ArrayList<String>();
	
	//metodos
	
	public Number sum(Number number1, Number number2)
	{
		Number answer = number1.doubleValue() + number2.doubleValue();
		
		saveOp('+', number1, number2, answer);
		
		return answer;
	}

	public Number subtraction(Number number1, Number number2)
	{
		Number answer = number1.doubleValue() - number2.doubleValue();
		
		saveOp('-', number1, number2, answer);
		
		return answer;
	}
	
	public Number multiplication(Number number1, Number number2)
	{
		double answer = number1.doubleValue() * number2.doubleValue();
		
		saveOp('*', number1, number2, answer);
		
		return answer;
	}
	
	public Number division(Number number1, Number number2)
	{
		double answer = number1.doubleValue() / number2.doubleValue();
		
		saveOp('/', number1, number2, answer);
		
		return answer;
	}
	
	public List<String> getLastOps()
	{
		List<String> copyLastOps = new ArrayList<String>();
		
		for (String op: lastOps)
		{
			copyLastOps.add(op);
		}
		
		return copyLastOps;
	}
	
	private void saveOp(char op, Number number1, Number number2, Number answer) 
	{
		String formattedResult = String.format("%.0f %s %.0f = %.0f", number1.doubleValue(), op, number2.doubleValue(), answer);

		lastOps.add(formattedResult);
		
	}
	
}
