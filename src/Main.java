import java.util.List;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int choice = 0;
		Calc calculator = new Calc(); //chamando a classe Calc
		do
		{
			//recebendo variaveis e escaneando
			double n1 = 0, n2 = 0;
			Scanner read = new Scanner(System.in);
			
			//menu---------------------------------------
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair");
			System.out.print("Sua escolha: ");
			choice = read.nextInt();
			
			if(choice != 5)
			{
				System.out.print("Digite um valor: ");
				n1 = read.nextDouble();
				System.out.print("Digite outro valor: ");
				n2 = read.nextDouble();
			}
			//-------------------------------------------
			
			switch(choice)
			{
			case 1:
				//soma-------------------------------------------------
				System.out.print("Somatorio: " + n1 + " + " + n2 + " = ");
				System.out.print(calculator.sum(n1, n2));
				System.out.println();
				break;
			case 2:
				//subtracao---------------------------------------------
				System.out.print("Subtracao: " + n1 + " - " + n2 + " = " );
				System.out.print(calculator.subtraction(n1, n2));
				System.out.println();
				break;
			case 3:
				//multiplicacao-------------------------------------------
				System.out.print("Multiplicacao: " + n1 + " x " + n2 + " = " );
				System.out.print(calculator.multiplication(n1, n2));
				System.out.println();
				break;
			case 4:
				//divisao------------------------------------------------
				System.out.print("Divisao: "  + n1 + " / " + n2 + " = " );
				System.out.print(calculator.division(n1, n2));
				System.out.println();
				break;
			case 5:
				//sair----------------------------------------------------
				System.out.println("------------------------------------");
				read.close();
				break;
			}
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
		}while(choice != 5);
		List<String> ops = calculator.getLastOps();
		System.out.println("Operações realizadas: ");
		for (String op : ops) 
		{
			System.out.println(op);
		}
	}
}
