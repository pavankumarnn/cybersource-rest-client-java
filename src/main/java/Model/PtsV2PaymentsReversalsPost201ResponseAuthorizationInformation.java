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
 * PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation {
  @SerializedName("approvalCode")
  private String approvalCode = null;

  @SerializedName("reasonCode")
  private String reasonCode = null;

  public PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * The authorization code returned by the processor.
   * @return approvalCode
  **/
  @ApiModelProperty(value = "The authorization code returned by the processor.")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Reply flag for the original transaction.
   * @return reasonCode
  **/
  @ApiModelProperty(value = "Reply flag for the original transaction.")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation ptsV2PaymentsReversalsPost201ResponseAuthorizationInformation = (PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation) o;
    return Objects.equals(this.approvalCode, ptsV2PaymentsReversalsPost201ResponseAuthorizationInformation.approvalCode) &&
        Objects.equals(this.reasonCode, ptsV2PaymentsReversalsPost201ResponseAuthorizationInformation.reasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, reasonCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsReversalsPost201ResponseAuthorizationInformation {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
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

