
package exer2;

//Deve ser criado outra classe chamada DadosLivro, onde esta classe terá o método 
//main. Logo após, deve-se criar uma instância da classe Livro, do mesmo jeito que 
//foi feito no exercício anterior. Em seguida, serão preenchidos os valores das variáveis 
//de todos os atributos inseridos da classe Livro. Para finalizar devem-se mostrar os valores 
//inseridos nas variáveis na console do Netbeans.
public class DadosDoLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Java";
        livro.edicao = "4ª";
        livro.genero = "Suspense";
        livro.anoPublicacao = 2020;
        livro.autor = "Douglas";
        livro.qtdPaginas = 125;
        
        for (int i=0;i<=5;i++){
            switch(i){
                case 0:
                    System.out.println("O título do livro é: "+livro.titulo);
                    break;
                case 1:
                    System.out.println("O livro está na "+livro.edicao+" edição.");
                    break;
                case 2:
                    System.out.println("O gênero do livro é: "+livro.genero);
                    break;
                case 3:
                    System.out.println("O ano de Publicação do livro é: "+livro.anoPublicacao);
                    break;
                case 4:
                    System.out.println("O autor do livro é: "+livro.autor);
                    break;
                case 5:
                    System.out.println("O livro tem um total de "+livro.qtdPaginas+" páginas.");
                    break;
        }
            
        }
    }
}
