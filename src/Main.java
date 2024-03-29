import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    Main() {
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        ImageIcon ic = new ImageIcon("C:\\Users\\Toshiba\\Desktop\\visualizer\\src\\connection.png");
        Image im = ic.getImage();

        JFrame frame = new JFrame("DSA Algorithm Visualizer");



        frame.setIconImage(im);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocation(100,100);

        JPanel panel1 = new JPanel();
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(2, 3, 20, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        panel.setBackground(Color.decode("#F4F4F4")); // Light gray background color

        JButton bubbleSortButton = createMenuButton("Bubble Sort", "bubble.png");
        bubbleSortButton.addActionListener(e -> new bubblesort());
        bubbleSortButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton selectionSortButton = createMenuButton("Selection Sort", "selection.png");
        selectionSortButton.addActionListener(e -> new selectionsort());
        selectionSortButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton singlyLinkedListButton = createMenuButton("Singly Linked List", "linkedlist.png");
        singlyLinkedListButton.addActionListener(e -> new GU());
        singlyLinkedListButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton doublyLinkedListButton = createMenuButton("Doubly Linked List", "doublylinkedlist.png");
        doublyLinkedListButton.addActionListener(e -> new GDoublyLinkedList());
        doublyLinkedListButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton stackButton = createMenuButton("Stack", "stack.png");
        stackButton.addActionListener(e -> new stack());
        stackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton queueButton = createMenuButton("Queue", "queue.png");
        queueButton.addActionListener(e -> new QueueVisualizationGUI());
        queueButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        panel.add(bubbleSortButton);
        panel.add(selectionSortButton);
        panel.add(singlyLinkedListButton);
        panel.add(doublyLinkedListButton);
        panel.add(stackButton);
        panel.add(queueButton);
panel.setBackground(Color.black);
        JButton infoButton = createInfoButton();
        frame.add(panel, BorderLayout.CENTER);
        frame.add(infoButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static JButton createMenuButton(String label, String iconFileName) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setFocusPainted(false);
        button.setBackground(Color.decode("#3498db"));
        button.setForeground(Color.white);
        button.setIcon(new ImageIcon(iconFileName));
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return button;
    }

    private static JButton createInfoButton() {
        JButton infoButton = new JButton("About");
        infoButton.setFont(new Font("Arial", Font.BOLD, 18));
        infoButton.setFocusPainted(false);
        infoButton.setBackground(Color.decode("#0000"));
        infoButton.setForeground(Color.white);
        infoButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        infoButton.setMargin(new Insets(10, 20, 10, 20)); // Increase margin to make it round

        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showInformationDialog();
            }
        });

        return infoButton;
    }

    private static void showInformationDialog() {
        JOptionPane.showMessageDialog(null,
                "DSA Algorithm Visualizer\n\n" +
                        "This application was created by:\n" +
                        "Abdu Hannan, Hasnain Irshad, Summaira Muzaffar\n" +
                        "abdulhannan0308@gmail.com\n" +
                        "Semester Project\n",
                "About Us",
                JOptionPane.INFORMATION_MESSAGE);
    }


}
