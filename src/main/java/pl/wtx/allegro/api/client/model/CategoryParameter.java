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
import org.openapitools.jackson.nullable.JsonNullable;
import pl.wtx.allegro.api.client.model.CategoryParameterDisplayConditions;
import pl.wtx.allegro.api.client.model.CategoryParameterOptions;
import pl.wtx.allegro.api.client.model.CategoryParameterRequirementConditions;

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
 * CategoryParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class CategoryParameter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  protected String type;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  @javax.annotation.Nullable
  private Boolean required;

  public static final String SERIALIZED_NAME_REQUIRED_FOR_PRODUCT = "requiredForProduct";
  @SerializedName(SERIALIZED_NAME_REQUIRED_FOR_PRODUCT)
  @javax.annotation.Nullable
  private Boolean requiredForProduct;

  public static final String SERIALIZED_NAME_REQUIRED_IF = "requiredIf";
  @SerializedName(SERIALIZED_NAME_REQUIRED_IF)
  @javax.annotation.Nullable
  private CategoryParameterRequirementConditions requiredIf;

  public static final String SERIALIZED_NAME_DISPLAYED_IF = "displayedIf";
  @SerializedName(SERIALIZED_NAME_DISPLAYED_IF)
  @javax.annotation.Nullable
  private CategoryParameterDisplayConditions displayedIf;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  @javax.annotation.Nullable
  private String unit;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  @javax.annotation.Nullable
  private CategoryParameterOptions options;

  public CategoryParameter() {
    this.type = this.getClass().getSimpleName();
  }

  public CategoryParameter id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the parameter.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public CategoryParameter name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the parameter in Polish.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public CategoryParameter type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the parameter. Other fields in this structure may appear based on the type of the parameter.
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public CategoryParameter required(@javax.annotation.Nullable Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Indicates whether the value of this parameter must be set in an offer. Offers without required parameters set cannot be published. See also &#x60;requiredIf&#x60;.
   * @return required
   */
  @javax.annotation.Nullable
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(@javax.annotation.Nullable Boolean required) {
    this.required = required;
  }


  public CategoryParameter requiredForProduct(@javax.annotation.Nullable Boolean requiredForProduct) {
    this.requiredForProduct = requiredForProduct;
    return this;
  }

  /**
   * Indicates whether the value of this parameter must be set in a product. Product without required parameters set cannot be created.
   * @return requiredForProduct
   */
  @javax.annotation.Nullable
  public Boolean getRequiredForProduct() {
    return requiredForProduct;
  }

  public void setRequiredForProduct(@javax.annotation.Nullable Boolean requiredForProduct) {
    this.requiredForProduct = requiredForProduct;
  }


  public CategoryParameter requiredIf(@javax.annotation.Nullable CategoryParameterRequirementConditions requiredIf) {
    this.requiredIf = requiredIf;
    return this;
  }

  /**
   * Get requiredIf
   * @return requiredIf
   */
  @javax.annotation.Nullable
  public CategoryParameterRequirementConditions getRequiredIf() {
    return requiredIf;
  }

  public void setRequiredIf(@javax.annotation.Nullable CategoryParameterRequirementConditions requiredIf) {
    this.requiredIf = requiredIf;
  }


  public CategoryParameter displayedIf(@javax.annotation.Nullable CategoryParameterDisplayConditions displayedIf) {
    this.displayedIf = displayedIf;
    return this;
  }

  /**
   * Get displayedIf
   * @return displayedIf
   */
  @javax.annotation.Nullable
  public CategoryParameterDisplayConditions getDisplayedIf() {
    return displayedIf;
  }

  public void setDisplayedIf(@javax.annotation.Nullable CategoryParameterDisplayConditions displayedIf) {
    this.displayedIf = displayedIf;
  }


  public CategoryParameter unit(@javax.annotation.Nullable String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * The unit in which values of the parameter are used. May be &#x60;null&#x60;.
   * @return unit
   */
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }

  public void setUnit(@javax.annotation.Nullable String unit) {
    this.unit = unit;
  }


  public CategoryParameter options(@javax.annotation.Nullable CategoryParameterOptions options) {
    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nullable
  public CategoryParameterOptions getOptions() {
    return options;
  }

  public void setOptions(@javax.annotation.Nullable CategoryParameterOptions options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryParameter categoryParameter = (CategoryParameter) o;
    return Objects.equals(this.id, categoryParameter.id) &&
        Objects.equals(this.name, categoryParameter.name) &&
        Objects.equals(this.type, categoryParameter.type) &&
        Objects.equals(this.required, categoryParameter.required) &&
        Objects.equals(this.requiredForProduct, categoryParameter.requiredForProduct) &&
        Objects.equals(this.requiredIf, categoryParameter.requiredIf) &&
        Objects.equals(this.displayedIf, categoryParameter.displayedIf) &&
        Objects.equals(this.unit, categoryParameter.unit) &&
        Objects.equals(this.options, categoryParameter.options);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, required, requiredForProduct, requiredIf, displayedIf, unit, options);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryParameter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requiredForProduct: ").append(toIndentedString(requiredForProduct)).append("\n");
    sb.append("    requiredIf: ").append(toIndentedString(requiredIf)).append("\n");
    sb.append("    displayedIf: ").append(toIndentedString(displayedIf)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("required");
    openapiFields.add("requiredForProduct");
    openapiFields.add("requiredIf");
    openapiFields.add("displayedIf");
    openapiFields.add("unit");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CategoryParameter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CategoryParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CategoryParameter is not found in the empty JSON string", CategoryParameter.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("type").getAsString();
      switch (discriminatorValue) {
        case "dictionary":
          DictionaryCategoryParameter.validateJsonElement(jsonElement);
          break;
        case "float":
          FloatCategoryParameter.validateJsonElement(jsonElement);
          break;
        case "integer":
          IntegerCategoryParameter.validateJsonElement(jsonElement);
          break;
        case "string":
          StringCategoryParameter.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


  /**
   * Create an instance of CategoryParameter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CategoryParameter
   * @throws IOException if the JSON string is invalid with respect to CategoryParameter
   */
  public static CategoryParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CategoryParameter.class);
  }

  /**
   * Convert an instance of CategoryParameter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

