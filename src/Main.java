import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //------------- Aluno 1 --------------------
        Aluno aluno1 = new Aluno();
        aluno1.nome="Pedro";
        aluno1.idade=19;
        aluno1.tipoVeculo="Carro";
        aluno1.aulasTeoricas=4;
        aluno1.aulasPraticas=5;
        //------------- Aluno 2 --------------------
        Aluno aluno2= new Aluno();
        aluno2.nome="Sergio";
        aluno2.idade=25;
        aluno2.tipoVeculo="Moto";
        aluno2.aulasTeoricas=5;
        aluno2.aulasPraticas=6;
        //------------- Aluno 3 --------------------
        Aluno aluno3 = new Aluno();
        aluno3.nome="Guilherme";
        aluno3.idade=20;
        aluno3.tipoVeculo="Carro";
        aluno3.aulasTeoricas=5;
        aluno3.aulasPraticas=4;
        //------------- Aluno 4 --------------------
        Aluno aluno4 = new Aluno();
        aluno4.nome="Gustavo";
        aluno4.idade=45;
        aluno4.tipoVeculo="Moto";
        aluno4.aulasTeoricas=7;
        aluno4.aulasPraticas=5;
        //--------------- Istrututor ---------------
        Instrutor instrutor1 = new Instrutor();
        instrutor1.nome="Julia";
        instrutor1.experiencia=3;
        instrutor1.categoria="Carro";
        //-------------- Veiculo ----------------
        Veiculo veiculo1 = new Veiculo();
        veiculo1.tipo = "Carro";
        veiculo1.modelo="picape";
        veiculo1.placa="232A-232";

        //----------------- Simulando agendamento da aula pratica  ----------------------
        aluno1.agendarAulaPratica();
        //-----------------Simulando agendamento da aula teorica ----------------------
        aluno1.agendarAulaTeorica();
        //-----------------Simulando cancelamento da aula pratica ----------------------
        aluno1.cancelarAulaPratica();
        //-----------------Simulando cancelamento da aula teorica ----------------------
        aluno1.cancelarAulaTeorica();

        //----------------- Realizando Exame de todos os alunos ---------------
        aluno1.realizarExame();
        aluno2.realizarExame();
        aluno3.realizarExame();
        aluno4.realizarExame();

        //------------ Auto Escola ------------
        AutoEscola autoEscola1 = new AutoEscola();
        autoEscola1.aluno1 = aluno1;
        autoEscola1.aluno2 = aluno2;
        autoEscola1.aluno3 = aluno3;
        autoEscola1.aluno4 = aluno4;

        autoEscola1.exibirResumo();
    }
}