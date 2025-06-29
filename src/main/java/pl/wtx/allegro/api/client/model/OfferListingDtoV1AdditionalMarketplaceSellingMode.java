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
import pl.wtx.allegro.api.client.model.BuyNowPrice;
import pl.wtx.allegro.api.client.model.PriceAutomation;

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
 * Information about the selling mode of the offer on the given marketplace.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class OfferListingDtoV1AdditionalMarketplaceSellingMode {
  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  @javax.annotation.Nullable
  private BuyNowPrice price;

  public static final String SERIALIZED_NAME_PRICE_AUTOMATION = "priceAutomation";
  @SerializedName(SERIALIZED_NAME_PRICE_AUTOMATION)
  @javax.annotation.Nullable
  private PriceAutomation priceAutomation;

  public OfferListingDtoV1AdditionalMarketplaceSellingMode() {
  }

  public OfferListingDtoV1AdditionalMarketplaceSellingMode price(@javax.annotation.Nullable BuyNowPrice price) {
    this.price = price;
    return this;
  }

  /**
   * The price of the offer on the given marketplace.
   * @return price
   */
  @javax.annotation.Nullable
  public BuyNowPrice getPrice() {
    return price;
  }

  public void setPrice(@javax.annotation.Nullable BuyNowPrice price) {
    this.price = price;
  }


  public OfferListingDtoV1AdditionalMarketplaceSellingMode priceAutomation(@javax.annotation.Nullable PriceAutomation priceAutomation) {
    this.priceAutomation = priceAutomation;
    return this;
  }

  /**
   * The automatic pricing rule on the given marketplace.
   * @return priceAutomation
   */
  @javax.annotation.Nullable
  public PriceAutomation getPriceAutomation() {
    return priceAutomation;
  }

  public void setPriceAutomation(@javax.annotation.Nullable PriceAutomation priceAutomation) {
    this.priceAutomation = priceAutomation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferListingDtoV1AdditionalMarketplaceSellingMode offerListingDtoV1AdditionalMarketplaceSellingMode = (OfferListingDtoV1AdditionalMarketplaceSellingMode) o;
    return Objects.equals(this.price, offerListingDtoV1AdditionalMarketplaceSellingMode.price) &&
        Objects.equals(this.priceAutomation, offerListingDtoV1AdditionalMarketplaceSellingMode.priceAutomation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, priceAutomation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferListingDtoV1AdditionalMarketplaceSellingMode {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceAutomation: ").append(toIndentedString(priceAutomation)).append("\n");
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
    openapiFields.add("price");
    openapiFields.add("priceAutomation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OfferListingDtoV1AdditionalMarketplaceSellingMode
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OfferListingDtoV1AdditionalMarketplaceSellingMode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfferListingDtoV1AdditionalMarketplaceSellingMode is not found in the empty JSON string", OfferListingDtoV1AdditionalMarketplaceSellingMode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OfferListingDtoV1AdditionalMarketplaceSellingMode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfferListingDtoV1AdditionalMarketplaceSellingMode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        BuyNowPrice.validateJsonElement(jsonObj.get("price"));
      }
      // validate the optional field `priceAutomation`
      if (jsonObj.get("priceAutomation") != null && !jsonObj.get("priceAutomation").isJsonNull()) {
        PriceAutomation.validateJsonElement(jsonObj.get("priceAutomation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferListingDtoV1AdditionalMarketplaceSellingMode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferListingDtoV1AdditionalMarketplaceSellingMode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferListingDtoV1AdditionalMarketplaceSellingMode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferListingDtoV1AdditionalMarketplaceSellingMode.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferListingDtoV1AdditionalMarketplaceSellingMode>() {
           @Override
           public void write(JsonWriter out, OfferListingDtoV1AdditionalMarketplaceSellingMode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferListingDtoV1AdditionalMarketplaceSellingMode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OfferListingDtoV1AdditionalMarketplaceSellingMode given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OfferListingDtoV1AdditionalMarketplaceSellingMode
   * @throws IOException if the JSON string is invalid with respect to OfferListingDtoV1AdditionalMarketplaceSellingMode
   */
  public static OfferListingDtoV1AdditionalMarketplaceSellingMode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferListingDtoV1AdditionalMarketplaceSellingMode.class);
  }

  /**
   * Convert an instance of OfferListingDtoV1AdditionalMarketplaceSellingMode to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

