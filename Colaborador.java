class Colaborador{
  private int id = 1;
  private String nome;
  private double salario_base;
  private String funcao;
  private char formacao;

  public Colaborador(String nome, double salario_base, String funcao, char formacao){
    this.nome = nome;
    this.salario_base = salario_base;
    this.funcao = funcao;
    this.formacao = formacao;
    this.id = setId(id);
  }

  public int getId(){
    return this.id;  
  }
  
  public double getSalarioBase(){
    return salario_base;
  }

  public String toString(){
    return nome + " " + salario_base + " " + formacao;
  }

  public char getFormacao(){
    return this.formacao;
  }

  public int setId(int id){
    return id + 1;
  }
}