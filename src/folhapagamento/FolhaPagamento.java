package folhapagamento;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class FolhaPagamento {

    public static void main(String[] args) {
        
        int n;
        int numDeps;
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionários na empresa? (De 1 a 100)"));
        }while(n < 1 || n > 100);
        
        for(int i = 0; i < n; i++){
            int tipo;
            do{
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo do funcionário:\n1 - Concursado\n2 - Temporário"));
            }while(tipo != 1 && tipo != 2);
            
            int codigo;
            double salario;
            int tempo;
            
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do funcionário: "));
            salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu salário base: "));
            
            ArrayList<Dependente> dependentes;
            
            switch(tipo){
                case 1:
                    dependentes = new ArrayList<>();
                    tempo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo de contrato em ANOS: "));
                    do{
                        numDeps = Integer.parseInt(JOptionPane.showInputDialog("Número de dependentes do funcionário (0 a 5): "));
                    }while(numDeps < 0 || numDeps > 5);
                    for(int x = 0; x < numDeps; x++){
                        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do " + (x+1) + " dependente: "));
                        Dependente dep = new Dependente(idade);
                        dependentes.add(dep);
                    }
                    Concursado c = new Concursado(codigo, salario, tempo, dependentes);
                    funcionarios.add(c);
                    
                    break;
                   
                case 2:
                    dependentes = new ArrayList<>();
                    tempo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo de contrato em MESES: "));
                    do{
                        numDeps = Integer.parseInt(JOptionPane.showInputDialog("Número de dependentes do funcionário (0 a 5): "));
                    }while(numDeps < 0 || numDeps > 5);
                    for(int x = 0; x < numDeps; x++){
                        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do " + (x+1) + " dependente: "));
                        Dependente dep = new Dependente(idade);
                        dependentes.add(dep);
                    }
                    Temporario t = new Temporario(codigo, salario, tempo, dependentes);
                    funcionarios.add(t);
                    
                    break;
                    
            }
        }
        
        ListIterator<Funcionario> f = funcionarios.listIterator();//getting the Iterator 
        System.out.println("FUNCIONÁRIOS:\n ");
        while(f.hasNext()){//check if iterator has the elements
            System.out.println(f.next().dadosFormatados());
        }
        
    }
    
}
