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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponseOrderInformationAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class TssV2TransactionsGet200ResponseOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("authorizedAmount")
  private String authorizedAmount = null;

  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Grand total for the order. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  * CTV, FDCCompass, Paymentech (&lt;&#x3D; 12)  For processor-specific information, see the grand_total_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Grand total for the order. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  * CTV, FDCCompass, Paymentech (<= 12)  For processor-specific information, see the grand_total_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character ISO Standard Currency Codes.  For an authorization reversal or a capture, you must use the same currency that you used in your request for Payment API. 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used for the order. Use the three-character ISO Standard Currency Codes.  For an authorization reversal or a capture, you must use the same currency that you used in your request for Payment API. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax amount for all the items in the order.  For processor-specific information, see the total_tax_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax amount for all the items in the order.  For processor-specific information, see the total_tax_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails authorizedAmount(String authorizedAmount) {
    this.authorizedAmount = authorizedAmount;
    return this;
  }

   /**
   * Amount that was authorized. 
   * @return authorizedAmount
  **/
  @ApiModelProperty(value = "Amount that was authorized. ")
  public String getAuthorizedAmount() {
    return authorizedAmount;
  }

  public void setAuthorizedAmount(String authorizedAmount) {
    this.authorizedAmount = authorizedAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseOrderInformationAmountDetails tssV2TransactionsGet200ResponseOrderInformationAmountDetails = (TssV2TransactionsGet200ResponseOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, tssV2TransactionsGet200ResponseOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.currency, tssV2TransactionsGet200ResponseOrderInformationAmountDetails.currency) &&
        Objects.equals(this.taxAmount, tssV2TransactionsGet200ResponseOrderInformationAmountDetails.taxAmount) &&
        Objects.equals(this.authorizedAmount, tssV2TransactionsGet200ResponseOrderInformationAmountDetails.authorizedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency, taxAmount, authorizedAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseOrderInformationAmountDetails {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    authorizedAmount: ").append(toIndentedString(authorizedAmount)).append("\n");
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

