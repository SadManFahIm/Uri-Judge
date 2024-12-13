package Strings;
import java.util.HashMap;
import java.util.Scanner;

public class URI 1367 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			if (N == 0) break;
			HashMap<Character, Integer> problemasResolvidos = new HashMap<>();
			HashMap<Character, Integer> problemas = new HashMap<>();
			for (int i = 0; i < N; i++) {
				char identificador = leitor.next().charAt(0);
				int tempo = leitor.nextInt();
				String julgamento = leitor.next();
				if (julgamento.equals("correct")) {
					if (problemas.containsKey(identificador) ) {
						tempo += problemas.get(identificador);
					}
					problemasResolvidos.put(identificador, tempo);
				} else {
					int penalidade = 20;
					if (problemas.containsKey(identificador) ) {
						penalidade += problemas.get(identificador);
					}
					problemas.put(identificador, penalidade);
				}
			}
			System.out.println(problemasResolvidos.size() + " " + problemasResolvidos.values().stream().reduce(0, Integer::sum));
		}
	}

}
