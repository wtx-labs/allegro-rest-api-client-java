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
 * Rules for the shipping cost for the first item in the parcel.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate {
  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  @javax.annotation.Nullable
  private String min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  @javax.annotation.Nullable
  private String max;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate() {
  }

  public GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate min(@javax.annotation.Nullable String min) {
    this.min = min;
    return this;
  }

  /**
   * Lower limit for the rate.
   * @return min
   */
  @javax.annotation.Nullable
  public String getMin() {
    return min;
  }

  public void setMin(@javax.annotation.Nullable String min) {
    this.min = min;
  }


  public GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate max(@javax.annotation.Nullable String max) {
    this.max = max;
    return this;
  }

  /**
   * Upper limit for the rate.
   * @return max
   */
  @javax.annotation.Nullable
  public String getMax() {
    return max;
  }

  public void setMax(@javax.annotation.Nullable String max) {
    this.max = max;
  }


  public GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * ISO 4217 currency code.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate getListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate = (GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate) o;
    return Objects.equals(this.min, getListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate.min) &&
        Objects.equals(this.max, getListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate.max) &&
        Objects.equals(this.currency, getListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("min");
    openapiFields.add("max");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate is not found in the empty JSON string", GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("min") != null && !jsonObj.get("min").isJsonNull()) && !jsonObj.get("min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min").toString()));
      }
      if ((jsonObj.get("max") != null && !jsonObj.get("max").isJsonNull()) && !jsonObj.get("max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate.class));

       return (TypeAdapter<T>) new TypeAdapter<GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate>() {
           @Override
           public void write(JsonWriter out, GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate
   * @throws IOException if the JSON string is invalid with respect to GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate
   */
  public static GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate.class);
  }

  /**
   * Convert an instance of GetListOfDeliveryMethodsUsingGET200ResponseDeliveryMethodsInnerShippingRatesConstraintsFirstItemRate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

