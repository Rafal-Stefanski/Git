package udemy.udemy_java_courses.game;

public abstract class GameObject {
    private int x;

    public void blah() {

    }

    //  Ta metoda musi być zastosowana przez każdą klasę która jest przedłużeniem klasy GameObject
    public abstract void draw();

    public static void main(String[] args) {
        Player player = new Player();
        player.someMethod();
//        player.draw();

        GameObject menu = new Menu();
//        menu.draw();

        GameObject[] gameObjects = new GameObject[2];
        gameObjects[0] = player;
        gameObjects[1] = menu;

        for (GameObject obj : gameObjects) {
            obj.draw();
        }

//        GameObject myObject = new GameObject();
    }
}
