/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package reservasdepistas.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class DialogoReservas extends javax.swing.JDialog {

    /**
     * Creates new form DialogoReservas
     */
    
    public DialogoReservas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroupTipoReserva = new javax.swing.ButtonGroup();
        panelPrincipalreservas = new javax.swing.JPanel();
        panelReservas = new javax.swing.JPanel();
        labelDatosCliente = new javax.swing.JLabel();
        panelDatosCliente = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        cBoxPais = new javax.swing.JComboBox<>();
        textFieldPrefijo = new javax.swing.JTextField();
        textFieldTelefono = new javax.swing.JTextField();
        labelReserva = new javax.swing.JLabel();
        panelDatosReseva = new javax.swing.JPanel();
        labelFechaReserva = new javax.swing.JLabel();
        labelHoraReserva = new javax.swing.JLabel();
        labelTipoReserva = new javax.swing.JLabel();
        separatorFechaHoraTipo = new javax.swing.JSeparator();
        labelNivelPartido = new javax.swing.JLabel();
        labelPartidoAbierto = new javax.swing.JLabel();
        labelPlazasLibres = new javax.swing.JLabel();
        spinnerFechaReserva = new javax.swing.JSpinner();
        comboBoxHoraReserva = new javax.swing.JComboBox<>();
        rButtonClase = new javax.swing.JRadioButton();
        rButtonLiga = new javax.swing.JRadioButton();
        rButtonAmistoso = new javax.swing.JRadioButton();
        cBoxNivelPartido = new javax.swing.JComboBox<>();
        cBoxPartidoAbierto = new javax.swing.JCheckBox();
        sliderPlazasLibres = new javax.swing.JSlider();
        buttonVolver = new javax.swing.JButton();
        buttonEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva reserva de pista");
        setResizable(false);

        labelDatosCliente.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        labelDatosCliente.setText("Datos del cliente");
        labelDatosCliente.setToolTipText("Introduce el nombre y el teléfono");

        panelDatosCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panelDatosCliente.setToolTipText("En este panel debes indicar el nombre y el número de telefono");

        labelNombre.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        labelNombre.setText("Nombre:");
        labelNombre.setToolTipText("Introduce el nombre");

        labelTelefono.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        labelTelefono.setText("Telefono:");
        labelTelefono.setToolTipText("Selecciona el pais e introduce el número de telefono");

        textNombre.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        textNombre.setToolTipText("Introduce tu nombre y tus apellidos");

        cBoxPais.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        cBoxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ES", "PT", "FR", "IT", "AD", "DE", "BE", "GI", "GB", " " }));
        cBoxPais.setToolTipText("Elige el pais");
        cBoxPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxPaisActionPerformed(evt);
            }
        });

        textFieldPrefijo.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        textFieldPrefijo.setText("+34");
        textFieldPrefijo.setToolTipText("Aquí aparecerea el prefijo del pais al seleccionar el pais");
        textFieldPrefijo.setEnabled(false);

        textFieldTelefono.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        textFieldTelefono.setToolTipText("Introduce aquí el número de telefono");

        javax.swing.GroupLayout panelDatosClienteLayout = new javax.swing.GroupLayout(panelDatosCliente);
        panelDatosCliente.setLayout(panelDatosClienteLayout);
        panelDatosClienteLayout.setHorizontalGroup(
            panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombre)
                    .addComponent(labelTelefono))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addComponent(cBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosClienteLayout.setVerticalGroup(
            panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono)
                    .addComponent(cBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        labelTelefono.getAccessibleContext().setAccessibleParent(labelTelefono);
        textNombre.getAccessibleContext().setAccessibleName("textNombre");
        textNombre.getAccessibleContext().setAccessibleParent(textNombre);
        cBoxPais.getAccessibleContext().setAccessibleName("cBoxPais");
        textFieldPrefijo.getAccessibleContext().setAccessibleName("textFieldPrefijo");
        textFieldPrefijo.getAccessibleContext().setAccessibleParent(textFieldPrefijo);
        textFieldTelefono.getAccessibleContext().setAccessibleName("textFieldTelefono");
        textFieldTelefono.getAccessibleContext().setAccessibleParent(textFieldTelefono);

        labelReserva.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        labelReserva.setText("Datos de la reserva");
        labelReserva.setToolTipText("Introduce los datos de la reserva que queires realizar");

        panelDatosReseva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panelDatosReseva.setToolTipText("En este panel debes indicar los datos de la reserva");

        labelFechaReserva.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        labelFechaReserva.setText("Fecha de la reserva:");
        labelFechaReserva.setToolTipText("Fecha para la desea realizar la reserva. No puede ser anterior al día en que se realiza la reserva. La hora mostrada en este campo indica la hora en la que realizamos la reserva.");

        labelHoraReserva.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        labelHoraReserva.setText("Hora de reserva:");
        labelHoraReserva.setToolTipText("Hora a la que queire reservar la pista. Debe de elegir entre 17:00h, 18:30h, 20:00h o 21:30h ");

        labelTipoReserva.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        labelTipoReserva.setText("Tipo de reserva:");
        labelTipoReserva.setToolTipText("Tipo de reserva que desea realizar. Debe elegir entre Clase, Liga o Amistoso");

        separatorFechaHoraTipo.setToolTipText("Separador fecha, hora y tipo de reserva");
        separatorFechaHoraTipo.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N

        labelNivelPartido.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        labelNivelPartido.setText("Nivel de partido amistoso:");
        labelNivelPartido.setToolTipText("Nivel de partido. Debe elegir entre Iniciación, Medio, Medio-alto o Alto");

        labelPartidoAbierto.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        labelPartidoAbierto.setText("Partido abierto:");
        labelPartidoAbierto.setToolTipText("Si elige partido amistoso, pude marcar si desea completar el partido con jugadores que se apunten por la web.");

        labelPlazasLibres.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        labelPlazasLibres.setText("Plazas libres:");
        labelPlazasLibres.setToolTipText("Si ha marcado Partido abierto, se deberá indicar el número de plazas libres en el partido (entre 1 y 3 plazas).\n");

        spinnerFechaReserva.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        spinnerFechaReserva.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1698012216961L), new java.util.Date(1735599780000L), java.util.Calendar.DAY_OF_MONTH));
        spinnerFechaReserva.setToolTipText("Fecha de la reserva y hora en la que se realiza");

        comboBoxHoraReserva.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        comboBoxHoraReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "17:00", "18:30", "20:00", "21:30" }));
        comboBoxHoraReserva.setToolTipText("Elige entre las horas disponibles");

        bGroupTipoReserva.add(rButtonClase);
        rButtonClase.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        rButtonClase.setText("Clase");
        rButtonClase.setToolTipText("Reserva de partido de clase clase");
        rButtonClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonClaseActionPerformed(evt);
            }
        });

        bGroupTipoReserva.add(rButtonLiga);
        rButtonLiga.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        rButtonLiga.setText("Liga");
        rButtonLiga.setToolTipText("Reserva de partido de liga");
        rButtonLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonLigaActionPerformed(evt);
            }
        });

        bGroupTipoReserva.add(rButtonAmistoso);
        rButtonAmistoso.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        rButtonAmistoso.setText("Amistoso");
        rButtonAmistoso.setToolTipText("Tipo de partido amistoso. Puede elegir posteriormente el nivel del partido, si es abierto y las plazas libres en caso de serlo.");
        rButtonAmistoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonAmistosoActionPerformed(evt);
            }
        });

        cBoxNivelPartido.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        cBoxNivelPartido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iniciación", "Medio", "Medio-alto", "Alto" }));
        cBoxNivelPartido.setToolTipText("Elige el tiepo de nivel de partido amisto");

        cBoxPartidoAbierto.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        cBoxPartidoAbierto.setText("(los jugadores se pueden apuntar por la web)");
        cBoxPartidoAbierto.setToolTipText("Marca esta casilla si quieres que el partido se complete con jugadores que se apunten por la web");
        cBoxPartidoAbierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxPartidoAbiertoActionPerformed(evt);
            }
        });

        sliderPlazasLibres.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        sliderPlazasLibres.setMajorTickSpacing(1);
        sliderPlazasLibres.setMaximum(3);
        sliderPlazasLibres.setMinimum(1);
        sliderPlazasLibres.setPaintLabels(true);
        sliderPlazasLibres.setPaintTicks(true);
        sliderPlazasLibres.setToolTipText("Seleccion el número de plazas libres del partido");
        sliderPlazasLibres.setValue(1);

        javax.swing.GroupLayout panelDatosResevaLayout = new javax.swing.GroupLayout(panelDatosReseva);
        panelDatosReseva.setLayout(panelDatosResevaLayout);
        panelDatosResevaLayout.setHorizontalGroup(
            panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosResevaLayout.createSequentialGroup()
                .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosResevaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(separatorFechaHoraTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosResevaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPlazasLibres)
                            .addComponent(labelPartidoAbierto)
                            .addComponent(labelNivelPartido))
                        .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosResevaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cBoxPartidoAbierto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelDatosResevaLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(sliderPlazasLibres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosResevaLayout.createSequentialGroup()
                .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosResevaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cBoxNivelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosResevaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTipoReserva)
                            .addComponent(labelHoraReserva)
                            .addComponent(labelFechaReserva))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rButtonClase)
                        .addGap(31, 31, 31)
                        .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosResevaLayout.createSequentialGroup()
                                .addComponent(rButtonLiga)
                                .addGap(36, 36, 36)
                                .addComponent(rButtonAmistoso))
                            .addComponent(spinnerFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxHoraReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        panelDatosResevaLayout.setVerticalGroup(
            panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosResevaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechaReserva)
                    .addComponent(spinnerFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHoraReserva)
                    .addComponent(comboBoxHoraReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoReserva)
                    .addComponent(rButtonClase)
                    .addComponent(rButtonLiga)
                    .addComponent(rButtonAmistoso))
                .addGap(18, 18, 18)
                .addComponent(separatorFechaHoraTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivelPartido)
                    .addComponent(cBoxNivelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPartidoAbierto)
                    .addComponent(cBoxPartidoAbierto))
                .addGap(18, 18, 18)
                .addGroup(panelDatosResevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderPlazasLibres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosResevaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelPlazasLibres)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        labelFechaReserva.getAccessibleContext().setAccessibleParent(labelFechaReserva);
        labelHoraReserva.getAccessibleContext().setAccessibleDescription("");
        labelHoraReserva.getAccessibleContext().setAccessibleParent(labelHoraReserva);
        labelTipoReserva.getAccessibleContext().setAccessibleParent(labelTipoReserva);
        separatorFechaHoraTipo.getAccessibleContext().setAccessibleName("separatorFechaHoraTipo");
        separatorFechaHoraTipo.getAccessibleContext().setAccessibleParent(separatorFechaHoraTipo);
        labelPartidoAbierto.getAccessibleContext().setAccessibleParent(labelPartidoAbierto);
        labelPlazasLibres.getAccessibleContext().setAccessibleParent(labelPlazasLibres);
        spinnerFechaReserva.getAccessibleContext().setAccessibleName("spinnerFechaReserva");
        spinnerFechaReserva.getAccessibleContext().setAccessibleParent(spinnerFechaReserva);
        comboBoxHoraReserva.getAccessibleContext().setAccessibleName("comboBoxHorareserva");
        cBoxNivelPartido.getAccessibleContext().setAccessibleName("cBoxNivelPartido");
        cBoxNivelPartido.getAccessibleContext().setAccessibleParent(cBoxNivelPartido);
        cBoxPartidoAbierto.getAccessibleContext().setAccessibleName("cBoxPartidoAmistoso");
        sliderPlazasLibres.getAccessibleContext().setAccessibleName("sliderPlazasLibres");

        javax.swing.GroupLayout panelReservasLayout = new javax.swing.GroupLayout(panelReservas);
        panelReservas.setLayout(panelReservasLayout);
        panelReservasLayout.setHorizontalGroup(
            panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatosReseva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelReservasLayout.createSequentialGroup()
                        .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelReserva)
                            .addComponent(labelDatosCliente))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelReservasLayout.setVerticalGroup(
            panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReservasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelDatosCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatosReseva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelDatosCliente.getAccessibleContext().setAccessibleParent(labelDatosCliente);
        panelDatosCliente.getAccessibleContext().setAccessibleName("panelDatosCliente");
        panelDatosCliente.getAccessibleContext().setAccessibleDescription("");
        panelDatosCliente.getAccessibleContext().setAccessibleParent(panelDatosCliente);
        labelReserva.getAccessibleContext().setAccessibleParent(labelReserva);

        buttonVolver.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        buttonVolver.setText("VOLVER");
        buttonVolver.setToolTipText("Haz clic aquí para volver a la pantalla principal");
        buttonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVolverMouseClicked(evt);
            }
        });

        buttonEnviar.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        buttonEnviar.setText("ENVIAR");
        buttonEnviar.setToolTipText("Pulsa para grabar la reserva con los daton introducidos");
        buttonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalreservasLayout = new javax.swing.GroupLayout(panelPrincipalreservas);
        panelPrincipalreservas.setLayout(panelPrincipalreservasLayout);
        panelPrincipalreservasLayout.setHorizontalGroup(
            panelPrincipalreservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalreservasLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(buttonVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEnviar)
                .addGap(65, 65, 65))
        );
        panelPrincipalreservasLayout.setVerticalGroup(
            panelPrincipalreservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalreservasLayout.createSequentialGroup()
                .addComponent(panelReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalreservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVolver)
                    .addComponent(buttonEnviar))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        panelReservas.getAccessibleContext().setAccessibleName("panelReservas");
        panelReservas.getAccessibleContext().setAccessibleParent(panelReservas);
        buttonVolver.getAccessibleContext().setAccessibleParent(buttonVolver);
        buttonEnviar.getAccessibleContext().setAccessibleParent(buttonEnviar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipalreservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipalreservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPrincipalreservas.getAccessibleContext().setAccessibleName("panelPrincipalReservas");
        panelPrincipalreservas.getAccessibleContext().setAccessibleDescription("");
        panelPrincipalreservas.getAccessibleContext().setAccessibleParent(panelPrincipalreservas);

        getAccessibleContext().setAccessibleName("dialogoReservas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBoxPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxPaisActionPerformed
        if (cBoxPais.getSelectedItem().equals("ES")){
            textFieldPrefijo.setText("+34");
        }else if (cBoxPais.getSelectedItem().equals("PT")){
            textFieldPrefijo.setText("+351");
        }else if (cBoxPais.getSelectedItem().equals("FR")){
            textFieldPrefijo.setText("+33");
        }else if (cBoxPais.getSelectedItem().equals("IT")){
            textFieldPrefijo.setText("+39");
        }else if (cBoxPais.getSelectedItem().equals("AD")){
            textFieldPrefijo.setText("+376");
        }else if (cBoxPais.getSelectedItem().equals("DE")){
            textFieldPrefijo.setText("+49");
        }else if (cBoxPais.getSelectedItem().equals("BE")){
            textFieldPrefijo.setText("+32");
        }else if (cBoxPais.getSelectedItem().equals("GI")){
            textFieldPrefijo.setText("+350");
        }else if (cBoxPais.getSelectedItem().equals("GB")){
            textFieldPrefijo.setText("+44");
        }
    }//GEN-LAST:event_cBoxPaisActionPerformed

    private void rButtonLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonLigaActionPerformed
        if (rButtonLiga.isSelected()){
            cBoxPartidoAbierto.setEnabled(false);
            cBoxNivelPartido.setEnabled(false);
            sliderPlazasLibres.setEnabled(false);
        }else{
            cBoxPartidoAbierto.setEnabled(true);
            cBoxNivelPartido.setEnabled(true);
            sliderPlazasLibres.setEnabled(true);
        }
    }//GEN-LAST:event_rButtonLigaActionPerformed

    private void rButtonAmistosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonAmistosoActionPerformed
        if (rButtonAmistoso.isSelected()){
            cBoxPartidoAbierto.setEnabled(true);
            cBoxNivelPartido.setEnabled(true);
        }else{
            cBoxPartidoAbierto.setEnabled(false);
            cBoxNivelPartido.setEnabled(false);
        }
    }//GEN-LAST:event_rButtonAmistosoActionPerformed

    private void cBoxPartidoAbiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxPartidoAbiertoActionPerformed
        
        if(cBoxPartidoAbierto.isSelected()){
            sliderPlazasLibres.setEnabled(true);
        }else{
            sliderPlazasLibres.setEnabled(false);
        }
    }//GEN-LAST:event_cBoxPartidoAbiertoActionPerformed

    private void rButtonClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonClaseActionPerformed
        if (rButtonClase.isSelected()){
            cBoxPartidoAbierto.setEnabled(false);
            cBoxNivelPartido.setEnabled(false);
            sliderPlazasLibres.setEnabled(false);
        }else{
            cBoxPartidoAbierto.setEnabled(true);
            cBoxNivelPartido.setEnabled(true);
            sliderPlazasLibres.setEnabled(true);
        }
    }//GEN-LAST:event_rButtonClaseActionPerformed

    private void buttonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVolverMouseClicked
        //JOptionPane.showMessageDialog(rootPane, "¿Seguro que desa volver sin gaurdar la reserva?");
        //this.dispose();
        int option = JOptionPane.showConfirmDialog(rootPane,"¿Seguro que "
                + "quiere volver sin enviar la reserva?", "Confirmación de cierre",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(option == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_buttonVolverMouseClicked

    private void buttonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviarActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Su reserva ha sido generada");
        this.dispose();
    }//GEN-LAST:event_buttonEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGroupTipoReserva;
    private javax.swing.JButton buttonEnviar;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox<String> cBoxNivelPartido;
    private javax.swing.JComboBox<String> cBoxPais;
    private javax.swing.JCheckBox cBoxPartidoAbierto;
    private javax.swing.JComboBox<String> comboBoxHoraReserva;
    private javax.swing.JLabel labelDatosCliente;
    private javax.swing.JLabel labelFechaReserva;
    private javax.swing.JLabel labelHoraReserva;
    private javax.swing.JLabel labelNivelPartido;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPartidoAbierto;
    private javax.swing.JLabel labelPlazasLibres;
    private javax.swing.JLabel labelReserva;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTipoReserva;
    private javax.swing.JPanel panelDatosCliente;
    private javax.swing.JPanel panelDatosReseva;
    private javax.swing.JPanel panelPrincipalreservas;
    private javax.swing.JPanel panelReservas;
    private javax.swing.JRadioButton rButtonAmistoso;
    private javax.swing.JRadioButton rButtonClase;
    private javax.swing.JRadioButton rButtonLiga;
    private javax.swing.JSeparator separatorFechaHoraTipo;
    private javax.swing.JSlider sliderPlazasLibres;
    private javax.swing.JSpinner spinnerFechaReserva;
    private javax.swing.JTextField textFieldPrefijo;
    private javax.swing.JTextField textFieldTelefono;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables

    
}
