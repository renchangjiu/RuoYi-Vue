package com.ruoyi.common.utils.poi;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author yui
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class SheetData {

    private List<?> data;

    private String sheetName;
}
