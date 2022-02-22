package com.skaii;

public final class Car implements Ignition {
    /**
     * Декларация класса (объявление)
     *   <p>(1) public - модификатор доступа
     *   Так же бывают модификаторы доступа:
     *   default (когда модификатор не указывается)
     *   protected
     *   private
     *   <p>(2) Ключевое слово final - от класса нельзя наследоваться
     *   <p>(3) Ключевое слово class - так же бывают другие ключевые слова в этом месте: interface, enum
     *   <p>(4) Description - произвольное имя класса
     *
     *   <p>ДОП:
     *   extends Task implements Serializable
     *   <p>(5) Ключевое слово extends - использоваться для того чтобы наследовать(расширять) другой класс.
     *   Например класс Task(6)
     *   <p>(7) Ключевое слово implements - используется для того чтобы реализовывать логику интерфейса
     */

    // Тип данных.
    // Приватная переменная типа строка с именем name
    private String name;
    // Приватная переменная типа целое число с именем age
    // Integer это обёртка над примитивным типом int
    private Integer age;
    // Приватная переменная типа вещественное(дробное) число с именем id
    // Long это обёртка над примитивным типом long
    private Long id;

    private String favoriteFootballClub;

    // Коструктор классса по умолчанию
    public Car() {
    }

    // Переопределённые конструктор класса
    public Car(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Setter
    public void setFavoriteFootballClub(String favoriteFootballClub) {
        this.favoriteFootballClub = favoriteFootballClub;
    }

    //Getter
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public String getFavoriteFootballClub() {
        return favoriteFootballClub;
    }

    @Override
    public void ignite() {
        System.out.println("Врум-Врум!");
    }
}
