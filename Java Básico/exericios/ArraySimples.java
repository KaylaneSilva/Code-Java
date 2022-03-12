import java.util.Arrays;

public class ArraySimples {
	public static void main (String[] args) {
		String[] paises = {"Brasil", "Bolívia", "Uruguai", "Europa"};
		System.out.println (paises[0]);
		System.out.println (Arrays.toString (paises));
		
		int posicao = Arrays.binarySearch(paises, "Brasil");
		System.out.println (posicao);
	}
}
