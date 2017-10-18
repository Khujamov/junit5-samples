package pl.codeleak.samples.shared.petclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
abstract class Person extends BaseEntity {

    private final String firstName;

    private final String lastName;

}
