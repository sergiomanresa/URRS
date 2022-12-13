package Azul9;

public class Jaula {
    Pajaro pajaro1;
    Pajaro pajaro2;
    Pajaro pajaro3;

    public Jaula(Pajaro pajaro1, Pajaro pajaro2, Pajaro pajaro3) {
        this.pajaro1 = pajaro1;
        this.pajaro2 = pajaro2;
        this.pajaro3 = pajaro3;
    }

    void moverJaula(){
        pajaro1.Piar();
        pajaro2.Piar();
        pajaro3.Piar();
    }
}
