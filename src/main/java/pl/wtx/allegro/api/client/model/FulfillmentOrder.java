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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pl.wtx.allegro.api.client.model.FulfillmentOrderParcel;

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
 * FulfillmentOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class FulfillmentOrder {
  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  @javax.annotation.Nullable
  private String orderId;

  public static final String SERIALIZED_NAME_PARCELS = "parcels";
  @SerializedName(SERIALIZED_NAME_PARCELS)
  @javax.annotation.Nullable
  private List<FulfillmentOrderParcel> parcels = new ArrayList<>();

  public FulfillmentOrder() {
  }

  public FulfillmentOrder orderId(@javax.annotation.Nullable String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * order identifier
   * @return orderId
   */
  @javax.annotation.Nullable
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(@javax.annotation.Nullable String orderId) {
    this.orderId = orderId;
  }


  public FulfillmentOrder parcels(@javax.annotation.Nullable List<FulfillmentOrderParcel> parcels) {
    this.parcels = parcels;
    return this;
  }

  public FulfillmentOrder addParcelsItem(FulfillmentOrderParcel parcelsItem) {
    if (this.parcels == null) {
      this.parcels = new ArrayList<>();
    }
    this.parcels.add(parcelsItem);
    return this;
  }

  /**
   * Get parcels
   * @return parcels
   */
  @javax.annotation.Nullable
  public List<FulfillmentOrderParcel> getParcels() {
    return parcels;
  }

  public void setParcels(@javax.annotation.Nullable List<FulfillmentOrderParcel> parcels) {
    this.parcels = parcels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentOrder fulfillmentOrder = (FulfillmentOrder) o;
    return Objects.equals(this.orderId, fulfillmentOrder.orderId) &&
        Objects.equals(this.parcels, fulfillmentOrder.parcels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, parcels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentOrder {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    parcels: ").append(toIndentedString(parcels)).append("\n");
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
    openapiFields.add("orderId");
    openapiFields.add("parcels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FulfillmentOrder
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FulfillmentOrder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FulfillmentOrder is not found in the empty JSON string", FulfillmentOrder.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FulfillmentOrder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FulfillmentOrder` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if (jsonObj.get("parcels") != null && !jsonObj.get("parcels").isJsonNull()) {
        JsonArray jsonArrayparcels = jsonObj.getAsJsonArray("parcels");
        if (jsonArrayparcels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parcels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parcels` to be an array in the JSON string but got `%s`", jsonObj.get("parcels").toString()));
          }

          // validate the optional field `parcels` (array)
          for (int i = 0; i < jsonArrayparcels.size(); i++) {
            FulfillmentOrderParcel.validateJsonElement(jsonArrayparcels.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FulfillmentOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FulfillmentOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FulfillmentOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FulfillmentOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<FulfillmentOrder>() {
           @Override
           public void write(JsonWriter out, FulfillmentOrder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FulfillmentOrder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FulfillmentOrder given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FulfillmentOrder
   * @throws IOException if the JSON string is invalid with respect to FulfillmentOrder
   */
  public static FulfillmentOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FulfillmentOrder.class);
  }

  /**
   * Convert an instance of FulfillmentOrder to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

