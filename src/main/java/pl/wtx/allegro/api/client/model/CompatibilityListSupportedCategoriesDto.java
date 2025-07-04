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
import pl.wtx.allegro.api.client.model.CompatibilityListSupportedCategoriesDtoSupportedCategoriesInner;

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
 * CompatibilityListSupportedCategoriesDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class CompatibilityListSupportedCategoriesDto {
  public static final String SERIALIZED_NAME_SUPPORTED_CATEGORIES = "supportedCategories";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_CATEGORIES)
  @javax.annotation.Nullable
  private List<CompatibilityListSupportedCategoriesDtoSupportedCategoriesInner> supportedCategories = new ArrayList<>();

  public CompatibilityListSupportedCategoriesDto() {
  }

  public CompatibilityListSupportedCategoriesDto supportedCategories(@javax.annotation.Nullable List<CompatibilityListSupportedCategoriesDtoSupportedCategoriesInner> supportedCategories) {
    this.supportedCategories = supportedCategories;
    return this;
  }

  public CompatibilityListSupportedCategoriesDto addSupportedCategoriesItem(CompatibilityListSupportedCategoriesDtoSupportedCategoriesInner supportedCategoriesItem) {
    if (this.supportedCategories == null) {
      this.supportedCategories = new ArrayList<>();
    }
    this.supportedCategories.add(supportedCategoriesItem);
    return this;
  }

  /**
   * List with information about categories where compatibility list is supported. &lt;a href&#x3D;\&quot; https://developer.allegro.pl/compatibility_list/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Read more&lt;/a&gt;.
   * @return supportedCategories
   */
  @javax.annotation.Nullable
  public List<CompatibilityListSupportedCategoriesDtoSupportedCategoriesInner> getSupportedCategories() {
    return supportedCategories;
  }

  public void setSupportedCategories(@javax.annotation.Nullable List<CompatibilityListSupportedCategoriesDtoSupportedCategoriesInner> supportedCategories) {
    this.supportedCategories = supportedCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatibilityListSupportedCategoriesDto compatibilityListSupportedCategoriesDto = (CompatibilityListSupportedCategoriesDto) o;
    return Objects.equals(this.supportedCategories, compatibilityListSupportedCategoriesDto.supportedCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilityListSupportedCategoriesDto {\n");
    sb.append("    supportedCategories: ").append(toIndentedString(supportedCategories)).append("\n");
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
    openapiFields.add("supportedCategories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CompatibilityListSupportedCategoriesDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CompatibilityListSupportedCategoriesDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompatibilityListSupportedCategoriesDto is not found in the empty JSON string", CompatibilityListSupportedCategoriesDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CompatibilityListSupportedCategoriesDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompatibilityListSupportedCategoriesDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("supportedCategories") != null && !jsonObj.get("supportedCategories").isJsonNull()) {
        JsonArray jsonArraysupportedCategories = jsonObj.getAsJsonArray("supportedCategories");
        if (jsonArraysupportedCategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("supportedCategories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `supportedCategories` to be an array in the JSON string but got `%s`", jsonObj.get("supportedCategories").toString()));
          }

          // validate the optional field `supportedCategories` (array)
          for (int i = 0; i < jsonArraysupportedCategories.size(); i++) {
            CompatibilityListSupportedCategoriesDtoSupportedCategoriesInner.validateJsonElement(jsonArraysupportedCategories.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompatibilityListSupportedCategoriesDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompatibilityListSupportedCategoriesDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompatibilityListSupportedCategoriesDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompatibilityListSupportedCategoriesDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CompatibilityListSupportedCategoriesDto>() {
           @Override
           public void write(JsonWriter out, CompatibilityListSupportedCategoriesDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompatibilityListSupportedCategoriesDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CompatibilityListSupportedCategoriesDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompatibilityListSupportedCategoriesDto
   * @throws IOException if the JSON string is invalid with respect to CompatibilityListSupportedCategoriesDto
   */
  public static CompatibilityListSupportedCategoriesDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompatibilityListSupportedCategoriesDto.class);
  }

  /**
   * Convert an instance of CompatibilityListSupportedCategoriesDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

