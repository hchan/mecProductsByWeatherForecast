
package ca.mec.productsbyweatherforecast.dto.generated.mec;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "product_count",
    "sub_categories"
})
public class Categories {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("product_count")
    private Integer productCount;
    @JsonProperty("sub_categories")
    private List<SubCategory> subCategories = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("product_count")
    public Integer getProductCount() {
        return productCount;
    }

    @JsonProperty("product_count")
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @JsonProperty("sub_categories")
    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    @JsonProperty("sub_categories")
    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
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
