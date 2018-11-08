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
 * TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard {
  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("type")
  private String type = null;

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Last four digits of the cardholder’s account number. This field is returned only for tokenized transactions. You can use this value on the receipt that you give to the cardholder. 
   * @return suffix
  **/
  @ApiModelProperty(value = "Last four digits of the cardholder’s account number. This field is returned only for tokenized transactions. You can use this value on the receipt that you give to the cardholder. ")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return prefix
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover 
   * @return type
  **/
  @ApiModelProperty(value = "Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard tssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard = (TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard) o;
    return Objects.equals(this.suffix, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard.suffix) &&
        Objects.equals(this.prefix, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard.prefix) &&
        Objects.equals(this.type, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix, prefix, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationCard {\n");
    
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
