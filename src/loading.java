import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loading {

    public static void main(String[] args) {
         LoadingScreen obj=new LoadingScreen();
         obj.startLoading();
    }
}

class LoadingScreen extends JFrame {

    private JProgressBar progressBar;
    private Timer timer;

    public LoadingScreen() {
        setTitle("Algorithm Visualizer");
        setUndecorated(true); // Removes the window decorations (title bar, etc.)
        setSize(400, 50);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Create a custom font for the app name
        Font appNameFont = new Font("Arial", Font.BOLD, 20);

        JLabel appNameLabel = new JLabel("Algorithm Visualizer", SwingConstants.CENTER);
        appNameLabel.setFont(appNameFont);
        contentPane.add(appNameLabel, BorderLayout.NORTH);

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        contentPane.add(progressBar, BorderLayout.CENTER);

        add(contentPane);

        timer = new Timer(100, new ActionListener() {
            int progress = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                progress += 2;
                progressBar.setValue(progress);
                if (progress >= 100) {
                    timer.stop();
                    loadingComplete();
                }
            }
        });
    }

    public void startLoading() {
        timer.start();
        setVisible(true);
    }

    private void loadingComplete() {
        dispose();
        SwingUtilities.invokeLater(() -> {
            // Call your main constructor or method here
            // For example:
            new Main();
        });
    }
}




