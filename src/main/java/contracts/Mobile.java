package contracts;

import common.Common;


/**
 * Класс мобильная связь со свойствами <b>minut</b>,<b>sms</b>,<b>gb</b>, наследующий класс общий со свойствами <b>ID</b> , <b>dateOfStartofContract</b> , <b>dateOfEndofContract</b> , <b>numberOfContract</b>, <b>man</b> .
 * @autor Анисимов Павел
 */
public class Mobile extends Common {

    /** Поле minut */
    private  int minut;
    /** sms */
    private int sms;
    /** gb */
    private int gb;

    /**
     * Конструктор - создание нового объекта без значений
     */
    public Mobile(){

    }
    /**
     * Функция определения значения поля {@link Mobile#minut}
     *  @param minut - количество минут
     */
    public void setMinut(int minut) {
        this.minut = minut;
    }
    /**
     * Функция определения значения поля {@link Mobile#sms}
     *  @param sms - количество смс
     */
    public void setSms(int sms) {
        this.sms = sms;
    }
    /**
     * Функция определения значения поля {@link Mobile#gb}
     *  @param gb - количество гигабайт
     */
    public void setGb(int gb) {
        this.gb = gb;
    }


    /**
     * Функция переопределения метода toString для вывода информации об объекте
     *  @return возвращает строку с полями объекта Mobile
     */
    @Override
    public String toString() {

        return " Контракт на мобильную связь: " +
                "  Id= " + ID
                + ", DateOfStartofContract= " + dateOfStartofContract

                + ", DateOfEndofContract= " + dateOfEndofContract

                + ",NumberOfContract= " + numberOfContract

                + ", Minuts= " + minut
                + ", SMS= " + sms
                + ", GB= " + gb
                + ",        Man :" +
                "ID= " + man.getID()
                + ", FIO= " + man.getFio()
                + ", DateOfBirthday= " + man.getDateOfBirthday()
                + ", SeriyAndNumberOfPassport= " + man.getDateOfPassport()
                + ", Gender= " + man.getGender()
                + ", Age= " + man.getAge();


    }
}
