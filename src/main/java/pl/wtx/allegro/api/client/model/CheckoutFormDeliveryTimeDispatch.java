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
import java.util.Arrays;

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
 * Dates when delivery should be dispatched, passed to the provider.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class CheckoutFormDeliveryTimeDispatch {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  @javax.annotation.Nullable
  private OffsetDateTime from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  @javax.annotation.Nullable
  private OffsetDateTime to;

  public CheckoutFormDeliveryTimeDispatch() {
  }

  public CheckoutFormDeliveryTimeDispatch from(@javax.annotation.Nullable OffsetDateTime from) {
    this.from = from;
    return this;
  }

  /**
   * ISO date when the earliest dispatch should take place.
   * @return from
   */
  @javax.annotation.Nullable
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(@javax.annotation.Nullable OffsetDateTime from) {
    this.from = from;
  }


  public CheckoutFormDeliveryTimeDispatch to(@javax.annotation.Nullable OffsetDateTime to) {
    this.to = to;
    return this;
  }

  /**
   * ISO date when the latest dispatch should take place.
   * @return to
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(@javax.annotation.Nullable OffsetDateTime to) {
    this.to = to;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormDeliveryTimeDispatch checkoutFormDeliveryTimeDispatch = (CheckoutFormDeliveryTimeDispatch) o;
    return Objects.equals(this.from, checkoutFormDeliveryTimeDispatch.from) &&
        Objects.equals(this.to, checkoutFormDeliveryTimeDispatch.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormDeliveryTimeDispatch {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CheckoutFormDeliveryTimeDispatch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckoutFormDeliveryTimeDispatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutFormDeliveryTimeDispatch is not found in the empty JSON string", CheckoutFormDeliveryTimeDispatch.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CheckoutFormDeliveryTimeDispatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckoutFormDeliveryTimeDispatch` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutFormDeliveryTimeDispatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutFormDeliveryTimeDispatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutFormDeliveryTimeDispatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutFormDeliveryTimeDispatch.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutFormDeliveryTimeDispatch>() {
           @Override
           public void write(JsonWriter out, CheckoutFormDeliveryTimeDispatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckoutFormDeliveryTimeDispatch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CheckoutFormDeliveryTimeDispatch given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckoutFormDeliveryTimeDispatch
   * @throws IOException if the JSON string is invalid with respect to CheckoutFormDeliveryTimeDispatch
   */
  public static CheckoutFormDeliveryTimeDispatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutFormDeliveryTimeDispatch.class);
  }

  /**
   * Convert an instance of CheckoutFormDeliveryTimeDispatch to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

