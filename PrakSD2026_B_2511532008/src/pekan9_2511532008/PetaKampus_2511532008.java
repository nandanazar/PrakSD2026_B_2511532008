package pekan9_2511532008;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class PetaKampus_2511532008 extends JFrame {
    
    static class Node_2008 {
        String name_2008;
        int x_2008, y_2008;

        Node_2008(String name_2008, int x_2008, int y_2008) {
            this.name_2008 = name_2008;
            this.x_2008 = x_2008;
            this.y_2008 = y_2008;
        }
    }

    private List<Node_2008> nodeList_2008;
    private Map<Integer, List<Integer>> adjList_2008;

    private Set<Integer> visitedIndices_2008;
    private List<Integer> visitedOrder_2008;
    private List<Integer> finalPath_2008;

    private JComboBox<String> startCombo_2008;
    private JComboBox<String> goalCombo_2008;
    private JTextArea resultArea_2008;
    private GraphPanel_2008 canvas_2008;

    public PetaKampus_2511532008() {
        setTitle("Pencarian Jalur BFS dan DFS - NIM 2511532008");
        setSize(850, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initGraph_2008();

        visitedIndices_2008 = new HashSet<>();
        visitedOrder_2008 = new ArrayList<>();
        finalPath_2008 = new ArrayList<>();

        setLayout(new BorderLayout());

        JPanel topPanel_2008 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        topPanel_2008.add(new JLabel("Lokasi Awal:"));
        startCombo_2008 = new JComboBox<>();
        topPanel_2008.add(startCombo_2008);

        topPanel_2008.add(new JLabel("Lokasi Tujuan:"));
        goalCombo_2008 = new JComboBox<>();
        topPanel_2008.add(goalCombo_2008);

        for (Node_2008 node_2008 : nodeList_2008) {
            startCombo_2008.addItem(node_2008.name_2008);
            goalCombo_2008.addItem(node_2008.name_2008);
        }

        JButton btnBFS_2008 = new JButton("BFS");
        JButton btnDFS_2008 = new JButton("DFS");
        JButton btnReset_2008 = new JButton("RESET");

        topPanel_2008.add(btnBFS_2008);
        topPanel_2008.add(btnDFS_2008);
        topPanel_2008.add(btnReset_2008);

        add(topPanel_2008, BorderLayout.NORTH);

        canvas_2008 = new GraphPanel_2008();
        add(canvas_2008, BorderLayout.CENTER);

        JPanel bottomPanel_2008 = new JPanel(new BorderLayout());
        bottomPanel_2008.setBorder(BorderFactory.createTitledBorder("Hasil Pencarian"));
        resultArea_2008 = new JTextArea(5, 50);
        resultArea_2008.setEditable(false);
        resultArea_2008.setFont(new Font("Monospaced", Font.PLAIN, 12));
        bottomPanel_2008.add(new JScrollPane(resultArea_2008), BorderLayout.CENTER);
        add(bottomPanel_2008, BorderLayout.SOUTH);

        btnBFS_2008.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e_2008) {
                BFS();
            }
        });

        btnDFS_2008.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e_2008) {
                DFS();
            }
        });

        btnReset_2008.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e_2008) {
                resetGraph();
            }
        });

        resetGraph();
    }

    private void initGraph_2008() {
        nodeList_2008 = new ArrayList<>();
        adjList_2008 = new HashMap<>();

        nodeList_2008.add(new Node_2008("GerbangUtama", 60, 250));     // 0
        nodeList_2008.add(new Node_2008("Perpus", 190, 120));          // 1
        nodeList_2008.add(new Node_2008("Rektorat", 190, 250));        // 2
        nodeList_2008.add(new Node_2008("Masjid", 190, 380));          // 3
        nodeList_2008.add(new Node_2008("Asrama", 380, 120));          // 4
        nodeList_2008.add(new Node_2008("PKM", 380, 250));             // 5
        nodeList_2008.add(new Node_2008("FakultasTeknik", 380, 380));  // 6
        nodeList_2008.add(new Node_2008("FTI", 580, 120));             // 7
        nodeList_2008.add(new Node_2008("LabJaringan", 580, 250));     // 8
        nodeList_2008.add(new Node_2008("LaborAI", 580, 380));         // 9

        for (int i_2008 = 0; i_2008 < nodeList_2008.size(); i_2008++) {
            adjList_2008.put(i_2008, new ArrayList<>());
        }

        addEdge_2008(0, 1);
        addEdge_2008(0, 2);
        addEdge_2008(0, 3);
        addEdge_2008(1, 2);
        addEdge_2008(2, 3);
        addEdge_2008(1, 4);
        addEdge_2008(2, 5);
        addEdge_2008(3, 6);
        addEdge_2008(4, 5);
        addEdge_2008(5, 6);
        addEdge_2008(4, 7);
        addEdge_2008(5, 8);
        addEdge_2008(6, 9);
        addEdge_2008(7, 8);
        addEdge_2008(8, 9);
    }

    private void addEdge_2008(int u_2008, int v_2008) {
        adjList_2008.get(u_2008).add(v_2008);
        adjList_2008.get(v_2008).add(u_2008);
    }
    public void BFS() {
        int startIdx_2008 = startCombo_2008.getSelectedIndex();
        int goalIdx_2008 = goalCombo_2008.getSelectedIndex();

        visitedIndices_2008.clear();
        visitedOrder_2008.clear();
        finalPath_2008.clear();

        Queue<Integer> queue_2008 = new LinkedList<>();
        Map<Integer, Integer> parentMap_2008 = new HashMap<>();

        queue_2008.add(startIdx_2008);
        visitedIndices_2008.add(startIdx_2008);
        visitedOrder_2008.add(startIdx_2008);

        boolean found_2008 = false;

        while (!queue_2008.isEmpty()) {
            int current_2008 = queue_2008.poll();

            if (current_2008 == goalIdx_2008) {
                found_2008 = true;
                break;
            }

            for (int neighbor_2008 : adjList_2008.get(current_2008)) {
                if (!visitedIndices_2008.contains(neighbor_2008)) {
                    visitedIndices_2008.add(neighbor_2008);
                    visitedOrder_2008.add(neighbor_2008);
                    parentMap_2008.put(neighbor_2008, current_2008);
                    queue_2008.add(neighbor_2008);
                }
            }
        }

        if (found_2008) {
            int curr_2008 = goalIdx_2008;
            while (curr_2008 != startIdx_2008) {
                finalPath_2008.add(0, curr_2008);
                curr_2008 = parentMap_2008.get(curr_2008);
            }
            finalPath_2008.add(0, startIdx_2008);
        }

        displayPath();
        displayGraph();
    }

    public void DFS() {
        int startIdx_2008 = startCombo_2008.getSelectedIndex();
        int goalIdx_2008 = goalCombo_2008.getSelectedIndex();

        visitedIndices_2008.clear();
        visitedOrder_2008.clear();
        finalPath_2008.clear();

        Stack<Integer> stack_2008 = new Stack<>();
        Map<Integer, Integer> parentMap_2008 = new HashMap<>();

        stack_2008.push(startIdx_2008);

        boolean found_2008 = false;

        while (!stack_2008.isEmpty()) {
            int current_2008 = stack_2008.pop();

            if (!visitedIndices_2008.contains(current_2008)) {
                visitedIndices_2008.add(current_2008);
                visitedOrder_2008.add(current_2008);

                if (current_2008 == goalIdx_2008) {
                    found_2008 = true;
                    break;
                }

                List<Integer> neighbors_2008 = adjList_2008.get(current_2008);
                for (int i_2008 = neighbors_2008.size() - 1; i_2008 >= 0; i_2008--) {
                    int neighbor_2008 = neighbors_2008.get(i_2008);
                    if (!visitedIndices_2008.contains(neighbor_2008)) {
                        stack_2008.push(neighbor_2008);
                        parentMap_2008.put(neighbor_2008, current_2008);
                    }
                }
            }
        }

        if (found_2008) {
            int curr_2008 = goalIdx_2008;
            while (curr_2008 != startIdx_2008) {
                finalPath_2008.add(0, curr_2008);
                curr_2008 = parentMap_2008.get(curr_2008);
            }
            finalPath_2008.add(0, startIdx_2008);
        }

        displayPath();
        displayGraph();
    }

    public void displayGraph() {
        canvas_2008.repaint();
    }

    public void displayPath() {
        StringBuilder sb_2008 = new StringBuilder();
        sb_2008.append("Hasil Pencarian :\n");
        sb_2008.append("Jalur : ");
        if (finalPath_2008.isEmpty()) {
            sb_2008.append("Tidak ditemukan jalur\n");
        } else {
            for (int i_2008 = 0; i_2008 < finalPath_2008.size(); i_2008++) {
                sb_2008.append(nodeList_2008.get(finalPath_2008.get(i_2008)).name_2008);
                if (i_2008 < finalPath_2008.size() - 1) {
                    sb_2008.append(" -> ");
                }
            }
            sb_2008.append("\n");
        }

        sb_2008.append("Node Dikunjungi : ");
        for (int i_2008 = 0; i_2008 < visitedOrder_2008.size(); i_2008++) {
            sb_2008.append(nodeList_2008.get(visitedOrder_2008.get(i_2008)).name_2008);
            if (i_2008 < visitedOrder_2008.size() - 1) {
                sb_2008.append(", ");
            }
        }
        sb_2008.append("\n");

        sb_2008.append("Jumlah Node Dikunjungi : ").append(visitedOrder_2008.size()).append("\n");
        resultArea_2008.setText(sb_2008.toString());
    }

    public void resetGraph() {
        visitedIndices_2008.clear();
        visitedOrder_2008.clear();
        finalPath_2008.clear();
        resultArea_2008.setText("Hasil Pencarian :\nJalur :\nNode Dikunjungi :\nJumlah Node Dikunjungi : 0");
        displayGraph();
    }

    private class GraphPanel_2008 extends JPanel {
        public GraphPanel_2008() {
            setBackground(Color.WHITE);
            setBorder(BorderFactory.createTitledBorder("VISUALISASI GRAPH"));
        }

        @Override
        protected void paintComponent(Graphics g_2008) {
            super.paintComponent(g_2008);
            Graphics2D g2_2008 = (Graphics2D) g_2008;
            g2_2008.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2_2008.setColor(Color.DARK_GRAY);
            g2_2008.setStroke(new BasicStroke(1));
            for (int u_2008 : adjList_2008.keySet()) {
                Node_2008 nodeU_2008 = nodeList_2008.get(u_2008);
                for (int v_2008 : adjList_2008.get(u_2008)) {
                    if (u_2008 < v_2008) {
                        Node_2008 nodeV_2008 = nodeList_2008.get(v_2008);
                        
                        if (isEdgeInPath_2008(u_2008, v_2008)) {
                            g2_2008.setColor(Color.BLACK);
                            g2_2008.setStroke(new BasicStroke(3));
                            g2_2008.drawLine(nodeU_2008.x_2008, nodeU_2008.y_2008, nodeV_2008.x_2008, nodeV_2008.y_2008);
                            g2_2008.setColor(Color.DARK_GRAY);
                            g2_2008.setStroke(new BasicStroke(1));
                        } else {
                            g2_2008.drawLine(nodeU_2008.x_2008, nodeU_2008.y_2008, nodeV_2008.x_2008, nodeV_2008.y_2008);
                        }
                    }
                }
            }

            int radius_2008 = 18;
            for (int i_2008 = 0; i_2008 < nodeList_2008.size(); i_2008++) {
                Node_2008 node_2008 = nodeList_2008.get(i_2008);

                if (finalPath_2008.contains(i_2008)) {
                    g2_2008.setColor(Color.LIGHT_GRAY); 
                } else if (visitedIndices_2008.contains(i_2008)) {
                    g2_2008.setColor(Color.GRAY); 
                } else {
                    g2_2008.setColor(Color.WHITE); 
                }

                g2_2008.fillOval(node_2008.x_2008 - radius_2008, node_2008.y_2008 - radius_2008, 2 * radius_2008, 2 * radius_2008);
                g2_2008.setColor(Color.BLACK);
                g2_2008.drawOval(node_2008.x_2008 - radius_2008, node_2008.y_2008 - radius_2008, 2 * radius_2008, 2 * radius_2008);

                g2_2008.drawString(node_2008.name_2008, node_2008.x_2008 - radius_2008, node_2008.y_2008 - radius_2008 - 4);
            }
        }

        private boolean isEdgeInPath_2008(int u_2008, int v_2008) {
            for (int i_2008 = 0; i_2008 < finalPath_2008.size() - 1; i_2008++) {
                int pU_2008 = finalPath_2008.get(i_2008);
                int pV_2008 = finalPath_2008.get(i_2008 + 1);
                if ((pU_2008 == u_2008 && pV_2008 == v_2008) || (pU_2008 == v_2008 && pV_2008 == u_2008)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args_2008) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PetaKampus_2511532008().setVisible(true);
            }
        });
    }
}