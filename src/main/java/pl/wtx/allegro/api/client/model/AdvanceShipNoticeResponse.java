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
import pl.wtx.allegro.api.client.model.AdvanceShipNoticeStatus;
import pl.wtx.allegro.api.client.model.HandlingUnit;
import pl.wtx.allegro.api.client.model.Labels;
import pl.wtx.allegro.api.client.model.ProductItem;
import pl.wtx.allegro.api.client.model.ShippingExtended;

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
 * AdvanceShipNoticeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class AdvanceShipNoticeResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_DISPLAY_NUMBER = "displayNumber";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NUMBER)
  @javax.annotation.Nonnull
  private String displayNumber;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private AdvanceShipNoticeStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  @javax.annotation.Nonnull
  private List<ProductItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_HANDLING_UNIT = "handlingUnit";
  @SerializedName(SERIALIZED_NAME_HANDLING_UNIT)
  @javax.annotation.Nullable
  private HandlingUnit handlingUnit;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  @javax.annotation.Nullable
  private Labels labels;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  @javax.annotation.Nullable
  private ShippingExtended shipping;

  public static final String SERIALIZED_NAME_SUBMITTED_AT = "submittedAt";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime submittedAt;

  public AdvanceShipNoticeResponse() {
  }

  public AdvanceShipNoticeResponse id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * An UUID identifier of ASN.
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public AdvanceShipNoticeResponse displayNumber(@javax.annotation.Nonnull String displayNumber) {
    this.displayNumber = displayNumber;
    return this;
  }

  /**
   * A human friendly identifier of ASN.
   * @return displayNumber
   */
  @javax.annotation.Nonnull
  public String getDisplayNumber() {
    return displayNumber;
  }

  public void setDisplayNumber(@javax.annotation.Nonnull String displayNumber) {
    this.displayNumber = displayNumber;
  }


  public AdvanceShipNoticeResponse status(@javax.annotation.Nonnull AdvanceShipNoticeStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public AdvanceShipNoticeStatus getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull AdvanceShipNoticeStatus status) {
    this.status = status;
  }


  public AdvanceShipNoticeResponse createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time of Advance Ship Notice creation. Provided in [ISO 8601 format](link: https://en.wikipedia.org/wiki/ISO_8601).
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AdvanceShipNoticeResponse updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date and time of last Advance Ship Notice update. Provided in [ISO 8601 format](link: https://en.wikipedia.org/wiki/ISO_8601).
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public AdvanceShipNoticeResponse items(@javax.annotation.Nonnull List<ProductItem> items) {
    this.items = items;
    return this;
  }

  public AdvanceShipNoticeResponse addItemsItem(ProductItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * A list of product items.
   * @return items
   */
  @javax.annotation.Nonnull
  public List<ProductItem> getItems() {
    return items;
  }

  public void setItems(@javax.annotation.Nonnull List<ProductItem> items) {
    this.items = items;
  }


  public AdvanceShipNoticeResponse handlingUnit(@javax.annotation.Nullable HandlingUnit handlingUnit) {
    this.handlingUnit = handlingUnit;
    return this;
  }

  /**
   * Get handlingUnit
   * @return handlingUnit
   */
  @javax.annotation.Nullable
  public HandlingUnit getHandlingUnit() {
    return handlingUnit;
  }

  public void setHandlingUnit(@javax.annotation.Nullable HandlingUnit handlingUnit) {
    this.handlingUnit = handlingUnit;
  }


  public AdvanceShipNoticeResponse labels(@javax.annotation.Nullable Labels labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @javax.annotation.Nullable
  public Labels getLabels() {
    return labels;
  }

  public void setLabels(@javax.annotation.Nullable Labels labels) {
    this.labels = labels;
  }


  public AdvanceShipNoticeResponse shipping(@javax.annotation.Nullable ShippingExtended shipping) {
    this.shipping = shipping;
    return this;
  }

  /**
   * Get shipping
   * @return shipping
   */
  @javax.annotation.Nullable
  public ShippingExtended getShipping() {
    return shipping;
  }

  public void setShipping(@javax.annotation.Nullable ShippingExtended shipping) {
    this.shipping = shipping;
  }


  public AdvanceShipNoticeResponse submittedAt(@javax.annotation.Nullable OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

  /**
   * The date and time of Advance Ship Notice submission. Provided in [ISO 8601 format](link: https://en.wikipedia.org/wiki/ISO_8601).
   * @return submittedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(@javax.annotation.Nullable OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceShipNoticeResponse advanceShipNoticeResponse = (AdvanceShipNoticeResponse) o;
    return Objects.equals(this.id, advanceShipNoticeResponse.id) &&
        Objects.equals(this.displayNumber, advanceShipNoticeResponse.displayNumber) &&
        Objects.equals(this.status, advanceShipNoticeResponse.status) &&
        Objects.equals(this.createdAt, advanceShipNoticeResponse.createdAt) &&
        Objects.equals(this.updatedAt, advanceShipNoticeResponse.updatedAt) &&
        Objects.equals(this.items, advanceShipNoticeResponse.items) &&
        Objects.equals(this.handlingUnit, advanceShipNoticeResponse.handlingUnit) &&
        Objects.equals(this.labels, advanceShipNoticeResponse.labels) &&
        Objects.equals(this.shipping, advanceShipNoticeResponse.shipping) &&
        Objects.equals(this.submittedAt, advanceShipNoticeResponse.submittedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayNumber, status, createdAt, updatedAt, items, handlingUnit, labels, shipping, submittedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceShipNoticeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayNumber: ").append(toIndentedString(displayNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    handlingUnit: ").append(toIndentedString(handlingUnit)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
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
    openapiFields.add("displayNumber");
    openapiFields.add("status");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("items");
    openapiFields.add("handlingUnit");
    openapiFields.add("labels");
    openapiFields.add("shipping");
    openapiFields.add("submittedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("displayNumber");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
    openapiRequiredFields.add("items");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdvanceShipNoticeResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdvanceShipNoticeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdvanceShipNoticeResponse is not found in the empty JSON string", AdvanceShipNoticeResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdvanceShipNoticeResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdvanceShipNoticeResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdvanceShipNoticeResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("displayNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayNumber").toString()));
      }
      // validate the required field `status`
      AdvanceShipNoticeStatus.validateJsonElement(jsonObj.get("status"));
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        ProductItem.validateJsonElement(jsonArrayitems.get(i));
      };
      // validate the optional field `handlingUnit`
      if (jsonObj.get("handlingUnit") != null && !jsonObj.get("handlingUnit").isJsonNull()) {
        HandlingUnit.validateJsonElement(jsonObj.get("handlingUnit"));
      }
      // validate the optional field `labels`
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull()) {
        Labels.validateJsonElement(jsonObj.get("labels"));
      }
      // validate the optional field `shipping`
      if (jsonObj.get("shipping") != null && !jsonObj.get("shipping").isJsonNull()) {
        ShippingExtended.validateJsonElement(jsonObj.get("shipping"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvanceShipNoticeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvanceShipNoticeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvanceShipNoticeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvanceShipNoticeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvanceShipNoticeResponse>() {
           @Override
           public void write(JsonWriter out, AdvanceShipNoticeResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvanceShipNoticeResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdvanceShipNoticeResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdvanceShipNoticeResponse
   * @throws IOException if the JSON string is invalid with respect to AdvanceShipNoticeResponse
   */
  public static AdvanceShipNoticeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvanceShipNoticeResponse.class);
  }

  /**
   * Convert an instance of AdvanceShipNoticeResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

