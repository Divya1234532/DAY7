class Character{
    /*Character() {
        System.out.println("Character");
    }*/
    void Warrior()
    {
        System.out.println("Warrior attack with Sword");
    }
    void Archer()
    {
        System.out.println("Archer attack with Arrow");
    }
    void Mage()
    {
        System.out.println("Mage attack with Magic");
    }


 }
 class Warrior extends Character{
     Warrior() {
         System.out.println("Warrior");
     }
     void Attack()
     {
         System.out.println("Warrior attack with Sword");
     }
 }
 class Archer extends Character{
     Archer() {
         System.out.println("Archer");
     }
     void Attack()
     {
         System.out.println("Archer attack with Arrow");
     }
 }
 class Mage extends Character{
    Mage() {
         System.out.println("Mage");
     }
     void Attack()
     {
         System.out.println("Mage attack with Magic");
     }
 }
public class MiniGame {
    public static void main(String[] args) {
        Warrior c1=new Warrior();
        c1.Attack();
        Archer c2=new Archer();
        c2.Attack();
        Mage c3=new Mage();
        c3.Attack();

    }
}
