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
import pl.wtx.allegro.api.client.model.AnswerVBeta1;
import pl.wtx.allegro.api.client.model.CommentVBeta1;
import pl.wtx.allegro.api.client.model.Exclusion;
import pl.wtx.allegro.api.client.model.Justification;
import pl.wtx.allegro.api.client.model.Order;
import pl.wtx.allegro.api.client.model.Removal;
import pl.wtx.allegro.api.client.model.User;

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
 * UserRatingVBeta1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class UserRatingVBeta1 {
  public static final String SERIALIZED_NAME_ANSWER = "answer";
  @SerializedName(SERIALIZED_NAME_ANSWER)
  @javax.annotation.Nullable
  private AnswerVBeta1 answer;

  public static final String SERIALIZED_NAME_BUYER = "buyer";
  @SerializedName(SERIALIZED_NAME_BUYER)
  @javax.annotation.Nonnull
  private User buyer;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nullable
  private CommentVBeta1 comment;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private String createdAt;

  public static final String SERIALIZED_NAME_EDITED_AT = "editedAt";
  @SerializedName(SERIALIZED_NAME_EDITED_AT)
  @javax.annotation.Nullable
  private String editedAt;

  public static final String SERIALIZED_NAME_EXCLUSION = "exclusion";
  @SerializedName(SERIALIZED_NAME_EXCLUSION)
  @javax.annotation.Nullable
  private Exclusion exclusion;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_JUSTIFICATIONS = "justifications";
  @SerializedName(SERIALIZED_NAME_JUSTIFICATIONS)
  @javax.annotation.Nullable
  private List<Justification> justifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_CHANGED_AT = "lastChangedAt";
  @SerializedName(SERIALIZED_NAME_LAST_CHANGED_AT)
  @javax.annotation.Nullable
  private String lastChangedAt;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  @javax.annotation.Nonnull
  private Order order;

  public static final String SERIALIZED_NAME_RECOMMENDED = "recommended";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED)
  @javax.annotation.Nonnull
  private Boolean recommended;

  public static final String SERIALIZED_NAME_REMOVAL = "removal";
  @SerializedName(SERIALIZED_NAME_REMOVAL)
  @javax.annotation.Nullable
  private Removal removal;

  public UserRatingVBeta1() {
  }

  public UserRatingVBeta1 answer(@javax.annotation.Nullable AnswerVBeta1 answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
   */
  @javax.annotation.Nullable
  public AnswerVBeta1 getAnswer() {
    return answer;
  }

  public void setAnswer(@javax.annotation.Nullable AnswerVBeta1 answer) {
    this.answer = answer;
  }


  public UserRatingVBeta1 buyer(@javax.annotation.Nonnull User buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Get buyer
   * @return buyer
   */
  @javax.annotation.Nonnull
  public User getBuyer() {
    return buyer;
  }

  public void setBuyer(@javax.annotation.Nonnull User buyer) {
    this.buyer = buyer;
  }


  public UserRatingVBeta1 comment(@javax.annotation.Nullable CommentVBeta1 comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public CommentVBeta1 getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nullable CommentVBeta1 comment) {
    this.comment = comment;
  }


  public UserRatingVBeta1 createdAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation datetime in ISO 8601 format
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
  }


  public UserRatingVBeta1 editedAt(@javax.annotation.Nullable String editedAt) {
    this.editedAt = editedAt;
    return this;
  }

  /**
   * Edition datetime in ISO 8601 format
   * @return editedAt
   */
  @javax.annotation.Nullable
  public String getEditedAt() {
    return editedAt;
  }

  public void setEditedAt(@javax.annotation.Nullable String editedAt) {
    this.editedAt = editedAt;
  }


  public UserRatingVBeta1 exclusion(@javax.annotation.Nullable Exclusion exclusion) {
    this.exclusion = exclusion;
    return this;
  }

  /**
   * Get exclusion
   * @return exclusion
   */
  @javax.annotation.Nullable
  public Exclusion getExclusion() {
    return exclusion;
  }

  public void setExclusion(@javax.annotation.Nullable Exclusion exclusion) {
    this.exclusion = exclusion;
  }


  public UserRatingVBeta1 id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Rating id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public UserRatingVBeta1 justifications(@javax.annotation.Nullable List<Justification> justifications) {
    this.justifications = justifications;
    return this;
  }

  public UserRatingVBeta1 addJustificationsItem(Justification justificationsItem) {
    if (this.justifications == null) {
      this.justifications = new ArrayList<>();
    }
    this.justifications.add(justificationsItem);
    return this;
  }

  /**
   * List of the justifications chosen by the buyer while creating rating
   * @return justifications
   */
  @javax.annotation.Nullable
  public List<Justification> getJustifications() {
    return justifications;
  }

  public void setJustifications(@javax.annotation.Nullable List<Justification> justifications) {
    this.justifications = justifications;
  }


  public UserRatingVBeta1 lastChangedAt(@javax.annotation.Nullable String lastChangedAt) {
    this.lastChangedAt = lastChangedAt;
    return this;
  }

  /**
   * Last change (creation or latest edition) datetime in ISO 8601 format
   * @return lastChangedAt
   */
  @javax.annotation.Nullable
  public String getLastChangedAt() {
    return lastChangedAt;
  }

  public void setLastChangedAt(@javax.annotation.Nullable String lastChangedAt) {
    this.lastChangedAt = lastChangedAt;
  }


  public UserRatingVBeta1 order(@javax.annotation.Nonnull Order order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   */
  @javax.annotation.Nonnull
  public Order getOrder() {
    return order;
  }

  public void setOrder(@javax.annotation.Nonnull Order order) {
    this.order = order;
  }


  public UserRatingVBeta1 recommended(@javax.annotation.Nonnull Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

  /**
   * Whether buyer recommends the order
   * @return recommended
   */
  @javax.annotation.Nonnull
  public Boolean getRecommended() {
    return recommended;
  }

  public void setRecommended(@javax.annotation.Nonnull Boolean recommended) {
    this.recommended = recommended;
  }


  public UserRatingVBeta1 removal(@javax.annotation.Nullable Removal removal) {
    this.removal = removal;
    return this;
  }

  /**
   * Get removal
   * @return removal
   */
  @javax.annotation.Nullable
  public Removal getRemoval() {
    return removal;
  }

  public void setRemoval(@javax.annotation.Nullable Removal removal) {
    this.removal = removal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRatingVBeta1 userRatingVBeta1 = (UserRatingVBeta1) o;
    return Objects.equals(this.answer, userRatingVBeta1.answer) &&
        Objects.equals(this.buyer, userRatingVBeta1.buyer) &&
        Objects.equals(this.comment, userRatingVBeta1.comment) &&
        Objects.equals(this.createdAt, userRatingVBeta1.createdAt) &&
        Objects.equals(this.editedAt, userRatingVBeta1.editedAt) &&
        Objects.equals(this.exclusion, userRatingVBeta1.exclusion) &&
        Objects.equals(this.id, userRatingVBeta1.id) &&
        Objects.equals(this.justifications, userRatingVBeta1.justifications) &&
        Objects.equals(this.lastChangedAt, userRatingVBeta1.lastChangedAt) &&
        Objects.equals(this.order, userRatingVBeta1.order) &&
        Objects.equals(this.recommended, userRatingVBeta1.recommended) &&
        Objects.equals(this.removal, userRatingVBeta1.removal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, buyer, comment, createdAt, editedAt, exclusion, id, justifications, lastChangedAt, order, recommended, removal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRatingVBeta1 {\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    editedAt: ").append(toIndentedString(editedAt)).append("\n");
    sb.append("    exclusion: ").append(toIndentedString(exclusion)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    justifications: ").append(toIndentedString(justifications)).append("\n");
    sb.append("    lastChangedAt: ").append(toIndentedString(lastChangedAt)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    removal: ").append(toIndentedString(removal)).append("\n");
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
    openapiFields.add("answer");
    openapiFields.add("buyer");
    openapiFields.add("comment");
    openapiFields.add("createdAt");
    openapiFields.add("editedAt");
    openapiFields.add("exclusion");
    openapiFields.add("id");
    openapiFields.add("justifications");
    openapiFields.add("lastChangedAt");
    openapiFields.add("order");
    openapiFields.add("recommended");
    openapiFields.add("removal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("buyer");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("order");
    openapiRequiredFields.add("recommended");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserRatingVBeta1
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserRatingVBeta1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserRatingVBeta1 is not found in the empty JSON string", UserRatingVBeta1.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserRatingVBeta1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserRatingVBeta1` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserRatingVBeta1.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `answer`
      if (jsonObj.get("answer") != null && !jsonObj.get("answer").isJsonNull()) {
        AnswerVBeta1.validateJsonElement(jsonObj.get("answer"));
      }
      // validate the required field `buyer`
      User.validateJsonElement(jsonObj.get("buyer"));
      // validate the optional field `comment`
      if (jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) {
        CommentVBeta1.validateJsonElement(jsonObj.get("comment"));
      }
      if (!jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("editedAt") != null && !jsonObj.get("editedAt").isJsonNull()) && !jsonObj.get("editedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `editedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("editedAt").toString()));
      }
      // validate the optional field `exclusion`
      if (jsonObj.get("exclusion") != null && !jsonObj.get("exclusion").isJsonNull()) {
        Exclusion.validateJsonElement(jsonObj.get("exclusion"));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("justifications") != null && !jsonObj.get("justifications").isJsonNull()) {
        JsonArray jsonArrayjustifications = jsonObj.getAsJsonArray("justifications");
        if (jsonArrayjustifications != null) {
          // ensure the json data is an array
          if (!jsonObj.get("justifications").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `justifications` to be an array in the JSON string but got `%s`", jsonObj.get("justifications").toString()));
          }

          // validate the optional field `justifications` (array)
          for (int i = 0; i < jsonArrayjustifications.size(); i++) {
            Justification.validateJsonElement(jsonArrayjustifications.get(i));
          };
        }
      }
      if ((jsonObj.get("lastChangedAt") != null && !jsonObj.get("lastChangedAt").isJsonNull()) && !jsonObj.get("lastChangedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastChangedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastChangedAt").toString()));
      }
      // validate the required field `order`
      Order.validateJsonElement(jsonObj.get("order"));
      // validate the optional field `removal`
      if (jsonObj.get("removal") != null && !jsonObj.get("removal").isJsonNull()) {
        Removal.validateJsonElement(jsonObj.get("removal"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserRatingVBeta1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserRatingVBeta1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserRatingVBeta1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserRatingVBeta1.class));

       return (TypeAdapter<T>) new TypeAdapter<UserRatingVBeta1>() {
           @Override
           public void write(JsonWriter out, UserRatingVBeta1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserRatingVBeta1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserRatingVBeta1 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserRatingVBeta1
   * @throws IOException if the JSON string is invalid with respect to UserRatingVBeta1
   */
  public static UserRatingVBeta1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserRatingVBeta1.class);
  }

  /**
   * Convert an instance of UserRatingVBeta1 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

