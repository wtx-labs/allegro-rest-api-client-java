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
import pl.wtx.allegro.api.client.model.CompatibleProductsGroupsDtoGroupsInner;

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
 * CompatibleProductsGroupsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class CompatibleProductsGroupsDto {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  @javax.annotation.Nullable
  private List<CompatibleProductsGroupsDtoGroupsInner> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  @javax.annotation.Nullable
  private Integer count;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  @javax.annotation.Nullable
  private Integer totalCount;

  public CompatibleProductsGroupsDto() {
  }

  public CompatibleProductsGroupsDto groups(@javax.annotation.Nullable List<CompatibleProductsGroupsDtoGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public CompatibleProductsGroupsDto addGroupsItem(CompatibleProductsGroupsDtoGroupsInner groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * List of groups for given type of compatible products.
   * @return groups
   */
  @javax.annotation.Nullable
  public List<CompatibleProductsGroupsDtoGroupsInner> getGroups() {
    return groups;
  }

  public void setGroups(@javax.annotation.Nullable List<CompatibleProductsGroupsDtoGroupsInner> groups) {
    this.groups = groups;
  }


  public CompatibleProductsGroupsDto count(@javax.annotation.Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of returned elements.
   * minimum: 0
   * @return count
   */
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }

  public void setCount(@javax.annotation.Nullable Integer count) {
    this.count = count;
  }


  public CompatibleProductsGroupsDto totalCount(@javax.annotation.Nullable Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of available elements.
   * minimum: 0
   * @return totalCount
   */
  @javax.annotation.Nullable
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(@javax.annotation.Nullable Integer totalCount) {
    this.totalCount = totalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatibleProductsGroupsDto compatibleProductsGroupsDto = (CompatibleProductsGroupsDto) o;
    return Objects.equals(this.groups, compatibleProductsGroupsDto.groups) &&
        Objects.equals(this.count, compatibleProductsGroupsDto.count) &&
        Objects.equals(this.totalCount, compatibleProductsGroupsDto.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, count, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibleProductsGroupsDto {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("groups");
    openapiFields.add("count");
    openapiFields.add("totalCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CompatibleProductsGroupsDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CompatibleProductsGroupsDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompatibleProductsGroupsDto is not found in the empty JSON string", CompatibleProductsGroupsDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CompatibleProductsGroupsDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompatibleProductsGroupsDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            CompatibleProductsGroupsDtoGroupsInner.validateJsonElement(jsonArraygroups.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompatibleProductsGroupsDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompatibleProductsGroupsDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompatibleProductsGroupsDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompatibleProductsGroupsDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CompatibleProductsGroupsDto>() {
           @Override
           public void write(JsonWriter out, CompatibleProductsGroupsDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompatibleProductsGroupsDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CompatibleProductsGroupsDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompatibleProductsGroupsDto
   * @throws IOException if the JSON string is invalid with respect to CompatibleProductsGroupsDto
   */
  public static CompatibleProductsGroupsDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompatibleProductsGroupsDto.class);
  }

  /**
   * Convert an instance of CompatibleProductsGroupsDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

