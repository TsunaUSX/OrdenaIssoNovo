package com.ordenaisso.gabriel.ordenaisso;

public class numeros {
    public int pos;
    public int num;

    public numeros(){}

    public numeros(int pos, int num)
    {
        this.pos = pos;
        this.num = num;
    }

    //Getters e setters
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
