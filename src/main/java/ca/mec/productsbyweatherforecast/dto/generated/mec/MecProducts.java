
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
    "products",
    "dimensions",
    "categories",
    "total_product_count",
    "errors_cnt",
    "warnings_cnt"
})
public class MecProducts {

    @JsonProperty("products")
    private List<Product> products = null;
    @JsonProperty("dimensions")
    private List<Dimension> dimensions = null;
    @JsonProperty("categories")
    private Categories categories;
    @JsonProperty("total_product_count")
    private Integer totalProductCount;
    @JsonProperty("errors_cnt")
    private Integer errorsCnt;
    @JsonProperty("warnings_cnt")
    private Integer warningsCnt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @JsonProperty("dimensions")
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    @JsonProperty("dimensions")
    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    @JsonProperty("categories")
    public Categories getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    @JsonProperty("total_product_count")
    public Integer getTotalProductCount() {
        return totalProductCount;
    }

    @JsonProperty("total_product_count")
    public void setTotalProductCount(Integer totalProductCount) {
        this.totalProductCount = totalProductCount;
    }

    @JsonProperty("errors_cnt")
    public Integer getErrorsCnt() {
        return errorsCnt;
    }

    @JsonProperty("errors_cnt")
    public void setErrorsCnt(Integer errorsCnt) {
        this.errorsCnt = errorsCnt;
    }

    @JsonProperty("warnings_cnt")
    public Integer getWarningsCnt() {
        return warningsCnt;
    }

    @JsonProperty("warnings_cnt")
    public void setWarningsCnt(Integer warningsCnt) {
        this.warningsCnt = warningsCnt;
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
