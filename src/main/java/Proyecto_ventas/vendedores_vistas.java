/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto_ventas;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class vendedores_vistas {
    JPanel vendedores = new JPanel();
    JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();
    
    
    private void botones(){
    
        vendedores.setLayout(null);
        JButton crear = new JButton("Crear");
        crear.setBounds(500, 100, 130, 50);
       vendedores.add(crear);
        
        JButton carga = new JButton("Carga Masiva");
        carga.setBounds(670, 100, 130, 50);
        vendedores.add(carga);
        
        JButton actualizar = new JButton("Actualizar");
        actualizar.setBounds(500, 250, 130, 50);
        vendedores.add(actualizar);
        
        JButton eliminar = new JButton("Eliminar");
        eliminar.setBounds(670, 250, 130, 50);
        vendedores.add(eliminar);
        
        JButton exportar = new JButton("Exportar PDF");
        exportar.setBounds(500, 400, 300, 50);
        vendedores.add(exportar);
        
    
    
    }
    
    private void tabla(){
        
        String columnas []= {"Código","Nombre","Caja","Ventas","Genero"};
        Object filas [][]={{"2020","Arturo","800","1000","m"}};
        tabla = new JTable(filas,columnas);
        sp = new JScrollPane(tabla);
        sp.setBounds(10, 20, 430, 600);
        vendedores.add(sp);
        
    
    
    }
    
    public void ejecutar(){
    botones();
    tabla();
    }
    
}
