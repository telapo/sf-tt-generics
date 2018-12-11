package cocontravariance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxPreparer {
    public static void prepareTaxes(Taxable t){
    }

    public static void prepareBulkTaxes(Taxable[] ta) {
        System.out.println("Type of ta is " + ta.getClass().getName());
        for (Taxable t : ta) {
            prepareTaxes(t);
        }
//        ta[0] = new Corporation();
    }

    // covariance
    public static void prepareBulkTaxes(List<? extends Taxable> lt) {
        for (Taxable t : lt) {
            prepareTaxes(t);
        }
//        Taxable t = new Corporation();
//        lt.add(t);
    }

    // contravariance
    public static void collectIndividualClients(List<? super Individual> lt) {
        Individual t = new Individual();
        lt.add(t);
//        lt.add(new Corporation());
    }

    public static void main(String[] args) {
        Taxable [] ta = {new Corporation(), new Individual()};
        System.out.println("About to calculate bulk taxes for Taxable array");
        prepareBulkTaxes(ta);

        Individual [] ia = {new Individual(), new Individual()};
        System.out.println("About to calculate bulk taxes for Individual array");
        prepareBulkTaxes(ia);

        List<Taxable> lt = new ArrayList<>(Arrays.asList(ta));
        System.out.println("About to calculate bulk taxes for List<Taxable>");
        prepareBulkTaxes(lt);

        List<Individual> li = new ArrayList<>(Arrays.asList(ia));
        prepareBulkTaxes(li);
        collectIndividualClients(li);
        collectIndividualClients(lt);

    }
}
