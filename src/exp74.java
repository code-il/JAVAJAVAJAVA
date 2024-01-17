
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp74 {
    String expression = "";

    public void create() {
        JFrame f;
        JTextField result;
        f = new JFrame("Not a Calculator");
        JPanel panel = new JPanel();
        f.setSize(300, 300);
        GridLayout gl = new GridLayout(4, 4);
        panel.setLayout(gl);

        result = new JTextField();
        result.setHorizontalAlignment(JTextField.RIGHT);
        result.setText("|");
        result.setEditable(false);
        f.add(result, BorderLayout.NORTH);

        String[] buttons = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "CLR", "0", "=", "+"};


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton button = new JButton(buttons[i * 4 + j]);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton key = (JButton) e.getSource();
                        String label = button.getText();
                        switch (label) {
                            case "CLR":
                                expression = "";
                                result.setText("|");
                                break;

                            case "=":
                                String r = calculate(expression);
                                result.setText(r);
                                break;

                            default:
                                expression += label;
                                result.setText(expression);
                                break;
                        }

                    }
                });
                panel.add(button);
            }
        }
        f.add(panel, BorderLayout.CENTER);
        f.setVisible(true);
    }

    public String calculate(String exp) {
        if (exp.length() == 0) {
            expression = "";
            return "NO LOL";
        } else {

            if(!CheckOperand(exp.charAt(0)))
                return "HMM WHY?";
            int res = value(exp.charAt(0));
            for (int i = 1; i < exp.length(); i += 2) {
                char operator = exp.charAt(i);
                if(i+1>=exp.length())
                    return "LOLOLOL";
                char operand = exp.charAt(i + 1);
                if (!CheckOperand(operand))
                    return "mistake!";
                if (operator == '+')
                    res += value(operand);
                else if (operator == '-')
                    res += value(operand);
                else if (operator == '*')
                    res *= value(operand);
                else if (operator == '/')
                    res /= value(operand);
                else
                    return "yeah nice try";
            }
            expression = "";
            return String.valueOf(res);
        }
    }

    public int value(char c) {
        return c - '0';
    }

    public boolean CheckOperand(char c) {
        return (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        exp74 ob = new exp74();
        ob.create();
    }
}
