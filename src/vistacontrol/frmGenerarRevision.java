/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistacontrol;

import accesodatos.clsEntregableRevisionDAO;
import accesodatos.clsProyectoEntregableDAO;
import conexion.clsConexionDS;
import global.clsTablasRender.miRender;
import java.awt.Dimension;
import java.awt.Window;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import transferenciadatos.clsEntregableRevisionDTO;



/**
 *
 * @author Kevin
 */
public class frmGenerarRevision extends javax.swing.JDialog {

    String proyectoId;
    Connection conexion;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
     ArrayList<String> arrayRevisionId = new ArrayList();
    /**
     * Creates new form frmArchivarProyecto
     * @param parentWindow
     */
    public frmGenerarRevision(Window parentWindow) {
        super(parentWindow);
        initComponents();
        this.setLocationRelativeTo(parentWindow);
        txtFechaRevision.setDateFormat(dateFormat);    
        spnCuerpo.getVerticalScrollBar().setUnitIncrement(16);
        this.setPreferredSize(new Dimension(1025, 721));
        conexion = clsConexionDS.AbrirConexion();        
        CargarEnlaceEquipo();
        CargarTablaRevisionComboPredecesor();
        clsConexionDS.CerrarConexion(conexion);
        
        System.out.println("entregable: "+frmAdministrarProyecto.entregableSeleccionadoId);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlRevisionTitulo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlCuerpo = new javax.swing.JPanel();
        pnlRevisionSubtitulo = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        spnCuerpo = new javax.swing.JScrollPane();
        pnlRevisionCuerpo1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreRevision = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMotivoRevision = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbPredecesor = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtEnlaceEquipo = new javax.swing.JTextField();
        txtFechaRevision = new com.alee.extended.date.WebDateField();
        jLabel13 = new javax.swing.JLabel();
        txtEnlaceRevision = new javax.swing.JTextField();
        btnAbrirEnlace = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRevision = new javax.swing.JTable();
        btnGenerarRevision = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Archivar Proyecto");
        setPreferredSize(new java.awt.Dimension(1025, 721));

        pnlRevisionTitulo.setBackground(new java.awt.Color(178, 223, 219));
        pnlRevisionTitulo.setMinimumSize(new java.awt.Dimension(650, 100));
        pnlRevisionTitulo.setPreferredSize(new java.awt.Dimension(650, 100));

        jLabel4.setFont(new java.awt.Font("Droid Sans", 1, 22)); // NOI18N
        jLabel4.setText("GENERAR REVISION");

        javax.swing.GroupLayout pnlRevisionTituloLayout = new javax.swing.GroupLayout(pnlRevisionTitulo);
        pnlRevisionTitulo.setLayout(pnlRevisionTituloLayout);
        pnlRevisionTituloLayout.setHorizontalGroup(
            pnlRevisionTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRevisionTituloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(781, Short.MAX_VALUE))
        );
        pnlRevisionTituloLayout.setVerticalGroup(
            pnlRevisionTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRevisionTituloLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(20, 20, 20))
        );

        getContentPane().add(pnlRevisionTitulo, java.awt.BorderLayout.PAGE_START);

        pnlCuerpo.setLayout(new java.awt.BorderLayout());

        pnlRevisionSubtitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlRevisionSubtitulo.setMinimumSize(new java.awt.Dimension(650, 110));
        pnlRevisionSubtitulo.setPreferredSize(new java.awt.Dimension(650, 110));
        pnlRevisionSubtitulo.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMinimumSize(new java.awt.Dimension(0, 10));
        jPanel13.setPreferredSize(new java.awt.Dimension(0, 10));
        jPanel13.setLayout(new java.awt.BorderLayout());
        jPanel13.add(jSeparator4, java.awt.BorderLayout.CENTER);

        pnlRevisionSubtitulo.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMinimumSize(new java.awt.Dimension(0, 100));

        jLabel14.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel14.setText("Datos de la revisión");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel14)
                .addContainerGap(819, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(20, 20, 20))
        );

        pnlRevisionSubtitulo.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        pnlCuerpo.add(pnlRevisionSubtitulo, java.awt.BorderLayout.PAGE_START);

        spnCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        spnCuerpo.setBorder(null);
        spnCuerpo.setPreferredSize(new java.awt.Dimension(800, 700));

        pnlRevisionCuerpo1.setBackground(new java.awt.Color(255, 255, 255));
        pnlRevisionCuerpo1.setMinimumSize(new java.awt.Dimension(692, 100));
        pnlRevisionCuerpo1.setPreferredSize(new java.awt.Dimension(790, 713));
        pnlRevisionCuerpo1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de la revisión.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(24, 35, 10, 0);
        pnlRevisionCuerpo1.add(jLabel2, gridBagConstraints);

        txtNombreRevision.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        txtNombreRevision.setMinimumSize(new java.awt.Dimension(10, 30));
        txtNombreRevision.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 35, 0, 0);
        pnlRevisionCuerpo1.add(txtNombreRevision, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de la revisión.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(24, 24, 10, 0);
        pnlRevisionCuerpo1.add(jLabel5, gridBagConstraints);

        jScrollPane2.setMinimumSize(new java.awt.Dimension(264, 100));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(264, 120));

        txtMotivoRevision.setColumns(20);
        txtMotivoRevision.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        txtMotivoRevision.setRows(5);
        txtMotivoRevision.setMinimumSize(new java.awt.Dimension(264, 50));
        txtMotivoRevision.setPreferredSize(new java.awt.Dimension(264, 80));
        jScrollPane2.setViewportView(txtMotivoRevision);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 35, 0, 0);
        pnlRevisionCuerpo1.add(jScrollPane2, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel10.setText("Motivo de la revisión.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(24, 35, 0, 0);
        pnlRevisionCuerpo1.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel11.setText("Predecesor.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(24, 35, 10, 0);
        pnlRevisionCuerpo1.add(jLabel11, gridBagConstraints);

        cmbPredecesor.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        cmbPredecesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 35, 0, 0);
        pnlRevisionCuerpo1.add(cmbPredecesor, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel12.setText("Enlace trabajado por el  equipo.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(24, 24, 10, 24);
        pnlRevisionCuerpo1.add(jLabel12, gridBagConstraints);

        txtEnlaceEquipo.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        txtEnlaceEquipo.setForeground(new java.awt.Color(0, 0, 255));
        txtEnlaceEquipo.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtEnlaceEquipo.setEnabled(false);
        txtEnlaceEquipo.setMinimumSize(new java.awt.Dimension(10, 30));
        txtEnlaceEquipo.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 24);
        pnlRevisionCuerpo1.add(txtEnlaceEquipo, gridBagConstraints);

        txtFechaRevision.setText("Seleccione una fecha");
        txtFechaRevision.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 24);
        pnlRevisionCuerpo1.add(txtFechaRevision, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel13.setText("Enlace de la revisión.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(24, 35, 0, 0);
        pnlRevisionCuerpo1.add(jLabel13, gridBagConstraints);

        txtEnlaceRevision.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        txtEnlaceRevision.setForeground(new java.awt.Color(0, 0, 255));
        txtEnlaceRevision.setMinimumSize(new java.awt.Dimension(10, 30));
        txtEnlaceRevision.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 35, 0, 0);
        pnlRevisionCuerpo1.add(txtEnlaceRevision, gridBagConstraints);

        btnAbrirEnlace.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        btnAbrirEnlace.setText("Abrir Enlace");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 35);
        pnlRevisionCuerpo1.add(btnAbrirEnlace, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel15.setText("Revisiones del entregable.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(24, 35, 0, 0);
        pnlRevisionCuerpo1.add(jLabel15, gridBagConstraints);

        jScrollPane3.setMinimumSize(new java.awt.Dimension(650, 150));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(650, 150));

        tblRevision.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        tblRevision.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblRevision);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 35, 35, 24);
        pnlRevisionCuerpo1.add(jScrollPane3, gridBagConstraints);

        btnGenerarRevision.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        btnGenerarRevision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/x24/settings.png"))); // NOI18N
        btnGenerarRevision.setText("GENERAR REVISION");
        btnGenerarRevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRevisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 24, 35);
        pnlRevisionCuerpo1.add(btnGenerarRevision, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlRevisionCuerpo1.add(jSeparator1, gridBagConstraints);

        spnCuerpo.setViewportView(pnlRevisionCuerpo1);

        pnlCuerpo.add(spnCuerpo, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCuerpo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarRevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarRevisionActionPerformed
       
        String fecha;
        clsEntregableRevisionDAO entregableRevisionDAO;
        clsEntregableRevisionDTO entregableRevisionDTO;
        
        fecha = dateFormat.format(txtFechaRevision.getDate());
        entregableRevisionDAO = new clsEntregableRevisionDAO();
        if(arrayRevisionId.isEmpty() == false){
            entregableRevisionDTO = new clsEntregableRevisionDTO (
                            "",
                            txtNombreRevision.getText(),
                            fecha,
                            txtMotivoRevision.getText(),
                            txtEnlaceRevision.getText(),
                            frmAdministrarProyecto.entregableSeleccionadoId,
                            "",
                            arrayRevisionId.get(cmbPredecesor.getSelectedIndex()),
                            ""
                        );
        }
        else
        {
            entregableRevisionDTO = new clsEntregableRevisionDTO (
                            "",
                            txtNombreRevision.getText(),
                            fecha,
                            txtMotivoRevision.getText(),
                            txtEnlaceRevision.getText(),
                            frmAdministrarProyecto.entregableSeleccionadoId,
                            "",
                            "1",
                            ""
                        );
        }
        
        conexion = clsConexionDS.AbrirConexion();
        entregableRevisionDAO.CrearEntregableRevision(entregableRevisionDTO, conexion);
        CargarTablaRevisionComboPredecesor();
        clsConexionDS.CerrarConexion(conexion);
        
    }//GEN-LAST:event_btnGenerarRevisionActionPerformed

    private void CargarEnlaceEquipo() {
        
        clsProyectoEntregableDAO proyectoEntregableDAO;
        String enlace;
        
        proyectoEntregableDAO = new clsProyectoEntregableDAO();
        
        try 
        {
            enlace = proyectoEntregableDAO.SeleccionarProyectoEntregableEnlace (
                    frmPrincipal.proyectoId,
                    frmAdministrarProyecto.entregableSeleccionadoId,
                    conexion
            );
            txtEnlaceEquipo.setText(enlace);
        }
        catch (Exception ex) 
        {
            Logger.getLogger(frmGenerarRevision.class.getName()).log(Level.SEVERE, null, ex);
        }                
        
    }
    
    private void CargarTablaRevisionComboPredecesor() {
        
        String[] titulos = {"revision id", "entregable id", "revision id hijo",
                            "Revision", "Fecha", "Motivo", "Enlace", "Predecesor"};
        String[] fila;
        clsEntregableRevisionDAO entregableRevisionDAO;
        ArrayList<clsEntregableRevisionDTO> arrayEntregableRevision;
        DefaultTableModel dtmRevision;
        DefaultComboBoxModel dcbmPredecesor;
        
        fila = new String [8];
        arrayRevisionId.clear();
        dtmRevision = new DefaultTableModel(null,titulos) {        
            @Override
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}               
        };
        dcbmPredecesor = new DefaultComboBoxModel();
        entregableRevisionDAO = new clsEntregableRevisionDAO();
        arrayEntregableRevision = entregableRevisionDAO.SeleccionarEntregableRevision (
                            frmAdministrarProyecto.entregableSeleccionadoId,
                            conexion
                        );
        dcbmPredecesor.removeAllElements();
        for(clsEntregableRevisionDTO er : arrayEntregableRevision)
        {
            fila[0] = er.getRevision_id();
            fila[1] = er.getEntregable_id();
            fila[2] = er.getRevision_id_hijo();
            fila[3] = er.getRevision_nombre();
            fila[4] = er.getRevision_fecha();
            fila[5] = er.getRevision_descripcion();
            fila[6] = er.getRevision_enlace();
            fila[7] = er.getRevision_nombre_hijo();
            dtmRevision.addRow(fila);
            dcbmPredecesor.addElement(fila[3]);
            arrayRevisionId.add(fila[0]);
        }
        
        tblRevision.setModel(dtmRevision);
        tblRevision.removeColumn(tblRevision.getColumnModel().getColumn(0));
        tblRevision.removeColumn(tblRevision.getColumnModel().getColumn(0));
        tblRevision.removeColumn(tblRevision.getColumnModel().getColumn(0));
        TableCellRenderer tcr =  tblRevision.getTableHeader().getDefaultRenderer();
        miRender mr = new miRender(tcr);
        mr.getTableCellRendererComponent(tblRevision, fila, true, true, WIDTH, 0);
        mr.getTableCellRendererComponent(tblRevision, fila, true, true, WIDTH, 1);
        
        cmbPredecesor.setModel(dcbmPredecesor);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirEnlace;
    private javax.swing.JButton btnGenerarRevision;
    private javax.swing.JComboBox<String> cmbPredecesor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel pnlCuerpo;
    private javax.swing.JPanel pnlRevisionCuerpo1;
    private javax.swing.JPanel pnlRevisionSubtitulo;
    private javax.swing.JPanel pnlRevisionTitulo;
    private javax.swing.JScrollPane spnCuerpo;
    private javax.swing.JTable tblRevision;
    private javax.swing.JTextField txtEnlaceEquipo;
    private javax.swing.JTextField txtEnlaceRevision;
    private com.alee.extended.date.WebDateField txtFechaRevision;
    private javax.swing.JTextArea txtMotivoRevision;
    private javax.swing.JTextField txtNombreRevision;
    // End of variables declaration//GEN-END:variables
}