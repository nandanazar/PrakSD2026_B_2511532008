package pekan8_2511532008;

import java.awt.BorderLayout;
import java.awt.FlowLayout; 
import javax.swing.JFrame;
import javax.swing.JPanel;
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
import java.util.LinkedList;
import java.util.Queue;

public class MergeSortGUI_2511532008 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_2008;
	private JLabel[] labelArray_2008;
	private JButton stepButton_2008, resetButton_2008, setButton_2008;
	private JTextField inputField_2008;
	private JPanel panelArray_2008;
	private JTextArea stepArea_2008;
	
	
	private int i_2008, j_2008, k_2008;
	private int left_2008, mid_2008, right_2008;
	private int[] temp_2008;
	private int stepCount_2008;
	private boolean isMerging_2008 = false;
	private boolean copying_2008 = false;
	private Queue<int[]> mergeQueue_2008 = new LinkedList<>();

	/**
	 * Create the frame.
	 */
	public MergeSortGUI_2511532008() {
		setTitle("Merge Sort Langkah per Langkah");
	    setSize(850, 400);
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
	    
	    stepArea_2008 = new JTextArea(8, 40);
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
	        for (int i = 0; i < parts_2008.length; i++) {
	            array_2008[i] = Integer.parseInt(parts_2008[i].trim());
	        }
	    } catch (NumberFormatException e_2008) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    
	    labelArray_2008 = new JLabel[array_2008.length];
	    panelArray_2008.removeAll();
	    for (int i = 0; i < array_2008.length; i++) {
	        labelArray_2008[i] = new JLabel(String.valueOf(array_2008[i]));
	        labelArray_2008[i].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_2008[i].setOpaque(true);
	        labelArray_2008[i].setBackground(Color.WHITE);
	        labelArray_2008[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_2008[i].setPreferredSize(new Dimension(50, 50));
	        labelArray_2008[i].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_2008.add(labelArray_2008[i]);
	    }
	    
	    mergeQueue_2008.clear();
	    generateMergeSteps_2008(0, array_2008.length - 1);
	    stepButton_2008.setEnabled(true);
	    stepArea_2008.setText("");
	    stepCount_2008 = 1;
	    isMerging_2008 = false;
	    copying_2008 = false;
	    panelArray_2008.revalidate();
	    panelArray_2008.repaint();
	}
	
		private void generateMergeSteps_2008(int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			generateMergeSteps_2008(l, m);
			generateMergeSteps_2008(m + 1, r);
			mergeQueue_2008.add(new int[]{l, m, r});
		}
	}
	
	private void performStep_2008() {
	    resetHighlights_2008();
	    
	    
	    if (!isMerging_2008 && !mergeQueue_2008.isEmpty()) {
	        int[] range_2008 = mergeQueue_2008.poll();
	        left_2008 = range_2008[0];
	        mid_2008 = range_2008[1];
	        right_2008 = range_2008[2];
	        temp_2008 = new int[right_2008 - left_2008 + 1];
	        i_2008 = left_2008;
	        j_2008 = mid_2008 + 1;
	        k_2008 = 0;
	        copying_2008 = false;
	        isMerging_2008 = true;
	        stepArea_2008.append("Langkah " + stepCount_2008++ + ": Mulai merge dari indeks " + left_2008 + " ke " + right_2008 + "\n");
	        return;
	    }
	    
	    
	    if (isMerging_2008 && !copying_2008) {
	        if (i_2008 <= mid_2008 && j_2008 <= right_2008) {
	            labelArray_2008[i_2008].setBackground(Color.CYAN);
	            labelArray_2008[j_2008].setBackground(Color.CYAN);
	            if (array_2008[i_2008] <= array_2008[j_2008]) {
	                temp_2008[k_2008++] = array_2008[i_2008++];
	            } else {
	                temp_2008[k_2008++] = array_2008[j_2008++];
	            }
	            stepArea_2008.append("Langkah " + stepCount_2008++ + ": Bandingkan dan salin elemen ke temp\n");
	            return;
	        } else if (i_2008 <= mid_2008) {
	            temp_2008[k_2008++] = array_2008[i_2008++];
	            stepArea_2008.append("Langkah " + stepCount_2008++ + ": Salin sisa elemen kiri\n");
	            return;
	        } else if (j_2008 <= right_2008) {
	            temp_2008[k_2008++] = array_2008[j_2008++];
	            stepArea_2008.append("Langkah " + stepCount_2008++ + ": Salin sisa elemen kanan\n");
	            return;
	        } else {
	            copying_2008 = true;
	            k_2008 = 0;
	            return;
	        }
	    } 
	    
	    
	    if (copying_2008 && k_2008 < temp_2008.length) {
	        array_2008[left_2008 + k_2008] = temp_2008[k_2008];
	        labelArray_2008[left_2008 + k_2008].setText(String.valueOf(temp_2008[k_2008]));
	        labelArray_2008[left_2008 + k_2008].setBackground(Color.GREEN);
	        k_2008++;
	        stepArea_2008.append("Langkah " + stepCount_2008++ + ": Salin kembali ke array utama\n");
	        return;
	    }

	
	    if (copying_2008 && k_2008 == temp_2008.length) {
	        isMerging_2008 = false;
	        copying_2008 = false;
	    }

		    if (mergeQueue_2008.isEmpty() && !isMerging_2008) {
	        stepArea_2008.append("Selesai.\n");
	        stepButton_2008.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
	    }
	}

	private void resetHighlights_2008() {
	    if (labelArray_2008 == null) return;
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
	    mergeQueue_2008.clear();
	    isMerging_2008 = false;
	    copying_2008 = false;
	    stepCount_2008 = 1;
	}
	
	public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	        MergeSortGUI_2511532008 gui_2008 = new MergeSortGUI_2511532008();
	        gui_2008.setVisible(true);
	    });
	}
}