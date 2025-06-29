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
 * AllegroPickupDropOffPointPaymentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class AllegroPickupDropOffPointPaymentsInner {
  /**
   * Gets or Sets method
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    CASH("CASH"),
    
    CARD("CARD");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MethodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  @javax.annotation.Nonnull
  private MethodEnum method;

  public AllegroPickupDropOffPointPaymentsInner() {
  }

  public AllegroPickupDropOffPointPaymentsInner method(@javax.annotation.Nonnull MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
   */
  @javax.annotation.Nonnull
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(@javax.annotation.Nonnull MethodEnum method) {
    this.method = method;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllegroPickupDropOffPointPaymentsInner allegroPickupDropOffPointPaymentsInner = (AllegroPickupDropOffPointPaymentsInner) o;
    return Objects.equals(this.method, allegroPickupDropOffPointPaymentsInner.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllegroPickupDropOffPointPaymentsInner {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
    openapiFields.add("method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("method");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AllegroPickupDropOffPointPaymentsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AllegroPickupDropOffPointPaymentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AllegroPickupDropOffPointPaymentsInner is not found in the empty JSON string", AllegroPickupDropOffPointPaymentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AllegroPickupDropOffPointPaymentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AllegroPickupDropOffPointPaymentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AllegroPickupDropOffPointPaymentsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      // validate the required field `method`
      MethodEnum.validateJsonElement(jsonObj.get("method"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AllegroPickupDropOffPointPaymentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AllegroPickupDropOffPointPaymentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AllegroPickupDropOffPointPaymentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AllegroPickupDropOffPointPaymentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AllegroPickupDropOffPointPaymentsInner>() {
           @Override
           public void write(JsonWriter out, AllegroPickupDropOffPointPaymentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AllegroPickupDropOffPointPaymentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AllegroPickupDropOffPointPaymentsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AllegroPickupDropOffPointPaymentsInner
   * @throws IOException if the JSON string is invalid with respect to AllegroPickupDropOffPointPaymentsInner
   */
  public static AllegroPickupDropOffPointPaymentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AllegroPickupDropOffPointPaymentsInner.class);
  }

  /**
   * Convert an instance of AllegroPickupDropOffPointPaymentsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

