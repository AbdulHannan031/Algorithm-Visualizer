import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stack extends JFrame {

    static String[] array = new String[5];
    static int top = -1;
    static int size = array.length;

    private JTextArea stackTextArea;
    private JTextField inputField;

    public stack() {
        initializeUI();
    }

    private void initializeUI() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stack Visualization");
        setLayout(new BorderLayout());
        setSize(400, 300);
        ImageIcon ic = new ImageIcon("C:\\Users\\Toshiba\\Desktop\\visualizer\\src\\connection.png");
        Image im = ic.getImage();
        setIconImage(im);
         JPanel panel=new JPanel();
        stackTextArea = new JTextArea();
        stackTextArea.setEditable(false);
        stackTextArea.setAlignmentX(Component.CENTER_ALIGNMENT);
         stackTextArea.setBackground(Color.black);
         stackTextArea.setForeground(Color.white);
         panel.setBackground(Color.black);
        panel.add(stackTextArea);
        add(panel,BorderLayout.CENTER);
        JLabel label=new JLabel("   Value :");
        label.setForeground(Color.white);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
         inputPanel.add(label);
       inputField = new JTextField(10);
       inputPanel.setBackground(Color.black);

        inputPanel.add(inputField);

        JButton pushButton = new JButton("Push");
        pushButton.setBackground(Color.decode("#355E3B"));
        pushButton.setForeground(Color.white);
        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(inputField.getText().isEmpty())
               {
                        JOptionPane.showMessageDialog(null,"Please enter a value");
               }
               else {
                   String input = inputField.getText();
                   push(input);
                   updateStackText();
                   inputField.setText("");
               }
            }
        });
        inputPanel.add(pushButton);

        JButton popButton = new JButton("Pop");
        popButton.setBackground(Color.RED);
        popButton.setForeground(Color.white);
        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pop();
                updateStackText();
            }
        });
        inputPanel.add(popButton);

        JButton peekButton = new JButton("Peek");
        peekButton.setBackground(Color.decode("#355E3B"));
        peekButton.setForeground(Color.white);
        peekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                peek();
                updateStackText();
            }
        });
        inputPanel.add(peekButton);

        add(inputPanel, BorderLayout.SOUTH);

        updateStackText();
        setVisible(true);
    }

    private void push(String c) {
        if (top >= size - 1) {
            JOptionPane.showMessageDialog(this, "Stack overflow");
        } else {
            array[++top] = c;
        }
    }

    private void pop() {
        if (top < 0) {
            JOptionPane.showMessageDialog(this, "Stack empty");
        } else {
            array[top--] = null;
        }
    }

    private void peek() {
        if (top >= 0) {
            JOptionPane.showMessageDialog(this, "Top element: " + array[top]);
        } else {
            JOptionPane.showMessageDialog(this, "Stack empty");
        }
    }

    private void updateStackText() {
        StringBuilder stackContent = new StringBuilder();
        stackContent.append("Stack Contents:\n");

        for (int i = top; i >= 0; i--) {
            stackContent.append("           "+array[i]).append("\n");
        }

        stackTextArea.setText(stackContent.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(stack::new);
    }
}
