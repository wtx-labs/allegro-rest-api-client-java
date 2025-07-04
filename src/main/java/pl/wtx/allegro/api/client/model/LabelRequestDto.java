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
 * LabelRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class LabelRequestDto {
  public static final String SERIALIZED_NAME_SHIPMENT_IDS = "shipmentIds";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_IDS)
  @javax.annotation.Nonnull
  private List<String> shipmentIds = new ArrayList<>();

  /**
   * Label page format. Only for PDF file.
   */
  @JsonAdapter(PageSizeEnum.Adapter.class)
  public enum PageSizeEnum {
    A4("A4"),
    
    A6("A6");

    private String value;

    PageSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageSizeEnum fromValue(String value) {
      for (PageSizeEnum b : PageSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PageSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PageSizeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PageSizeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  @javax.annotation.Nullable
  private PageSizeEnum pageSize;

  public static final String SERIALIZED_NAME_CUT_LINE = "cutLine";
  @SerializedName(SERIALIZED_NAME_CUT_LINE)
  @javax.annotation.Nullable
  private Boolean cutLine;

  public LabelRequestDto() {
  }

  public LabelRequestDto shipmentIds(@javax.annotation.Nonnull List<String> shipmentIds) {
    this.shipmentIds = shipmentIds;
    return this;
  }

  public LabelRequestDto addShipmentIdsItem(String shipmentIdsItem) {
    if (this.shipmentIds == null) {
      this.shipmentIds = new ArrayList<>();
    }
    this.shipmentIds.add(shipmentIdsItem);
    return this;
  }

  /**
   * Get shipmentIds
   * @return shipmentIds
   */
  @javax.annotation.Nonnull
  public List<String> getShipmentIds() {
    return shipmentIds;
  }

  public void setShipmentIds(@javax.annotation.Nonnull List<String> shipmentIds) {
    this.shipmentIds = shipmentIds;
  }


  public LabelRequestDto pageSize(@javax.annotation.Nullable PageSizeEnum pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Label page format. Only for PDF file.
   * @return pageSize
   */
  @javax.annotation.Nullable
  public PageSizeEnum getPageSize() {
    return pageSize;
  }

  public void setPageSize(@javax.annotation.Nullable PageSizeEnum pageSize) {
    this.pageSize = pageSize;
  }


  public LabelRequestDto cutLine(@javax.annotation.Nullable Boolean cutLine) {
    this.cutLine = cutLine;
    return this;
  }

  /**
   * Put additional cut lines. Only for PDF file with A4 size.
   * @return cutLine
   */
  @javax.annotation.Nullable
  public Boolean getCutLine() {
    return cutLine;
  }

  public void setCutLine(@javax.annotation.Nullable Boolean cutLine) {
    this.cutLine = cutLine;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelRequestDto labelRequestDto = (LabelRequestDto) o;
    return Objects.equals(this.shipmentIds, labelRequestDto.shipmentIds) &&
        Objects.equals(this.pageSize, labelRequestDto.pageSize) &&
        Objects.equals(this.cutLine, labelRequestDto.cutLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentIds, pageSize, cutLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelRequestDto {\n");
    sb.append("    shipmentIds: ").append(toIndentedString(shipmentIds)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    cutLine: ").append(toIndentedString(cutLine)).append("\n");
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
    openapiFields.add("shipmentIds");
    openapiFields.add("pageSize");
    openapiFields.add("cutLine");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shipmentIds");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LabelRequestDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LabelRequestDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LabelRequestDto is not found in the empty JSON string", LabelRequestDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LabelRequestDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LabelRequestDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LabelRequestDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("shipmentIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("shipmentIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipmentIds` to be an array in the JSON string but got `%s`", jsonObj.get("shipmentIds").toString()));
      }
      if ((jsonObj.get("pageSize") != null && !jsonObj.get("pageSize").isJsonNull()) && !jsonObj.get("pageSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageSize").toString()));
      }
      // validate the optional field `pageSize`
      if (jsonObj.get("pageSize") != null && !jsonObj.get("pageSize").isJsonNull()) {
        PageSizeEnum.validateJsonElement(jsonObj.get("pageSize"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LabelRequestDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LabelRequestDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LabelRequestDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LabelRequestDto.class));

       return (TypeAdapter<T>) new TypeAdapter<LabelRequestDto>() {
           @Override
           public void write(JsonWriter out, LabelRequestDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LabelRequestDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LabelRequestDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LabelRequestDto
   * @throws IOException if the JSON string is invalid with respect to LabelRequestDto
   */
  public static LabelRequestDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LabelRequestDto.class);
  }

  /**
   * Convert an instance of LabelRequestDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

