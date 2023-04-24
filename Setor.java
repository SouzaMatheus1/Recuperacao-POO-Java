import java.util.ArrayList;

class Setor{
  private String nome;
  static int idColaboradores;
  private ArrayList<Colaborador> colaboradores;

  public Setor(String nome){
    this.nome = nome;
    this.colaboradores = new ArrayList<Colaborador>();
  }

  public String getNome(){
    return this.nome;
  }

  public void addColaborador(Colaborador colaborador){
    colaboradores.add(colaborador);
  }

  public void removeColaborador(Colaborador colaborador){
    colaboradores.remove(colaborador);
  }

  public Colaborador selecionaColaborador(int id){
    for(int i = 0;i < colaboradores.size();i++){
      if(id == colaboradores.get(i).getId()){
        return colaboradores.get(i);
      }
    }return colaboradores.get(-1);
  }

  public void mostraColaboradores(){
    for(int i = 0;i < colaboradores.size();i++){
      int x = colaboradores.get(i).getId();
      System.out.print(colaboradores.get(i));
      System.out.printf(" R$ %.2f %n", calculaSalario(x));
    }
  }

  public double calculaSalario(int id){
    if(selecionaColaborador(id).getFormacao() == 'b'){
      return selecionaColaborador(id).getSalarioBase() * 1.10;
    }else if(selecionaColaborador(id).getFormacao() == 'm'){
      return selecionaColaborador(id).getSalarioBase() * 1.25;
    }else if(selecionaColaborador(id).getFormacao() == 'd'){
      return selecionaColaborador(id).getSalarioBase() * 1.50;
    }else{
      return ' ';
    }
  }

  public String toString(){
    return nome + " ";
  }
}