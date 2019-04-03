package testSzulanieElementuTablicy;

public class testSzulanieElementuTablicy {

    public static void main(String[] args) {


        int[] A = {2, 1, 3, 4, 5, -1};

        Obliczenia O = new Obliczenia();

        System.out.println("dupa = " + O.licznikOperacji);
        System.out.println("Szukana cyfra jest w tablicy na pozycji "+O.findMinus1(A));

    }
}
