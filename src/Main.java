public class Main {
    public static void main(String[] args) {

        Tester miTester = new Tester();

        miTester.llenarMapa();
        miTester.printKeys();
        miTester.printValues();
        miTester.printEntries();
        miTester.obtenerValor("51256987J");
        miTester.aniadirEntrada("Y6894116H", new Persona("Gabriel", "Osorio"));
        miTester.aniadirEntrada("26549753P", new Persona("Marcel", "Moise"));
        miTester.printEntries();
        miTester.generarTreeMap();

    }
}