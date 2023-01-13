package com.huseyinaydin.aop.stereotype;

import lombok.*;

@BenimStereoType
@Data @NoArgsConstructor @AllArgsConstructor
public class StereoTypeBean {
    private Long id;
    private String name="Merhabalar";
    private String trade;
}
