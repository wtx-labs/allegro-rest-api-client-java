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
 * LineItemDiscount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class LineItemDiscount {
  /**
   * Describes the types of discounts used in the lineItems. The types of discounts can be as follows:   - &#x60;BUNDLE&#x60; - a bundle discount (used also for bundles with no price change)   - &#x60;UNIT_PERCENTAGE_DISCOUNT&#x60; - a MULTIPACK or CROSS_MULTIPACK discount   - &#x60;WHOLESALE_PRICE_LIST&#x60; - a wholesale price list discount (a discount for company users only)   - &#x60;LARGE_ORDER_DISCOUNT&#x60; - a large order discount (a discount for company users only)   - &#x60;TURNOVER_DISCOUNT&#x60; - a turnover discount (a discount for company users only)   - &#x60;COUPON&#x60; - a coupon discount   - &#x60;CAMPAIGN&#x60; - a campaign discount 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BUNDLE("BUNDLE"),
    
    UNIT_PERCENTAGE_DISCOUNT("UNIT_PERCENTAGE_DISCOUNT"),
    
    WHOLESALE_PRICE_LIST("WHOLESALE_PRICE_LIST"),
    
    LARGE_ORDER_DISCOUNT("LARGE_ORDER_DISCOUNT"),
    
    TURNOVER_DISCOUNT("TURNOVER_DISCOUNT"),
    
    COUPON("COUPON"),
    
    CAMPAIGN("CAMPAIGN");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private TypeEnum type;

  public LineItemDiscount() {
  }

  public LineItemDiscount type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Describes the types of discounts used in the lineItems. The types of discounts can be as follows:   - &#x60;BUNDLE&#x60; - a bundle discount (used also for bundles with no price change)   - &#x60;UNIT_PERCENTAGE_DISCOUNT&#x60; - a MULTIPACK or CROSS_MULTIPACK discount   - &#x60;WHOLESALE_PRICE_LIST&#x60; - a wholesale price list discount (a discount for company users only)   - &#x60;LARGE_ORDER_DISCOUNT&#x60; - a large order discount (a discount for company users only)   - &#x60;TURNOVER_DISCOUNT&#x60; - a turnover discount (a discount for company users only)   - &#x60;COUPON&#x60; - a coupon discount   - &#x60;CAMPAIGN&#x60; - a campaign discount 
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemDiscount lineItemDiscount = (LineItemDiscount) o;
    return Objects.equals(this.type, lineItemDiscount.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemDiscount {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LineItemDiscount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LineItemDiscount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LineItemDiscount is not found in the empty JSON string", LineItemDiscount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LineItemDiscount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LineItemDiscount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LineItemDiscount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LineItemDiscount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LineItemDiscount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LineItemDiscount.class));

       return (TypeAdapter<T>) new TypeAdapter<LineItemDiscount>() {
           @Override
           public void write(JsonWriter out, LineItemDiscount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LineItemDiscount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LineItemDiscount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LineItemDiscount
   * @throws IOException if the JSON string is invalid with respect to LineItemDiscount
   */
  public static LineItemDiscount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LineItemDiscount.class);
  }

  /**
   * Convert an instance of LineItemDiscount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

