
package Controladores;

import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NodoControler implements ActionListener {
    
    frmPrincipal VistaPrincipal;
    frmNodos VistaNodos;
    Lista NuevaLista;

    public NodoControler(frmPrincipal VistaPrincipal, frmNodos VistaNodos, Lista NuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaNodos = VistaNodos;
        this.NuevaLista = NuevaLista;
        
        this.VistaPrincipal.btnAgregarNodo.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnAgregarNodo){
            this.VistaNodos.btnAgregar.addActionListener(this);
            
            this.VistaNodos.setLocationRelativeTo(null);
            this.VistaNodos.setVisible(true);
        }
        if(e.getSource() == this.VistaNodos.btnAgregar){
            this.NuevaLista.Agregar(Integer.parseInt(this.VistaNodos.txtDato.getText()));
            this.VistaNodos.txtLista.setText(this.NuevaLista.Listar());
        }
            
       
    }
    
    


    
    
    

}
