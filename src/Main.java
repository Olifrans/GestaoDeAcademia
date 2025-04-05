import models.Academia;
import models.Cliente;
import models.Instrutor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Academia academiaSenai = new Academia("Java Senai Fitness");

        Cliente clienteSenai = new Cliente("Paulo",45,"Plus++");
        Cliente clienteSenai01 = new Cliente("Pedro",25,"Basico");
        Cliente clienteSenai02 = new Cliente("Francisco",18,"Premium");


        Instrutor  instrutorSenai = new Instrutor("João",35,"Musculação");
        Instrutor  instrutorSenai01 = new Instrutor("Pedro",35,"Ginastica");
        Instrutor  instrutorSenai02 = new Instrutor("Maria",35,"Musculação");



        academiaSenai.adicionarPessoa(clienteSenai);
        academiaSenai.adicionarPessoa(clienteSenai01);
        academiaSenai.adicionarPessoa(clienteSenai02);

        System.out.println("_______________________");
//        academiaSenai.adicionarPessoa(instrutorSenai);
//        academiaSenai.adicionarPessoa(instrutorSenai01);
//        academiaSenai.adicionarPessoa(instrutorSenai02);

        academiaSenai.listarPessoas();









    }
}