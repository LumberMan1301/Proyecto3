package proyecto3.interfaz.Grafo1;

import java.awt.Dimension;
import java.awt.Toolkit;
import proyecto3.EstructurasDeDatos.Lista.ListaSimple;
import proyecto3.EstructurasDeDatos.grafos.Pintar;
import proyecto3.EstructurasDeDatos.grafos.Grafo;
import proyecto3.EstructurasDeDatos.matriz.Matriz;
import proyecto3.manejadorArchivos.manejadorArchivos;

/**
 * Clase para visualizar el grafo de las dependencias,
 * muestra enumeradas las dependencias y el nombre del jar
 * en una lista en pantalla para que en el grafo los nodos
 * solo tenga los numeros que coinciden con los nombres
 * @author karla
 */
public class Grafo1 extends javax.swing.JFrame {
    
    /**
     * Creates new form Grafo1
     */
    public Grafo1() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        int ScreenWidth = d.width;
        int ScreenHeight = d.height;
        this.setSize(ScreenWidth, ScreenHeight);
        this.setLocationByPlatform(true);
        this.setLocationRelativeTo(this);
        initComponents();
        
    }
    private ListaSimple<Integer> coordX = new ListaSimple<Integer>();
    private ListaSimple<Integer> coordY = new ListaSimple<Integer>();
    private int tope=manejadorArchivos.getMatriz().size();// lleva el # de nodos creado 
    int n=0,nn=0,id,id2;// permite controlar que se halla dando click sobre un nodo
    
    
    Pintar pintar = new Pintar();
    Grafo grafo = new Grafo(tope);    
    /**
     * Pinta en pantalla los nodos, y las aristas que los unen
     * @param tope para ver cuantos nodos se deben crear
     * @param grafo para obtener las coordenadas de donde se van
     * a graficar los nodos en pantalla
     */
    public static void R_repaint(int tope, Grafo grafo){//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if(grafo.getmAdyacencia(j, k) == 1)
                     Pintar.pintarLinea(jPanel1.getGraphics(),grafo.getCordeX(j),grafo.getCordeY(j), grafo.getCordeX(k), grafo.getCordeY(k));
            }
        }
        for (int j = 0; j < tope; j++) 
            Pintar.pintarCirculo(jPanel1.getGraphics(), grafo.getCordeX(j),grafo.getCordeY(j),String.valueOf(grafo.getNombre(j)));
                
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NumDepe = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        NumDepe.setColumns(20);
        NumDepe.setRows(5);
        jScrollPane1.setViewportView(NumDepe);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Mostrar grafo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Información del grafo");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.paint(jPanel1.getGraphics()); 
     
        Matriz matriz = manejadorArchivos.getMatriz();
        
        int coordy = 65;
        int coordx = 70;
        int i = 0;
        int l = 1;
        int m = 0;
        while(l<7){
            if(i%2 == 0){
                if(m == 5){
                    coordx = 70;
                    coordy += 210;
                    l++;
                    m = 0;
                }else{
                    
                    grafo.getCordeX().add(coordx);
                    grafo.getCordeY().add(coordy+50);
                    coordx += 130;
                    m += 1;
                }    
            }
            else{
                grafo.cordeY.add(coordy-50);
                    
            }
            i++;         
        }
        
         
        for(int j = 0; j < tope; j ++){
            grafo.nombre.add(j);
        }
        for (int j = 0; j < tope; j++) {            
            for (int k = 0; k < tope; k++) {
                grafo.setmAdyacencia(j,k, matriz.get(j, k));
            }
        }        
            
       R_repaint(tope,grafo);
       llenarNumDepe();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea NumDepe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
    public void llenarNumDepe(){
        
            NumDepe.append("0: "+manejadorArchivos.getNombre()+"\n");
            for (int i = 1; i < tope; i++){
                NumDepe.append(String.valueOf(i)+": "+manejadorArchivos.getAux().get(i-1).toString()+"\n");
            }
        
    }
   
}
