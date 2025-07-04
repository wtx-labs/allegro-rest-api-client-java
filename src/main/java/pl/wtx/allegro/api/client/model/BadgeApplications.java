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
import pl.wtx.allegro.api.client.model.BadgeApplication;

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
 * BadgeApplications
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BadgeApplications {
  public static final String SERIALIZED_NAME_BADGE_APPLICATIONS = "badgeApplications";
  @SerializedName(SERIALIZED_NAME_BADGE_APPLICATIONS)
  @javax.annotation.Nonnull
  private List<BadgeApplication> badgeApplications = new ArrayList<>();

  public BadgeApplications() {
  }

  public BadgeApplications badgeApplications(@javax.annotation.Nonnull List<BadgeApplication> badgeApplications) {
    this.badgeApplications = badgeApplications;
    return this;
  }

  public BadgeApplications addBadgeApplicationsItem(BadgeApplication badgeApplicationsItem) {
    if (this.badgeApplications == null) {
      this.badgeApplications = new ArrayList<>();
    }
    this.badgeApplications.add(badgeApplicationsItem);
    return this;
  }

  /**
   * Get badgeApplications
   * @return badgeApplications
   */
  @javax.annotation.Nonnull
  public List<BadgeApplication> getBadgeApplications() {
    return badgeApplications;
  }

  public void setBadgeApplications(@javax.annotation.Nonnull List<BadgeApplication> badgeApplications) {
    this.badgeApplications = badgeApplications;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadgeApplications badgeApplications = (BadgeApplications) o;
    return Objects.equals(this.badgeApplications, badgeApplications.badgeApplications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badgeApplications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadgeApplications {\n");
    sb.append("    badgeApplications: ").append(toIndentedString(badgeApplications)).append("\n");
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
    openapiFields.add("badgeApplications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("badgeApplications");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BadgeApplications
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BadgeApplications.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BadgeApplications is not found in the empty JSON string", BadgeApplications.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BadgeApplications.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BadgeApplications` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BadgeApplications.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("badgeApplications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `badgeApplications` to be an array in the JSON string but got `%s`", jsonObj.get("badgeApplications").toString()));
      }

      JsonArray jsonArraybadgeApplications = jsonObj.getAsJsonArray("badgeApplications");
      // validate the required field `badgeApplications` (array)
      for (int i = 0; i < jsonArraybadgeApplications.size(); i++) {
        BadgeApplication.validateJsonElement(jsonArraybadgeApplications.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BadgeApplications.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BadgeApplications' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BadgeApplications> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BadgeApplications.class));

       return (TypeAdapter<T>) new TypeAdapter<BadgeApplications>() {
           @Override
           public void write(JsonWriter out, BadgeApplications value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BadgeApplications read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BadgeApplications given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BadgeApplications
   * @throws IOException if the JSON string is invalid with respect to BadgeApplications
   */
  public static BadgeApplications fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BadgeApplications.class);
  }

  /**
   * Convert an instance of BadgeApplications to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

