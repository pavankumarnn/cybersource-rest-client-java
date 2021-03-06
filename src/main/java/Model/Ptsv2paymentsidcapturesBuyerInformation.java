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
 * Ptsv2paymentsidcapturesBuyerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class Ptsv2paymentsidcapturesBuyerInformation {
  @SerializedName("merchantCustomerId")
  private String merchantCustomerId = null;

  @SerializedName("vatRegistrationNumber")
  private String vatRegistrationNumber = null;

  public Ptsv2paymentsidcapturesBuyerInformation merchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
    return this;
  }

   /**
   * Your identifier for the customer.  For processor-specific information, see the customer_account_id field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return merchantCustomerId
  **/
  @ApiModelProperty(value = "Your identifier for the customer.  For processor-specific information, see the customer_account_id field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getMerchantCustomerId() {
    return merchantCustomerId;
  }

  public void setMerchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }

  public Ptsv2paymentsidcapturesBuyerInformation vatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
    return this;
  }

   /**
   * Customer’s government-assigned tax identification number.  For processor-specific information, see the purchaser_vat_registration_number field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return vatRegistrationNumber
  **/
  @ApiModelProperty(value = "Customer’s government-assigned tax identification number.  For processor-specific information, see the purchaser_vat_registration_number field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getVatRegistrationNumber() {
    return vatRegistrationNumber;
  }

  public void setVatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidcapturesBuyerInformation ptsv2paymentsidcapturesBuyerInformation = (Ptsv2paymentsidcapturesBuyerInformation) o;
    return Objects.equals(this.merchantCustomerId, ptsv2paymentsidcapturesBuyerInformation.merchantCustomerId) &&
        Objects.equals(this.vatRegistrationNumber, ptsv2paymentsidcapturesBuyerInformation.vatRegistrationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantCustomerId, vatRegistrationNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidcapturesBuyerInformation {\n");
    
    sb.append("    merchantCustomerId: ").append(toIndentedString(merchantCustomerId)).append("\n");
    sb.append("    vatRegistrationNumber: ").append(toIndentedString(vatRegistrationNumber)).append("\n");
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

