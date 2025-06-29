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
import pl.wtx.allegro.api.client.model.UserRatingSummaryResponseV2StatisticsExcluded;
import pl.wtx.allegro.api.client.model.UserRatingSummaryResponseV2StatisticsReceived;
import pl.wtx.allegro.api.client.model.UserRatingSummaryResponseV2StatisticsRemoved;

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
 * Summary of ratings statistics.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class UserRatingSummaryResponseV2Statistics {
  public static final String SERIALIZED_NAME_RECEIVED = "received";
  @SerializedName(SERIALIZED_NAME_RECEIVED)
  @javax.annotation.Nonnull
  private UserRatingSummaryResponseV2StatisticsReceived received;

  public static final String SERIALIZED_NAME_EXCLUDED = "excluded";
  @SerializedName(SERIALIZED_NAME_EXCLUDED)
  @javax.annotation.Nonnull
  private UserRatingSummaryResponseV2StatisticsExcluded excluded;

  public static final String SERIALIZED_NAME_REMOVED = "removed";
  @SerializedName(SERIALIZED_NAME_REMOVED)
  @javax.annotation.Nonnull
  private UserRatingSummaryResponseV2StatisticsRemoved removed;

  public UserRatingSummaryResponseV2Statistics() {
  }

  public UserRatingSummaryResponseV2Statistics received(@javax.annotation.Nonnull UserRatingSummaryResponseV2StatisticsReceived received) {
    this.received = received;
    return this;
  }

  /**
   * Get received
   * @return received
   */
  @javax.annotation.Nonnull
  public UserRatingSummaryResponseV2StatisticsReceived getReceived() {
    return received;
  }

  public void setReceived(@javax.annotation.Nonnull UserRatingSummaryResponseV2StatisticsReceived received) {
    this.received = received;
  }


  public UserRatingSummaryResponseV2Statistics excluded(@javax.annotation.Nonnull UserRatingSummaryResponseV2StatisticsExcluded excluded) {
    this.excluded = excluded;
    return this;
  }

  /**
   * Get excluded
   * @return excluded
   */
  @javax.annotation.Nonnull
  public UserRatingSummaryResponseV2StatisticsExcluded getExcluded() {
    return excluded;
  }

  public void setExcluded(@javax.annotation.Nonnull UserRatingSummaryResponseV2StatisticsExcluded excluded) {
    this.excluded = excluded;
  }


  public UserRatingSummaryResponseV2Statistics removed(@javax.annotation.Nonnull UserRatingSummaryResponseV2StatisticsRemoved removed) {
    this.removed = removed;
    return this;
  }

  /**
   * Get removed
   * @return removed
   */
  @javax.annotation.Nonnull
  public UserRatingSummaryResponseV2StatisticsRemoved getRemoved() {
    return removed;
  }

  public void setRemoved(@javax.annotation.Nonnull UserRatingSummaryResponseV2StatisticsRemoved removed) {
    this.removed = removed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRatingSummaryResponseV2Statistics userRatingSummaryResponseV2Statistics = (UserRatingSummaryResponseV2Statistics) o;
    return Objects.equals(this.received, userRatingSummaryResponseV2Statistics.received) &&
        Objects.equals(this.excluded, userRatingSummaryResponseV2Statistics.excluded) &&
        Objects.equals(this.removed, userRatingSummaryResponseV2Statistics.removed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(received, excluded, removed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRatingSummaryResponseV2Statistics {\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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
    openapiFields.add("received");
    openapiFields.add("excluded");
    openapiFields.add("removed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("received");
    openapiRequiredFields.add("excluded");
    openapiRequiredFields.add("removed");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserRatingSummaryResponseV2Statistics
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserRatingSummaryResponseV2Statistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserRatingSummaryResponseV2Statistics is not found in the empty JSON string", UserRatingSummaryResponseV2Statistics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserRatingSummaryResponseV2Statistics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserRatingSummaryResponseV2Statistics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserRatingSummaryResponseV2Statistics.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `received`
      UserRatingSummaryResponseV2StatisticsReceived.validateJsonElement(jsonObj.get("received"));
      // validate the required field `excluded`
      UserRatingSummaryResponseV2StatisticsExcluded.validateJsonElement(jsonObj.get("excluded"));
      // validate the required field `removed`
      UserRatingSummaryResponseV2StatisticsRemoved.validateJsonElement(jsonObj.get("removed"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserRatingSummaryResponseV2Statistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserRatingSummaryResponseV2Statistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserRatingSummaryResponseV2Statistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserRatingSummaryResponseV2Statistics.class));

       return (TypeAdapter<T>) new TypeAdapter<UserRatingSummaryResponseV2Statistics>() {
           @Override
           public void write(JsonWriter out, UserRatingSummaryResponseV2Statistics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserRatingSummaryResponseV2Statistics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserRatingSummaryResponseV2Statistics given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserRatingSummaryResponseV2Statistics
   * @throws IOException if the JSON string is invalid with respect to UserRatingSummaryResponseV2Statistics
   */
  public static UserRatingSummaryResponseV2Statistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserRatingSummaryResponseV2Statistics.class);
  }

  /**
   * Convert an instance of UserRatingSummaryResponseV2Statistics to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

