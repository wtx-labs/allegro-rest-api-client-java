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
import pl.wtx.allegro.api.client.model.MarketplaceItemCurrency;

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
 * Currencies available for that marketplace
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class MarketplaceItemCurrencies {
  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  @javax.annotation.Nullable
  private MarketplaceItemCurrency base;

  public static final String SERIALIZED_NAME_ADDITIONAL = "additional";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL)
  @javax.annotation.Nullable
  private List<MarketplaceItemCurrency> additional = new ArrayList<>();

  public MarketplaceItemCurrencies() {
  }

  public MarketplaceItemCurrencies base(@javax.annotation.Nullable MarketplaceItemCurrency base) {
    this.base = base;
    return this;
  }

  /**
   * Get base
   * @return base
   */
  @javax.annotation.Nullable
  public MarketplaceItemCurrency getBase() {
    return base;
  }

  public void setBase(@javax.annotation.Nullable MarketplaceItemCurrency base) {
    this.base = base;
  }


  public MarketplaceItemCurrencies additional(@javax.annotation.Nullable List<MarketplaceItemCurrency> additional) {
    this.additional = additional;
    return this;
  }

  public MarketplaceItemCurrencies addAdditionalItem(MarketplaceItemCurrency additionalItem) {
    if (this.additional == null) {
      this.additional = new ArrayList<>();
    }
    this.additional.add(additionalItem);
    return this;
  }

  /**
   * List of other currencies available for that marketplace
   * @return additional
   */
  @javax.annotation.Nullable
  public List<MarketplaceItemCurrency> getAdditional() {
    return additional;
  }

  public void setAdditional(@javax.annotation.Nullable List<MarketplaceItemCurrency> additional) {
    this.additional = additional;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceItemCurrencies marketplaceItemCurrencies = (MarketplaceItemCurrencies) o;
    return Objects.equals(this.base, marketplaceItemCurrencies.base) &&
        Objects.equals(this.additional, marketplaceItemCurrencies.additional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, additional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceItemCurrencies {\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
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
    openapiFields.add("base");
    openapiFields.add("additional");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MarketplaceItemCurrencies
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketplaceItemCurrencies.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketplaceItemCurrencies is not found in the empty JSON string", MarketplaceItemCurrencies.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketplaceItemCurrencies.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketplaceItemCurrencies` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `base`
      if (jsonObj.get("base") != null && !jsonObj.get("base").isJsonNull()) {
        MarketplaceItemCurrency.validateJsonElement(jsonObj.get("base"));
      }
      if (jsonObj.get("additional") != null && !jsonObj.get("additional").isJsonNull()) {
        JsonArray jsonArrayadditional = jsonObj.getAsJsonArray("additional");
        if (jsonArrayadditional != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additional").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additional` to be an array in the JSON string but got `%s`", jsonObj.get("additional").toString()));
          }

          // validate the optional field `additional` (array)
          for (int i = 0; i < jsonArrayadditional.size(); i++) {
            MarketplaceItemCurrency.validateJsonElement(jsonArrayadditional.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketplaceItemCurrencies.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketplaceItemCurrencies' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketplaceItemCurrencies> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketplaceItemCurrencies.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketplaceItemCurrencies>() {
           @Override
           public void write(JsonWriter out, MarketplaceItemCurrencies value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketplaceItemCurrencies read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MarketplaceItemCurrencies given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MarketplaceItemCurrencies
   * @throws IOException if the JSON string is invalid with respect to MarketplaceItemCurrencies
   */
  public static MarketplaceItemCurrencies fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketplaceItemCurrencies.class);
  }

  /**
   * Convert an instance of MarketplaceItemCurrencies to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

