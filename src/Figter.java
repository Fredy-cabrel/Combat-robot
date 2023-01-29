import java.util.Random;
public class Figter extends Robot {
    String nom_f;
    int vie_f = 10;
    public String getNom_f(){
        return nom_f;
    }
    public Figter(String nom_f){
        super();
        this.nom_f = nom_f;
    }
    public void affiche(){
        System.out.println("Fighter " + this.nom_f);
    }
    public int getVie_f(){
        return vie_f;
    }
    public void fire_f(Figter f2){
        Random f1 = new Random();
        System.out.println(f1.nextBoolean());
        if (f1.nextBoolean() == true){
            f2.vie_f = f2.getVie_f()-2;
            System.out.println("l'humain " + f2.getNom_f() + " a touché " + this.nom_f);
        }else {
            f2.vie_f = f2.getVie_f();
            System.out.println("l'humain " + f2.getNom_f() + " a loupé " + this.nom_f);
        }
    }
    public void isDead(){
        if (this.vie_f == 0){
            System.out.println("l'humain " + this.nom_f + " a perdu");
        }else {
            System.out.println("l'humain " + this.nom_f + " est encore en vie ");
        }
    }

}
