package one.digitalinnovation.personapi.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class VehicleDTO {

    public Long id;

    @NotEmpty
    @Size(min = 7, max = 7)
    private String licensePlate;

    private String makeName;

    private String modelName;

}
