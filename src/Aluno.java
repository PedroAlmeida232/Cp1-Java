public class Aluno {

    public String nome;
    public  int idade;
    public String tipoVeculo;
    public int aulasTeoricas;
    public int aulasPraticas;
    public boolean aprovado;

    public void agendarAulaTeorica(){
        aulasTeoricas += 1;
    }
    public void agendarAulaPratica(){
        aulasPraticas+= 1;
    }
    public void cancelarAulaTeorica(){
        aulasTeoricas -= 1;
    }
    public void cancelarAulaPratica(){
        aulasPraticas -= 1;
    }
    public void realizarExame(){
        if (aulasPraticas >= 5 && aulasTeoricas >= 5){
            aprovado = true;
        }else{
            System.out.println("Nao foi possivel realizar o exame , voce deve ter no minimo 5 aulas teoricas e 5 aulas praticas");
        }

    }


}
