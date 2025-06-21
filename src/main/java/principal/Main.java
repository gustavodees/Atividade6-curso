package principal;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int NUMBER = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número de cadastro: "));
        double HORAS = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        double VPH = HORAS * 15.55;
        String salarioFormatado = String.format("%.2f", VPH);
        JOptionPane.showMessageDialog(null,"NUMBER = "+ NUMBER +"\n"
                                                                + "SALARY = U$ "+ salarioFormatado);




    }
}