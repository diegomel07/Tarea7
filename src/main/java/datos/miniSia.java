package datos;

import java.util.*;

public class miniSia {

    public static Date getRandomDate(){
        Date d1 = new Date(650000000000L), d2 = new Date();

        Random rand = new Random();

        return new Date();
    }
    
    public static TreeMap<String, String> mostrarDatos(){

        
        Estudiante est_ejemplo = new Estudiante("Juan", "Perez", "jperez1", "123", 01, 5.0, getRandomDate());
        Estudiante est_ejemplo2 = new Estudiante("Camila", "Camacho", "ccamacho2", "456", 02, 4.1, getRandomDate());
        
        String diasSema[] = {"lunes", "miercoles", "viernes"};
        String vecDia[] = {"mañana", "tarde"};
        Grupo gru_ejemplo = new Grupo(01,diasSema, vecDia);
        
        String diasSema2[] = {"lunes", "martes", "miercoles"};
        String vecDia2[] = {"tarde"};
        Grupo gru_ejemplo2 = new Grupo(02,diasSema2, vecDia2);
        
        long id = 1;
        Materia mat_ejemplo = new Materia("Progamación Orientada a Objetos", id);
        
        long id2 = 2;
        Materia mat_ejemplo2 = new Materia("Fisica Cuantica", id2);
        
        Notas nota_ejemplo = new Notas(3.1);
        Notas nota_ejemplo2 = new Notas(3.8);
        
        Profesor profe_ejemplo = new Profesor("Osvaldo", "De las Rosas", "odelasrosas", "123", 01, getRandomDate());
        Profesor profe_ejemplo2 = new Profesor("Plinio", "Del Carmen", "pCarmen", "456", 02, getRandomDate());
        
        Programa progr_ejemplo = new Programa("Ingeniería de Sistemas y Computación", 01);
        Programa progr_ejemplo2 = new Programa("Matematicas", 02);
        
        RecibosPago recibo_ejemplo = new RecibosPago(01, 50000, "2022-2", getRandomDate(), getRandomDate());
        RecibosPago recibo_ejemplo2 = new RecibosPago(02, 2800000, "2022-1", getRandomDate(), getRandomDate());
        


        
        // ejemplo
        ArrayList<Grupo> grupos_est = new ArrayList<Grupo>();
        grupos_est.add(gru_ejemplo);
        grupos_est.add(gru_ejemplo2);
        est_ejemplo.setGrupos(grupos_est);
        est_ejemplo2.setGrupos(grupos_est);
        ArrayList<Programa> progr_est = new ArrayList<Programa>();
        progr_est.add(progr_ejemplo);
        progr_est.add(progr_ejemplo2);
        est_ejemplo.setPrograma(progr_est);
        est_ejemplo2.setPrograma(progr_est);
                                
                                
                        


                    
        // ejemplo
        gru_ejemplo.setRepresenta(mat_ejemplo);
        gru_ejemplo2.setRepresenta(mat_ejemplo2);
        gru_ejemplo.setEnseniadoPor(profe_ejemplo);
        gru_ejemplo2.setEnseniadoPor(profe_ejemplo2);
        ArrayList<Estudiante> estudiante_gru = new ArrayList<Estudiante>();
        estudiante_gru.add(est_ejemplo);
        estudiante_gru.add(est_ejemplo2);
        gru_ejemplo.setAsistentes(estudiante_gru);
        gru_ejemplo2.setAsistentes(estudiante_gru);
        ArrayList<Notas> notas_gru = new ArrayList<Notas>();
        notas_gru.add(nota_ejemplo);
        notas_gru.add(nota_ejemplo2);
        gru_ejemplo.setNotas(notas_gru);
        gru_ejemplo2.setNotas(notas_gru);
                                
                      
        mat_ejemplo.setPrograma(progr_ejemplo);
        mat_ejemplo2.setPrograma(progr_ejemplo2);
                                
                        
                        
        ArrayList<Grupo> grupos_profe = new ArrayList<Grupo>();
        grupos_profe.add(gru_ejemplo);
        grupos_profe.add(gru_ejemplo2);
        profe_ejemplo.setGrupos(grupos_profe);
        profe_ejemplo2.setGrupos(grupos_profe);

        // ejemplo
        ArrayList<Materia> mate = new ArrayList<Materia>();
        mate.add(mat_ejemplo);
        mate.add(mat_ejemplo2);
        progr_ejemplo.setMaterias(mate);
        progr_ejemplo2.setMaterias(mate);
        ArrayList<Estudiante> est_progr = new ArrayList<Estudiante>();
        est_progr.add(est_ejemplo);
        est_progr.add(est_ejemplo2);
        progr_ejemplo.setEstudiantes(est_progr);
        progr_ejemplo2.setEstudiantes(est_progr);
                                
                        
        recibo_ejemplo.setEstudiante(est_ejemplo);
        recibo_ejemplo2.setEstudiante(est_ejemplo2);
                                
        
        // Diccionario con todos los datos
        TreeMap<String, String> datos = new TreeMap<>();
        datos.put("Estudiante", est_ejemplo.toString()+ "\n\n" + est_ejemplo2.toString());
        datos.put("Grupo", gru_ejemplo.toString() + "\n\n" + gru_ejemplo2.toString());
        datos.put("Materia", mat_ejemplo.toString() + "\n\n" + mat_ejemplo2.toString());
        datos.put("Notas", nota_ejemplo.toString() + "\n\n" + nota_ejemplo2.toString());
        datos.put("Profesor", profe_ejemplo.toString() + "\n\n" + profe_ejemplo2.toString());
        datos.put("Programa", progr_ejemplo.toString() + "\n\n" + progr_ejemplo2.toString());
        datos.put("Recibos", recibo_ejemplo.toString() + "\n\n" + recibo_ejemplo2.toString());
        
        return datos;
        
    }

    

    

}
