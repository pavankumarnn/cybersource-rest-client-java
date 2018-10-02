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
import Model.InstrumentidentifiersBankAccount;
import Model.InstrumentidentifiersCard;
import Model.InstrumentidentifiersLinks;
import Model.InstrumentidentifiersMetadata;
import Model.InstrumentidentifiersProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentinstrumentsInstrumentIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class PaymentinstrumentsInstrumentIdentifier {
  @SerializedName("_links")
  private InstrumentidentifiersLinks links = null;

  /**
   * Describes type of token. For example: customer, paymentInstrument or instrumentIdentifier.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    INSTRUMENTIDENTIFIER("instrumentIdentifier");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ObjectEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("object")
  private ObjectEnum object = null;

  /**
   * Current state of the token.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    CLOSED("CLOSED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("card")
  private InstrumentidentifiersCard card = null;

  @SerializedName("bankAccount")
  private InstrumentidentifiersBankAccount bankAccount = null;

  @SerializedName("processingInformation")
  private InstrumentidentifiersProcessingInformation processingInformation = null;

  @SerializedName("metadata")
  private InstrumentidentifiersMetadata metadata = null;

  public PaymentinstrumentsInstrumentIdentifier links(InstrumentidentifiersLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public InstrumentidentifiersLinks getLinks() {
    return links;
  }

  public void setLinks(InstrumentidentifiersLinks links) {
    this.links = links;
  }

   /**
   * Describes type of token. For example: customer, paymentInstrument or instrumentIdentifier.
   * @return object
  **/
  @ApiModelProperty(example = "instrumentIdentifier", value = "Describes type of token. For example: customer, paymentInstrument or instrumentIdentifier.")
  public ObjectEnum getObject() {
    return object;
  }

   /**
   * Current state of the token.
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "Current state of the token.")
  public StateEnum getState() {
    return state;
  }

  public PaymentinstrumentsInstrumentIdentifier id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the existing instrument identifier to be linked to the newly created payment instrument.
   * @return id
  **/
  @ApiModelProperty(example = "1234567890123456789", value = "The id of the existing instrument identifier to be linked to the newly created payment instrument.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentinstrumentsInstrumentIdentifier card(InstrumentidentifiersCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public InstrumentidentifiersCard getCard() {
    return card;
  }

  public void setCard(InstrumentidentifiersCard card) {
    this.card = card;
  }

  public PaymentinstrumentsInstrumentIdentifier bankAccount(InstrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public InstrumentidentifiersBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(InstrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public PaymentinstrumentsInstrumentIdentifier processingInformation(InstrumentidentifiersProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public InstrumentidentifiersProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(InstrumentidentifiersProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PaymentinstrumentsInstrumentIdentifier metadata(InstrumentidentifiersMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public InstrumentidentifiersMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(InstrumentidentifiersMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentinstrumentsInstrumentIdentifier paymentinstrumentsInstrumentIdentifier = (PaymentinstrumentsInstrumentIdentifier) o;
    return Objects.equals(this.links, paymentinstrumentsInstrumentIdentifier.links) &&
        Objects.equals(this.object, paymentinstrumentsInstrumentIdentifier.object) &&
        Objects.equals(this.state, paymentinstrumentsInstrumentIdentifier.state) &&
        Objects.equals(this.id, paymentinstrumentsInstrumentIdentifier.id) &&
        Objects.equals(this.card, paymentinstrumentsInstrumentIdentifier.card) &&
        Objects.equals(this.bankAccount, paymentinstrumentsInstrumentIdentifier.bankAccount) &&
        Objects.equals(this.processingInformation, paymentinstrumentsInstrumentIdentifier.processingInformation) &&
        Objects.equals(this.metadata, paymentinstrumentsInstrumentIdentifier.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, object, state, id, card, bankAccount, processingInformation, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentinstrumentsInstrumentIdentifier {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
