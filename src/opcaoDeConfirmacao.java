import javax.swing.JOptionPane;

public class opcaoDeConfirmacao {
    public static void main(String[] args) throws Exception {
        
        try {
            String carros = JOptionPane.showInputDialog("Informe a quantidade de carros:");
            String porta = JOptionPane.showInputDialog("Informe a quantidade de portas por carro:");
            String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");
            String cor = JOptionPane.showInputDialog("Informe a cor dos carros:");
            String placa = JOptionPane.showInputDialog("Informe a placa dos carros:");

            int carroNumero = Integer.parseInt(carros);
            int pessoaNumero = Integer.parseInt(pessoas);
            int portaNumero = Integer.parseInt(porta);
          
            System.out.println("Quantidade de carros: " + carros + 
                               "\nQuantidade de portas por carro: " + porta +
                               "\nQuantidade de pessoas: " + pessoas +
                               "\nCor dos carros: " + cor +
                               "\nPlaca dos carros: " + placa);
        } catch (NumberFormatException e) {

         int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisao?");

            System.out.println("Por favor, insira valores numéricos válidos.");
            e.printStackTrace();
        }





    }
}
    