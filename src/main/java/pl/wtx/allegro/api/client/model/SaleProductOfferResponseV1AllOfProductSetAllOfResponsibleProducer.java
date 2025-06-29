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
 * Reference to the responsible producer configured using Responsible Producer API. Note that this is a different field than &lt;code&gt;responsiblePerson&lt;/code&gt;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer() {
  }

  public SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer saleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer = (SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer) o;
    return Objects.equals(this.id, saleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer is not found in the empty JSON string", SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer.class));

       return (TypeAdapter<T>) new TypeAdapter<SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer>() {
           @Override
           public void write(JsonWriter out, SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer
   * @throws IOException if the JSON string is invalid with respect to SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer
   */
  public static SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer.class);
  }

  /**
   * Convert an instance of SaleProductOfferResponseV1AllOfProductSetAllOfResponsibleProducer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

