package academy.devdojo.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseBodyDtoPaginated<E> {

    private List<E> entities;
    private Long totalResults;

}
