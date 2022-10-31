package FightGame;



public abstract class  Character {

//weapon behavior es mi interface
    WeaponBehavior wB;

    //item que va a tener cada personaje
    public void WeaponItemFight()
    {
        wB.UseWeaponItem();
    }

    // fight lo ocupo como el display en el caso del simulador de los patos
    public abstract void fight();

    public void showCharacter()
    {
        fight();
       WeaponItemFight();

    }

    public void setWeapon(WeaponBehavior w)
    {
        this.wB = w;
    }// end setWeapom

}//end class
