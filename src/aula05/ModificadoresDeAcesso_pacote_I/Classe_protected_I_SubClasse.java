package aula05.ModificadoresDeAcesso_pacote_I;

import aula05.ModificadoresDeAcesso_pacote_II.Classe_protected_II_SuperClasse;

/**
 * @author Jonathas
 */
public class Classe_protected_I_SubClasse extends Classe_protected_II_SuperClasse {

    public String mostrarNome() {
        String nome = nome();
        return nome;
    }
}
