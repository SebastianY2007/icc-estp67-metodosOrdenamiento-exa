import controllers.BrandController;
import models.Brand;
import test.TestData;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Examen interciclo de Estructuras de Datos");
        System.out.println("====Configurar studente.env====");

        TestData testData = new TestData();

        Brand[] brands = testData.createBrands();
        BrandController brandController = new BrandController();

        System.out.println("Original");
        for (Brand b : brands) {
            System.out.println(b.getBrandName() + " - Años validos: " + b.getTotalValidYears());
        }

        brandController.sortSelectionDesc(brands);
        System.out.println("\nOrdenado por Selection Sort descendente:");
        for (Brand b : brands) {
            System.out.println(b.getBrandName() + " - Años validos: " + b.getTotalValidYears());
        }

        System.out.println("\nBuscar marca con 8 años válidos que se ordenaron de mayor a menor: ");
        Brand busqueda1 = brandController.binarySearchByValidYears(brands, 8, false);
        if (busqueda1 != null) {
            System.out.println("Encontrada: " + busqueda1.getBrandName() + ", Total de años validos: " + busqueda1.getTotalValidYears());
        }

        System.out.println("\nBuscar marca con 10 años válidos que se ordenaron de mayor a menor: ");
        Brand busqueda2 = brandController.binarySearchByValidYears(brands, 10, false);
        if (busqueda2 != null) {
            System.out.println("Encontrada: " + busqueda2.getBrandName() + ", Total de años validos: " + busqueda2.getTotalValidYears());
        }
    }

}
