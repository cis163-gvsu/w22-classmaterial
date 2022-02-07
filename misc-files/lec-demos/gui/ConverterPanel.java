package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ConverterPanel extends JPanel{
    private JTextField temp;
    private JLabel inputLabel, outputLabel, resultLabel;
    private JButton convert;
    private JRadioButton cel, fah;
    private ButtonGroup bg;
    private int which = 0;

    public ConverterPanel() {
        inputLabel = new JLabel("Temperature to convert:");
        outputLabel = new JLabel("Converted temeprature:");
        temp = new JTextField(5);

        cel = new JRadioButton("Convert to Celsius");
        cel.setSelected(true);
        fah = new JRadioButton("Convert to Fahrenheit");
        bg = new ButtonGroup();
        bg.add(cel);
        bg.add(fah);

        convert = new JButton("Convert");

        add(inputLabel);
        add(temp);
        add(outputLabel);
        add(convert);

        add(cel);
        add(fah);


        convert.addActionListener(new ConvertListener());
    }

    private class ConvertListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == convert) {
                double tempval = Double.parseDouble(temp.getText());
                double convertedval;
                if (fah.isSelected()) {
                    convertedval = Converter.convertToFahrenheit(tempval);
                }
                else {
                    convertedval = Converter.convertToCelsius(tempval);
                }
                outputLabel.setText(Double.toString(convertedval));
            }
        }
    }
}
