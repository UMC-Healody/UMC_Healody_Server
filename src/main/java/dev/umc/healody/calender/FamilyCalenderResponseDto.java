package dev.umc.healody.calender;

import dev.umc.healody.family.Family;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FamilyCalenderResponseDto {

    Long userId;
    String name;

    @Builder
    public FamilyCalenderResponseDto(Long userId, String name) {
        this.userId = userId;
        this.name = name;
    }
}
