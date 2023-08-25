/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ucr
 */
public class Contact {

    private String phone;
    private String email;
    private String address;
    private String cellPhone;
    private String webPage;
    private String[] socialMedia;

    public Contact() {
        this.phone = "No definido";
        this.email = "No definido";
        this.address = "No definido";
        this.cellPhone = "No definido";
        this.webPage = "No definido";
        this.socialMedia = null;
    }

    public Contact(String phone, String email, String address,
            String cellPhone, String webPage, String[] socialMedia) {
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.cellPhone = cellPhone;
        this.webPage = webPage;
        this.socialMedia = socialMedia;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the cellPhone
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return the webPage
     */
    public String getWebPage() {
        return webPage;
    }

    /**
     * @param webPage the webPage to set
     */
    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    /**
     * @return the socialMedia
     */
    public String[] getSocialMedia() {
        return socialMedia;
    }

    /**
     * @param socialMedia the socialMedia to set
     */
    public void setSocialMedia(String[] socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public String toString() {
        return "Contact{" + "phone=" + phone + ", email=" + email + ", address=" 
                + address + ", cellPhone=" + cellPhone + ", webPage=" + webPage 
                + ", socialMedia=" + socialMedia + '}';
    }
    
    

}
