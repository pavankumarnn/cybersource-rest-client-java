/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Ptsv2paymentsOrderInformationInvoiceDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class Ptsv2paymentsOrderInformationInvoiceDetails {
  @SerializedName("invoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("barcodeNumber")
  private String barcodeNumber = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("purchaseOrderDate")
  private String purchaseOrderDate = null;

  @SerializedName("purchaseContactName")
  private String purchaseContactName = null;

  @SerializedName("taxable")
  private Boolean taxable = null;

  @SerializedName("vatInvoiceReferenceNumber")
  private String vatInvoiceReferenceNumber = null;

  @SerializedName("commodityCode")
  private String commodityCode = null;

  @SerializedName("merchandiseCode")
  private BigDecimal merchandiseCode = null;

  @SerializedName("transactionAdviceAddendum")
  private List<Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> transactionAdviceAddendum = null;

  public Ptsv2paymentsOrderInformationInvoiceDetails invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice Number.
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "Invoice Number.")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails barcodeNumber(String barcodeNumber) {
    this.barcodeNumber = barcodeNumber;
    return this;
  }

   /**
   * Barcode Number.
   * @return barcodeNumber
  **/
  @ApiModelProperty(value = "Barcode Number.")
  public String getBarcodeNumber() {
    return barcodeNumber;
  }

  public void setBarcodeNumber(String barcodeNumber) {
    this.barcodeNumber = barcodeNumber;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration Date.
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Expiration Date.")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Value used by your customer to identify the order. This value is typically a purchase order number. CyberSource recommends that you do not populate the field with all zeros or nines.  For processor-specific information, see the user_po field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(value = "Value used by your customer to identify the order. This value is typically a purchase order number. CyberSource recommends that you do not populate the field with all zeros or nines.  For processor-specific information, see the user_po field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails purchaseOrderDate(String purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
    return this;
  }

   /**
   * Date the order was processed. &#x60;Format: YYYY-MM-DD&#x60;.  For processor-specific information, see the purchaser_order_date field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return purchaseOrderDate
  **/
  @ApiModelProperty(value = "Date the order was processed. `Format: YYYY-MM-DD`.  For processor-specific information, see the purchaser_order_date field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getPurchaseOrderDate() {
    return purchaseOrderDate;
  }

  public void setPurchaseOrderDate(String purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails purchaseContactName(String purchaseContactName) {
    this.purchaseContactName = purchaseContactName;
    return this;
  }

   /**
   * The name of the individual or the company contacted for company authorized purchases.  For processor-specific information, see the authorized_contact_name field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return purchaseContactName
  **/
  @ApiModelProperty(value = "The name of the individual or the company contacted for company authorized purchases.  For processor-specific information, see the authorized_contact_name field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getPurchaseContactName() {
    return purchaseContactName;
  }

  public void setPurchaseContactName(String purchaseContactName) {
    this.purchaseContactName = purchaseContactName;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Flag that indicates whether an order is taxable. This value must be true if the sum of all _lineItems[].taxAmount_ values &gt; 0.  If you do not include any _lineItems[].taxAmount_ values in your request, CyberSource does not include _invoiceDetails.taxable_ in the data it sends to the processor.  For processor-specific information, see the tax_indicator field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return taxable
  **/
  @ApiModelProperty(value = "Flag that indicates whether an order is taxable. This value must be true if the sum of all _lineItems[].taxAmount_ values > 0.  If you do not include any _lineItems[].taxAmount_ values in your request, CyberSource does not include _invoiceDetails.taxable_ in the data it sends to the processor.  For processor-specific information, see the tax_indicator field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails vatInvoiceReferenceNumber(String vatInvoiceReferenceNumber) {
    this.vatInvoiceReferenceNumber = vatInvoiceReferenceNumber;
    return this;
  }

   /**
   * VAT invoice number associated with the transaction.  For processor-specific information, see the vat_invoice_ref_number field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return vatInvoiceReferenceNumber
  **/
  @ApiModelProperty(value = "VAT invoice number associated with the transaction.  For processor-specific information, see the vat_invoice_ref_number field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getVatInvoiceReferenceNumber() {
    return vatInvoiceReferenceNumber;
  }

  public void setVatInvoiceReferenceNumber(String vatInvoiceReferenceNumber) {
    this.vatInvoiceReferenceNumber = vatInvoiceReferenceNumber;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * International description code of the overall order’s goods or services or the Categorizes purchases for VAT reporting. Contact your acquirer for a list of codes.  For processor-specific information, see the summary_commodity_code field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return commodityCode
  **/
  @ApiModelProperty(value = "International description code of the overall order’s goods or services or the Categorizes purchases for VAT reporting. Contact your acquirer for a list of codes.  For processor-specific information, see the summary_commodity_code field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getCommodityCode() {
    return commodityCode;
  }

  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails merchandiseCode(BigDecimal merchandiseCode) {
    this.merchandiseCode = merchandiseCode;
    return this;
  }

   /**
   * Identifier for the merchandise. Possible value:   - 1000: Gift card  This field is supported only for **American Express Direct**. 
   * @return merchandiseCode
  **/
  @ApiModelProperty(value = "Identifier for the merchandise. Possible value:   - 1000: Gift card  This field is supported only for **American Express Direct**. ")
  public BigDecimal getMerchandiseCode() {
    return merchandiseCode;
  }

  public void setMerchandiseCode(BigDecimal merchandiseCode) {
    this.merchandiseCode = merchandiseCode;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails transactionAdviceAddendum(List<Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> transactionAdviceAddendum) {
    this.transactionAdviceAddendum = transactionAdviceAddendum;
    return this;
  }

  public Ptsv2paymentsOrderInformationInvoiceDetails addTransactionAdviceAddendumItem(Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum transactionAdviceAddendumItem) {
    if (this.transactionAdviceAddendum == null) {
      this.transactionAdviceAddendum = new ArrayList<Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum>();
    }
    this.transactionAdviceAddendum.add(transactionAdviceAddendumItem);
    return this;
  }

   /**
   * Get transactionAdviceAddendum
   * @return transactionAdviceAddendum
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> getTransactionAdviceAddendum() {
    return transactionAdviceAddendum;
  }

  public void setTransactionAdviceAddendum(List<Ptsv2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> transactionAdviceAddendum) {
    this.transactionAdviceAddendum = transactionAdviceAddendum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationInvoiceDetails ptsv2paymentsOrderInformationInvoiceDetails = (Ptsv2paymentsOrderInformationInvoiceDetails) o;
    return Objects.equals(this.invoiceNumber, ptsv2paymentsOrderInformationInvoiceDetails.invoiceNumber) &&
        Objects.equals(this.barcodeNumber, ptsv2paymentsOrderInformationInvoiceDetails.barcodeNumber) &&
        Objects.equals(this.expirationDate, ptsv2paymentsOrderInformationInvoiceDetails.expirationDate) &&
        Objects.equals(this.purchaseOrderNumber, ptsv2paymentsOrderInformationInvoiceDetails.purchaseOrderNumber) &&
        Objects.equals(this.purchaseOrderDate, ptsv2paymentsOrderInformationInvoiceDetails.purchaseOrderDate) &&
        Objects.equals(this.purchaseContactName, ptsv2paymentsOrderInformationInvoiceDetails.purchaseContactName) &&
        Objects.equals(this.taxable, ptsv2paymentsOrderInformationInvoiceDetails.taxable) &&
        Objects.equals(this.vatInvoiceReferenceNumber, ptsv2paymentsOrderInformationInvoiceDetails.vatInvoiceReferenceNumber) &&
        Objects.equals(this.commodityCode, ptsv2paymentsOrderInformationInvoiceDetails.commodityCode) &&
        Objects.equals(this.merchandiseCode, ptsv2paymentsOrderInformationInvoiceDetails.merchandiseCode) &&
        Objects.equals(this.transactionAdviceAddendum, ptsv2paymentsOrderInformationInvoiceDetails.transactionAdviceAddendum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, barcodeNumber, expirationDate, purchaseOrderNumber, purchaseOrderDate, purchaseContactName, taxable, vatInvoiceReferenceNumber, commodityCode, merchandiseCode, transactionAdviceAddendum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationInvoiceDetails {\n");
    
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    barcodeNumber: ").append(toIndentedString(barcodeNumber)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    purchaseOrderDate: ").append(toIndentedString(purchaseOrderDate)).append("\n");
    sb.append("    purchaseContactName: ").append(toIndentedString(purchaseContactName)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
    sb.append("    vatInvoiceReferenceNumber: ").append(toIndentedString(vatInvoiceReferenceNumber)).append("\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    merchandiseCode: ").append(toIndentedString(merchandiseCode)).append("\n");
    sb.append("    transactionAdviceAddendum: ").append(toIndentedString(transactionAdviceAddendum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
