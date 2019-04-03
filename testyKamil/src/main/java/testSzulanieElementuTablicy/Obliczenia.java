package testSzulanieElementuTablicy;

public class Obliczenia {

   public int licznikOperacji;

    public int findMinus1 (int [] A) {
        int komorkaTablicy = 0;

        for (int i = 0; i < A.length; i++) {
            licznikOperacji = i+1;
            if (A[i]==-1) {
                komorkaTablicy =  i;
            }

        }

        return komorkaTablicy;
    }

}
