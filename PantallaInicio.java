/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_pokemon_g5;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class PantallaInicio extends javax.swing.JFrame {

    public PantallaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);//Centrar

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        BotonInicioJuego = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(27, 145, 201));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonInicioJuego.setBackground(new java.awt.Color(255, 255, 0));
        BotonInicioJuego.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        BotonInicioJuego.setForeground(new java.awt.Color(51, 153, 255));
        BotonInicioJuego.setText("Iniciar Batalla");
        BotonInicioJuego.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonInicioJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioJuegoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonInicioJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 420, 61));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\proyectoPokemon\\src\\main\\java\\com\\mycompany\\proyectopokemon\\imagenes\\Pantalla Pokemon.png")); // NOI18N
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, 612));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInicioJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioJuegoActionPerformed
        this.setVisible(false);

        String audioFilePath = "C:/Users/kevin/OneDrive/Documentos/Ing Sistemas/Cursos actuales/Estructura de Datos/ProyectoFinal_G5/src/main/java/sonidos/MusicaPelea.wav";

        try {
            // Obtener el archivo de audio
            File audioFile = new File(audioFilePath);
            // Crear un flujo de entrada de audio
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
            // Obtener un Clip de audio
            Clip clip = AudioSystem.getClip();
            // Abrir el flujo de audio en el Clip
            clip.open(audioInputStream);
            //bajamos el volumen a la mitad 
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            // Obtener los valores mínimo y máximo del control de volumen
            float minVolume = gainControl.getMinimum();
            float maxVolume = gainControl.getMaximum();
            // Calcular el valor para reducir el volumen a la mitad
            float targetVolume = (minVolume + maxVolume) / 2.0f;
            // Establecer el valor de volumen a la mitad
            gainControl.setValue(targetVolume);
            clip.start();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
        new BatallaPokemon().setVisible(true);

    }//GEN-LAST:event_BotonInicioJuegoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaInicio().setVisible(true);
                String audioFilePath = "C:/Users/kevin/OneDrive/Documentos/Ing Sistemas/Cursos actuales/Estructura de Datos/ProyectoFinal_G5/src/main/java/sonidos/InicioJuego.wav";

                try {
                    // Obtener el archivo de audio
                    File audioFile = new File(audioFilePath);
                    // Crear un flujo de entrada de audio
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
                    // Obtener un Clip de audio
                    Clip clip = AudioSystem.getClip();
                    // Abrir el flujo de audio en el Clip
                    clip.open(audioInputStream);
                    // Reproducir el audio
                    clip.start();
                    // Esperar hasta que termine la reproducción
                    /*while (!clip.isRunning()) {
                        Thread.sleep(1);
                    }
                    while (clip.isRunning()) {
                        Thread.sleep(1);
                    }
                    // Cerrar el Clip y el flujo de audio
                    clip.close();
                    audioInputStream.close();*/
                } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
                    e.printStackTrace();
                }
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicioJuego;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
