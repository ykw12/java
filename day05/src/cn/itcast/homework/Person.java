package cn.itcast.homework;

public class Person {
    private String name;
    private int life;

    public Person() {
    }

    public Person(String name, int life) {
        this.name = name;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setlife(String name,int life) throws LifeException {
        if (life < 0) {
            throw new LifeException("生命值不能为负值");
        }
        this.life = life;
    }
}
