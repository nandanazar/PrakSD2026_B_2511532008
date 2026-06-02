			package pekan8_2511532008;
			
			import java.awt.BorderLayout;
			import java.awt.EventQueue;
			import java.awt.FlowLayout; 
			import javax.swing.JFrame;
			import javax.swing.JPanel;
			import javax.swing.border.EmptyBorder;
			import javax.swing.JButton;   
			import javax.swing.JLabel;    
			import javax.swing.JTextArea;  
			import javax.swing.JTextField; 
			import java.awt.Font;
			import javax.swing.JScrollPane;
			import javax.swing.JOptionPane;
			import javax.swing.BorderFactory;
			import javax.swing.SwingConstants;
			import java.awt.Color;
			import java.awt.Dimension;
			import javax.swing.SwingUtilities;
			
			public class BubleSortGUI__2511532008 extends JFrame {
			
				private static final long serialVersionUID = 1L;
				private int [] array_2008;
				private JLabel[] labelArray_2008;
				private JButton stepButton_2008, resetButton_2008, setButton_2008;
				private JTextField inputField_2008;
				private JPanel panelArray_2008;
				private JTextArea stepArea_2008;
				private JPanel contentPane;
				
				private int i_2008 = 1,j_2008;
				private boolean sorting_2008 = false;
				private int stepCount_2008;
			
				/**
				 * Launch the application.
				 */
				/**
				 * Create the frame.
				 */
				public BubleSortGUI__2511532008() {
					setTitle("Insertion Sort Langkah per Langkah");
				    setSize(750, 400);
				    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				    setLocationRelativeTo(null);
				    setLayout(new BorderLayout());
			
				    JPanel inputPanel_2008 = new JPanel(new FlowLayout());
				    inputField_2008 = new JTextField(30);
				    setButton_2008 = new JButton("Set Array");
				    inputPanel_2008.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
				    inputPanel_2008.add(inputField_2008);
				    inputPanel_2008.add(setButton_2008);
			
				    panelArray_2008 = new JPanel();
				    panelArray_2008.setLayout(new FlowLayout());
			
				    JPanel controlPanel_2008 = new JPanel();
				    stepButton_2008 = new JButton("Langkah Selanjutnya");
				    resetButton_2008 = new JButton("Reset");
				    stepButton_2008.setEnabled(false);
				    controlPanel_2008.add(stepButton_2008);
				    controlPanel_2008.add(resetButton_2008);
				    
				    stepArea_2008 = new JTextArea(8, 60);
				    stepArea_2008.setEditable(false);
				    stepArea_2008.setFont(new Font("Monospaced", Font.PLAIN, 14));
				    JScrollPane scrollPane_2008 = new JScrollPane(stepArea_2008);
			
				    add(inputPanel_2008, BorderLayout.NORTH); 	 
				    add(panelArray_2008, BorderLayout.CENTER);
				    add(controlPanel_2008, BorderLayout.SOUTH);
				    add(scrollPane_2008, BorderLayout.EAST);
			
				    setButton_2008.addActionListener(e_2008 -> setArrayFromInput_2008());
				    stepButton_2008.addActionListener(e_2008 -> performStep_2008());
				    resetButton_2008.addActionListener(e_2008 -> reset_2008());
			
				}
				
				private void setArrayFromInput_2008() {
					String text_2008 = inputField_2008.getText().trim();
				    if (text_2008.isEmpty()) return;
				    String[] parts_2008 = text_2008.split(",");
				    array_2008 = new int[parts_2008.length];
				    try {
				        for (int k_2008 = 0; k_2008 < parts_2008.length; k_2008++) {
				            array_2008[k_2008] = Integer.parseInt(parts_2008[k_2008].trim());
				        }
				    } catch (NumberFormatException e_2008) {
				        JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
				        return;
				    }
				    
				    i_2008 = 0;
				    j_2008 = 0;
				    stepCount_2008 = 1;
				    sorting_2008 = true;
				    stepButton_2008.setEnabled(true);
				    stepArea_2008.setText("");
				    panelArray_2008.removeAll();
				    labelArray_2008 = new JLabel[array_2008.length];
				    for (int k_2008 = 0; k_2008 < array_2008.length; k_2008++) {
				        labelArray_2008[k_2008] = new JLabel(String.valueOf(array_2008[k_2008]));
				        labelArray_2008[k_2008].setFont(new Font("Arial", Font.BOLD, 24));
				        labelArray_2008[k_2008].setOpaque(true);
				        labelArray_2008[k_2008].setBackground(Color.WHITE);
				        labelArray_2008[k_2008].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				        labelArray_2008[k_2008].setPreferredSize(new Dimension(50, 50));
				        labelArray_2008[k_2008].setHorizontalAlignment(SwingConstants.CENTER);
				        panelArray_2008.add(labelArray_2008[k_2008]);
				    }
				    panelArray_2008.revalidate();
				    panelArray_2008.repaint();
				}
				
				private void performStep_2008() {
				    if (!sorting_2008 || i_2008 >= array_2008.length - 1) {
				        sorting_2008 = false;
				        stepButton_2008.setEnabled(false);
				        JOptionPane.showMessageDialog(this, "Sorting selesai!");
				        return;
				    }
				    resetHighlights_2008();
				    StringBuilder stepLog_2008 = new StringBuilder();
				    labelArray_2008[j_2008].setBackground(Color.CYAN);
				    labelArray_2008[j_2008 + 1].setBackground(Color.CYAN);
				    if (array_2008[j_2008] > array_2008[j_2008 + 1]) {
				        // Swap
				        int temp_2008 = array_2008[j_2008];
				        array_2008[j_2008] = array_2008[j_2008 + 1];
				        array_2008[j_2008 + 1] = temp_2008;
				        labelArray_2008[j_2008].setBackground(Color.RED);
				        labelArray_2008[j_2008 + 1].setBackground(Color.RED);
				        stepLog_2008.append("Langkah ").append(stepCount_2008).append(": Menukar elemen ke-")
				                .append(j_2008).append(" (").append(array_2008[j_2008 + 1]).append(") dengan ke-")
				                .append(j_2008 + 1).append(" (").append(array_2008[j_2008]).append(")\n");
				    } else {
				        stepLog_2008.append("Langkah ").append(stepCount_2008).append(": Tidak ada pertukaran antara ke-")
				                .append(j_2008).append(" (").append(array_2008[j_2008]).append(") dan ke-")
				                .append(j_2008 + 1).append(" (").append(array_2008[j_2008 + 1]).append(")\n");
				    }
				    stepLog_2008.append("Hasil: ").append(arrayToString_2008(array_2008)).append("\n\n");
				    stepArea_2008.append(stepLog_2008.toString());
				    updateLabels_2008();
				    j_2008++;
				    if (j_2008 >= array_2008.length - i_2008 - 1) {
				        j_2008 = 0;
				        i_2008++;
				    }
				    stepCount_2008++;
				    if (i_2008 >= array_2008.length - 1) {
				        sorting_2008 = false;
				        stepButton_2008.setEnabled(false);
				        JOptionPane.showMessageDialog(this, "Sorting selesai!");
				    }
				}
				
				private void updateLabels_2008() {
				    for (int k_2008 = 0; k_2008 < array_2008.length; k_2008++) {
				        labelArray_2008[k_2008].setText(String.valueOf(array_2008[k_2008]));
				    }
				}

				private void resetHighlights_2008() {
				    for (JLabel label_2008 : labelArray_2008) {
				        label_2008.setBackground(Color.WHITE);
				    }
				}

				private void reset_2008() {
				    inputField_2008.setText("");
				    panelArray_2008.removeAll();
				    panelArray_2008.revalidate();
				    panelArray_2008.repaint();
				    stepArea_2008.setText("");
				    stepButton_2008.setEnabled(false);
				    sorting_2008 = false;
				    i_2008 = 0;
				    j_2008 = 0;
				    stepCount_2008 = 1;
				}

				private String arrayToString_2008(int[] arr_2008) {
				    StringBuilder sb_2008 = new StringBuilder();
				    for (int k_2008 = 0; k_2008 < arr_2008.length; k_2008++) {
				        sb_2008.append(arr_2008[k_2008]);
				        if (k_2008 < arr_2008.length - 1) sb_2008.append(", ");
				    }
				    return sb_2008.toString();
				}
				
				
				public static void main(String[] args) {
				    SwingUtilities.invokeLater(() -> {
				        BubleSortGUI__2511532008 gui_2008 = new BubleSortGUI__2511532008();
				        gui_2008.setVisible(true);
				    });
				}
				
				
				
			
			}
