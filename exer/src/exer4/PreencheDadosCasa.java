package exer4;
/*
Deve ser criado outra classe chamada PreencheDadosCasa, onde a mesma terá o 
método main. Após criado o método main, deve-se criar uma instância da classe 
Casa, por meio do operador new. Em seguida, preencher os valores de cada variável 
por meio da instância seguida do operador ponto (.). Para finalizar, devem-se
mostrar os valores na tela da console do Netbeans.
 */
public class PreencheDadosCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        //qtdQuartos, cor, qtdBanheiro, valorImovel, bairro, rua, numero.
        casa.qtdQuartos = 5;
        casa.qtdBanheiro = 2;
        casa.valorImovel = 150000.0;
        casa.bairro = "Nossa Senhora de Fátima";
        casa.rua = "Bernardo Heidemann";
        casa.cor = "Branca";
        casa.numero = 1251;
        for (int i=0;i<=6;i++){
            switch(i){
                case 0:
                    System.out.println("A casa tem "+casa.qtdQuartos+" quartos");
                    break;
                case 1:
                    System.out.println("A casa tem "+casa.qtdBanheiro+" banheiros");
                    break;
                case 2:
                    System.out.println("A casa tem o valor de: R$"+casa.valorImovel);
                    break;
                case 3:
                    System.out.println("A casa se localiza no bairro: "+casa.bairro);
                    break;
                case 4:
                    System.out.println("A casa se localiza na rua: "+casa.rua);
                    break;
                case 5:
                    System.out.println("A casa é da cor "+casa.cor);
                    break;
                case 6:
                    System.out.println("O número da casa é: "+casa.numero);
                    break;
        }
            
        }
    }
}
