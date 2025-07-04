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
import java.util.UUID;
import pl.wtx.allegro.api.client.model.AfterSalesServicesAttachment;
import pl.wtx.allegro.api.client.model.Seller;
import pl.wtx.allegro.api.client.model.WarrantyPeriod;
import pl.wtx.allegro.api.client.model.WarrantyType;

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
 * WarrantyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class WarrantyResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_SELLER = "seller";
  @SerializedName(SERIALIZED_NAME_SELLER)
  @javax.annotation.Nullable
  private Seller seller;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private WarrantyType type;

  public static final String SERIALIZED_NAME_INDIVIDUAL = "individual";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL)
  @javax.annotation.Nullable
  private WarrantyPeriod individual;

  public static final String SERIALIZED_NAME_CORPORATE = "corporate";
  @SerializedName(SERIALIZED_NAME_CORPORATE)
  @javax.annotation.Nullable
  private WarrantyPeriod corporate;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  @javax.annotation.Nullable
  private AfterSalesServicesAttachment attachment;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public WarrantyResponse() {
  }

  public WarrantyResponse id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the warranty definition.
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public WarrantyResponse seller(@javax.annotation.Nullable Seller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
   */
  @javax.annotation.Nullable
  public Seller getSeller() {
    return seller;
  }

  public void setSeller(@javax.annotation.Nullable Seller seller) {
    this.seller = seller;
  }


  public WarrantyResponse name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Warranty name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public WarrantyResponse type(@javax.annotation.Nullable WarrantyType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public WarrantyType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable WarrantyType type) {
    this.type = type;
  }


  public WarrantyResponse individual(@javax.annotation.Nullable WarrantyPeriod individual) {
    this.individual = individual;
    return this;
  }

  /**
   * Get individual
   * @return individual
   */
  @javax.annotation.Nullable
  public WarrantyPeriod getIndividual() {
    return individual;
  }

  public void setIndividual(@javax.annotation.Nullable WarrantyPeriod individual) {
    this.individual = individual;
  }


  public WarrantyResponse corporate(@javax.annotation.Nullable WarrantyPeriod corporate) {
    this.corporate = corporate;
    return this;
  }

  /**
   * Get corporate
   * @return corporate
   */
  @javax.annotation.Nullable
  public WarrantyPeriod getCorporate() {
    return corporate;
  }

  public void setCorporate(@javax.annotation.Nullable WarrantyPeriod corporate) {
    this.corporate = corporate;
  }


  public WarrantyResponse attachment(@javax.annotation.Nullable AfterSalesServicesAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
   */
  @javax.annotation.Nullable
  public AfterSalesServicesAttachment getAttachment() {
    return attachment;
  }

  public void setAttachment(@javax.annotation.Nullable AfterSalesServicesAttachment attachment) {
    this.attachment = attachment;
  }


  public WarrantyResponse description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Warranty description.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarrantyResponse warrantyResponse = (WarrantyResponse) o;
    return Objects.equals(this.id, warrantyResponse.id) &&
        Objects.equals(this.seller, warrantyResponse.seller) &&
        Objects.equals(this.name, warrantyResponse.name) &&
        Objects.equals(this.type, warrantyResponse.type) &&
        Objects.equals(this.individual, warrantyResponse.individual) &&
        Objects.equals(this.corporate, warrantyResponse.corporate) &&
        Objects.equals(this.attachment, warrantyResponse.attachment) &&
        Objects.equals(this.description, warrantyResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, seller, name, type, individual, corporate, attachment, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarrantyResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
    sb.append("    corporate: ").append(toIndentedString(corporate)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("seller");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("individual");
    openapiFields.add("corporate");
    openapiFields.add("attachment");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WarrantyResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WarrantyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WarrantyResponse is not found in the empty JSON string", WarrantyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WarrantyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WarrantyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `seller`
      if (jsonObj.get("seller") != null && !jsonObj.get("seller").isJsonNull()) {
        Seller.validateJsonElement(jsonObj.get("seller"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        WarrantyType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `individual`
      if (jsonObj.get("individual") != null && !jsonObj.get("individual").isJsonNull()) {
        WarrantyPeriod.validateJsonElement(jsonObj.get("individual"));
      }
      // validate the optional field `corporate`
      if (jsonObj.get("corporate") != null && !jsonObj.get("corporate").isJsonNull()) {
        WarrantyPeriod.validateJsonElement(jsonObj.get("corporate"));
      }
      // validate the optional field `attachment`
      if (jsonObj.get("attachment") != null && !jsonObj.get("attachment").isJsonNull()) {
        AfterSalesServicesAttachment.validateJsonElement(jsonObj.get("attachment"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WarrantyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WarrantyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WarrantyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WarrantyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WarrantyResponse>() {
           @Override
           public void write(JsonWriter out, WarrantyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WarrantyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WarrantyResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WarrantyResponse
   * @throws IOException if the JSON string is invalid with respect to WarrantyResponse
   */
  public static WarrantyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WarrantyResponse.class);
  }

  /**
   * Convert an instance of WarrantyResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

