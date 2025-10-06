package principal;
import javax.swing.JOptionPane;
import equacao.Equacao;

public class Principal {

    public static void main(String[] args) {

        String opcao = "";
        Equacao equacao = new Equacao();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura coeficientes \n2 - Delta \n3 - Raizes \n9 - Sair");
            switch (Integer.parseInt(opcao)) {
                case 1:
                    equacao.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a")));
                    equacao.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor b")));
                    equacao.setValorC(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor c")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Delta: " + equacao.getDelta());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "x1: " + equacao.getRaiz1() + " x2: " + equacao.getRaiz2());
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Alternativa inválida!");
                    break;
            }
        }
    }
}
