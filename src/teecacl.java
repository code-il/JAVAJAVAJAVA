import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class teecacl {
    String input="";
    ArrayList<String>operator=new ArrayList<>();
    ArrayList<Integer>operand=new ArrayList<>();
    teecacl(){
        JFrame f=new JFrame();
        JPanel p=new JPanel(new GridLayout(4,4));
        JTextField result=new JTextField();
        result.setHorizontalAlignment(SwingConstants.RIGHT);
        result.setText("|");
        result.setEditable(false);
        f.add(result,BorderLayout.NORTH);
        f.setSize(400,400);
        String [] buttons={"7","8","9","/",
                            "4","5","6","*",
                            "1","2","3","-",
                            "CLR","0","=","+"};
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                JButton button =new JButton(buttons[4*i+j]);
                p.add(button);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String clicked = button.getText();
                        if (clicked.equalsIgnoreCase("CLR")) {
                            operand.clear();
                            operator.clear();
                            input = "";
                            result.setText("|");
                        } else if (clicked.equalsIgnoreCase("+") || clicked.equalsIgnoreCase("-") || clicked.equalsIgnoreCase("/") || clicked.equalsIgnoreCase("*")) {
                            operand.add(Integer.parseInt(input));
                            operator.add(clicked);
                            result.setText("|");
                            input = "";
                        } else if (clicked.equalsIgnoreCase("=")) {
                            if (operator.size() != operand.size() + 1 && !input.equals("")) {
                                operand.add(Integer.parseInt(input));
                                String r = calculate();
                                result.setText(r);
                            } else {
                                result.setText("ERROR");
                            }

                        } else {
                            input = input + clicked;
                            result.setText(input);
                        }
                        }
                    });
                }
            }
        f.add(p,BorderLayout.CENTER);
        f.setVisible(true);
    }
    String calculate(){
        int result=operand.get(0);
        for(int i=1;i<=operator.size();i++){
            int oprd = operand.get(i);
            String oprtr=operator.get(i-1);
            switch (oprtr){
                case "+":
                    result+=oprd;
                    break;
                case "-":
                    result-=oprd;
                    break;
                case "*":
                    result*=oprd;
                    break;
                case "/":
                    result/=oprd;
                    break;
                default:
                    return "Syntax error";
            }
        }
        return String.valueOf(result);
    }
    public static void main(String [] args){
        new teecacl();
    }
}
