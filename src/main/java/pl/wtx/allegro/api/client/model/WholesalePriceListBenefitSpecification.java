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
import pl.wtx.allegro.api.client.model.BenefitSpecification;
import pl.wtx.allegro.api.client.model.WholesalePriceListBenefitSpecificationAllOfThresholds;

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
 * WholesalePriceListBenefitSpecification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class WholesalePriceListBenefitSpecification extends BenefitSpecification {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  protected String type = "WHOLESALE_PRICE_LIST";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_THRESHOLDS = "thresholds";
  @SerializedName(SERIALIZED_NAME_THRESHOLDS)
  @javax.annotation.Nonnull
  private List<WholesalePriceListBenefitSpecificationAllOfThresholds> thresholds = new ArrayList<>();

  public WholesalePriceListBenefitSpecification() {
    this.type = this.getClass().getSimpleName();
  }

  public WholesalePriceListBenefitSpecification type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public WholesalePriceListBenefitSpecification name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Price list name (visible to you only).
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public WholesalePriceListBenefitSpecification thresholds(@javax.annotation.Nonnull List<WholesalePriceListBenefitSpecificationAllOfThresholds> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  public WholesalePriceListBenefitSpecification addThresholdsItem(WholesalePriceListBenefitSpecificationAllOfThresholds thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new ArrayList<>();
    }
    this.thresholds.add(thresholdsItem);
    return this;
  }

  /**
   * List of discount thresholds. A threshold with a higher quantity.lowerBound than another must also have a higher discount.percentage.
   * @return thresholds
   */
  @javax.annotation.Nonnull
  public List<WholesalePriceListBenefitSpecificationAllOfThresholds> getThresholds() {
    return thresholds;
  }

  public void setThresholds(@javax.annotation.Nonnull List<WholesalePriceListBenefitSpecificationAllOfThresholds> thresholds) {
    this.thresholds = thresholds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WholesalePriceListBenefitSpecification wholesalePriceListBenefitSpecification = (WholesalePriceListBenefitSpecification) o;
    return Objects.equals(this.type, wholesalePriceListBenefitSpecification.type) &&
        Objects.equals(this.name, wholesalePriceListBenefitSpecification.name) &&
        Objects.equals(this.thresholds, wholesalePriceListBenefitSpecification.thresholds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, thresholds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WholesalePriceListBenefitSpecification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("name");
    openapiFields.add("thresholds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("thresholds");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WholesalePriceListBenefitSpecification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WholesalePriceListBenefitSpecification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WholesalePriceListBenefitSpecification is not found in the empty JSON string", WholesalePriceListBenefitSpecification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WholesalePriceListBenefitSpecification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WholesalePriceListBenefitSpecification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WholesalePriceListBenefitSpecification.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WholesalePriceListBenefitSpecification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WholesalePriceListBenefitSpecification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WholesalePriceListBenefitSpecification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WholesalePriceListBenefitSpecification.class));

       return (TypeAdapter<T>) new TypeAdapter<WholesalePriceListBenefitSpecification>() {
           @Override
           public void write(JsonWriter out, WholesalePriceListBenefitSpecification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WholesalePriceListBenefitSpecification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WholesalePriceListBenefitSpecification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WholesalePriceListBenefitSpecification
   * @throws IOException if the JSON string is invalid with respect to WholesalePriceListBenefitSpecification
   */
  public static WholesalePriceListBenefitSpecification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WholesalePriceListBenefitSpecification.class);
  }

  /**
   * Convert an instance of WholesalePriceListBenefitSpecification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

