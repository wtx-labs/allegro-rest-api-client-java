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
import pl.wtx.allegro.api.client.model.AllegroParcelTrackingHistoryTrackingDetails;

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
 * AllegroParcelTrackingHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class AllegroParcelTrackingHistory {
  public static final String SERIALIZED_NAME_WAYBILL = "waybill";
  @SerializedName(SERIALIZED_NAME_WAYBILL)
  @javax.annotation.Nonnull
  private String waybill;

  public static final String SERIALIZED_NAME_TRACKING_DETAILS = "trackingDetails";
  @SerializedName(SERIALIZED_NAME_TRACKING_DETAILS)
  @javax.annotation.Nullable
  private AllegroParcelTrackingHistoryTrackingDetails trackingDetails;

  public AllegroParcelTrackingHistory() {
  }

  public AllegroParcelTrackingHistory waybill(@javax.annotation.Nonnull String waybill) {
    this.waybill = waybill;
    return this;
  }

  /**
   * Waybill number (parcel tracking number).
   * @return waybill
   */
  @javax.annotation.Nonnull
  public String getWaybill() {
    return waybill;
  }

  public void setWaybill(@javax.annotation.Nonnull String waybill) {
    this.waybill = waybill;
  }


  public AllegroParcelTrackingHistory trackingDetails(@javax.annotation.Nullable AllegroParcelTrackingHistoryTrackingDetails trackingDetails) {
    this.trackingDetails = trackingDetails;
    return this;
  }

  /**
   * Get trackingDetails
   * @return trackingDetails
   */
  @javax.annotation.Nullable
  public AllegroParcelTrackingHistoryTrackingDetails getTrackingDetails() {
    return trackingDetails;
  }

  public void setTrackingDetails(@javax.annotation.Nullable AllegroParcelTrackingHistoryTrackingDetails trackingDetails) {
    this.trackingDetails = trackingDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllegroParcelTrackingHistory allegroParcelTrackingHistory = (AllegroParcelTrackingHistory) o;
    return Objects.equals(this.waybill, allegroParcelTrackingHistory.waybill) &&
        Objects.equals(this.trackingDetails, allegroParcelTrackingHistory.trackingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waybill, trackingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllegroParcelTrackingHistory {\n");
    sb.append("    waybill: ").append(toIndentedString(waybill)).append("\n");
    sb.append("    trackingDetails: ").append(toIndentedString(trackingDetails)).append("\n");
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
    openapiFields.add("waybill");
    openapiFields.add("trackingDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("waybill");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AllegroParcelTrackingHistory
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AllegroParcelTrackingHistory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AllegroParcelTrackingHistory is not found in the empty JSON string", AllegroParcelTrackingHistory.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AllegroParcelTrackingHistory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AllegroParcelTrackingHistory` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AllegroParcelTrackingHistory.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("waybill").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waybill` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waybill").toString()));
      }
      // validate the optional field `trackingDetails`
      if (jsonObj.get("trackingDetails") != null && !jsonObj.get("trackingDetails").isJsonNull()) {
        AllegroParcelTrackingHistoryTrackingDetails.validateJsonElement(jsonObj.get("trackingDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AllegroParcelTrackingHistory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AllegroParcelTrackingHistory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AllegroParcelTrackingHistory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AllegroParcelTrackingHistory.class));

       return (TypeAdapter<T>) new TypeAdapter<AllegroParcelTrackingHistory>() {
           @Override
           public void write(JsonWriter out, AllegroParcelTrackingHistory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AllegroParcelTrackingHistory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AllegroParcelTrackingHistory given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AllegroParcelTrackingHistory
   * @throws IOException if the JSON string is invalid with respect to AllegroParcelTrackingHistory
   */
  public static AllegroParcelTrackingHistory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AllegroParcelTrackingHistory.class);
  }

  /**
   * Convert an instance of AllegroParcelTrackingHistory to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

