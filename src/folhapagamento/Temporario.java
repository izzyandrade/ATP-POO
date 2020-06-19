/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapagamento;

import java.util.ArrayList;

/**
 *
 * @author Izzy
 */
public class Temporario extends Funcionario{

    public Temporario(int codigo, double salario, int tempo, ArrayList dependentes) {
        super(codigo, salario, tempo, dependentes);      
        super.setSalarioTotal(calculaSalario(salario, tempo));
    }
    
    private double calculaSalario(double salario, int tempo){
        double numDependentes = super.getDependentesNoLimite(18);
        double salarioTotal = salario + (tempo * 15) + (50 * numDependentes);
        return salarioTotal;
    }
    
    public String dadosFormatados(){
        String dados = "Funcionário com código " + super.getCodigo() + ", temporário, com salário base de R$" + super.getSalarioBase() + ", salário total (com bonificações) de R$" + super.getSalarioTotal() + ", e " + super.getTempo() + " MESES de contratação.\nO funcionário tem " + super.dependentesSize() + " dependentes, e " + super.getDependentesNoLimite(18) + " estão dentro do limite de idade para que o funcionário receba auxílio salarial.\n";
        return dados;
    }
}
