import javax.swing.SwingUtilities;

import Views.Calc;

public class Main {
    // run swing interface
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calc();
            }
        });
    }
}