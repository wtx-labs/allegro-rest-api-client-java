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
import pl.wtx.allegro.api.client.model.ExternalId;
import pl.wtx.allegro.api.client.model.OfferEventEndedOfferAllOfPublication;

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
 * OfferEventEndedOffer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class OfferEventEndedOffer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  @javax.annotation.Nullable
  private ExternalId external;

  public static final String SERIALIZED_NAME_PUBLICATION = "publication";
  @SerializedName(SERIALIZED_NAME_PUBLICATION)
  @javax.annotation.Nonnull
  private OfferEventEndedOfferAllOfPublication publication;

  public OfferEventEndedOffer() {
  }

  public OfferEventEndedOffer id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * The offer ID.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public OfferEventEndedOffer external(@javax.annotation.Nullable ExternalId external) {
    this.external = external;
    return this;
  }

  /**
   * Get external
   * @return external
   */
  @javax.annotation.Nullable
  public ExternalId getExternal() {
    return external;
  }

  public void setExternal(@javax.annotation.Nullable ExternalId external) {
    this.external = external;
  }


  public OfferEventEndedOffer publication(@javax.annotation.Nonnull OfferEventEndedOfferAllOfPublication publication) {
    this.publication = publication;
    return this;
  }

  /**
   * Get publication
   * @return publication
   */
  @javax.annotation.Nonnull
  public OfferEventEndedOfferAllOfPublication getPublication() {
    return publication;
  }

  public void setPublication(@javax.annotation.Nonnull OfferEventEndedOfferAllOfPublication publication) {
    this.publication = publication;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferEventEndedOffer offerEventEndedOffer = (OfferEventEndedOffer) o;
    return Objects.equals(this.id, offerEventEndedOffer.id) &&
        Objects.equals(this.external, offerEventEndedOffer.external) &&
        Objects.equals(this.publication, offerEventEndedOffer.publication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, external, publication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferEventEndedOffer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    publication: ").append(toIndentedString(publication)).append("\n");
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
    openapiFields.add("external");
    openapiFields.add("publication");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("publication");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OfferEventEndedOffer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OfferEventEndedOffer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfferEventEndedOffer is not found in the empty JSON string", OfferEventEndedOffer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OfferEventEndedOffer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfferEventEndedOffer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfferEventEndedOffer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `external`
      if (jsonObj.get("external") != null && !jsonObj.get("external").isJsonNull()) {
        ExternalId.validateJsonElement(jsonObj.get("external"));
      }
      // validate the required field `publication`
      OfferEventEndedOfferAllOfPublication.validateJsonElement(jsonObj.get("publication"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferEventEndedOffer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferEventEndedOffer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferEventEndedOffer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferEventEndedOffer.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferEventEndedOffer>() {
           @Override
           public void write(JsonWriter out, OfferEventEndedOffer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferEventEndedOffer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OfferEventEndedOffer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OfferEventEndedOffer
   * @throws IOException if the JSON string is invalid with respect to OfferEventEndedOffer
   */
  public static OfferEventEndedOffer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferEventEndedOffer.class);
  }

  /**
   * Convert an instance of OfferEventEndedOffer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

