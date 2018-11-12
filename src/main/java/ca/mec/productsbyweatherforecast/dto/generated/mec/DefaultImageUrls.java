
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
    "small_image_url",
    "large_image_url",
    "main_image_url",
    "zoom_image_url"
})
public class DefaultImageUrls {

    @JsonProperty("small_image_url")
    private String smallImageUrl;
    @JsonProperty("large_image_url")
    private String largeImageUrl;
    @JsonProperty("main_image_url")
    private String mainImageUrl;
    @JsonProperty("zoom_image_url")
    private String zoomImageUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("small_image_url")
    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    @JsonProperty("small_image_url")
    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    @JsonProperty("large_image_url")
    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    @JsonProperty("large_image_url")
    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    @JsonProperty("main_image_url")
    public String getMainImageUrl() {
        return mainImageUrl;
    }

    @JsonProperty("main_image_url")
    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    @JsonProperty("zoom_image_url")
    public String getZoomImageUrl() {
        return zoomImageUrl;
    }

    @JsonProperty("zoom_image_url")
    public void setZoomImageUrl(String zoomImageUrl) {
        this.zoomImageUrl = zoomImageUrl;
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
