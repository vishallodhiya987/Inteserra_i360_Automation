package trfa;

import org.junit.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import TRAFA_BASE_PKG.TRFABASE;


@Listeners(Listn.class) 
public class TRFA {

    TRFABASE log = new TRFABASE();

    @Test(priority =0)
    public void setup1() throws InterruptedException {
        log.setup();
    }

    @Test(priority = 1, description = "TRFA Module", groups = { "Login", "Carrier" }, enabled = true)
    public void carrier_module() {
        log.trfa_Carriers();
    }

    @Test(priority = 2, description = "add Carrier", groups = "Carrier", enabled = true)
    public void addcarr() throws InterruptedException {
        log.add_carrier();
    }

    @Test(priority = 3, description = "Edit Carrier", groups = "Carrier", enabled = true)
    public void editcar() throws InterruptedException {
        log.edit_carrier();
    }

    @Test(priority = 4, description = "Delete Carrier", groups = "Carrier", enabled = true)
    public void deletecar() throws InterruptedException {
        log.delete_carrier();
    }

    @Test(priority = 5, description = "Category sub module", groups = "Category", enabled = true)
    public void category1() throws InterruptedException {
        log.addcategory();
    }

 
}
