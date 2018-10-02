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
import Model.V2paymentsProcessingInformationAuthorizationOptionsInitiator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V2paymentsProcessingInformationAuthorizationOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2paymentsProcessingInformationAuthorizationOptions {
  @SerializedName("authType")
  private String authType = null;

  @SerializedName("verbalAuthCode")
  private String verbalAuthCode = null;

  @SerializedName("verbalAuthTransactionId")
  private String verbalAuthTransactionId = null;

  @SerializedName("authIndicator")
  private String authIndicator = null;

  @SerializedName("partialAuthIndicator")
  private Boolean partialAuthIndicator = null;

  @SerializedName("balanceInquiry")
  private Boolean balanceInquiry = null;

  @SerializedName("ignoreAvsResult")
  private Boolean ignoreAvsResult = false;

  /**
   * Gets or Sets declineAvsFlags
   */
  @JsonAdapter(DeclineAvsFlagsEnum.Adapter.class)
  public enum DeclineAvsFlagsEnum {
    D("D"),
    
    A("A"),
    
    V("V"),
    
    S("S"),
    
    N("N"),
    
    O("O");

    private String value;

    DeclineAvsFlagsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeclineAvsFlagsEnum fromValue(String text) {
      for (DeclineAvsFlagsEnum b : DeclineAvsFlagsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeclineAvsFlagsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeclineAvsFlagsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeclineAvsFlagsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeclineAvsFlagsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("declineAvsFlags")
  private List<DeclineAvsFlagsEnum> declineAvsFlags = null;

  @SerializedName("ignoreCvResult")
  private Boolean ignoreCvResult = false;

  @SerializedName("initiator")
  private V2paymentsProcessingInformationAuthorizationOptionsInitiator initiator = null;

  public V2paymentsProcessingInformationAuthorizationOptions authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Authorization type. Possible values:   - **AUTOCAPTURE**: automatic capture.  - **STANDARDCAPTURE**: standard capture.  - **VERBAL**: forced capture. Include it in the payment request for a forced capture. Include it in the capture  request for a verbal payment.  For processor-specific information, see the auth_type field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return authType
  **/
  @ApiModelProperty(value = "Authorization type. Possible values:   - **AUTOCAPTURE**: automatic capture.  - **STANDARDCAPTURE**: standard capture.  - **VERBAL**: forced capture. Include it in the payment request for a forced capture. Include it in the capture  request for a verbal payment.  For processor-specific information, see the auth_type field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public V2paymentsProcessingInformationAuthorizationOptions verbalAuthCode(String verbalAuthCode) {
    this.verbalAuthCode = verbalAuthCode;
    return this;
  }

   /**
   * Authorization code.  **Forced Capture**  Use this field to send the authorization code you received from a payment that you authorized outside the CyberSource system.  **Verbal Authorization**  Use this field in CAPTURE API to send the verbally received authorization code.  For processor-specific information, see the auth_code field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return verbalAuthCode
  **/
  @ApiModelProperty(value = "Authorization code.  **Forced Capture**  Use this field to send the authorization code you received from a payment that you authorized outside the CyberSource system.  **Verbal Authorization**  Use this field in CAPTURE API to send the verbally received authorization code.  For processor-specific information, see the auth_code field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getVerbalAuthCode() {
    return verbalAuthCode;
  }

  public void setVerbalAuthCode(String verbalAuthCode) {
    this.verbalAuthCode = verbalAuthCode;
  }

  public V2paymentsProcessingInformationAuthorizationOptions verbalAuthTransactionId(String verbalAuthTransactionId) {
    this.verbalAuthTransactionId = verbalAuthTransactionId;
    return this;
  }

   /**
   * Transaction ID (TID).
   * @return verbalAuthTransactionId
  **/
  @ApiModelProperty(value = "Transaction ID (TID).")
  public String getVerbalAuthTransactionId() {
    return verbalAuthTransactionId;
  }

  public void setVerbalAuthTransactionId(String verbalAuthTransactionId) {
    this.verbalAuthTransactionId = verbalAuthTransactionId;
  }

  public V2paymentsProcessingInformationAuthorizationOptions authIndicator(String authIndicator) {
    this.authIndicator = authIndicator;
    return this;
  }

   /**
   * Flag that specifies the purpose of the authorization.  Possible values:  - **0**: Preauthorization  - **1**: Final authorization  For processor-specific information, see the auth_indicator field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return authIndicator
  **/
  @ApiModelProperty(value = "Flag that specifies the purpose of the authorization.  Possible values:  - **0**: Preauthorization  - **1**: Final authorization  For processor-specific information, see the auth_indicator field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAuthIndicator() {
    return authIndicator;
  }

  public void setAuthIndicator(String authIndicator) {
    this.authIndicator = authIndicator;
  }

  public V2paymentsProcessingInformationAuthorizationOptions partialAuthIndicator(Boolean partialAuthIndicator) {
    this.partialAuthIndicator = partialAuthIndicator;
    return this;
  }

   /**
   * Flag that indicates whether the transaction is enabled for partial authorization or not. When your request includes this field, this value overrides the information in your CyberSource account.  For processor-specific information, see the auth_partial_auth_indicator field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return partialAuthIndicator
  **/
  @ApiModelProperty(value = "Flag that indicates whether the transaction is enabled for partial authorization or not. When your request includes this field, this value overrides the information in your CyberSource account.  For processor-specific information, see the auth_partial_auth_indicator field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public Boolean getPartialAuthIndicator() {
    return partialAuthIndicator;
  }

  public void setPartialAuthIndicator(Boolean partialAuthIndicator) {
    this.partialAuthIndicator = partialAuthIndicator;
  }

  public V2paymentsProcessingInformationAuthorizationOptions balanceInquiry(Boolean balanceInquiry) {
    this.balanceInquiry = balanceInquiry;
    return this;
  }

   /**
   * Flag that indicates whether to return balance information.
   * @return balanceInquiry
  **/
  @ApiModelProperty(value = "Flag that indicates whether to return balance information.")
  public Boolean getBalanceInquiry() {
    return balanceInquiry;
  }

  public void setBalanceInquiry(Boolean balanceInquiry) {
    this.balanceInquiry = balanceInquiry;
  }

  public V2paymentsProcessingInformationAuthorizationOptions ignoreAvsResult(Boolean ignoreAvsResult) {
    this.ignoreAvsResult = ignoreAvsResult;
    return this;
  }

   /**
   * Flag that indicates whether to allow the capture service to run even when the payment receives an AVS decline. 
   * @return ignoreAvsResult
  **/
  @ApiModelProperty(value = "Flag that indicates whether to allow the capture service to run even when the payment receives an AVS decline. ")
  public Boolean getIgnoreAvsResult() {
    return ignoreAvsResult;
  }

  public void setIgnoreAvsResult(Boolean ignoreAvsResult) {
    this.ignoreAvsResult = ignoreAvsResult;
  }

  public V2paymentsProcessingInformationAuthorizationOptions declineAvsFlags(List<DeclineAvsFlagsEnum> declineAvsFlags) {
    this.declineAvsFlags = declineAvsFlags;
    return this;
  }

  public V2paymentsProcessingInformationAuthorizationOptions addDeclineAvsFlagsItem(DeclineAvsFlagsEnum declineAvsFlagsItem) {
    if (this.declineAvsFlags == null) {
      this.declineAvsFlags = new ArrayList<DeclineAvsFlagsEnum>();
    }
    this.declineAvsFlags.add(declineAvsFlagsItem);
    return this;
  }

   /**
   * An array of AVS flags that cause the reply flag to be returned.  &#x60;Important&#x60; To receive declines for the AVS code N, include the value N in the array. 
   * @return declineAvsFlags
  **/
  @ApiModelProperty(value = "An array of AVS flags that cause the reply flag to be returned.  `Important` To receive declines for the AVS code N, include the value N in the array. ")
  public List<DeclineAvsFlagsEnum> getDeclineAvsFlags() {
    return declineAvsFlags;
  }

  public void setDeclineAvsFlags(List<DeclineAvsFlagsEnum> declineAvsFlags) {
    this.declineAvsFlags = declineAvsFlags;
  }

  public V2paymentsProcessingInformationAuthorizationOptions ignoreCvResult(Boolean ignoreCvResult) {
    this.ignoreCvResult = ignoreCvResult;
    return this;
  }

   /**
   * Flag that indicates whether to allow the capture service to run even when the payment receives a CVN decline. 
   * @return ignoreCvResult
  **/
  @ApiModelProperty(value = "Flag that indicates whether to allow the capture service to run even when the payment receives a CVN decline. ")
  public Boolean getIgnoreCvResult() {
    return ignoreCvResult;
  }

  public void setIgnoreCvResult(Boolean ignoreCvResult) {
    this.ignoreCvResult = ignoreCvResult;
  }

  public V2paymentsProcessingInformationAuthorizationOptions initiator(V2paymentsProcessingInformationAuthorizationOptionsInitiator initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Get initiator
   * @return initiator
  **/
  @ApiModelProperty(value = "")
  public V2paymentsProcessingInformationAuthorizationOptionsInitiator getInitiator() {
    return initiator;
  }

  public void setInitiator(V2paymentsProcessingInformationAuthorizationOptionsInitiator initiator) {
    this.initiator = initiator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2paymentsProcessingInformationAuthorizationOptions v2paymentsProcessingInformationAuthorizationOptions = (V2paymentsProcessingInformationAuthorizationOptions) o;
    return Objects.equals(this.authType, v2paymentsProcessingInformationAuthorizationOptions.authType) &&
        Objects.equals(this.verbalAuthCode, v2paymentsProcessingInformationAuthorizationOptions.verbalAuthCode) &&
        Objects.equals(this.verbalAuthTransactionId, v2paymentsProcessingInformationAuthorizationOptions.verbalAuthTransactionId) &&
        Objects.equals(this.authIndicator, v2paymentsProcessingInformationAuthorizationOptions.authIndicator) &&
        Objects.equals(this.partialAuthIndicator, v2paymentsProcessingInformationAuthorizationOptions.partialAuthIndicator) &&
        Objects.equals(this.balanceInquiry, v2paymentsProcessingInformationAuthorizationOptions.balanceInquiry) &&
        Objects.equals(this.ignoreAvsResult, v2paymentsProcessingInformationAuthorizationOptions.ignoreAvsResult) &&
        Objects.equals(this.declineAvsFlags, v2paymentsProcessingInformationAuthorizationOptions.declineAvsFlags) &&
        Objects.equals(this.ignoreCvResult, v2paymentsProcessingInformationAuthorizationOptions.ignoreCvResult) &&
        Objects.equals(this.initiator, v2paymentsProcessingInformationAuthorizationOptions.initiator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, verbalAuthCode, verbalAuthTransactionId, authIndicator, partialAuthIndicator, balanceInquiry, ignoreAvsResult, declineAvsFlags, ignoreCvResult, initiator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2paymentsProcessingInformationAuthorizationOptions {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    verbalAuthCode: ").append(toIndentedString(verbalAuthCode)).append("\n");
    sb.append("    verbalAuthTransactionId: ").append(toIndentedString(verbalAuthTransactionId)).append("\n");
    sb.append("    authIndicator: ").append(toIndentedString(authIndicator)).append("\n");
    sb.append("    partialAuthIndicator: ").append(toIndentedString(partialAuthIndicator)).append("\n");
    sb.append("    balanceInquiry: ").append(toIndentedString(balanceInquiry)).append("\n");
    sb.append("    ignoreAvsResult: ").append(toIndentedString(ignoreAvsResult)).append("\n");
    sb.append("    declineAvsFlags: ").append(toIndentedString(declineAvsFlags)).append("\n");
    sb.append("    ignoreCvResult: ").append(toIndentedString(ignoreCvResult)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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
