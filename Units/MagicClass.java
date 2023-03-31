/** 1. MagicClacc - класс магических героев (потомок класса BaseHero)
это родительский класс для:
1.1. Priest - класс МОНАХОВ (потомок MagClass)
1.2. Magician - класс МАГОВ (потомок MagClass)
 */

package Units;

import java.util.ArrayList;

public abstract class MagicClass extends BaseHero{
 
     protected int magicPower; // магическая сила персонажа
 
     public MagicClass(float hp, float maxHp, int speed, int damage, int damageMax, int defence, int attack, int magicPower, int team,
                        String name, int x, int y) {
        super(hp, maxHp, speed, damage, damageMax, defence, attack, team, name, x, y);
        this.magicPower = magicPower;
     }

     @Override
     public String getInfo(){
        return super.getInfo() + String.format("\t    ");
     }

     @Override
     public void step(ArrayList<BaseHero> teamArray) {
        System.out.printf("(%d) %s %s:\n    > ничего не сделал, т.к. для него метод не реализован...\n", this.getTeam(), this.getClassName(), this.getName());
     }
 }
