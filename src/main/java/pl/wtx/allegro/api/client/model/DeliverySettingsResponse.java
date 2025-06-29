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
import pl.wtx.allegro.api.client.model.DeliverySettingsResponseAbroadFreeDelivery;
import pl.wtx.allegro.api.client.model.DeliverySettingsResponseCustomCost;
import pl.wtx.allegro.api.client.model.DeliverySettingsResponseFreeDelivery;
import pl.wtx.allegro.api.client.model.DeliverySettingsResponseJoinPolicy;
import pl.wtx.allegro.api.client.model.DeliverySettingsResponseMarketplace;

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
 * DeliverySettingsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class DeliverySettingsResponse {
  public static final String SERIALIZED_NAME_MARKETPLACE = "marketplace";
  @SerializedName(SERIALIZED_NAME_MARKETPLACE)
  @javax.annotation.Nonnull
  private DeliverySettingsResponseMarketplace marketplace;

  public static final String SERIALIZED_NAME_FREE_DELIVERY = "freeDelivery";
  @SerializedName(SERIALIZED_NAME_FREE_DELIVERY)
  @javax.annotation.Nullable
  private DeliverySettingsResponseFreeDelivery freeDelivery;

  public static final String SERIALIZED_NAME_ABROAD_FREE_DELIVERY = "abroadFreeDelivery";
  @SerializedName(SERIALIZED_NAME_ABROAD_FREE_DELIVERY)
  @javax.annotation.Nullable
  private DeliverySettingsResponseAbroadFreeDelivery abroadFreeDelivery;

  public static final String SERIALIZED_NAME_JOIN_POLICY = "joinPolicy";
  @SerializedName(SERIALIZED_NAME_JOIN_POLICY)
  @javax.annotation.Nonnull
  private DeliverySettingsResponseJoinPolicy joinPolicy;

  public static final String SERIALIZED_NAME_CUSTOM_COST = "customCost";
  @SerializedName(SERIALIZED_NAME_CUSTOM_COST)
  @javax.annotation.Nonnull
  private DeliverySettingsResponseCustomCost customCost;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private String updatedAt;

  public DeliverySettingsResponse() {
  }

  public DeliverySettingsResponse marketplace(@javax.annotation.Nonnull DeliverySettingsResponseMarketplace marketplace) {
    this.marketplace = marketplace;
    return this;
  }

  /**
   * Get marketplace
   * @return marketplace
   */
  @javax.annotation.Nonnull
  public DeliverySettingsResponseMarketplace getMarketplace() {
    return marketplace;
  }

  public void setMarketplace(@javax.annotation.Nonnull DeliverySettingsResponseMarketplace marketplace) {
    this.marketplace = marketplace;
  }


  public DeliverySettingsResponse freeDelivery(@javax.annotation.Nullable DeliverySettingsResponseFreeDelivery freeDelivery) {
    this.freeDelivery = freeDelivery;
    return this;
  }

  /**
   * Get freeDelivery
   * @return freeDelivery
   */
  @javax.annotation.Nullable
  public DeliverySettingsResponseFreeDelivery getFreeDelivery() {
    return freeDelivery;
  }

  public void setFreeDelivery(@javax.annotation.Nullable DeliverySettingsResponseFreeDelivery freeDelivery) {
    this.freeDelivery = freeDelivery;
  }


  public DeliverySettingsResponse abroadFreeDelivery(@javax.annotation.Nullable DeliverySettingsResponseAbroadFreeDelivery abroadFreeDelivery) {
    this.abroadFreeDelivery = abroadFreeDelivery;
    return this;
  }

  /**
   * Get abroadFreeDelivery
   * @return abroadFreeDelivery
   */
  @javax.annotation.Nullable
  public DeliverySettingsResponseAbroadFreeDelivery getAbroadFreeDelivery() {
    return abroadFreeDelivery;
  }

  public void setAbroadFreeDelivery(@javax.annotation.Nullable DeliverySettingsResponseAbroadFreeDelivery abroadFreeDelivery) {
    this.abroadFreeDelivery = abroadFreeDelivery;
  }


  public DeliverySettingsResponse joinPolicy(@javax.annotation.Nonnull DeliverySettingsResponseJoinPolicy joinPolicy) {
    this.joinPolicy = joinPolicy;
    return this;
  }

  /**
   * Get joinPolicy
   * @return joinPolicy
   */
  @javax.annotation.Nonnull
  public DeliverySettingsResponseJoinPolicy getJoinPolicy() {
    return joinPolicy;
  }

  public void setJoinPolicy(@javax.annotation.Nonnull DeliverySettingsResponseJoinPolicy joinPolicy) {
    this.joinPolicy = joinPolicy;
  }


  public DeliverySettingsResponse customCost(@javax.annotation.Nonnull DeliverySettingsResponseCustomCost customCost) {
    this.customCost = customCost;
    return this;
  }

  /**
   * Get customCost
   * @return customCost
   */
  @javax.annotation.Nonnull
  public DeliverySettingsResponseCustomCost getCustomCost() {
    return customCost;
  }

  public void setCustomCost(@javax.annotation.Nonnull DeliverySettingsResponseCustomCost customCost) {
    this.customCost = customCost;
  }


  public DeliverySettingsResponse updatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Date and time of the last modification of the set in UTC ISO 8601 format.
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliverySettingsResponse deliverySettingsResponse = (DeliverySettingsResponse) o;
    return Objects.equals(this.marketplace, deliverySettingsResponse.marketplace) &&
        Objects.equals(this.freeDelivery, deliverySettingsResponse.freeDelivery) &&
        Objects.equals(this.abroadFreeDelivery, deliverySettingsResponse.abroadFreeDelivery) &&
        Objects.equals(this.joinPolicy, deliverySettingsResponse.joinPolicy) &&
        Objects.equals(this.customCost, deliverySettingsResponse.customCost) &&
        Objects.equals(this.updatedAt, deliverySettingsResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplace, freeDelivery, abroadFreeDelivery, joinPolicy, customCost, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliverySettingsResponse {\n");
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    freeDelivery: ").append(toIndentedString(freeDelivery)).append("\n");
    sb.append("    abroadFreeDelivery: ").append(toIndentedString(abroadFreeDelivery)).append("\n");
    sb.append("    joinPolicy: ").append(toIndentedString(joinPolicy)).append("\n");
    sb.append("    customCost: ").append(toIndentedString(customCost)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("marketplace");
    openapiFields.add("freeDelivery");
    openapiFields.add("abroadFreeDelivery");
    openapiFields.add("joinPolicy");
    openapiFields.add("customCost");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketplace");
    openapiRequiredFields.add("joinPolicy");
    openapiRequiredFields.add("customCost");
    openapiRequiredFields.add("updatedAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeliverySettingsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeliverySettingsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliverySettingsResponse is not found in the empty JSON string", DeliverySettingsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeliverySettingsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliverySettingsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeliverySettingsResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `marketplace`
      DeliverySettingsResponseMarketplace.validateJsonElement(jsonObj.get("marketplace"));
      // validate the optional field `freeDelivery`
      if (jsonObj.get("freeDelivery") != null && !jsonObj.get("freeDelivery").isJsonNull()) {
        DeliverySettingsResponseFreeDelivery.validateJsonElement(jsonObj.get("freeDelivery"));
      }
      // validate the optional field `abroadFreeDelivery`
      if (jsonObj.get("abroadFreeDelivery") != null && !jsonObj.get("abroadFreeDelivery").isJsonNull()) {
        DeliverySettingsResponseAbroadFreeDelivery.validateJsonElement(jsonObj.get("abroadFreeDelivery"));
      }
      // validate the required field `joinPolicy`
      DeliverySettingsResponseJoinPolicy.validateJsonElement(jsonObj.get("joinPolicy"));
      // validate the required field `customCost`
      DeliverySettingsResponseCustomCost.validateJsonElement(jsonObj.get("customCost"));
      if (!jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliverySettingsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliverySettingsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliverySettingsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliverySettingsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliverySettingsResponse>() {
           @Override
           public void write(JsonWriter out, DeliverySettingsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliverySettingsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeliverySettingsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeliverySettingsResponse
   * @throws IOException if the JSON string is invalid with respect to DeliverySettingsResponse
   */
  public static DeliverySettingsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliverySettingsResponse.class);
  }

  /**
   * Convert an instance of DeliverySettingsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

