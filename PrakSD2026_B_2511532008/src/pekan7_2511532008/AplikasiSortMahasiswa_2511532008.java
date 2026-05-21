		package pekan7_2511532008;
		
		import javax.swing.*;
		import javax.swing.table.DefaultTableModel;
		import java.awt.*;
		import java.util.ArrayList;
		
		class Mahasiswa_2511532008 {
		    private String nama_2008;
		    private String nim_2008;
		    private String prodi_2008;
		
	public Mahasiswa_2511532008(String nama_2008, String nim_2008, String prodi_2008) {
		        this.nama_2008 = nama_2008;
		        this.nim_2008 = nim_2008;
		        this.prodi_2008 = prodi_2008;
		    }
		    public String getNama_2008() {
		        return nama_2008;
		    }
		    public void setNama_2008(String nama_2008) {
		        this.nama_2008 = nama_2008;
		    }
		    public String getNim_2008() {
		        return nim_2008;
		    }
		    public void setNim_2008(String nim_2008) {
		        this.nim_2008 = nim_2008;
		    }
		    public String getProdi_2008() {
		        return prodi_2008;
		    }
		    public void setProdi_2008(String prodi_2008) {
		        this.prodi_2008 = prodi_2008;
		    }
		    public String toString_2008() {
		        return nama_2008;
		    	}
			}
		
		
		public class AplikasiSortMahasiswa_2511532008 extends JFrame {
		    private JTextField txtNama_2008, txtNim_2008, txtProdi_2008;
		    private JButton btnTambah_2008, btnHapus_2008, btnSort_2008;
		    private JComboBox<String> cmbAlgo_2008;
		    private JTextArea txtAreaLog_2008;
		    private JTable table_2008;
		    private DefaultTableModel tableModel_2008;		
		    private ArrayList<Mahasiswa_2511532008> listMahasiswa_2008;
		
		    public AplikasiSortMahasiswa_2511532008() {
		        listMahasiswa_2008 = new ArrayList<>();
		        initGui_2008();
		    }
		
		    private void initGui_2008() {
		        setTitle("Program Pengurutan Nama Mahasiswa - NIM Suffix _2008");
		        setSize(850, 600);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        setLocationRelativeTo(null);
		        setLayout(new BorderLayout(10, 10));
		
		        JPanel panelInput_2008 = new JPanel(new GridLayout(3, 2, 5, 5));
		        panelInput_2008.setBorder(BorderFactory.createTitledBorder("Form Input Data Mahasiswa"));
		
		        JLabel lblNama_2008 = new JLabel(" Nama Mahasiswa:");
		        txtNama_2008 = new JTextField();
		        JLabel lblNim_2008 = new JLabel(" NIM Mahasiswa:");
		        txtNim_2008 = new JTextField();
		        JLabel lblProdi_2008 = new JLabel(" Program Studi:");
		        txtProdi_2008 = new JTextField();
		
		        panelInput_2008.add(lblNama_2008);
		        panelInput_2008.add(txtNama_2008);
		        panelInput_2008.add(lblNim_2008);
		        panelInput_2008.add(txtNim_2008);
		        panelInput_2008.add(lblProdi_2008);
		        panelInput_2008.add(txtProdi_2008);
		
		        JPanel panelTengah_2008 = new JPanel(new BorderLayout(5, 5));
		
		        String[] kolom_2008 = {"NIM", "Nama Mahasiswa", "Program Studi"};
		        tableModel_2008 = new DefaultTableModel(kolom_2008, 0);
		        table_2008 = new JTable(tableModel_2008);
		        JScrollPane scrollTabel_2008 = new JScrollPane(table_2008);
		        scrollTabel_2008.setPreferredSize(new Dimension(400, 200));
		        panelTengah_2008.add(scrollTabel_2008, BorderLayout.CENTER);
		
		        JPanel panelAksiData_2008 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
		        btnTambah_2008 = new JButton("Tambah Data");
		        btnHapus_2008 = new JButton("Hapus Pilihan");
		        panelAksiData_2008.add(btnTambah_2008);
		        panelAksiData_2008.add(btnHapus_2008);
		        panelTengah_2008.add(panelAksiData_2008, BorderLayout.SOUTH);
		
		        JPanel panelBawah_2008 = new JPanel(new BorderLayout(5, 5));
		        panelBawah_2008.setBorder(BorderFactory.createTitledBorder("Visualisasi Proses Sorting"));
		
		        JPanel panelOpsiSort_2008 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		        JLabel lblAlgo_2008 = new JLabel("Pilih Algoritma:");
		        String[] algos_2008 = {"Insertion Sort", "Selection Sort", "Bubble Sort"};
		        cmbAlgo_2008 = new JComboBox<>(algos_2008);
		        btnSort_2008 = new JButton("Mulai Sorting");
		        
		        panelOpsiSort_2008.add(lblAlgo_2008);
		        panelOpsiSort_2008.add(cmbAlgo_2008);
		        panelOpsiSort_2008.add(btnSort_2008);
		        panelBawah_2008.add(panelOpsiSort_2008, BorderLayout.NORTH);
		
		        txtAreaLog_2008 = new JTextArea();
		        txtAreaLog_2008.setEditable(false);
		        txtAreaLog_2008.setFont(new Font("Monospaced", Font.PLAIN, 12));
		        JScrollPane scrollLog_2008 = new JScrollPane(txtAreaLog_2008);
		        scrollLog_2008.setPreferredSize(new Dimension(800, 220));
		        panelBawah_2008.add(scrollLog_2008, BorderLayout.CENTER);
		
		        add(panelInput_2008, BorderLayout.NORTH);
		        add(panelTengah_2008, BorderLayout.CENTER);
		        add(panelBawah_2008, BorderLayout.SOUTH);
		
		        btnTambah_2008.addActionListener(e_2008 -> tambahData_2008());
		        btnHapus_2008.addActionListener(e_2008 -> hapusData_2008());
		        btnSort_2008.addActionListener(e_2008 -> jalankanSorting_2008());
		    }
		
		    private void tambahData_2008() {
		        String nama_2008 = txtNama_2008.getText().trim();
		        String nim_2008 = txtNim_2008.getText().trim();
		        String prodi_2008 = txtProdi_2008.getText().trim();
		
		        if (nama_2008.isEmpty() || nim_2008.isEmpty() || prodi_2008.isEmpty()) {
		            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
		            return;
		        }
		
		        Mahasiswa_2511532008 mhs_2008 = new Mahasiswa_2511532008(nama_2008, nim_2008, prodi_2008);
		        listMahasiswa_2008.add(mhs_2008);
		
		        tableModel_2008.addRow(new Object[]{mhs_2008.getNim_2008(), mhs_2008.getNama_2008(), mhs_2008.getProdi_2008()});
		
		        txtNama_2008.setText("");
		        txtNim_2008.setText("");
		        txtProdi_2008.setText("");
		        txtNama_2008.requestFocus();
		    }
		
		    private void hapusData_2008() {
		        int barisTerpilih_2008 = table_2008.getSelectedRow();
		        if (barisTerpilih_2008 != -1) {
		            listMahasiswa_2008.remove(barisTerpilih_2008);
		            tableModel_2008.removeRow(barisTerpilih_2008);
		        } else {
		            JOptionPane.showMessageDialog(this, "Pilih baris tabel yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
		        }
		    }
		    private void jalankanSorting_2008() {
		        if (listMahasiswa_2008.isEmpty()) {
		            JOptionPane.showMessageDialog(this, "Data mahasiswa kosong! Input data terlebih dahulu.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
		            return;
		        }
		        ArrayList<Mahasiswa_2511532008> listKerja_2008 = new ArrayList<>(listMahasiswa_2008);
		        txtAreaLog_2008.setText(""); 
		
		        String algoTerpilih_2008 = (String) cmbAlgo_2008.getSelectedItem();
		
		        if ("Insertion Sort".equals(algoTerpilih_2008)) {
		            insertionSort_2008(listKerja_2008);
		        } else if ("Selection Sort".equals(algoTerpilih_2008)) {
		            selectionSort_2008(listKerja_2008);
		        } else if ("Bubble Sort".equals(algoTerpilih_2008)) {
		            bubbleSort_2008(listKerja_2008);
		        }
		
		        tableModel_2008.setRowCount(0);
		        for (Mahasiswa_2511532008 mhs_2008 : listKerja_2008) {
		            tableModel_2008.addRow(new Object[]{mhs_2008.getNim_2008(), mhs_2008.getNama_2008(), mhs_2008.getProdi_2008()});
		        }
		    }
		
		    private void cetakLog_2008(String pesan_2008) {
		        txtAreaLog_2008.append(pesan_2008 + "\n");
		        System.out.println(pesan_2008);
		    }
		
		    private String formatArrayNama_2008(ArrayList<Mahasiswa_2511532008> list_2008) {
		        StringBuilder sb_2008 = new StringBuilder("[");
		        for (int i_2008 = 0; i_2008 < list_2008.size(); i_2008++) {
		            sb_2008.append(list_2008.get(i_2008).getNama_2008());
		            if (i_2008 < list_2008.size() - 1) {
		                sb_2008.append(", ");
		            }
		        }
		        sb_2008.append("]");
		        return sb_2008.toString();
		    }
		
		    private void insertionSort_2008(ArrayList<Mahasiswa_2511532008> list_2008) {
		        int n_2008 = list_2008.size();
		        cetakLog_2008("=== INSERTION SORT ===");
		        cetakLog_2008("Data Awal : " + formatArrayNama_2008(list_2008));
		
		        for (int i_2008 = 1; i_2008 < n_2008; i_2008++) {
		            Mahasiswa_2511532008 key_2008 = list_2008.get(i_2008);
		            int j_2008 = i_2008 - 1;
		
		            while (j_2008 >= 0 && list_2008.get(j_2008).getNama_2008().compareToIgnoreCase(key_2008.getNama_2008()) > 0) {
		                list_2008.set(j_2008 + 1, list_2008.get(j_2008));
		                j_2008--;
		            }
		            list_2008.set(j_2008 + 1, key_2008);
		            cetakLog_2008("Langkah " + i_2008 + " : " + formatArrayNama_2008(list_2008));
		        }
		        cetakLog_2008("Hasil Akhir: " + formatArrayNama_2008(list_2008) + "\n");
		    }
		
		    private void selectionSort_2008(ArrayList<Mahasiswa_2511532008> list_2008) {
		        int n_2008 = list_2008.size();
		        cetakLog_2008("=== SELECTION SORT ===");
		        cetakLog_2008("Data Awal : " + formatArrayNama_2008(list_2008));
		
		        for (int i_2008 = 0; i_2008 < n_2008 - 1; i_2008++) {
		            int minIdx_2008 = i_2008;
		            for (int j_2008 = i_2008 + 1; j_2008 < n_2008; j_2008++) {
		
		                if (list_2008.get(j_2008).getNama_2008().compareToIgnoreCase(list_2008.get(minIdx_2008).getNama_2008()) < 0) {
		                    minIdx_2008 = j_2008;
		                }
		            }
		
		            Mahasiswa_2511532008 temp_2008 = list_2008.get(minIdx_2008);
		            list_2008.set(minIdx_2008, list_2008.get(i_2008));
		            list_2008.set(i_2008, temp_2008);
		
		            cetakLog_2008("Pass " + (i_2008 + 1) + " : " + formatArrayNama_2008(list_2008));
		        }
		        cetakLog_2008("Hasil Akhir: " + formatArrayNama_2008(list_2008) + "\n");
		    }
		
		    private void bubbleSort_2008(ArrayList<Mahasiswa_2511532008> list_2008) {
		        int n_2008 = list_2008.size();
		        cetakLog_2008("=== BUBBLE SORT ===");
		        cetakLog_2008("Data Awal : " + formatArrayNama_2008(list_2008));
		
		        for (int i_2008 = 0; i_2008 < n_2008 - 1; i_2008++) {
		            for (int j_2008 = 0; j_2008 < n_2008 - i_2008 - 1; j_2008++) {
		                if (list_2008.get(j_2008).getNama_2008().compareToIgnoreCase(list_2008.get(j_2008 + 1).getNama_2008()) > 0) {
		                    Mahasiswa_2511532008 temp_2008 = list_2008.get(j_2008);
		                    list_2008.set(j_2008, list_2008.get(j_2008 + 1));
		                    list_2008.set(j_2008 + 1, temp_2008);
		                }
		            }
		            cetakLog_2008("Pass " + (i_2008 + 1) + " : " + formatArrayNama_2008(list_2008));
		        }
		        cetakLog_2008("Hasil Akhir: " + formatArrayNama_2008(list_2008) + "\n");
		    }
		
		    public static void main(String[] args) {
		        SwingUtilities.invokeLater(() -> {
		            new AplikasiSortMahasiswa_2511532008().setVisible(true);
		        });
		    }
		}