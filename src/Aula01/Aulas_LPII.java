
package Aula01;

//Classe 1
public class Aulas_LPII {
    public static void main(String[] args) {
       
        Classe2 objClasse2 = new Classe2();        
        objClasse2.exibirIdade();
        
        String acessandoNome = objClasse2.nome;
        int acessandoIdade = objClasse2.idade;
        
        System.out.println("Os dados do objeto criado são: " + acessandoNome + " e " + acessandoIdade);
        
    }
 }


