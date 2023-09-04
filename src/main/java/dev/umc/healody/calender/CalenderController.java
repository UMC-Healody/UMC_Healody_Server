package dev.umc.healody.calender;

import dev.umc.healody.common.SuccessResponse;
import dev.umc.healody.common.SuccessStatus;
import dev.umc.healody.family.FamilyResponseDTO;
import dev.umc.healody.family.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static dev.umc.healody.common.FindUserInfo.*;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class CalenderController {

    private final FamilyService familyService;

    @GetMapping("/calender/view")
    public SuccessResponse<List<FamilyResponseDTO>> getFamily() {
        List<FamilyCalenderResponseDto> responseDTOList = familyService.searchFamilyInCalender(getCurrentUserId());
        return new SuccessResponse(SuccessStatus.SUCCESS, responseDTOList);
    }
}
