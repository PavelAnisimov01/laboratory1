package common;

import java.util.Scanner;

/**
 * Класс общий со свойствами <b>ID</b> , <b>dateOfStartofContract</b> , <b>dateOfEndofContract</b> , <b>numberOfContract</b>, <b>man</b> .
 * @autor Анисимов Павел
 */
public class Common {
    /** Поле ID */
    protected Long ID;
    /** Поле даты начала контракта */
    protected String dateOfStartofContract;
    /** Поле даты окончания контракта */
    protected String dateOfEndofContract;
    /** Поле номера контракта */
    protected Long numberOfContract;
    /** Поле сущности человека */
    protected Man man;

    /**
     * Конструктор - создание нового объекта без значений
     */
    public Common(){

    }
    /**
     * Функция определения значения поля {@link Common#man}
     *  @param man - сущность человек
     */

    public void setMan(Man man) {
        this.man = man;
    }


    /**
     * Функция получения значения поля {@link Common#ID}
     * @return возвращает значение возраста
     */

    public Long getID() {
        return ID;
    }
    /**
     * Функция определения значения поля {@link Common#ID}
     *  @param ID - ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }
    /**
     * Функция определения значения поля {@link Common#dateOfStartofContract}
     *  @param dateOfStartofContract - дата начала контракта
     */

    public void setDateOfStartofContract(String dateOfStartofContract) {
        this.dateOfStartofContract = dateOfStartofContract;
    }
    /**
     * Функция определения значения поля {@link Common#dateOfEndofContract}
     *  @param dateOfEndofContract - дата окончания контракта
     */
    public void setDateOfEndofContract(String dateOfEndofContract) {
        this.dateOfEndofContract = dateOfEndofContract;
    }
    /**
     * Функция определения значения поля {@link Common#numberOfContract}
     *  @param numberOfContract - номер контракта
     */
    public void setNumberOfContract(Long numberOfContract) {
        this.numberOfContract = numberOfContract;
    }
    /**
     * Функция определения общих свойств для каждого контракта
     * @param count -счётчик, определяющих индивидуальный ID
     * @param scStr -объект типа сканер для ввода строковых значений
     * @param scChislo- объект типа сканер для ввода числовых значений
     */

    public void setCommon(Long count,Scanner scStr,Scanner scChislo){
        Man man=new Man();
        System.out.println("Введите FIO человека");
        man.setFio(scStr.nextLine());
        System.out.println("Введите дату рождения человека(формат dd:mm:yyyy)");
        man.setDateOfBirthday(scStr.nextLine());
        System.out.println("Введите серию и номер паспорта человека через пробел(формат ssss nnnnnn)");
        man.setSeriyAndNumberOfPassport(scStr.nextLine());
        System.out.println("Введите пол человека");
        man.setGender(scStr.nextLine());
        man.setID(count);
        setMan(man);
        System.out.println("Введите дату начала контракта(формат dd:mm:yyyy)");
        setDateOfStartofContract(scStr.nextLine());
        System.out.println("Введите дату окончания контракта(формат dd:mm:yyyy)");
        setDateOfEndofContract(scStr.nextLine());
        System.out.println("Введите номер контракта");
        setNumberOfContract(scChislo.nextLong());
        setID(count);

    }
}
