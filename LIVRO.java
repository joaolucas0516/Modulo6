package livro;
import java.util.PriorityQueue;
import java.util.Scanner;
public class LIVRO {
    public static void main(String[] args) {
		Scanner LerS= new Scanner(System.in);
		PriorityQueue <Integer> pq1 = new PriorityQueue <Integer>();
	int variavel;
	System.out.print("Qual � a primeira variavel que quer introduzir?");
	variavel = LerS.nextInt();
	pq1.add(variavel);
	int variavel1;
	System.out.print("Qual � a segunda variavel que quer introduzir?");
	variavel1 = LerS.nextInt();
	pq1.add(variavel1);
	int variavel2;
	System.out.print("Qual � a terceira variavel que introduzir?");
	variavel2 = LerS.nextInt();
	pq1.add(variavel2);
	int variavel3;
	System.out.print("Qual � a quarta variavel que quer introduzir?");
	variavel3 = LerS.nextInt();
	pq1.add(variavel3);
	int variavel4;
	System.out.print("Qual � a quinta variavel que quer introduzir?");
	variavel4 = LerS.nextInt();
	pq1.add(variavel4);
	int variavel5;
	System.out.print("Qual � a sexta variavel que quer introduzir?");
	variavel5 = LerS.nextInt();
	pq1.add(variavel5);
	System.out.print ("Flia Original:" +pq1);
	System.out.print("A variavel � cabe�a:" + pq1.element());
	}
}
