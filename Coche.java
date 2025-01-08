public class Coche {
    String matricula;
    int anyoMatricula;
    int cilindrada;

    public Coche(String a, int anyo, int cilin){
        this.matricula = a;
        this.anyoMatricula = anyo;
        this.cilindrada = cilin;
    }

    public String getMatricula(){
        return  this.matricula;
    }

    public int getAnyoMatricula(){
        return this.anyoMatricula;
    }

    public int getCilindrada(){
        return  this.cilindrada;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setAnyoMatricula(int anyo){
        this.anyoMatricula = anyo;
    }

    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
}
