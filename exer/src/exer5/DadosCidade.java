package exer5;

/*
Cria uma classe que terá o metodo main. Crie três instâncias de Cidade e de os valores para estas cidades sendo que cada uma de um estado do sul do Brasil. 
Mostre os valores na tela.
 */
public class DadosCidade {
    public static void main(String[] args) {
        Cidade c1 = new Cidade();
        //código, nome, estado e sigla do estado.
        c1.codigo = 1;
        c1.nome = "Porto Alegre";
        c1.estado = "Rio Grande do Sul";
        c1.siglaEstado = "RS";
        
        Cidade c2 = new Cidade();
        c2.codigo = 2;
        c2.nome = "Florianópolis";
        c2.estado = "Santa Catarina";
        c2.siglaEstado = "SC";
        
        Cidade c3 = new Cidade();
        c3.codigo = 3;
        c3.nome = "Curitiba";
        c3.estado = "Paraná";
        c3.siglaEstado = "PR";
        
        for (int i=0;i<=2;i++){
            switch(i){
                case 0:
                    System.out.println("O código da cidade é: "+c1.codigo);
                    System.out.println("O nome da cidade é: "+c1.nome);
                    System.out.println("O estado que a cidade está é: "+c1.estado);
                    System.out.println("A sigla do estado é: "+c1.siglaEstado);
                    break;
                case 1:
                    System.out.println("O código da cidade é: "+c2.codigo);
                    System.out.println("O nome da cidade é: "+c2.nome);
                    System.out.println("O estado que a cidade está é: "+c2.estado);
                    System.out.println("A sigla do estado é: "+c2.siglaEstado);
                    break;
                case 2:
                    System.out.println("O código da cidade é: "+c3.codigo);
                    System.out.println("O nome da cidade é: "+c3.nome);
                    System.out.println("O estado que a cidade está é: "+c3.estado);
                    System.out.println("A sigla do estado é: "+c3.siglaEstado);
                    break;           
            }
            
        }
    }
}
