package testSilnia;

public class Silnia {

    int n;
    int wynik;


   public int obliczeniaSilnia (int n){
    /*
        if ( n == 0){
             wynik = 1;
        }
        else if ( n<0){
             Integer.valueOf("liczba nie mozna podawac liczby mniejszej niz 0");
        }
        else if(n>0){

            for (int i=1; i<=n; i++ ){
                wynik= wynik * i;
            }

        }
       return wynik;
*/
    int costam = 1;

    for ( int i = 1; i<=n; i++){
        costam*=i;
    }



            return costam;

    }
}
