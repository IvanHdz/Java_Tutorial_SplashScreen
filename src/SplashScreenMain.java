
/**
 *
 * @author Ivan
 */
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;

public class SplashScreenMain {

    SplashScreen screen;

    public SplashScreenMain() {
        // initialize the splash screen
        splashScreenInit();
        // do something here to simulate the program doing something that
        // is time consuming
        for (int i = 0; i <= 1000000; i++) {
            for (long j = 0; j < 50000; ++j) {
                String poop = " " + (j + i);
            }
            // run either of these two -- not both
            screen.setProgress("Yo " + i, i);  // progress bar with a message
            //screen.setProgress(i);           // progress bar with no message
        }
        splashScreenDestruct();
        System.exit(0);
    }

    private void splashScreenDestruct() {
        screen.setScreenVisible(false);
    }

    private void splashScreenInit() {
        ImageIcon myImage = new ImageIcon(SplashScreenMain.class.getResource("splash.gif"));
        screen = new SplashScreen(myImage);
        screen.setLocationRelativeTo(null);
        screen.setProgressMax(100);
        screen.setScreenVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
        } catch (IllegalAccessException e) {
        } catch (InstantiationException e) {
        } catch (UnsupportedLookAndFeelException e) {
        }
        SplashScreenMain splashScreenMain = new SplashScreenMain();
    }
}