package aula05.ModificadoresDeAcesso_pacote_I;

//import aula05.ModificadoresDeAcesso_pacote_II.Classe_default_II;
public class Principal extends ClasseFinal {

    public static void main(String[] args) {
        
        ClasseStatic classeStatic = new ClasseStatic();
        ClasseStatic classeStatic2 = new ClasseStatic();
        ClasseStatic classeStatic3 = new ClasseStatic();
        
        System.out.println(ClasseStatic.empresa);
                
       //alteração na classe: todos os objetos compartilham
        ClasseStatic.empresa = "UFMS";
        
        System.out.println(ClasseStatic.empresa);
        
       //para alterar a idade, individual, pois objetos não compartilham:
       classeStatic.idade = 10;
       classeStatic2.idade = 20;
       //...
       
       ClasseAbstract_Sub classeAbstract_Sub = new ClasseAbstract_Sub();
//      
        System.out.println(classeAbstract_Sub.nome());
        
        
        
        
        
    }

//    ClasseFinal classeFinal = new ClasseFinal();
//    classeFinal.n  = 20;

//        
        
//        Classe_default_II classe_default_II = new Classe_default_II();
//        System.out.println(classe_default_II.nome());
//        
//        
//        Classe_default classe_default = new Classe_default();        
//        System.out.println(classe_default.nome());
    //Classe_protected_I_SubClasse classe_protected_I_SubClasse = new Classe_protected_I_SubClasse();
    //System.out.println(classe_protected_I_SubClasse.mostrarNome());
}
