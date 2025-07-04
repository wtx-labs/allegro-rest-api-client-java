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
import pl.wtx.allegro.api.client.model.ExternalId;
import pl.wtx.allegro.api.client.model.Location;
import pl.wtx.allegro.api.client.model.MessageToSellerSettings;
import pl.wtx.allegro.api.client.model.OfferTaxSettings;
import pl.wtx.allegro.api.client.model.Payments;
import pl.wtx.allegro.api.client.model.SellingMode;
import pl.wtx.allegro.api.client.model.SizeTable;
import pl.wtx.allegro.api.client.model.StandardizedDescription;

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
 * Single offer data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class SaleProductOffer {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  @javax.annotation.Nullable
  private Payments payments;

  public static final String SERIALIZED_NAME_SELLING_MODE = "sellingMode";
  @SerializedName(SERIALIZED_NAME_SELLING_MODE)
  @javax.annotation.Nullable
  private SellingMode sellingMode;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  @javax.annotation.Nullable
  private Location location;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  @javax.annotation.Nullable
  private List<String> images = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private StandardizedDescription description;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  @javax.annotation.Nullable
  private ExternalId external;

  public static final String SERIALIZED_NAME_SIZE_TABLE = "sizeTable";
  @SerializedName(SERIALIZED_NAME_SIZE_TABLE)
  @javax.annotation.Nullable
  private SizeTable sizeTable;

  public static final String SERIALIZED_NAME_TAX_SETTINGS = "taxSettings";
  @SerializedName(SERIALIZED_NAME_TAX_SETTINGS)
  @javax.annotation.Nullable
  private OfferTaxSettings taxSettings;

  public static final String SERIALIZED_NAME_MESSAGE_TO_SELLER_SETTINGS = "messageToSellerSettings";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TO_SELLER_SETTINGS)
  @javax.annotation.Nullable
  private MessageToSellerSettings messageToSellerSettings;

  public SaleProductOffer() {
  }

  public SaleProductOffer name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name (title) of an offer. Length cannot be more than 75 characters. Read more: &lt;a href&#x3D;\&quot;../../tutorials/jak-jednym-requestem-wystawic-oferte-powiazana-z-produktem-D7Kj9gw4xFA#tytul-oferty\&quot; target&#x3D;\&quot;_blank\&quot;&gt;PL&lt;/a&gt;  / &lt;a href&#x3D;\&quot;../../tutorials/list-offer-assigned-product-one-request-D7Kj9M71Bu6#offer-title\&quot; target&#x3D;\&quot;_blank\&quot;&gt;EN&lt;/a&gt; .
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public SaleProductOffer payments(@javax.annotation.Nullable Payments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
   */
  @javax.annotation.Nullable
  public Payments getPayments() {
    return payments;
  }

  public void setPayments(@javax.annotation.Nullable Payments payments) {
    this.payments = payments;
  }


  public SaleProductOffer sellingMode(@javax.annotation.Nullable SellingMode sellingMode) {
    this.sellingMode = sellingMode;
    return this;
  }

  /**
   * Get sellingMode
   * @return sellingMode
   */
  @javax.annotation.Nullable
  public SellingMode getSellingMode() {
    return sellingMode;
  }

  public void setSellingMode(@javax.annotation.Nullable SellingMode sellingMode) {
    this.sellingMode = sellingMode;
  }


  public SaleProductOffer location(@javax.annotation.Nullable Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public Location getLocation() {
    return location;
  }

  public void setLocation(@javax.annotation.Nullable Location location) {
    this.location = location;
  }


  public SaleProductOffer images(@javax.annotation.Nullable List<String> images) {
    this.images = images;
    return this;
  }

  public SaleProductOffer addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
   */
  @javax.annotation.Nullable
  public List<String> getImages() {
    return images;
  }

  public void setImages(@javax.annotation.Nullable List<String> images) {
    this.images = images;
  }


  public SaleProductOffer description(@javax.annotation.Nullable StandardizedDescription description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public StandardizedDescription getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable StandardizedDescription description) {
    this.description = description;
  }


  public SaleProductOffer external(@javax.annotation.Nullable ExternalId external) {
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


  public SaleProductOffer sizeTable(@javax.annotation.Nullable SizeTable sizeTable) {
    this.sizeTable = sizeTable;
    return this;
  }

  /**
   * Get sizeTable
   * @return sizeTable
   */
  @javax.annotation.Nullable
  public SizeTable getSizeTable() {
    return sizeTable;
  }

  public void setSizeTable(@javax.annotation.Nullable SizeTable sizeTable) {
    this.sizeTable = sizeTable;
  }


  public SaleProductOffer taxSettings(@javax.annotation.Nullable OfferTaxSettings taxSettings) {
    this.taxSettings = taxSettings;
    return this;
  }

  /**
   * Get taxSettings
   * @return taxSettings
   */
  @javax.annotation.Nullable
  public OfferTaxSettings getTaxSettings() {
    return taxSettings;
  }

  public void setTaxSettings(@javax.annotation.Nullable OfferTaxSettings taxSettings) {
    this.taxSettings = taxSettings;
  }


  public SaleProductOffer messageToSellerSettings(@javax.annotation.Nullable MessageToSellerSettings messageToSellerSettings) {
    this.messageToSellerSettings = messageToSellerSettings;
    return this;
  }

  /**
   * Get messageToSellerSettings
   * @return messageToSellerSettings
   */
  @javax.annotation.Nullable
  public MessageToSellerSettings getMessageToSellerSettings() {
    return messageToSellerSettings;
  }

  public void setMessageToSellerSettings(@javax.annotation.Nullable MessageToSellerSettings messageToSellerSettings) {
    this.messageToSellerSettings = messageToSellerSettings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleProductOffer saleProductOffer = (SaleProductOffer) o;
    return Objects.equals(this.name, saleProductOffer.name) &&
        Objects.equals(this.payments, saleProductOffer.payments) &&
        Objects.equals(this.sellingMode, saleProductOffer.sellingMode) &&
        Objects.equals(this.location, saleProductOffer.location) &&
        Objects.equals(this.images, saleProductOffer.images) &&
        Objects.equals(this.description, saleProductOffer.description) &&
        Objects.equals(this.external, saleProductOffer.external) &&
        Objects.equals(this.sizeTable, saleProductOffer.sizeTable) &&
        Objects.equals(this.taxSettings, saleProductOffer.taxSettings) &&
        Objects.equals(this.messageToSellerSettings, saleProductOffer.messageToSellerSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, payments, sellingMode, location, images, description, external, sizeTable, taxSettings, messageToSellerSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleProductOffer {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    sellingMode: ").append(toIndentedString(sellingMode)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    sizeTable: ").append(toIndentedString(sizeTable)).append("\n");
    sb.append("    taxSettings: ").append(toIndentedString(taxSettings)).append("\n");
    sb.append("    messageToSellerSettings: ").append(toIndentedString(messageToSellerSettings)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("payments");
    openapiFields.add("sellingMode");
    openapiFields.add("location");
    openapiFields.add("images");
    openapiFields.add("description");
    openapiFields.add("external");
    openapiFields.add("sizeTable");
    openapiFields.add("taxSettings");
    openapiFields.add("messageToSellerSettings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SaleProductOffer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SaleProductOffer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SaleProductOffer is not found in the empty JSON string", SaleProductOffer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SaleProductOffer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SaleProductOffer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `payments`
      if (jsonObj.get("payments") != null && !jsonObj.get("payments").isJsonNull()) {
        Payments.validateJsonElement(jsonObj.get("payments"));
      }
      // validate the optional field `sellingMode`
      if (jsonObj.get("sellingMode") != null && !jsonObj.get("sellingMode").isJsonNull()) {
        SellingMode.validateJsonElement(jsonObj.get("sellingMode"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        Location.validateJsonElement(jsonObj.get("location"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonNull() && !jsonObj.get("images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        StandardizedDescription.validateJsonElement(jsonObj.get("description"));
      }
      // validate the optional field `external`
      if (jsonObj.get("external") != null && !jsonObj.get("external").isJsonNull()) {
        ExternalId.validateJsonElement(jsonObj.get("external"));
      }
      // validate the optional field `sizeTable`
      if (jsonObj.get("sizeTable") != null && !jsonObj.get("sizeTable").isJsonNull()) {
        SizeTable.validateJsonElement(jsonObj.get("sizeTable"));
      }
      // validate the optional field `taxSettings`
      if (jsonObj.get("taxSettings") != null && !jsonObj.get("taxSettings").isJsonNull()) {
        OfferTaxSettings.validateJsonElement(jsonObj.get("taxSettings"));
      }
      // validate the optional field `messageToSellerSettings`
      if (jsonObj.get("messageToSellerSettings") != null && !jsonObj.get("messageToSellerSettings").isJsonNull()) {
        MessageToSellerSettings.validateJsonElement(jsonObj.get("messageToSellerSettings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SaleProductOffer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SaleProductOffer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SaleProductOffer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SaleProductOffer.class));

       return (TypeAdapter<T>) new TypeAdapter<SaleProductOffer>() {
           @Override
           public void write(JsonWriter out, SaleProductOffer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SaleProductOffer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SaleProductOffer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SaleProductOffer
   * @throws IOException if the JSON string is invalid with respect to SaleProductOffer
   */
  public static SaleProductOffer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SaleProductOffer.class);
  }

  /**
   * Convert an instance of SaleProductOffer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

