
package ca.mec.productsbyweatherforecast.dto.generated.mec;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "list_price",
    "all_skus_clearance",
    "default_image_urls",
    "product_code",
    "full_name",
    "name",
    "brand",
    "review_count",
    "review_rating",
    "can_add_to_cart",
    "can_add_to_wish_list",
    "new_to_mec",
    "default_colour_code",
    "web_url",
    "clearance",
    "tracking",
    "product_details_url"
})
public class Product {

    @JsonProperty("list_price")
    private ListPrice listPrice;
    @JsonProperty("all_skus_clearance")
    private Boolean allSkusClearance;
    @JsonProperty("default_image_urls")
    private DefaultImageUrls defaultImageUrls;
    @JsonProperty("product_code")
    private String productCode;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("review_count")
    private Integer reviewCount;
    @JsonProperty("review_rating")
    private Double reviewRating;
    @JsonProperty("can_add_to_cart")
    private Boolean canAddToCart;
    @JsonProperty("can_add_to_wish_list")
    private Boolean canAddToWishList;
    @JsonProperty("new_to_mec")
    private Boolean newToMec;
    @JsonProperty("default_colour_code")
    private String defaultColourCode;
    @JsonProperty("web_url")
    private String webUrl;
    @JsonProperty("clearance")
    private Boolean clearance;
    @JsonProperty("tracking")
    private Tracking tracking;
    @JsonProperty("product_details_url")
    private String productDetailsUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("list_price")
    public ListPrice getListPrice() {
        return listPrice;
    }

    @JsonProperty("list_price")
    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    @JsonProperty("all_skus_clearance")
    public Boolean getAllSkusClearance() {
        return allSkusClearance;
    }

    @JsonProperty("all_skus_clearance")
    public void setAllSkusClearance(Boolean allSkusClearance) {
        this.allSkusClearance = allSkusClearance;
    }

    @JsonProperty("default_image_urls")
    public DefaultImageUrls getDefaultImageUrls() {
        return defaultImageUrls;
    }

    @JsonProperty("default_image_urls")
    public void setDefaultImageUrls(DefaultImageUrls defaultImageUrls) {
        this.defaultImageUrls = defaultImageUrls;
    }

    @JsonProperty("product_code")
    public String getProductCode() {
        return productCode;
    }

    @JsonProperty("product_code")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("review_count")
    public Integer getReviewCount() {
        return reviewCount;
    }

    @JsonProperty("review_count")
    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    @JsonProperty("review_rating")
    public Double getReviewRating() {
        return reviewRating;
    }

    @JsonProperty("review_rating")
    public void setReviewRating(Double reviewRating) {
        this.reviewRating = reviewRating;
    }

    @JsonProperty("can_add_to_cart")
    public Boolean getCanAddToCart() {
        return canAddToCart;
    }

    @JsonProperty("can_add_to_cart")
    public void setCanAddToCart(Boolean canAddToCart) {
        this.canAddToCart = canAddToCart;
    }

    @JsonProperty("can_add_to_wish_list")
    public Boolean getCanAddToWishList() {
        return canAddToWishList;
    }

    @JsonProperty("can_add_to_wish_list")
    public void setCanAddToWishList(Boolean canAddToWishList) {
        this.canAddToWishList = canAddToWishList;
    }

    @JsonProperty("new_to_mec")
    public Boolean getNewToMec() {
        return newToMec;
    }

    @JsonProperty("new_to_mec")
    public void setNewToMec(Boolean newToMec) {
        this.newToMec = newToMec;
    }

    @JsonProperty("default_colour_code")
    public String getDefaultColourCode() {
        return defaultColourCode;
    }

    @JsonProperty("default_colour_code")
    public void setDefaultColourCode(String defaultColourCode) {
        this.defaultColourCode = defaultColourCode;
    }

    @JsonProperty("web_url")
    public String getWebUrl() {
        return webUrl;
    }

    @JsonProperty("web_url")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @JsonProperty("clearance")
    public Boolean getClearance() {
        return clearance;
    }

    @JsonProperty("clearance")
    public void setClearance(Boolean clearance) {
        this.clearance = clearance;
    }

    @JsonProperty("tracking")
    public Tracking getTracking() {
        return tracking;
    }

    @JsonProperty("tracking")
    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
    }

    @JsonProperty("product_details_url")
    public String getProductDetailsUrl() {
        return productDetailsUrl;
    }

    @JsonProperty("product_details_url")
    public void setProductDetailsUrl(String productDetailsUrl) {
        this.productDetailsUrl = productDetailsUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
