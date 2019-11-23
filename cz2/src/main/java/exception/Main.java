package exception;

public class Main {



    public void handleInput() {
        try {
            moveForwardChecked(-1);
        } catch (Exception e) {
            System.out.println("Failed to move forward");
        }
        moveForwardUnchecked(-2);
    }

    private void moveForwardChecked(int a) throws Exception {
        if (a < 0) throw new Exception("a should be positive");
        // ...
    }

    private void moveForwardUnchecked(int a) {
        if (a < 0) throw new RuntimeException("a should be positive");
        // ...
    }

    private void move(int a) {
        try {
            moveForwardChecked(a);
        } catch (Exception e) {
            throw new IllegalArgumentException("Couldn't move!", e);
        } finally {
            System.out.println("Couldn't move!");
        }
    }

}
