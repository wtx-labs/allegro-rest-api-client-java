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
import pl.wtx.allegro.api.client.model.LargeOrderDiscountBenefitSpecificationAllOfThresholds;

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
 * LargeOrderDiscountBenefitSpecification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class LargeOrderDiscountBenefitSpecification extends BenefitSpecification {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  protected String type = "LARGE_ORDER_DISCOUNT";

  public static final String SERIALIZED_NAME_THRESHOLDS = "thresholds";
  @SerializedName(SERIALIZED_NAME_THRESHOLDS)
  @javax.annotation.Nonnull
  private List<LargeOrderDiscountBenefitSpecificationAllOfThresholds> thresholds = new ArrayList<>();

  public LargeOrderDiscountBenefitSpecification() {
    this.type = this.getClass().getSimpleName();
  }

  public LargeOrderDiscountBenefitSpecification type(@javax.annotation.Nullable String type) {
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


  public LargeOrderDiscountBenefitSpecification thresholds(@javax.annotation.Nonnull List<LargeOrderDiscountBenefitSpecificationAllOfThresholds> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  public LargeOrderDiscountBenefitSpecification addThresholdsItem(LargeOrderDiscountBenefitSpecificationAllOfThresholds thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new ArrayList<>();
    }
    this.thresholds.add(thresholdsItem);
    return this;
  }

  /**
   * List of order discount thresholds. A threshold with a higher orderValue.lowerBound.amount than another one must also have a higher discount.percentage.
   * @return thresholds
   */
  @javax.annotation.Nonnull
  public List<LargeOrderDiscountBenefitSpecificationAllOfThresholds> getThresholds() {
    return thresholds;
  }

  public void setThresholds(@javax.annotation.Nonnull List<LargeOrderDiscountBenefitSpecificationAllOfThresholds> thresholds) {
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
    LargeOrderDiscountBenefitSpecification largeOrderDiscountBenefitSpecification = (LargeOrderDiscountBenefitSpecification) o;
    return Objects.equals(this.type, largeOrderDiscountBenefitSpecification.type) &&
        Objects.equals(this.thresholds, largeOrderDiscountBenefitSpecification.thresholds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, thresholds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LargeOrderDiscountBenefitSpecification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("thresholds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("thresholds");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LargeOrderDiscountBenefitSpecification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LargeOrderDiscountBenefitSpecification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LargeOrderDiscountBenefitSpecification is not found in the empty JSON string", LargeOrderDiscountBenefitSpecification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LargeOrderDiscountBenefitSpecification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LargeOrderDiscountBenefitSpecification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LargeOrderDiscountBenefitSpecification.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LargeOrderDiscountBenefitSpecification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LargeOrderDiscountBenefitSpecification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LargeOrderDiscountBenefitSpecification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LargeOrderDiscountBenefitSpecification.class));

       return (TypeAdapter<T>) new TypeAdapter<LargeOrderDiscountBenefitSpecification>() {
           @Override
           public void write(JsonWriter out, LargeOrderDiscountBenefitSpecification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LargeOrderDiscountBenefitSpecification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LargeOrderDiscountBenefitSpecification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LargeOrderDiscountBenefitSpecification
   * @throws IOException if the JSON string is invalid with respect to LargeOrderDiscountBenefitSpecification
   */
  public static LargeOrderDiscountBenefitSpecification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LargeOrderDiscountBenefitSpecification.class);
  }

  /**
   * Convert an instance of LargeOrderDiscountBenefitSpecification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

