package com.bayada.candidate.domain;

import lombok.Data;

import java.util.List;
@Data
public class ScreeningQuestion {
private String Question;
private List<String>answers;
}
