package visibility;

public class Streetlights {

    private boolean red, yellow, green;

    public void switchLights() {
        if (isStop()) switchToPrepareToDrive();
        else if(isPrepareToDrive()) switchToDrive();
        else if (isDrive()) switchToPrepareToStop();
        else if (isPrepareToStop()) switchToStop();
    }

    private boolean isPrepareToStop() {
        return yellow;
    }

    private boolean isDrive() {
        return green;
    }

    private boolean isPrepareToDrive() {
        return red && isPrepareToStop();
    }

    private boolean isStop() {
        return red && !isPrepareToStop();
    }

    private void switchToStop() {
        green = yellow = false;
        red = true;
    }

    private void switchToPrepareToStop() {
        green = red = false;
        yellow = true;
    }

    private void switchToDrive() {
        red = yellow = false;
        green = true;
    }

    private void switchToPrepareToDrive() {
        yellow = red = true;
        green = false;
    }
}
