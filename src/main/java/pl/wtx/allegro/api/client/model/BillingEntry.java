/*
 * Allegro REST API
 * https://developer.allegro.pl/about  Documentation is generated from [this OpenAPI 3.0 specification file](https://developer.allegro.pl/swagger.yaml). To start working with our API, you can also check our [official Allegro REST API public collection](https://www.postman.com/allegro-rest-api/allegro-rest-api/collection/4puh6ls/allegro-rest-api) in Postman.
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pl.wtx.allegro.api.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import pl.wtx.allegro.api.client.model.BillingEntryAdditionalInfoInner;
import pl.wtx.allegro.api.client.model.BillingEntryBalance;
import pl.wtx.allegro.api.client.model.BillingEntryOffer;
import pl.wtx.allegro.api.client.model.BillingEntryOrder;
import pl.wtx.allegro.api.client.model.BillingEntryTax;
import pl.wtx.allegro.api.client.model.BillingEntryType;
import pl.wtx.allegro.api.client.model.BillingEntryValue;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.wtx.allegro.api.client.invoker.JSON;

/**
 * BillingEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BillingEntry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_OCCURRED_AT = "occurredAt";
  @SerializedName(SERIALIZED_NAME_OCCURRED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime occurredAt;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private BillingEntryType type;

  public static final String SERIALIZED_NAME_OFFER = "offer";
  @SerializedName(SERIALIZED_NAME_OFFER)
  @javax.annotation.Nullable
  private BillingEntryOffer offer;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private BillingEntryValue value;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  @javax.annotation.Nullable
  private BillingEntryTax tax;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  @javax.annotation.Nullable
  private BillingEntryBalance balance;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  @javax.annotation.Nullable
  private BillingEntryOrder order;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  @javax.annotation.Nullable
  private List<BillingEntryAdditionalInfoInner> additionalInfo = new ArrayList<>();

  public BillingEntry() {
  }

  public BillingEntry id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the returned billing entry.
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public BillingEntry occurredAt(@javax.annotation.Nullable OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

  /**
   * Date of billing entry.
   * @return occurredAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(@javax.annotation.Nullable OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }


  public BillingEntry type(@javax.annotation.Nullable BillingEntryType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public BillingEntryType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable BillingEntryType type) {
    this.type = type;
  }


  public BillingEntry offer(@javax.annotation.Nullable BillingEntryOffer offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @javax.annotation.Nullable
  public BillingEntryOffer getOffer() {
    return offer;
  }

  public void setOffer(@javax.annotation.Nullable BillingEntryOffer offer) {
    this.offer = offer;
  }


  public BillingEntry value(@javax.annotation.Nullable BillingEntryValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public BillingEntryValue getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable BillingEntryValue value) {
    this.value = value;
  }


  public BillingEntry tax(@javax.annotation.Nullable BillingEntryTax tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
   */
  @javax.annotation.Nullable
  public BillingEntryTax getTax() {
    return tax;
  }

  public void setTax(@javax.annotation.Nullable BillingEntryTax tax) {
    this.tax = tax;
  }


  public BillingEntry balance(@javax.annotation.Nullable BillingEntryBalance balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   */
  @javax.annotation.Nullable
  public BillingEntryBalance getBalance() {
    return balance;
  }

  public void setBalance(@javax.annotation.Nullable BillingEntryBalance balance) {
    this.balance = balance;
  }


  public BillingEntry order(@javax.annotation.Nullable BillingEntryOrder order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   */
  @javax.annotation.Nullable
  public BillingEntryOrder getOrder() {
    return order;
  }

  public void setOrder(@javax.annotation.Nullable BillingEntryOrder order) {
    this.order = order;
  }


  public BillingEntry additionalInfo(@javax.annotation.Nullable List<BillingEntryAdditionalInfoInner> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BillingEntry addAdditionalInfoItem(BillingEntryAdditionalInfoInner additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<>();
    }
    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

  /**
   * Additional information associated with the returned billing entry.
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  public List<BillingEntryAdditionalInfoInner> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(@javax.annotation.Nullable List<BillingEntryAdditionalInfoInner> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingEntry billingEntry = (BillingEntry) o;
    return Objects.equals(this.id, billingEntry.id) &&
        Objects.equals(this.occurredAt, billingEntry.occurredAt) &&
        Objects.equals(this.type, billingEntry.type) &&
        Objects.equals(this.offer, billingEntry.offer) &&
        Objects.equals(this.value, billingEntry.value) &&
        Objects.equals(this.tax, billingEntry.tax) &&
        Objects.equals(this.balance, billingEntry.balance) &&
        Objects.equals(this.order, billingEntry.order) &&
        Objects.equals(this.additionalInfo, billingEntry.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, occurredAt, type, offer, value, tax, balance, order, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("occurredAt");
    openapiFields.add("type");
    openapiFields.add("offer");
    openapiFields.add("value");
    openapiFields.add("tax");
    openapiFields.add("balance");
    openapiFields.add("order");
    openapiFields.add("additionalInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BillingEntry
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BillingEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillingEntry is not found in the empty JSON string", BillingEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BillingEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BillingEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        BillingEntryType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `offer`
      if (jsonObj.get("offer") != null && !jsonObj.get("offer").isJsonNull()) {
        BillingEntryOffer.validateJsonElement(jsonObj.get("offer"));
      }
      // validate the optional field `value`
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        BillingEntryValue.validateJsonElement(jsonObj.get("value"));
      }
      // validate the optional field `tax`
      if (jsonObj.get("tax") != null && !jsonObj.get("tax").isJsonNull()) {
        BillingEntryTax.validateJsonElement(jsonObj.get("tax"));
      }
      // validate the optional field `balance`
      if (jsonObj.get("balance") != null && !jsonObj.get("balance").isJsonNull()) {
        BillingEntryBalance.validateJsonElement(jsonObj.get("balance"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        BillingEntryOrder.validateJsonElement(jsonObj.get("order"));
      }
      if (jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) {
        JsonArray jsonArrayadditionalInfo = jsonObj.getAsJsonArray("additionalInfo");
        if (jsonArrayadditionalInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be an array in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
          }

          // validate the optional field `additionalInfo` (array)
          for (int i = 0; i < jsonArrayadditionalInfo.size(); i++) {
            BillingEntryAdditionalInfoInner.validateJsonElement(jsonArrayadditionalInfo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillingEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillingEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillingEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillingEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<BillingEntry>() {
           @Override
           public void write(JsonWriter out, BillingEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BillingEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BillingEntry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BillingEntry
   * @throws IOException if the JSON string is invalid with respect to BillingEntry
   */
  public static BillingEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillingEntry.class);
  }

  /**
   * Convert an instance of BillingEntry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

