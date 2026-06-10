package com.proyecto2.Herencia;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("L001", "El Quijote", true, 1000);
        libro1.mostrarFichaTecnica();
        libro1.getNumeroPaginas();

        Recurso libro2 = new Libro("L002", "Cien Años de Soledad", false, 300);
        libro2.mostrarFichaTecnica();

        Recurso recurso1= new Libro(null, null, false, 300);
        recurso1.mostrarFichaTecnica();

        Revista revista1 = new Revista("R001", "National Geographic", true, "Mensual");
        revista1.mostrarFichaTecnica();

        Historieta historieta1 = new Historieta("H001", "Spider-Man", true, "Semanal", "Acción");
        historieta1.getInfo();

        System.out.println("\n");

        Recurso.imprimir();


        Recurso[] biblioteca = new Recurso[3];
        biblioteca[0] = libro1;
        biblioteca[1] = libro2;
        biblioteca[2] = revista1;

        for(int i = 0; i < biblioteca.length; i++) {
            biblioteca[i].mostrarFichaTecnica();
        }



    }
}
