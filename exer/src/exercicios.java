public class exercicios{
    public static void main(String[] args) {
        /*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
            mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
            (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

        int idade = 0;
        int [] tempo = new int[2];
        tempo[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos anos de vida você tem:"));//0 = anos de vida
        tempo[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos meses de vida você tem:"));// 1 = meses de vida
        tempo[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos dias de vida você tem:"));// 2 = dias de vida
        idade = (tempo[0]*365) + (tempo[1]*30) + tempo[2];
        System.out.println("Você possui "+idade+" dias de vida!");*/

            /*2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
            números 4, 5 e 6. A soma das duas médias. A média das médias.

        double m1 = (9+8+7)/3;
        double m2 = (6+5+4)/3;
        System.out.println("A média de 9, 8 e 7 é igual a: " +  m1);
        System.out.println("A média de 6, 5 e 4 é igual a: " +  m2);
        double m3 = (m1+m2)/2;
        System.out.println("A média das duas médias é de: " + m3);*/

            /*3. Informar um saldo e imprimir o saldo com reajuste de 1%.

        double sal = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um valor a ser reajustado 1%:"));
        double reajuste = sal - (sal*0.01);
        JOptionPane.showMessageDialog(null, "O salário reajustado em 1% é igual a R$"+reajuste);*/

            /*4. Escrever um algoritmo que lê:
            - a porcentagem do IPI a ser acrescido no valor das peças
            - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
            - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
            O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
            Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)     

        double ipi = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor (em %) do IPI a ser acrescido no valor das peças:"));

        if (ipi>0 && ipi<=100) {

            double pc1[]= new double[2];

            pc1[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da peça 1:"));
            pc1[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor unitário da peça 1:"));
            pc1[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de peças:"));

            double pc2[]= new double[2];

            pc2[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da peça 2:"));
            pc2[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor unitário da peça 2:"));
            pc2[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de peças:"));
            
            double form = ((pc1[1]*pc1[2])+(pc2[1]*pc2[2]))*((ipi/100) + 1);

            JOptionPane.showMessageDialog(null, "O total a ser pago será de: R$"+form);

        }else {
            JOptionPane.showMessageDialog(null, "Valor Inválido, tente novamente!");
        }*/
        
            /* 5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
            calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
            (1SM=R$788,00) 
        double sm = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do salário mínimo atual:"));
        double sl = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do seu salário atual:"));
        double qtdesm = sl/sm;
        JOptionPane.showMessageDialog(null, "Você ganha "+qtdesm+" salário(s) mínimo(s)");*/

            /* 6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
            antecessor e seu sucessor
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
        JOptionPane.showMessageDialog(null, "O número antecessor de "+num+" é "+ (num -1) + "\n e seu posterior é "+ (num+1));*/
    }
}