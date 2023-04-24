import java.util.ArrayList;

class Empresa{
  private String nome;
  private ArrayList<Setor> setores;

  public Empresa(String nome){
    this.nome = nome;
    this.setores = new ArrayList<Setor>();
  }

  public String getNome(){
    return this.nome;
  }
  
  public void addSetor(Setor setor){
    setores.add(setor);
  }

  public Setor selecionaSetor(String nome){
    for(int i = 0;i < setores.size();i++){
      if(nome == setores.get(i).getNome()){
        return setores.get(i);
      }
    }return setores.get(-1);
  }

  public void mostraSetores(){
    for(int i = 0;i < setores.size();i++){
      System.out.println(setores.get(i));
      System.out.println("Colaboradores: ");
      setores.get(i).mostraColaboradores();
      System.out.println("\n");
    }
  }

  public void removeSetores(Setor setor){
    setores.remove(setor);
  }
  
}