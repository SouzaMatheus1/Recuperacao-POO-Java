class Main {
  public static void main(String[] args) {
    // EMPRESA: ESCOLA PINGO DE LUZ
    Empresa escola = new Empresa("Pingo de luz");
    Setor sala = new Setor("Sala");
    Colaborador prof1 = new Colaborador("Jefferson", 1300.00, "Professor", 'b');
    Colaborador prof2 = new Colaborador("Ana", 1342.44, "Professora", 'b');

    sala.addColaborador(prof1);
    sala.addColaborador(prof2);

    Setor cozinha = new Setor("Cozinha");
    Colaborador cozi1 = new Colaborador("Angelina", 1400.00, "Cozinheira", 'm');
    Colaborador cozi2 = new Colaborador("Odete", 1234.23, "Cozinheira", 'm');

    cozinha.addColaborador(cozi1);
    cozinha.addColaborador(cozi2);

    escola.addSetor(sala);
    escola.addSetor(cozinha);

    // EMPRESA: TIME IMPÉRIO DA VILA
    Empresa time = new Empresa("Império da vila");
    Setor campo = new Setor("Equipe campo");
    Colaborador trein = new Colaborador("Anderson", 1512.00, "Treinador", 'b');
    Colaborador gandu = new Colaborador("João", 1320.20, "Gandula", 'b');

    campo.addColaborador(trein);
    campo.addColaborador(gandu);

    Setor adm = new Setor("Administrativo");
    Colaborador fisio = new Colaborador("Lucas", 1983.94, "Fisioterapeuta", 'd');
    Colaborador massa = new Colaborador("Jorge", 1489.33, "Massagista", 'm');

    adm.addColaborador(fisio);
    adm.addColaborador(gandu);

    time.addSetor(adm);
    time.addSetor(campo);

    // EMPRESA: MECANINCA MAO NA MASSA
    Empresa mecanica = new Empresa("Mão na massa");
    Setor mec = new Setor("Mecânica - Reparos");
    Colaborador mec1 = new Colaborador("Tião", 2934.44, "Mecânico", 'b');
    Colaborador mec2 = new Colaborador("Amadeus", 2423.44, "Mecânico", 'b');

    mec.addColaborador(mec1);
    mec.addColaborador(mec2);

    Setor adm_mec = new Setor("Mecânica - Administrativo");
    Colaborador cont = new Colaborador("Amauri", 1874.39, "Contador", 'd');
    Colaborador adv = new Colaborador("Nunces", 3252.44, "Advogado", 'd');

    adm_mec.addColaborador(cont);
    adm_mec.addColaborador(adv);

    mecanica.addSetor(mec);
    mecanica.addSetor(adm_mec);

    // USANDO FUNÇÕES
    System.out.println(escola.getNome());
    escola.mostraSetores();

    System.out.println(time.getNome());
    time.mostraSetores();

    System.out.println(mecanica.getNome());
    mecanica.mostraSetores();
    System.out.println(adm_mec.calculaSalario(1));
  }
}