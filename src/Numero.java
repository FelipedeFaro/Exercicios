import java.util.Scanner;

public class Numero {

    public void calculos (){

        Scanner in = new Scanner(System.in);
        Float n1= in.nextFloat();
        Float n2= in.nextFloat();
        Float n3= in.nextFloat();

        System.out.println("o maior numero é "+maior(n1,n2,n3));
        System.out.println("o menor numero é "+menor(n1,n2,n3));
        System.out.println("a media é "+media(n1,n2,n3));
    }

    Float maior(float n1, float n2, float n3){
        Float maior = null;
        if (n1>n2 && n1>n3) {
            maior = n1;
        }
        else {
            if (n2>n3 && n2>n1){
                maior = n2;
            }
            else {
                if (n3>n1 && n3>n2){
                    maior = n3;
                }
            }

        }
        return maior;
    }
    Float menor(float n1, float n2, float n3) {
        Float menor = null;
        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else {
            if (n2 < n3 && n2 < n1) {
                menor = n2;
            } else {
                if (n3 < n1 && n3 < n2) {
                    menor = n3;
                }
            }

        }
        return menor;
    }
    Float media(float n1, float n2, float n3) {
        Float media = (n1 + n2 + n3) / 3;
        return media;
    }
}
