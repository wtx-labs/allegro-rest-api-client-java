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
import pl.wtx.allegro.api.client.model.DisputeAuthorRole;

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
 * DisputeAuthor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class DisputeAuthor {
  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  @javax.annotation.Nullable
  private String login;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  @javax.annotation.Nonnull
  private DisputeAuthorRole role;

  public DisputeAuthor() {
  }

  public DisputeAuthor login(@javax.annotation.Nullable String login) {
    this.login = login;
    return this;
  }

  /**
   * Not present if role is ADMIN or FULFILLMENT
   * @return login
   */
  @javax.annotation.Nullable
  public String getLogin() {
    return login;
  }

  public void setLogin(@javax.annotation.Nullable String login) {
    this.login = login;
  }


  public DisputeAuthor role(@javax.annotation.Nonnull DisputeAuthorRole role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @javax.annotation.Nonnull
  public DisputeAuthorRole getRole() {
    return role;
  }

  public void setRole(@javax.annotation.Nonnull DisputeAuthorRole role) {
    this.role = role;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeAuthor disputeAuthor = (DisputeAuthor) o;
    return Objects.equals(this.login, disputeAuthor.login) &&
        Objects.equals(this.role, disputeAuthor.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeAuthor {\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("login");
    openapiFields.add("role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("role");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DisputeAuthor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DisputeAuthor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisputeAuthor is not found in the empty JSON string", DisputeAuthor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DisputeAuthor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DisputeAuthor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DisputeAuthor.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("login") != null && !jsonObj.get("login").isJsonNull()) && !jsonObj.get("login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login").toString()));
      }
      // validate the required field `role`
      DisputeAuthorRole.validateJsonElement(jsonObj.get("role"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisputeAuthor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisputeAuthor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisputeAuthor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisputeAuthor.class));

       return (TypeAdapter<T>) new TypeAdapter<DisputeAuthor>() {
           @Override
           public void write(JsonWriter out, DisputeAuthor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DisputeAuthor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DisputeAuthor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DisputeAuthor
   * @throws IOException if the JSON string is invalid with respect to DisputeAuthor
   */
  public static DisputeAuthor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisputeAuthor.class);
  }

  /**
   * Convert an instance of DisputeAuthor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

