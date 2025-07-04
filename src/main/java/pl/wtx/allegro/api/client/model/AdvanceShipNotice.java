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
import pl.wtx.allegro.api.client.model.HandlingUnit;
import pl.wtx.allegro.api.client.model.ProductItem;
import pl.wtx.allegro.api.client.model.Shipping;

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
 * AdvanceShipNotice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class AdvanceShipNotice {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  @javax.annotation.Nonnull
  private List<ProductItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_HANDLING_UNIT = "handlingUnit";
  @SerializedName(SERIALIZED_NAME_HANDLING_UNIT)
  @javax.annotation.Nullable
  private HandlingUnit handlingUnit;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  @javax.annotation.Nullable
  private Shipping shipping;

  public AdvanceShipNotice() {
  }

  public AdvanceShipNotice items(@javax.annotation.Nonnull List<ProductItem> items) {
    this.items = items;
    return this;
  }

  public AdvanceShipNotice addItemsItem(ProductItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * A list of product items.
   * @return items
   */
  @javax.annotation.Nonnull
  public List<ProductItem> getItems() {
    return items;
  }

  public void setItems(@javax.annotation.Nonnull List<ProductItem> items) {
    this.items = items;
  }


  public AdvanceShipNotice handlingUnit(@javax.annotation.Nullable HandlingUnit handlingUnit) {
    this.handlingUnit = handlingUnit;
    return this;
  }

  /**
   * Get handlingUnit
   * @return handlingUnit
   */
  @javax.annotation.Nullable
  public HandlingUnit getHandlingUnit() {
    return handlingUnit;
  }

  public void setHandlingUnit(@javax.annotation.Nullable HandlingUnit handlingUnit) {
    this.handlingUnit = handlingUnit;
  }


  public AdvanceShipNotice shipping(@javax.annotation.Nullable Shipping shipping) {
    this.shipping = shipping;
    return this;
  }

  /**
   * Get shipping
   * @return shipping
   */
  @javax.annotation.Nullable
  public Shipping getShipping() {
    return shipping;
  }

  public void setShipping(@javax.annotation.Nullable Shipping shipping) {
    this.shipping = shipping;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceShipNotice advanceShipNotice = (AdvanceShipNotice) o;
    return Objects.equals(this.items, advanceShipNotice.items) &&
        Objects.equals(this.handlingUnit, advanceShipNotice.handlingUnit) &&
        Objects.equals(this.shipping, advanceShipNotice.shipping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, handlingUnit, shipping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceShipNotice {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    handlingUnit: ").append(toIndentedString(handlingUnit)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("handlingUnit");
    openapiFields.add("shipping");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("items");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdvanceShipNotice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdvanceShipNotice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdvanceShipNotice is not found in the empty JSON string", AdvanceShipNotice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdvanceShipNotice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdvanceShipNotice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdvanceShipNotice.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        ProductItem.validateJsonElement(jsonArrayitems.get(i));
      };
      // validate the optional field `handlingUnit`
      if (jsonObj.get("handlingUnit") != null && !jsonObj.get("handlingUnit").isJsonNull()) {
        HandlingUnit.validateJsonElement(jsonObj.get("handlingUnit"));
      }
      // validate the optional field `shipping`
      if (jsonObj.get("shipping") != null && !jsonObj.get("shipping").isJsonNull()) {
        Shipping.validateJsonElement(jsonObj.get("shipping"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvanceShipNotice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvanceShipNotice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvanceShipNotice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvanceShipNotice.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvanceShipNotice>() {
           @Override
           public void write(JsonWriter out, AdvanceShipNotice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvanceShipNotice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdvanceShipNotice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdvanceShipNotice
   * @throws IOException if the JSON string is invalid with respect to AdvanceShipNotice
   */
  public static AdvanceShipNotice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvanceShipNotice.class);
  }

  /**
   * Convert an instance of AdvanceShipNotice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

