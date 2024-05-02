//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta(4238748,"Jorge", 1.64,21,65);
        Atleta atleta2 = new Atleta(4812301,"Pedro",1.70,19,85);
        Atleta atleta3 = new Atleta(4100659,"Clara",1.89,28,74);
        Atleta atleta4 = new Atleta(3481273,"Sam",2.04,41,164);
        Atleta atleta5 = new Atleta(4001234,"Maria",1.76,24,70);
        Persona ciudadano = new Persona(4359123,"Carlos");

        EquipoNacional equipoAM = new EquipoNacional("Equipo de Artes Marciales");

        equipoAM.agregarAtletaAlEquipo(atleta1);
        equipoAM.agregarAtletaAlEquipo(atleta2);
        equipoAM.agregarAtletaAlEquipo(atleta3);
        equipoAM.agregarAtletaAlEquipo(atleta4);
        equipoAM.agregarAtletaAlEquipo(atleta5);

        equipoAM.statusEquipo(equipoAM);

        Sede sede = new Sede(4,"4 de Noviembre", "4 pm");

        Prueba prueba1 = new Prueba("Torneo regional",1111);
        prueba1.addAtleta(atleta2);
        prueba1.addAtleta(atleta3);
        prueba1.addAtleta(atleta4);
        prueba1.addAtleta(atleta5);

        Prueba prueba2 = new Prueba("Torneo Provincial", 2222);
        prueba2.addAtleta(atleta3);
        prueba2.addAtleta(atleta4);
        prueba2.addAtleta(atleta5);

        Prueba prueba3 = new Prueba("Torneo Nacional", 3333);
        prueba3.addAtleta(atleta3);
        prueba3.addAtleta(atleta4);

        Instalacion instalacion = new Instalacion("Artes marciales", "Lujan de Cuyo","Centro Maracuya","Registrado Nacionalmente");
        instalacion.addPrueba(prueba1);
        instalacion.addPrueba(prueba2);
        instalacion.addPrueba(prueba3);
        instalacion.tercerAtletaSegundaPrueba();


    }
}