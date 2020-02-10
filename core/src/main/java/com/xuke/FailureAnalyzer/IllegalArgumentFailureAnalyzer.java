package com.xuke.FailureAnalyzer;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-10 20:16
 * @Email ：wxk1035@gmail.com
 */
public class IllegalArgumentFailureAnalyzer  extends AbstractFailureAnalyzer<IllegalArgumentException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, IllegalArgumentException cause) {
        return new FailureAnalysis(cause.getMessage(),"请检查参数配置！",cause);
    }
}
