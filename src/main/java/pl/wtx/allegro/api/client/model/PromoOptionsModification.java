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
 * PromoOptionsModification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class PromoOptionsModification {
  /**
   * Type of modification to be applied.
   */
  @JsonAdapter(ModificationTypeEnum.Adapter.class)
  public enum ModificationTypeEnum {
    CHANGE("CHANGE"),
    
    REMOVE_WITH_END_OF_CYCLE("REMOVE_WITH_END_OF_CYCLE"),
    
    REMOVE_NOW("REMOVE_NOW");

    private String value;

    ModificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModificationTypeEnum fromValue(String value) {
      for (ModificationTypeEnum b : ModificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModificationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ModificationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MODIFICATION_TYPE = "modificationType";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_TYPE)
  @javax.annotation.Nullable
  private ModificationTypeEnum modificationType;

  /**
   * Type of promotion package to be changed/removed.
   */
  @JsonAdapter(PackageTypeEnum.Adapter.class)
  public enum PackageTypeEnum {
    BASE("BASE"),
    
    EXTRA("EXTRA");

    private String value;

    PackageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PackageTypeEnum fromValue(String value) {
      for (PackageTypeEnum b : PackageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PackageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PackageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PackageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PackageTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PackageTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PACKAGE_TYPE = "packageType";
  @SerializedName(SERIALIZED_NAME_PACKAGE_TYPE)
  @javax.annotation.Nullable
  private PackageTypeEnum packageType;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "packageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  @javax.annotation.Nullable
  private String packageId;

  public PromoOptionsModification() {
  }

  public PromoOptionsModification modificationType(@javax.annotation.Nullable ModificationTypeEnum modificationType) {
    this.modificationType = modificationType;
    return this;
  }

  /**
   * Type of modification to be applied.
   * @return modificationType
   */
  @javax.annotation.Nullable
  public ModificationTypeEnum getModificationType() {
    return modificationType;
  }

  public void setModificationType(@javax.annotation.Nullable ModificationTypeEnum modificationType) {
    this.modificationType = modificationType;
  }


  public PromoOptionsModification packageType(@javax.annotation.Nullable PackageTypeEnum packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * Type of promotion package to be changed/removed.
   * @return packageType
   */
  @javax.annotation.Nullable
  public PackageTypeEnum getPackageType() {
    return packageType;
  }

  public void setPackageType(@javax.annotation.Nullable PackageTypeEnum packageType) {
    this.packageType = packageType;
  }


  public PromoOptionsModification packageId(@javax.annotation.Nullable String packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * Promotion package identifier.
   * @return packageId
   */
  @javax.annotation.Nullable
  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(@javax.annotation.Nullable String packageId) {
    this.packageId = packageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoOptionsModification promoOptionsModification = (PromoOptionsModification) o;
    return Objects.equals(this.modificationType, promoOptionsModification.modificationType) &&
        Objects.equals(this.packageType, promoOptionsModification.packageType) &&
        Objects.equals(this.packageId, promoOptionsModification.packageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modificationType, packageType, packageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoOptionsModification {\n");
    sb.append("    modificationType: ").append(toIndentedString(modificationType)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
    openapiFields.add("modificationType");
    openapiFields.add("packageType");
    openapiFields.add("packageId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PromoOptionsModification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PromoOptionsModification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromoOptionsModification is not found in the empty JSON string", PromoOptionsModification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PromoOptionsModification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PromoOptionsModification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("modificationType") != null && !jsonObj.get("modificationType").isJsonNull()) && !jsonObj.get("modificationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modificationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modificationType").toString()));
      }
      // validate the optional field `modificationType`
      if (jsonObj.get("modificationType") != null && !jsonObj.get("modificationType").isJsonNull()) {
        ModificationTypeEnum.validateJsonElement(jsonObj.get("modificationType"));
      }
      if ((jsonObj.get("packageType") != null && !jsonObj.get("packageType").isJsonNull()) && !jsonObj.get("packageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `packageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("packageType").toString()));
      }
      // validate the optional field `packageType`
      if (jsonObj.get("packageType") != null && !jsonObj.get("packageType").isJsonNull()) {
        PackageTypeEnum.validateJsonElement(jsonObj.get("packageType"));
      }
      if ((jsonObj.get("packageId") != null && !jsonObj.get("packageId").isJsonNull()) && !jsonObj.get("packageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `packageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("packageId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromoOptionsModification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromoOptionsModification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromoOptionsModification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromoOptionsModification.class));

       return (TypeAdapter<T>) new TypeAdapter<PromoOptionsModification>() {
           @Override
           public void write(JsonWriter out, PromoOptionsModification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromoOptionsModification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PromoOptionsModification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PromoOptionsModification
   * @throws IOException if the JSON string is invalid with respect to PromoOptionsModification
   */
  public static PromoOptionsModification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromoOptionsModification.class);
  }

  /**
   * Convert an instance of PromoOptionsModification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

