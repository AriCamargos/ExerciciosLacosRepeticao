package forwhile;
/*@author AriCamargos
*@version 8.0 (Sept 13, 2021)
*Exercício livro "Entendendo e dominando o Java" pág 54.  
*Código escrito com fórmula em Random
*/
public class Numero_Randomico2 {
    public static void main(String[] args){
        int numero = 1;
            while(numero<=10){
               int maximo = 100;
               int randomico = (int) (Math.random()* maximo);
                System.out.println("NÚMERO ALEATÓRIO : " + randomico);
                System.out.println();
                numero ++;
            }
    }
}
