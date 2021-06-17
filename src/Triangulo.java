//Exercícios de Java e OO
//        Lógica estruturada
//        Decisões
//        1)
//        Fazer um programa em Java para:
//        •
//        receber 3 valores n1, n2 e n3 do usuário
//        •
//        verificar se estes valores podem ser os lados de um triângulo. Em casoafirmativo,
//        informar se o triângulo  equilátero, isoisceles ou escaleno




class Triangulo {
    int aresta1;
    int aresta2;
    int aresta3;

    Triangulo(int aresta1,int aresta2,int aresta3){
         this.aresta1 = aresta1;
         this.aresta2 = aresta2;
         this.aresta3 = aresta3;

    }

    String tipo (){
        if (valido()) {
            if (equilatero()) {
                return "Triangulo Equilatero";
            }
            if (isoisceles()) {
                return "Triangulo isoisceles";
            }
            if (escaleno()) {
                return "Triangulo escaleno";
            }
        }
        return "Não é um triangulo";

    }

    boolean valido (){
        if (aresta1+aresta2 < aresta3){
            return false;
        }
        if (aresta2+aresta3 < aresta1){
            return false;
        }
        if (aresta1+aresta3 < aresta2){
            return false;
        }
        return true;
    }

    boolean equilatero(){
        if (aresta1 == aresta2 && aresta3 == aresta1 ){
            return true;
        }
        return false;

    }

    boolean escaleno(){
        if (aresta1 != aresta2 && aresta3 != aresta1){
            return true;
        }
        return false;
    }
    boolean isoisceles() {
        if (!equilatero() && !escaleno()) {
            return true;
        }
        return false;
    }
}

