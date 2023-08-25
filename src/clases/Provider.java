package clases;

/**
 * Esta es la clase provvedor que me sirvenoaskdjoasjkdoiasjdo
 *
 * @author ucr
 */

public class Provider {

    private boolean status;
    private boolean typeProvider;

    private Contact contac;

    private Invoice[] invoice;

    private String dateClousure;
    private String dateDelivery;
    private String idProvider;
    private String nameProvider;

    /**
     * Para inicializar los atributos de clase // false = persona fisica || true
     * = persona juridica
     *
     */
    public Provider() {
        this.status = false;
        this.typeProvider = false;
        this.contac = null;
        this.invoice = null;
        this.dateClousure = "No definido";
        this.dateDelivery = "No definido";
        this.idProvider = "No definido";
        this.nameProvider = "No definido";
    }

    /**
     * 
     * @param status 
     * @param typeProvider 
     * @param contac 
     * @param invoice 
     * @param dateClousure
     * @param dateDelivery
     * @param idProvider
     * @param nameProvider 
     */
    public Provider(boolean status, boolean typeProvider, Contact contac, Invoice[] invoice, String dateClousure, String dateDelivery, String idProvider, String nameProvider) {
        this.status = status;
        this.typeProvider = typeProvider; //
        this.contac = contac;
        this.invoice = invoice;
        this.dateClousure = dateClousure;
        this.dateDelivery = dateDelivery;
        this.idProvider = idProvider;
        this.nameProvider = nameProvider;
    }

    /**
     * 
     * @return status define si el proveedor esta activo
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the typeProvider
     */
    public boolean isTypeProvider() {
        return typeProvider;
    }

    /**
     * @param typeProvider the typeProvider to set
     */
    public void setTypeProvider(boolean typeProvider) {
        this.typeProvider = typeProvider;
    }

    /**
     * @return the contac
     */
    public Contact getContac() {
        return contac;
    }

    /**
     * @param contac the contac to set
     */
    public void setContac(Contact contac) {
        this.contac = contac;
    }

    /**
     * @return the invoice
     */
    public Invoice[] getInvoice() {
        return invoice;
    }

    /**
     * @param invoice the invoice to set
     */
    public void setInvoice(Invoice[] invoice) {
        this.invoice = invoice;
    }

    /**
     * @return the dateClousure
     */
    public String getDateClousure() {
        return dateClousure;
    }

    /**
     * @param dateClousure the dateClousure to set
     */
    public void setDateClousure(String dateClousure) {
        this.dateClousure = dateClousure;
    }

    /**
     * @return the dateDelivery
     */
    public String getDateDelivery() {
        return dateDelivery;
    }

    /**
     * @param dateDelivery the dateDelivery to set
     */
    public void setDateDelivery(String dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    /**
     * @return the idProvider
     */
    public String getIdProvider() {
        return idProvider;
    }

    /**
     * @param idProvider the idProvider to set
     */
    public void setIdProvider(String idProvider) {
        this.idProvider = idProvider;
    }

    /**
     * @return the nameProvider
     */
    public String getNameProvider() {
        return nameProvider;
    }

    /**
     * @param nameProvider the nameProvider to set
     */
    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }
    
    

}
