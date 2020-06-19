
package folhapagamento;

import java.util.ArrayList;
import java.util.ListIterator;

public class Funcionario {
    
    private int codigo;
    private double salarioBase;
    private double salarioTotal;
    private int tempo;
    private ArrayList<Dependente> dependentes;
    
    public Funcionario(int codigo, double salario, int tempo, ArrayList dependentes) {
        this.codigo = codigo;
        this.salarioBase = salario;
        this.tempo = tempo;
        this.dependentes = dependentes;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public void addDependente(Dependente dep){
        dependentes.add(dep);
    }
    
    public int getDependentesNoLimite(int limite){
        int num = 0;
        ListIterator<Dependente> dep = dependentes.listIterator();//getting the Iterator 
        while(dep.hasNext()){//check if iterator has the elements
            if(dep.next().getIdade() <= limite){
               num += 1;
            }
        } 
        return num;
    }
    
    public int dependentesSize(){
        return dependentes.size();
    }
}
