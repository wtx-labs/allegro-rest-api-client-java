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
 * BundledOfferDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BundledOfferDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_REQUIRED_QUANTITY = "requiredQuantity";
  @SerializedName(SERIALIZED_NAME_REQUIRED_QUANTITY)
  @javax.annotation.Nonnull
  private Integer requiredQuantity;

  public static final String SERIALIZED_NAME_ENTRY_POINT = "entryPoint";
  @SerializedName(SERIALIZED_NAME_ENTRY_POINT)
  @javax.annotation.Nonnull
  private Boolean entryPoint;

  public BundledOfferDTO() {
  }

  public BundledOfferDTO id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Offer ID
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public BundledOfferDTO requiredQuantity(@javax.annotation.Nonnull Integer requiredQuantity) {
    this.requiredQuantity = requiredQuantity;
    return this;
  }

  /**
   * How many units of this offer will be in bundle.
   * @return requiredQuantity
   */
  @javax.annotation.Nonnull
  public Integer getRequiredQuantity() {
    return requiredQuantity;
  }

  public void setRequiredQuantity(@javax.annotation.Nonnull Integer requiredQuantity) {
    this.requiredQuantity = requiredQuantity;
  }


  public BundledOfferDTO entryPoint(@javax.annotation.Nonnull Boolean entryPoint) {
    this.entryPoint = entryPoint;
    return this;
  }

  /**
   * Set if bundle should be shown on offer page.
   * @return entryPoint
   */
  @javax.annotation.Nonnull
  public Boolean getEntryPoint() {
    return entryPoint;
  }

  public void setEntryPoint(@javax.annotation.Nonnull Boolean entryPoint) {
    this.entryPoint = entryPoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundledOfferDTO bundledOfferDTO = (BundledOfferDTO) o;
    return Objects.equals(this.id, bundledOfferDTO.id) &&
        Objects.equals(this.requiredQuantity, bundledOfferDTO.requiredQuantity) &&
        Objects.equals(this.entryPoint, bundledOfferDTO.entryPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requiredQuantity, entryPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledOfferDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requiredQuantity: ").append(toIndentedString(requiredQuantity)).append("\n");
    sb.append("    entryPoint: ").append(toIndentedString(entryPoint)).append("\n");
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
    openapiFields.add("requiredQuantity");
    openapiFields.add("entryPoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("requiredQuantity");
    openapiRequiredFields.add("entryPoint");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BundledOfferDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BundledOfferDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BundledOfferDTO is not found in the empty JSON string", BundledOfferDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BundledOfferDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BundledOfferDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BundledOfferDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BundledOfferDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BundledOfferDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BundledOfferDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BundledOfferDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<BundledOfferDTO>() {
           @Override
           public void write(JsonWriter out, BundledOfferDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BundledOfferDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BundledOfferDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BundledOfferDTO
   * @throws IOException if the JSON string is invalid with respect to BundledOfferDTO
   */
  public static BundledOfferDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BundledOfferDTO.class);
  }

  /**
   * Convert an instance of BundledOfferDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

