import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Tester {

    private HashMap<String, Persona> miMapa;


    public Tester() {
        miMapa = new HashMap<>();
    }

    public void llenarMapa() {
        miMapa.put("429836F5K", new Persona("Kurt", "Cobain"));
        miMapa.put("75682155R", new Persona("Lesley", "Gore"));
        miMapa.put("51256987J", new Persona("Marilyn", "Manson"));
        miMapa.put("54863145F", new Persona("Michael", "Jackson"));
        miMapa.put("26549753P", new Persona("Miles", "Davis"));
        miMapa.put("42659365G", new Persona("Elvis", "Presley"));

    }

    public void printKeys() {
        System.out.println("Keys de mi HashMap: ");
        Iterator<String> miIterator = miMapa.keySet().iterator();

        while (miIterator.hasNext()) {
            System.out.println(miIterator.next());
        }
    }

    public void printValues() {
        System.out.println("Values de mi HashMap: ");
        Iterator<String> miIterator = miMapa.keySet().iterator();

        while (miIterator.hasNext()) {
            String key = miIterator.next();
            Persona p = miMapa.get(key);
            System.out.println(p.toString());
        }
    }

    public void printEntries() {
        System.out.println("Entries de mi HashMap: ");
        Iterator<String> miIterator = miMapa.keySet().iterator();

        while (miIterator.hasNext()) {
            String key = miIterator.next();
            Persona p = miMapa.get(key);
            System.out.println("Clave: " + key + "\n" + p.toString());
        }
    }

    //Devuelve null si el valor no existe
    public void obtenerValor(String key) {
        System.out.println(miMapa.get(key));

    }
    //Añade valores a mi HashMap. En caso de key existente sobrescribe la pre-existente
    public void aniadirEntrada(String NIF, Persona p) {
        miMapa.put(NIF, p);
    }

    //Generamos un TreeMap a partir del HashMap y sus entradas estarán ordenadas por key.
    public void generarTreeMap() {
        TreeMap<String, Persona> miTreeMap = new TreeMap<>(miMapa);

        for (Map.Entry<String, Persona> entradas : miTreeMap.entrySet()) {
            System.out.println(entradas);
        }
    }
}

