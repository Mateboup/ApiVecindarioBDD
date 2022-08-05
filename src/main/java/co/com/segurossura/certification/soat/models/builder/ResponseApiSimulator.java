package co.com.segurossura.certification.soat.models.builder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"msg"})
@Getter
public class ResponseApiSimulator implements Serializable {

  @JsonProperty("msg")
  private String msg;

  private static final long serialVersionUID = 4545855629166319075L;
}
