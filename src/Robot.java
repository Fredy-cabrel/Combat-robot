public class Robot {
    String nom;
    int vie = 10;
    public String getNom(){
        return nom;
    }
    public Robot (){
        this.nom = nom;
    }
    public void affiche(){
        System.out.println("Robot " + this.nom);
    }
    public int getVie(){
        return vie;
    }
    /*public void fire(Robot Rob1, Robot Rob2){
        Rob2.vie = Rob2.getVie()-2;
        System.out.println("Robot " + Rob2.getNom() + " a touché " + Rob1.getNom());
    }*/
    public void fire(Robot Rob1, Robot Rob2){
        Rob2.vie = Rob2.getVie()-2;
        System.out.println("Robot " + Rob2.getNom() + " a touché " + Rob1.getNom());
    }
    public void isDead(){
        if (this.vie == 0){
            System.out.println("Robot " + this.nom + " a gagné");
        }else {
            System.out.println("Robot est encore en vie ");
        }
    }
}
