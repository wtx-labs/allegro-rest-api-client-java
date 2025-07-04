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
 * Allows you to change duration of the offers. You can include only property in a request \&quot;duration\&quot; or \&quot;durationUnlimited\&quot;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class ModificationPublication {
  /**
   * Offer duration time provided in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
   */
  @JsonAdapter(DurationEnum.Adapter.class)
  public enum DurationEnum {
    PT72_H("PT72H"),
    
    PT120_H("PT120H"),
    
    PT168_H("PT168H"),
    
    PT240_H("PT240H"),
    
    PT480_H("PT480H"),
    
    PT720_H("PT720H"),
    
    P3_D("P3D"),
    
    P5_D("P5D"),
    
    P7_D("P7D"),
    
    P10_D("P10D"),
    
    P20_D("P20D"),
    
    P30_D("P30D");

    private String value;

    DurationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DurationEnum fromValue(String value) {
      for (DurationEnum b : DurationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DurationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DurationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DurationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DurationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DurationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  @javax.annotation.Nullable
  private DurationEnum duration;

  public static final String SERIALIZED_NAME_DURATION_UNLIMITED = "durationUnlimited";
  @SerializedName(SERIALIZED_NAME_DURATION_UNLIMITED)
  @javax.annotation.Nullable
  private Boolean durationUnlimited;

  public ModificationPublication() {
  }

  public ModificationPublication duration(@javax.annotation.Nullable DurationEnum duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Offer duration time provided in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
   * @return duration
   */
  @javax.annotation.Nullable
  public DurationEnum getDuration() {
    return duration;
  }

  public void setDuration(@javax.annotation.Nullable DurationEnum duration) {
    this.duration = duration;
  }


  public ModificationPublication durationUnlimited(@javax.annotation.Nullable Boolean durationUnlimited) {
    this.durationUnlimited = durationUnlimited;
    return this;
  }

  /**
   * Unlimited duration time.
   * @return durationUnlimited
   */
  @javax.annotation.Nullable
  public Boolean getDurationUnlimited() {
    return durationUnlimited;
  }

  public void setDurationUnlimited(@javax.annotation.Nullable Boolean durationUnlimited) {
    this.durationUnlimited = durationUnlimited;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModificationPublication modificationPublication = (ModificationPublication) o;
    return Objects.equals(this.duration, modificationPublication.duration) &&
        Objects.equals(this.durationUnlimited, modificationPublication.durationUnlimited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, durationUnlimited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationPublication {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    durationUnlimited: ").append(toIndentedString(durationUnlimited)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("durationUnlimited");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModificationPublication
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModificationPublication.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModificationPublication is not found in the empty JSON string", ModificationPublication.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModificationPublication.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModificationPublication` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      // validate the optional field `duration`
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) {
        DurationEnum.validateJsonElement(jsonObj.get("duration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModificationPublication.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModificationPublication' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModificationPublication> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModificationPublication.class));

       return (TypeAdapter<T>) new TypeAdapter<ModificationPublication>() {
           @Override
           public void write(JsonWriter out, ModificationPublication value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModificationPublication read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModificationPublication given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModificationPublication
   * @throws IOException if the JSON string is invalid with respect to ModificationPublication
   */
  public static ModificationPublication fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModificationPublication.class);
  }

  /**
   * Convert an instance of ModificationPublication to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

