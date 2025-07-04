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
import pl.wtx.allegro.api.client.model.AdditionalMarketplacePromoOptionsCommandModification;
import pl.wtx.allegro.api.client.model.OfferCriterium;
import pl.wtx.allegro.api.client.model.PromoOptionsCommandModification;

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
 * PromoOptionsCommand
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class PromoOptionsCommand {
  public static final String SERIALIZED_NAME_OFFER_CRITERIA = "offerCriteria";
  @SerializedName(SERIALIZED_NAME_OFFER_CRITERIA)
  @javax.annotation.Nullable
  private List<OfferCriterium> offerCriteria = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODIFICATION = "modification";
  @SerializedName(SERIALIZED_NAME_MODIFICATION)
  @javax.annotation.Nullable
  private PromoOptionsCommandModification modification;

  public static final String SERIALIZED_NAME_ADDITIONAL_MARKETPLACES = "additionalMarketplaces";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_MARKETPLACES)
  @javax.annotation.Nullable
  private List<AdditionalMarketplacePromoOptionsCommandModification> additionalMarketplaces = new ArrayList<>();

  public PromoOptionsCommand() {
  }

  public PromoOptionsCommand offerCriteria(@javax.annotation.Nullable List<OfferCriterium> offerCriteria) {
    this.offerCriteria = offerCriteria;
    return this;
  }

  public PromoOptionsCommand addOfferCriteriaItem(OfferCriterium offerCriteriaItem) {
    if (this.offerCriteria == null) {
      this.offerCriteria = new ArrayList<>();
    }
    this.offerCriteria.add(offerCriteriaItem);
    return this;
  }

  /**
   * Offer choice criteria.
   * @return offerCriteria
   */
  @javax.annotation.Nullable
  public List<OfferCriterium> getOfferCriteria() {
    return offerCriteria;
  }

  public void setOfferCriteria(@javax.annotation.Nullable List<OfferCriterium> offerCriteria) {
    this.offerCriteria = offerCriteria;
  }


  public PromoOptionsCommand modification(@javax.annotation.Nullable PromoOptionsCommandModification modification) {
    this.modification = modification;
    return this;
  }

  /**
   * Get modification
   * @return modification
   */
  @javax.annotation.Nullable
  public PromoOptionsCommandModification getModification() {
    return modification;
  }

  public void setModification(@javax.annotation.Nullable PromoOptionsCommandModification modification) {
    this.modification = modification;
  }


  public PromoOptionsCommand additionalMarketplaces(@javax.annotation.Nullable List<AdditionalMarketplacePromoOptionsCommandModification> additionalMarketplaces) {
    this.additionalMarketplaces = additionalMarketplaces;
    return this;
  }

  public PromoOptionsCommand addAdditionalMarketplacesItem(AdditionalMarketplacePromoOptionsCommandModification additionalMarketplacesItem) {
    if (this.additionalMarketplaces == null) {
      this.additionalMarketplaces = new ArrayList<>();
    }
    this.additionalMarketplaces.add(additionalMarketplacesItem);
    return this;
  }

  /**
   * Get additionalMarketplaces
   * @return additionalMarketplaces
   */
  @javax.annotation.Nullable
  public List<AdditionalMarketplacePromoOptionsCommandModification> getAdditionalMarketplaces() {
    return additionalMarketplaces;
  }

  public void setAdditionalMarketplaces(@javax.annotation.Nullable List<AdditionalMarketplacePromoOptionsCommandModification> additionalMarketplaces) {
    this.additionalMarketplaces = additionalMarketplaces;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoOptionsCommand promoOptionsCommand = (PromoOptionsCommand) o;
    return Objects.equals(this.offerCriteria, promoOptionsCommand.offerCriteria) &&
        Objects.equals(this.modification, promoOptionsCommand.modification) &&
        Objects.equals(this.additionalMarketplaces, promoOptionsCommand.additionalMarketplaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerCriteria, modification, additionalMarketplaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoOptionsCommand {\n");
    sb.append("    offerCriteria: ").append(toIndentedString(offerCriteria)).append("\n");
    sb.append("    modification: ").append(toIndentedString(modification)).append("\n");
    sb.append("    additionalMarketplaces: ").append(toIndentedString(additionalMarketplaces)).append("\n");
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
    openapiFields.add("offerCriteria");
    openapiFields.add("modification");
    openapiFields.add("additionalMarketplaces");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PromoOptionsCommand
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PromoOptionsCommand.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromoOptionsCommand is not found in the empty JSON string", PromoOptionsCommand.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PromoOptionsCommand.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PromoOptionsCommand` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("offerCriteria") != null && !jsonObj.get("offerCriteria").isJsonNull()) {
        JsonArray jsonArrayofferCriteria = jsonObj.getAsJsonArray("offerCriteria");
        if (jsonArrayofferCriteria != null) {
          // ensure the json data is an array
          if (!jsonObj.get("offerCriteria").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `offerCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("offerCriteria").toString()));
          }

          // validate the optional field `offerCriteria` (array)
          for (int i = 0; i < jsonArrayofferCriteria.size(); i++) {
            OfferCriterium.validateJsonElement(jsonArrayofferCriteria.get(i));
          };
        }
      }
      // validate the optional field `modification`
      if (jsonObj.get("modification") != null && !jsonObj.get("modification").isJsonNull()) {
        PromoOptionsCommandModification.validateJsonElement(jsonObj.get("modification"));
      }
      if (jsonObj.get("additionalMarketplaces") != null && !jsonObj.get("additionalMarketplaces").isJsonNull()) {
        JsonArray jsonArrayadditionalMarketplaces = jsonObj.getAsJsonArray("additionalMarketplaces");
        if (jsonArrayadditionalMarketplaces != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalMarketplaces").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalMarketplaces` to be an array in the JSON string but got `%s`", jsonObj.get("additionalMarketplaces").toString()));
          }

          // validate the optional field `additionalMarketplaces` (array)
          for (int i = 0; i < jsonArrayadditionalMarketplaces.size(); i++) {
            AdditionalMarketplacePromoOptionsCommandModification.validateJsonElement(jsonArrayadditionalMarketplaces.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromoOptionsCommand.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromoOptionsCommand' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromoOptionsCommand> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromoOptionsCommand.class));

       return (TypeAdapter<T>) new TypeAdapter<PromoOptionsCommand>() {
           @Override
           public void write(JsonWriter out, PromoOptionsCommand value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromoOptionsCommand read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PromoOptionsCommand given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PromoOptionsCommand
   * @throws IOException if the JSON string is invalid with respect to PromoOptionsCommand
   */
  public static PromoOptionsCommand fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromoOptionsCommand.class);
  }

  /**
   * Convert an instance of PromoOptionsCommand to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

