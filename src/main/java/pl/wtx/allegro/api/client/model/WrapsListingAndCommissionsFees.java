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
import pl.wtx.allegro.api.client.model.DescribesListingFee;
import pl.wtx.allegro.api.client.model.DescribesSuccessCommissionFee;

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
 * WrapsListingAndCommissionsFees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class WrapsListingAndCommissionsFees {
  public static final String SERIALIZED_NAME_COMMISSIONS = "commissions";
  @SerializedName(SERIALIZED_NAME_COMMISSIONS)
  @javax.annotation.Nonnull
  private List<DescribesSuccessCommissionFee> commissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUOTES = "quotes";
  @SerializedName(SERIALIZED_NAME_QUOTES)
  @javax.annotation.Nonnull
  private List<DescribesListingFee> quotes = new ArrayList<>();

  public WrapsListingAndCommissionsFees() {
  }

  public WrapsListingAndCommissionsFees commissions(@javax.annotation.Nonnull List<DescribesSuccessCommissionFee> commissions) {
    this.commissions = commissions;
    return this;
  }

  public WrapsListingAndCommissionsFees addCommissionsItem(DescribesSuccessCommissionFee commissionsItem) {
    if (this.commissions == null) {
      this.commissions = new ArrayList<>();
    }
    this.commissions.add(commissionsItem);
    return this;
  }

  /**
   * Get commissions
   * @return commissions
   */
  @javax.annotation.Nonnull
  public List<DescribesSuccessCommissionFee> getCommissions() {
    return commissions;
  }

  public void setCommissions(@javax.annotation.Nonnull List<DescribesSuccessCommissionFee> commissions) {
    this.commissions = commissions;
  }


  public WrapsListingAndCommissionsFees quotes(@javax.annotation.Nonnull List<DescribesListingFee> quotes) {
    this.quotes = quotes;
    return this;
  }

  public WrapsListingAndCommissionsFees addQuotesItem(DescribesListingFee quotesItem) {
    if (this.quotes == null) {
      this.quotes = new ArrayList<>();
    }
    this.quotes.add(quotesItem);
    return this;
  }

  /**
   * Get quotes
   * @return quotes
   */
  @javax.annotation.Nonnull
  public List<DescribesListingFee> getQuotes() {
    return quotes;
  }

  public void setQuotes(@javax.annotation.Nonnull List<DescribesListingFee> quotes) {
    this.quotes = quotes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WrapsListingAndCommissionsFees wrapsListingAndCommissionsFees = (WrapsListingAndCommissionsFees) o;
    return Objects.equals(this.commissions, wrapsListingAndCommissionsFees.commissions) &&
        Objects.equals(this.quotes, wrapsListingAndCommissionsFees.quotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissions, quotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapsListingAndCommissionsFees {\n");
    sb.append("    commissions: ").append(toIndentedString(commissions)).append("\n");
    sb.append("    quotes: ").append(toIndentedString(quotes)).append("\n");
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
    openapiFields.add("commissions");
    openapiFields.add("quotes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("commissions");
    openapiRequiredFields.add("quotes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WrapsListingAndCommissionsFees
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WrapsListingAndCommissionsFees.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WrapsListingAndCommissionsFees is not found in the empty JSON string", WrapsListingAndCommissionsFees.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WrapsListingAndCommissionsFees.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WrapsListingAndCommissionsFees` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WrapsListingAndCommissionsFees.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("commissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `commissions` to be an array in the JSON string but got `%s`", jsonObj.get("commissions").toString()));
      }

      JsonArray jsonArraycommissions = jsonObj.getAsJsonArray("commissions");
      // validate the required field `commissions` (array)
      for (int i = 0; i < jsonArraycommissions.size(); i++) {
        DescribesSuccessCommissionFee.validateJsonElement(jsonArraycommissions.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("quotes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `quotes` to be an array in the JSON string but got `%s`", jsonObj.get("quotes").toString()));
      }

      JsonArray jsonArrayquotes = jsonObj.getAsJsonArray("quotes");
      // validate the required field `quotes` (array)
      for (int i = 0; i < jsonArrayquotes.size(); i++) {
        DescribesListingFee.validateJsonElement(jsonArrayquotes.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WrapsListingAndCommissionsFees.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WrapsListingAndCommissionsFees' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WrapsListingAndCommissionsFees> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WrapsListingAndCommissionsFees.class));

       return (TypeAdapter<T>) new TypeAdapter<WrapsListingAndCommissionsFees>() {
           @Override
           public void write(JsonWriter out, WrapsListingAndCommissionsFees value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WrapsListingAndCommissionsFees read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WrapsListingAndCommissionsFees given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WrapsListingAndCommissionsFees
   * @throws IOException if the JSON string is invalid with respect to WrapsListingAndCommissionsFees
   */
  public static WrapsListingAndCommissionsFees fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WrapsListingAndCommissionsFees.class);
  }

  /**
   * Convert an instance of WrapsListingAndCommissionsFees to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

